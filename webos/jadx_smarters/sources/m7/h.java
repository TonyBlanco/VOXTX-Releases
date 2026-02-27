package m7;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import j1.AbstractC2074a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m1.C2219a;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONObject;
import p1.InterfaceC2389c;
import u7.C2858a;

/* JADX INFO: loaded from: classes.dex */
public class h implements InterfaceC1233c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44622a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Activity f44627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences.Editor f44628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f44629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressDialog f44630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LiveStreamDBHandler f44632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecentWatchDBHandler f44633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f44635o = new ArrayList();

    public class a implements MyApplication.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44636a;

        /* JADX INFO: renamed from: m7.h$a$a, reason: collision with other inner class name */
        public class RunnableC0387a implements Runnable {
            public RunnableC0387a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                if (aVar.f44636a.equalsIgnoreCase(SharepreferenceDBHandler.getClientSecurityUrl(h.this.f44622a))) {
                    h.this.w();
                } else {
                    h.this.r();
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.w();
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f44640a;

            public c(String str) {
                this.f44640a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                MyApplication.p().D("MU" + this.f44640a, h.this.f44622a);
                h.this.w();
            }
        }

        public a(String str) {
            this.f44636a = str;
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void a(String str) {
            h.this.f44627g.runOnUiThread(new b());
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void b(String str) {
            h.this.f44627g.runOnUiThread(new c(str));
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void onSuccess() {
            h.this.f44627g.runOnUiThread(new RunnableC0387a());
        }
    }

    public class b implements InterfaceC2389c {
        public b() {
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            h hVar;
            String str;
            Log.e("AUTH_API", String.valueOf(jSONObject));
            try {
                String string = jSONObject.getString("auth_token");
                if (a7.m.a(string)) {
                    SharepreferenceDBHandler.setOneStreamToken(string, h.this.f44622a);
                    hVar = h.this;
                    str = AbstractC2237a.f44482Z;
                } else {
                    Log.e("AUTHAPI", "AUTHTOKEN IS EMPTY");
                    if (!AbstractC2237a.f44526o.booleanValue()) {
                        h.this.w();
                        return;
                    } else {
                        SharepreferenceDBHandler.setOneStreamToken(string, h.this.f44622a);
                        hVar = h.this;
                        str = AbstractC2237a.f44482Z;
                    }
                }
                hVar.p(str);
            } catch (Exception e9) {
                h.this.w();
                e9.printStackTrace();
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            h.this.w();
        }
    }

    public class c implements InterfaceC2389c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44643a;

        public c(String str) {
            this.f44643a = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: JSONException -> 0x006e, TryCatch #2 {JSONException -> 0x006e, blocks: (B:24:0x0067, B:27:0x0071, B:29:0x00cb, B:53:0x020f, B:56:0x0265, B:59:0x0287, B:60:0x02ab, B:64:0x02ce, B:96:0x0437, B:97:0x0452, B:63:0x02cb, B:65:0x02ed, B:67:0x02fa, B:68:0x030a, B:70:0x0318, B:72:0x031e, B:78:0x033c, B:79:0x0356, B:74:0x032a, B:76:0x0330, B:80:0x035b, B:82:0x0361, B:84:0x036d, B:86:0x0395, B:88:0x039e, B:89:0x03b9, B:90:0x03ed, B:92:0x03f3, B:94:0x03ff, B:95:0x041b, B:98:0x0456, B:7:0x0030, B:10:0x0042, B:13:0x004a, B:16:0x0055, B:19:0x005c), top: B:106:0x0030, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: JSONException -> 0x006e, TryCatch #2 {JSONException -> 0x006e, blocks: (B:24:0x0067, B:27:0x0071, B:29:0x00cb, B:53:0x020f, B:56:0x0265, B:59:0x0287, B:60:0x02ab, B:64:0x02ce, B:96:0x0437, B:97:0x0452, B:63:0x02cb, B:65:0x02ed, B:67:0x02fa, B:68:0x030a, B:70:0x0318, B:72:0x031e, B:78:0x033c, B:79:0x0356, B:74:0x032a, B:76:0x0330, B:80:0x035b, B:82:0x0361, B:84:0x036d, B:86:0x0395, B:88:0x039e, B:89:0x03b9, B:90:0x03ed, B:92:0x03f3, B:94:0x03ff, B:95:0x041b, B:98:0x0456, B:7:0x0030, B:10:0x0042, B:13:0x004a, B:16:0x0055, B:19:0x005c), top: B:106:0x0030, inners: #1 }] */
        @Override // p1.InterfaceC2389c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(org.json.JSONObject r24) {
            /*
                Method dump skipped, instruction units count: 1161
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: m7.h.c.a(org.json.JSONObject):void");
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            Log.e("INFO_API", String.valueOf(c2219a));
            Toast.makeText(h.this.f44622a.getApplicationContext(), h.this.f44622a.getResources().getString(a7.j.f12976D2), 0).show();
        }
    }

    public class d extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f44645a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f44646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f44647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f44648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f44649f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f44651a;

            public a(View view) {
                this.f44651a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f44651a;
                    if (view2 == null || view2.getTag() == null || !this.f44651a.getTag().equals("1")) {
                        View view3 = this.f44651a;
                        if (view3 == null || view3.getTag() == null || !this.f44651a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f44649f;
                        }
                    } else {
                        linearLayout = d.this.f44648e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f44651a;
                    if (view4 == null || view4.getTag() == null || !this.f44651a.getTag().equals("1")) {
                        View view5 = this.f44651a;
                        if (view5 == null || view5.getTag() == null || !this.f44651a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f44649f;
                        }
                    } else {
                        linearLayout = d.this.f44648e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public d(Activity activity) {
            super(activity);
            this.f44645a = activity;
        }

        public final /* synthetic */ void d() {
            new e(h.this, null).execute(new Void[0]);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == a7.f.f12524s1) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m7.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44654a.d();
                    }
                }, 200L);
                dismiss();
            } else if (id == a7.f.f12313X0) {
                try {
                    dismiss();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new C2858a(h.this.f44622a).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12819j2 : a7.g.f12813i2);
            this.f44646c = (TextView) findViewById(a7.f.f12524s1);
            this.f44647d = (TextView) findViewById(a7.f.f12313X0);
            this.f44648e = (LinearLayout) findViewById(a7.f.Ia);
            this.f44649f = (LinearLayout) findViewById(a7.f.V8);
            this.f44646c.setOnClickListener(this);
            this.f44647d.setOnClickListener(this);
            TextView textView = this.f44646c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f44647d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class e extends AsyncTask {
        public e() {
        }

        public /* synthetic */ e(h hVar, a aVar) {
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[PHI: r3
          0x001f: PHI (r3v9 java.util.ArrayList) = (r3v7 java.util.ArrayList), (r3v16 java.util.ArrayList) binds: [B:14:0x003d, B:9:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPostExecute(java.lang.Boolean r3) {
            /*
                r2 = this;
                super.onPostExecute(r3)
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L40
                java.lang.Boolean r3 = m7.AbstractC2237a.f44526o
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L39
                java.lang.Boolean r3 = m7.AbstractC2237a.f44523n
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L33
                m7.h r3 = m7.h.this
                java.util.ArrayList r3 = r3.f44635o
                if (r3 == 0) goto L2d
            L1f:
                r3.clear()
                m7.h r3 = m7.h.this
                java.util.ArrayList r0 = r3.f44635o
                java.lang.String r3 = m7.h.a(r3)
                r0.add(r3)
            L2d:
                m7.h r3 = m7.h.this
                m7.h.h(r3)
                goto L57
            L33:
                m7.h r3 = m7.h.this
                m7.h.i(r3)
                goto L57
            L39:
                m7.h r3 = m7.h.this
                java.util.ArrayList r3 = r3.f44635o
                if (r3 == 0) goto L2d
                goto L1f
            L40:
                m7.h r3 = m7.h.this
                m7.h.j(r3)
                m7.h$d r3 = new m7.h$d
                m7.h r0 = m7.h.this
                android.app.Activity r1 = m7.h.k(r0)
                r3.<init>(r1)
                r0 = 0
                r3.setCancelable(r0)
                r3.show()
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m7.h.e.onPostExecute(java.lang.Boolean):void");
        }
    }

    public h(Context context, Activity activity) {
        this.f44622a = context;
        this.f44627g = activity;
        this.f44632l = new LiveStreamDBHandler(context);
        this.f44633m = new RecentWatchDBHandler(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefsserverurl", 0);
        this.f44629i = sharedPreferences;
        this.f44628h = sharedPreferences.edit();
        ProgressDialog progressDialog = new ProgressDialog(context);
        this.f44630j = progressDialog;
        progressDialog.setMessage(context.getResources().getString(a7.j.f13392t5));
        this.f44630j.setCanceledOnTouchOutside(false);
        this.f44630j.setCancelable(false);
        this.f44630j.setProgressStyle(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            ProgressDialog progressDialog = this.f44630j;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        String oneStreamToken = SharepreferenceDBHandler.getOneStreamToken(this.f44622a);
        SharepreferenceDBHandler.setCurrentAPPType("onestream_api", this.f44622a);
        AbstractC2074a.a(str + "play/b2c/v1/user-info?token=" + oneStreamToken).s(k1.e.MEDIUM).q().o(new c(str));
    }

    public static long q(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        StringBuilder sb;
        List list;
        b7.e eVarA;
        String strJ = MyApplication.j(this.f44627g);
        String strL = MyApplication.l();
        MyApplication.p().q();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f44622a).equals("m3u")) {
            sb = new StringBuilder();
            sb.append(b7.f.c(this.f44622a));
            sb.append("*");
            sb.append(b7.f.d(this.f44622a));
            sb.append("-");
            sb.append("playlist");
        } else {
            sb = new StringBuilder();
            sb.append(b7.f.c(this.f44622a));
            sb.append("*");
            sb.append(b7.f.d(this.f44622a));
            sb.append("-");
            sb.append(this.f44624d);
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
        b7.g.f17717b.add(b7.g.a("k", b7.f.c(this.f44627g)));
        b7.g.f17717b.add(b7.g.a("sc", strZ));
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f44622a).equals("m3u")) {
            list = b7.g.f17717b;
            eVarA = b7.g.a("u", "playlist");
        } else {
            list = b7.g.f17717b;
            eVarA = b7.g.a("u", this.f44624d);
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

    private void u() {
        try {
            ProgressDialog progressDialog = this.f44630j;
            if (progressDialog != null) {
                progressDialog.show();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        String clientSecurityUrl = SharepreferenceDBHandler.getClientSecurityUrl(this.f44622a);
        if (AbstractC2237a.f44477W0.booleanValue()) {
            MyApplication.p().G(this.f44622a, new a(clientSecurityUrl));
        } else if (clientSecurityUrl.equalsIgnoreCase(SharepreferenceDBHandler.getClientSecurityUrl(this.f44622a))) {
            w();
        } else {
            r();
        }
    }

    public boolean n() {
        return this.f44622a.getSharedPreferences("automation_channels", 0).getString("automation_channels", "").equals("checked");
    }

    public void s(String str, String str2, String str3, String str4, boolean z9, boolean z10) {
        this.f44634n = z10;
        this.f44631k = z9;
        this.f44623c = str;
        this.f44624d = str2;
        this.f44625e = str3;
        this.f44626f = str4;
    }

    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void K0(String str, int i9, boolean z9) {
        if (!z9) {
            Context context = this.f44622a;
            Toast.makeText(context, context.getResources().getString(a7.j.f12944A0), 0).show();
            return;
        }
        if (i9 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                AbstractC1232b.f17694a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    Context context2 = this.f44622a;
                    Toast.makeText(context2, context2.getResources().getString(a7.j.f13071M7), 0).show();
                    return;
                }
                String string = AbstractC1232b.f17694a.getString("su");
                AbstractC1232b.f17694a.getString("ndd");
                System.currentTimeMillis();
                try {
                    b7.f.e(this.f44627g, AbstractC1232b.f17694a.optString("su"));
                    if (!AbstractC1232b.f17694a.getString("sc").equalsIgnoreCase(MyApplication.z(AbstractC1232b.f17694a.optString("su") + "*" + b7.f.d(this.f44627g) + "*" + AbstractC1232b.f17695b))) {
                        Context context3 = this.f44622a;
                        Toast.makeText(context3, context3.getResources().getString(a7.j.f12944A0), 0).show();
                        return;
                    }
                    if (string != null && !string.equals("") && !string.isEmpty()) {
                        this.f44635o = new ArrayList(Arrays.asList(string.split(",")));
                    }
                    w();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void v() {
        u();
        new e(this, null).execute(new Void[0]);
    }

    public final void w() {
        ArrayList arrayList = this.f44635o;
        if (arrayList != null && arrayList.size() >= 1) {
            this.f44628h.putString(AbstractC2237a.f44454L, ((String) this.f44635o.get(0)).trim());
            this.f44628h.commit();
            this.f44635o.remove(0);
            x();
            return;
        }
        ArrayList arrayList2 = this.f44635o;
        if (arrayList2 == null || arrayList2.size() != 0) {
            return;
        }
        o();
        Toast.makeText(this.f44622a, "Your Account is invalid or has expired !", 0).show();
    }

    public final void x() {
        String lowerCase = this.f44629i.getString(AbstractC2237a.f44454L, "").toLowerCase();
        if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
            lowerCase = "http://" + lowerCase;
        }
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase + "/";
        }
        AbstractC2237a.f44482Z = lowerCase;
        AbstractC2074a.b(lowerCase + "play/b2c/v1/auth").s(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f44624d).s(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f44625e).t("Content-Type", "FormUrlEncoded").v(k1.e.MEDIUM).u().o(new b());
    }
}
