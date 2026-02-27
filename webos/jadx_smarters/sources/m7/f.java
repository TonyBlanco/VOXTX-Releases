package m7;

import D.AbstractC0519b;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.ImportM3uActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONObject;
import u7.C2858a;

/* JADX INFO: loaded from: classes.dex */
public class f implements InterfaceC1233c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44592a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Activity f44596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f44597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences f44598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ProgressDialog f44599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LiveStreamDBHandler f44601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecentWatchDBHandler f44602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A7.a f44603m;

    public class a implements MyApplication.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44604a;

        /* JADX INFO: renamed from: m7.f$a$a, reason: collision with other inner class name */
        public class RunnableC0386a implements Runnable {
            public RunnableC0386a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                if (aVar.f44604a.equalsIgnoreCase(SharepreferenceDBHandler.getClientSecurityUrl(f.this.f44592a))) {
                    f.this.s();
                } else {
                    f.this.n();
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.s();
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f44608a;

            public c(String str) {
                this.f44608a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                MyApplication.p().D("MU" + this.f44608a, f.this.f44592a);
                f.this.s();
            }
        }

        public a(String str) {
            this.f44604a = str;
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void a(String str) {
            f.this.f44596f.runOnUiThread(new b());
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void b(String str) {
            f.this.f44596f.runOnUiThread(new c(str));
        }

        @Override // com.nst.iptvsmarterstvbox.miscelleneious.MyApplication.d
        public void onSuccess() {
            f.this.f44596f.runOnUiThread(new RunnableC0386a());
        }
    }

    public class b extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f44610a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f44611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f44612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f44613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f44614f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f44616a;

            public a(View view) {
                this.f44616a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f44616a;
                    if (view2 == null || view2.getTag() == null || !this.f44616a.getTag().equals("1")) {
                        View view3 = this.f44616a;
                        if (view3 == null || view3.getTag() == null || !this.f44616a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = b.this.f44614f;
                        }
                    } else {
                        linearLayout = b.this.f44613e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f44616a;
                    if (view4 == null || view4.getTag() == null || !this.f44616a.getTag().equals("1")) {
                        View view5 = this.f44616a;
                        if (view5 == null || view5.getTag() == null || !this.f44616a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = b.this.f44614f;
                        }
                    } else {
                        linearLayout = b.this.f44613e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public b(Activity activity) {
            super(activity);
            this.f44610a = activity;
        }

        public final /* synthetic */ void d() {
            new d(f.this, null).execute(new Void[0]);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == a7.f.f12524s1) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m7.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44621a.d();
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
            setContentView(new C2858a(f.this.f44592a).A().equals(AbstractC2237a.f44453K0) ? a7.g.f12819j2 : a7.g.f12813i2);
            this.f44611c = (TextView) findViewById(a7.f.f12524s1);
            this.f44612d = (TextView) findViewById(a7.f.f12313X0);
            this.f44613e = (LinearLayout) findViewById(a7.f.Ia);
            this.f44614f = (LinearLayout) findViewById(a7.f.V8);
            this.f44611c.setOnClickListener(this);
            this.f44612d.setOnClickListener(this);
            TextView textView = this.f44611c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f44612d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class c extends AsyncTask {
        public c() {
        }

        public /* synthetic */ c(f fVar, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                URL url = new URL(strArr[0]);
                f.this.p();
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(f.this.f44592a.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(f.this.f44592a.getFilesDir() + "/data_temp.txt").toString())));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!(((!line.contains("http://") || line.contains("tvg-logo")) && (!line.contains("https://") || line.contains("tvg-logo"))) ? "" : line).equals("")) {
                        sb.append(line);
                        break;
                    }
                }
                bufferedWriter.write(sb.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
                return Boolean.TRUE;
            } catch (Exception e10) {
                e10.printStackTrace();
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    f.this.new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, f.this.f44592a.getFilesDir() + "/data_temp.txt");
                } else {
                    f.this.l();
                    w.P0(f.this.f44592a, f.this.f44592a.getResources().getString(a7.j.f13269h2));
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(String... strArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class d extends AsyncTask {
        public d() {
        }

        public /* synthetic */ d(f fVar, a aVar) {
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
                    f.this.s();
                    return;
                } else {
                    f.this.n();
                    return;
                }
            }
            f.this.l();
            f fVar = f.this;
            b bVar = fVar.new b(fVar.f44596f);
            bVar.setCancelable(false);
            bVar.show();
        }
    }

    public class e extends AsyncTask {
        public e() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return f.this.f44603m.c(new FileInputStream(new File(strArr[0])), f.this.f44592a);
            } catch (Exception unused) {
                return "";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            Toast toastMakeText;
            f fVar;
            super.onPostExecute(str);
            if (str.equals("")) {
                if (f.this.f44601k != null) {
                    f.this.f44601k.updateImportStatus("all", "2");
                }
                f.this.l();
                Toast.makeText(f.this.f44592a, f.this.f44592a.getResources().getString(a7.j.f13205a8), 1).show();
                return;
            }
            try {
                if (AbstractC2237a.f44538t.booleanValue()) {
                    if (!AbstractC2237a.f44526o.booleanValue()) {
                        String strA = b7.f.a(f.this.f44592a);
                        ArrayList arrayList = (strA == null || strA.equals("") || strA.isEmpty()) ? null : new ArrayList(Arrays.asList(strA.split(",")));
                        if (arrayList == null || arrayList.size() < 1) {
                            f.this.l();
                            toastMakeText = Toast.makeText(f.this.f44592a, f.this.f44592a.getResources().getString(a7.j.f13312l5), 0);
                        } else {
                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                if (str.contains((CharSequence) arrayList.get(i9))) {
                                    fVar = f.this;
                                }
                            }
                            f.this.l();
                            toastMakeText = Toast.makeText(f.this.f44592a, f.this.f44592a.getResources().getString(a7.j.f13006G2), 0);
                        }
                        toastMakeText.show();
                        return;
                    }
                    fVar = f.this;
                    fVar.j(str);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public f(Context context, Activity activity) {
        this.f44592a = context;
        this.f44596f = activity;
        this.f44601k = new LiveStreamDBHandler(context);
        this.f44602l = new RecentWatchDBHandler(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefsserverurl", 0);
        this.f44598h = sharedPreferences;
        this.f44597g = sharedPreferences.edit();
        this.f44603m = new A7.a();
        ProgressDialog progressDialog = new ProgressDialog(context);
        this.f44599i = progressDialog;
        progressDialog.setMessage(context.getResources().getString(a7.j.f13392t5));
        this.f44599i.setCanceledOnTouchOutside(false);
        this.f44599i.setCancelable(false);
        this.f44599i.setProgressStyle(0);
    }

    private boolean k() {
        return this.f44592a.getSharedPreferences("automation_channels", 0).getString("automation_channels", "").equals("checked");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            ProgressDialog progressDialog = this.f44599i;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static long m(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        StringBuilder sb;
        String strJ = MyApplication.j(this.f44596f);
        String strL = MyApplication.l();
        MyApplication.p().q();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f44592a).equals("m3u")) {
            sb = new StringBuilder();
            sb.append(b7.f.c(this.f44592a));
            sb.append("*");
            sb.append(b7.f.d(this.f44592a));
            sb.append("-");
            sb.append("playlist");
            sb.append("-");
        } else {
            sb = new StringBuilder();
            sb.append(b7.f.c(this.f44592a));
            sb.append("*");
            sb.append(b7.f.d(this.f44592a));
            sb.append("-playlist-");
        }
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
        b7.g.f17717b.add(b7.g.a("k", b7.f.c(this.f44596f)));
        b7.g.f17717b.add(b7.g.a("sc", strZ));
        SharepreferenceDBHandler.getCurrentAPPType(this.f44592a).equals("m3u");
        b7.g.f17717b.add(b7.g.a("u", "playlist"));
        b7.g.f17717b.add(b7.g.a("pw", "no_password"));
        b7.g.f17717b.add(b7.g.a("r", AbstractC1232b.f17695b));
        b7.g.f17717b.add(b7.g.a("av", strJ));
        b7.g.f17717b.add(b7.g.a("dt", "unknown"));
        b7.g.f17717b.add(b7.g.a("d", MyApplication.n()));
        b7.g.f17717b.add(b7.g.a("do", strL));
        b7.g.f17718c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (i9 >= 33) {
            return true;
        }
        if (this.f44592a.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        AbstractC0519b.h((Activity) this.f44592a, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    private void r() {
        try {
            ProgressDialog progressDialog = this.f44599i;
            if (progressDialog != null) {
                progressDialog.show();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        String clientSecurityUrl = SharepreferenceDBHandler.getClientSecurityUrl(this.f44592a);
        if (AbstractC2237a.f44477W0.booleanValue()) {
            MyApplication.p().G(this.f44592a, new a(clientSecurityUrl));
        } else if (clientSecurityUrl.equalsIgnoreCase(SharepreferenceDBHandler.getClientSecurityUrl(this.f44592a))) {
            s();
        } else {
            n();
        }
    }

    public final void j(String str) {
        Activity activity;
        try {
            SharedPreferences.Editor editorEdit = this.f44592a.getSharedPreferences("loginPrefs", 0).edit();
            SharedPreferences.Editor editorEdit2 = this.f44592a.getSharedPreferences("loginprefsmultiuser", 0).edit();
            editorEdit2.putString("name", this.f44595e);
            editorEdit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
            editorEdit2.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "playlist");
            editorEdit2.putString(AbstractC2237a.f44454L, this.f44594d);
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "playlist");
            editorEdit.putString("serverPort", "");
            editorEdit.putString("serverUrl", this.f44594d);
            editorEdit.putString("serverM3UUrl", this.f44594d);
            editorEdit.putString(AbstractC2237a.f44454L, this.f44594d);
            editorEdit.apply();
            editorEdit2.apply();
            SharedPreferences sharedPreferences = this.f44592a.getSharedPreferences("allowedFormat", 0);
            SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = this.f44592a.getSharedPreferences("timeFormat", 0);
            SharedPreferences.Editor editorEdit4 = sharedPreferences2.edit();
            String string = sharedPreferences.getString("allowedFormat", "");
            if (string != null && string.equals("")) {
                editorEdit3.putString("allowedFormat", "ts");
                editorEdit3.apply();
            }
            String string2 = sharedPreferences2.getString("timeFormat", AbstractC2237a.f44441E0);
            if (string2 != null && string2.equals("")) {
                editorEdit4.putString("timeFormat", AbstractC2237a.f44441E0);
                editorEdit4.apply();
            }
            SharedPreferences.Editor editorEdit5 = this.f44592a.getSharedPreferences("sharedprefremberme", 0).edit();
            editorEdit5.putBoolean("savelogin", true);
            editorEdit5.apply();
            SharepreferenceDBHandler.getUserID(this.f44592a);
            l();
            try {
                Context context = this.f44592a;
                Toast.makeText(context, context.getResources().getString(a7.j.f13210b3), 0).show();
            } catch (WindowManager.BadTokenException e9) {
                e9.printStackTrace();
            }
            int importTableCount = this.f44601k.getImportTableCount("m3u");
            if (str != null && !str.equals("")) {
                if (SharepreferenceDBHandler.getFirebaseM3uNode(this.f44592a).equalsIgnoreCase("")) {
                    importTableCount = 0;
                }
                SharepreferenceDBHandler.setFirebaseM3uNode(str, this.f44592a);
            }
            if (importTableCount == 0) {
                ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                ImportStatusModel importStatusModel = new ImportStatusModel();
                importStatusModel.setType("all");
                importStatusModel.setStatus("0");
                importStatusModel.setDate("");
                arrayList.add(0, importStatusModel);
                this.f44601k.importDataStatusArrayList(arrayList, "m3u");
            }
            ImportStatusModel importStatusModel2 = this.f44601k.getdateDBStatus("all");
            if (importStatusModel2 != null) {
                if ((importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("0")) && (importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("2"))) {
                    if (importStatusModel2.getStatus() != null && importStatusModel2.getStatus().equals("1")) {
                        long jM = m(new SimpleDateFormat("dd/MM/yyyy", Locale.US), importStatusModel2.getDate(), w.q());
                        C2858a c2858a = new C2858a(this.f44592a);
                        if (!k() || jM < c2858a.g()) {
                            editorEdit2.putString("name", this.f44595e);
                            editorEdit2.apply();
                            AbstractC2237a.f44520m = this.f44595e;
                            this.f44592a.startActivity(new Intent(this.f44592a, (Class<?>) NewDashboardActivity.class));
                            activity = (Activity) this.f44592a;
                        } else {
                            this.f44592a.startActivity(new Intent(this.f44592a, (Class<?>) ImportM3uActivity.class));
                            activity = (Activity) this.f44592a;
                        }
                    } else {
                        if (importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("3")) {
                            return;
                        }
                        this.f44592a.startActivity(new Intent(this.f44592a, (Class<?>) ImportM3uActivity.class));
                        activity = (Activity) this.f44592a;
                    }
                } else {
                    if (this.f44592a == null) {
                        return;
                    }
                    this.f44592a.startActivity(new Intent(this.f44592a, (Class<?>) ImportM3uActivity.class));
                    activity = (Activity) this.f44592a;
                }
                activity.finish();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void o(boolean z9, String str, String str2, String str3) {
        this.f44595e = str3;
        this.f44600j = z9;
        this.f44593c = str;
        this.f44594d = str2;
    }

    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void K0(String str, int i9, boolean z9) {
        Toast toastMakeText;
        if (!z9) {
            Context context = this.f44592a;
            Toast.makeText(context, context.getResources().getString(a7.j.f12944A0), 0).show();
            return;
        }
        if (i9 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                AbstractC1232b.f17694a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    Context context2 = this.f44592a;
                    Toast.makeText(context2, context2.getResources().getString(a7.j.f13071M7), 0).show();
                    return;
                }
                String string = AbstractC1232b.f17694a.getString("su");
                AbstractC1232b.f17694a.getString("ndd");
                System.currentTimeMillis();
                try {
                    b7.f.e(this.f44596f, AbstractC1232b.f17694a.optString("su"));
                    if (!AbstractC1232b.f17694a.getString("sc").equalsIgnoreCase(MyApplication.z(AbstractC1232b.f17694a.optString("su") + "*" + b7.f.d(this.f44596f) + "*" + AbstractC1232b.f17695b))) {
                        Context context3 = this.f44592a;
                        toastMakeText = Toast.makeText(context3, context3.getResources().getString(a7.j.f12944A0), 0);
                    } else {
                        if (string != null && string.length() > 0) {
                            if (this.f44593c.equalsIgnoreCase(TransferTable.COLUMN_FILE)) {
                                new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f44594d);
                                return;
                            } else {
                                if (this.f44593c.equalsIgnoreCase("url")) {
                                    new c(this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f44594d);
                                    return;
                                }
                                return;
                            }
                        }
                        Context context4 = this.f44592a;
                        toastMakeText = Toast.makeText(context4, context4.getResources().getString(a7.j.f12944A0), 0);
                    }
                    toastMakeText.show();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void s() {
        try {
            if (this.f44593c.equalsIgnoreCase(TransferTable.COLUMN_FILE)) {
                new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f44594d);
            } else if (this.f44593c.equalsIgnoreCase("url")) {
                new c(this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f44594d);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void t() {
        r();
        new d(this, null).execute(new Void[0]);
    }
}
