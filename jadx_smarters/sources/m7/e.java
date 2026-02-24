package m7;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.ImportM3uActivity;
import com.nst.iptvsmarterstvbox.view.activity.ImportOneStreamActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import j1.AbstractC2074a;
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
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m1.C2219a;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONException;
import org.json.JSONObject;
import p1.InterfaceC2389c;
import u7.C2858a;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2858a f44561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44562d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f44565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f44566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f44567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f44568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f44569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f44570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f44571m;

    public class a implements InterfaceC2389c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f44572a;

        public a(ArrayList arrayList) {
            this.f44572a = arrayList;
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            Log.e("AUTH_API", String.valueOf(jSONObject));
            try {
                String string = jSONObject.getString("auth_token");
                if (string.isEmpty()) {
                    Log.e("AUTHAPI", "AUTHTOKEN IS EMPTY");
                    e.this.x(this.f44572a);
                } else {
                    if (e.this.f44559a != null) {
                        SharepreferenceDBHandler.setFirebaseOneStreamNode(e.this.f44566h, e.this.f44559a);
                        SharepreferenceDBHandler.setOneStreamToken(string, e.this.f44559a);
                    }
                    e.this.v(this.f44572a);
                }
            } catch (Exception e9) {
                e.this.x(this.f44572a);
                e9.printStackTrace();
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            e.this.x(this.f44572a);
        }
    }

    public class b implements InterfaceC2389c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f44574a;

        public b(ArrayList arrayList) {
            this.f44574a = arrayList;
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            Intent intent;
            Context context;
            Log.e("AUTH_API", String.valueOf(jSONObject));
            if (jSONObject == null) {
                e.this.x(this.f44574a);
            } else {
                try {
                    jSONObject2 = new JSONObject(String.valueOf(jSONObject)).getJSONObject("user_info");
                } catch (JSONException e9) {
                    e = e9;
                }
                if (jSONObject2 != null) {
                    e.this.f44570l = jSONObject2.getString("auth");
                    if (e.this.f44570l != null && Integer.valueOf(e.this.f44570l).intValue() != 0) {
                        e.this.f44571m = jSONObject2.getString("status");
                        if (e.this.f44571m != null && e.this.f44571m.equals("Active")) {
                            JSONObject jSONObject3 = new JSONObject(String.valueOf(jSONObject));
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("user_info");
                            jSONObject4.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
                            jSONObject4.getString("message");
                            String string = jSONObject4.getString("expire_at");
                            String string2 = jSONObject4.getString("active_connections");
                            String string3 = jSONObject4.getString("created_at");
                            String string4 = jSONObject4.getString("max_connections");
                            jSONObject4.getJSONArray("allowed_output_formats");
                            JSONObject jSONObject5 = jSONObject3.getJSONObject("server_info");
                            jSONObject5.getString("time_now");
                            String string5 = jSONObject5.getString("timezone");
                            try {
                            } catch (JSONException e10) {
                                e = e10;
                            }
                            if (e.this.f44571m == null || !e.this.f44571m.equals("Active")) {
                                if (e.this.f44559a != null) {
                                    Toast.makeText(e.this.f44559a.getApplicationContext(), e.this.f44559a.getResources().getString(a7.j.f13016H2) + e.this.f44571m, 0).show();
                                    return;
                                }
                                return;
                            }
                            if (e.this.f44559a != null) {
                                e.this.f44559a.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "").toLowerCase();
                                SharedPreferences.Editor editorEdit = e.this.f44559a.getSharedPreferences("loginPrefs", 0).edit();
                                editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, e.this.f44567i);
                                editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, e.this.f44568j);
                                editorEdit.putString("auth", e.this.f44570l);
                                editorEdit.putString("status", e.this.f44571m);
                                editorEdit.putString("expDate", string);
                                editorEdit.putString("activeCons", string2);
                                editorEdit.putString("createdAt", string3);
                                editorEdit.putString("maxConnections", string4);
                                editorEdit.putString("serverTimeZone", string5);
                                editorEdit.apply();
                                SharedPreferences sharedPreferences = e.this.f44559a.getSharedPreferences("allowedFormat", 0);
                                SharedPreferences sharedPreferences2 = e.this.f44559a.getSharedPreferences("timeFormat", 0);
                                SharedPreferences sharedPreferences3 = e.this.f44559a.getSharedPreferences("epgchannelupdate", 0);
                                SharedPreferences sharedPreferences4 = e.this.f44559a.getSharedPreferences("automation_channels", 0);
                                SharedPreferences sharedPreferences5 = e.this.f44559a.getSharedPreferences("automation_epg", 0);
                                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                                SharedPreferences.Editor editorEdit3 = sharedPreferences2.edit();
                                SharedPreferences.Editor editorEdit4 = sharedPreferences3.edit();
                                SharedPreferences.Editor editorEdit5 = sharedPreferences4.edit();
                                SharedPreferences.Editor editorEdit6 = sharedPreferences5.edit();
                                try {
                                    SharedPreferences.Editor editorEdit7 = e.this.f44559a.getSharedPreferences("auto_start", 0).edit();
                                    if (editorEdit7 != null) {
                                        editorEdit7.putBoolean("full_epg", true);
                                        editorEdit7.apply();
                                    }
                                    if (sharedPreferences4.getString("automation_channels", "").equals("")) {
                                        editorEdit5.putString("automation_channels", "checked");
                                        editorEdit5.apply();
                                    }
                                    if (sharedPreferences5.getString("automation_epg", "").equals("")) {
                                        editorEdit6.putString("automation_epg", "checked");
                                        editorEdit6.apply();
                                    }
                                    AbstractC2237a.f44491c0 = Boolean.FALSE;
                                    if (sharedPreferences.getString("allowedFormat", "").equals("")) {
                                        editorEdit2.putString("allowedFormat", "ts");
                                        editorEdit2.apply();
                                    }
                                    if (sharedPreferences2.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                                        editorEdit3.putString("timeFormat", AbstractC2237a.f44441E0);
                                        editorEdit3.apply();
                                    }
                                    if (sharedPreferences3.getString("epgchannelupdate", "").equals("")) {
                                        editorEdit4.putString("epgchannelupdate", "all");
                                        editorEdit4.apply();
                                    }
                                    MultiUserDBHandler multiUserDBHandler = new MultiUserDBHandler(e.this.f44559a);
                                    LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(e.this.f44559a);
                                    if (!multiUserDBHandler.checkregistration(e.this.f44569k, e.this.f44567i, e.this.f44568j, e.this.f44566h, "onestream_api", e.this.f44566h, "")) {
                                        multiUserDBHandler.addmultiusers(e.this.f44569k, e.this.f44567i, e.this.f44568j, AbstractC2237a.f44482Z, "", "onestream_api");
                                        try {
                                            Toast.makeText(e.this.f44559a.getApplicationContext(), e.this.f44559a.getResources().getString(a7.j.f13375r8), 0).show();
                                        } catch (WindowManager.BadTokenException e11) {
                                            e11.printStackTrace();
                                        }
                                        SharedPreferences.Editor editorEdit8 = e.this.f44559a.getSharedPreferences("loginprefsmultiuser", 0).edit();
                                        editorEdit8.putString("name", e.this.f44569k);
                                        editorEdit8.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, e.this.f44567i);
                                        editorEdit8.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, e.this.f44568j);
                                        editorEdit8.putString(AbstractC2237a.f44454L, e.this.f44566h);
                                        editorEdit8.putString("expDate", string);
                                        editorEdit8.apply();
                                        Toast.makeText(e.this.f44559a, e.this.f44559a.getResources().getString(a7.j.f13210b3), 0).show();
                                        SharepreferenceDBHandler.setUserID(multiUserDBHandler.getAutoIdLoggedInUser(e.this.f44569k, e.this.f44567i, e.this.f44568j, e.this.f44566h, "onestream_api", e.this.f44566h, ""), e.this.f44559a);
                                        e.this.f44559a.startActivity(new Intent(e.this.f44559a.getApplicationContext(), (Class<?>) ImportOneStreamActivity.class));
                                        return;
                                    }
                                    try {
                                        Toast.makeText(e.this.f44559a.getApplicationContext(), e.this.f44559a.getString(a7.j.f12973D) + e.this.f44569k + e.this.f44559a.getString(a7.j.f13405u8) + e.this.f44567i + e.this.f44559a.getString(a7.j.f12993F) + AbstractC2237a.f44482Z, 0).show();
                                    } catch (WindowManager.BadTokenException e12) {
                                        e12.printStackTrace();
                                    }
                                    SharedPreferences sharedPreferences6 = e.this.f44559a.getSharedPreferences("loginprefsmultiuser", 0);
                                    SharedPreferences.Editor editorEdit9 = sharedPreferences6.edit();
                                    editorEdit9.putString("name", e.this.f44569k);
                                    editorEdit9.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, e.this.f44567i);
                                    editorEdit9.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, e.this.f44568j);
                                    editorEdit9.putString(AbstractC2237a.f44454L, e.this.f44566h);
                                    editorEdit9.putString("expDate", string);
                                    editorEdit9.apply();
                                    Toast.makeText(e.this.f44559a, e.this.f44559a.getResources().getString(a7.j.f13210b3), 0).show();
                                    ImportStatusModel importStatusModel = liveStreamDBHandler.getdateDBStatus("onestream_api");
                                    if (importStatusModel == null) {
                                        intent = new Intent(e.this.f44559a, (Class<?>) ImportOneStreamActivity.class);
                                        context = e.this.f44559a;
                                    } else if ((importStatusModel.getStatus() != null && importStatusModel.getStatus().equals("0")) || (importStatusModel.getStatus() != null && importStatusModel.getStatus().equals("2"))) {
                                        intent = new Intent(e.this.f44559a, (Class<?>) ImportOneStreamActivity.class);
                                        context = e.this.f44559a;
                                    } else if (importStatusModel.getStatus() != null && importStatusModel.getStatus().equals("1")) {
                                        long jW = e.w(new SimpleDateFormat("dd/MM/yyyy", Locale.US), importStatusModel.getDate(), w.q());
                                        if (!e.this.u() || jW < e.this.f44561c.g()) {
                                            sharedPreferences6.edit().putString("name", e.this.f44569k);
                                            editorEdit9.apply();
                                            AbstractC2237a.f44520m = e.this.f44569k;
                                            intent = new Intent(e.this.f44559a, (Class<?>) NewDashboardActivity.class);
                                            context = e.this.f44559a;
                                        } else {
                                            intent = new Intent(e.this.f44559a, (Class<?>) ImportOneStreamActivity.class);
                                            context = e.this.f44559a;
                                        }
                                    } else {
                                        if (importStatusModel.getStatus() == null || !importStatusModel.getStatus().equals("3")) {
                                            return;
                                        }
                                        intent = new Intent(e.this.f44559a, (Class<?>) ImportOneStreamActivity.class);
                                        context = e.this.f44559a;
                                    }
                                    context.startActivity(intent);
                                    return;
                                } catch (JSONException e13) {
                                    e = e13;
                                }
                                e = e10;
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                }
                e.this.x(this.f44574a);
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            Log.e("INFO_API", String.valueOf(c2219a));
            if (e.this.f44559a != null) {
                Toast.makeText(e.this.f44559a.getApplicationContext(), e.this.f44559a.getResources().getString(a7.j.f12976D2), 0).show();
            }
        }
    }

    public class c extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f44576a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f44577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f44578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f44579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f44580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f44581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f44582h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f44584a;

            public a(View view) {
                this.f44584a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f44584a;
                    if (view2 == null || view2.getTag() == null || !this.f44584a.getTag().equals("1")) {
                        View view3 = this.f44584a;
                        if (view3 == null || view3.getTag() == null || !this.f44584a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = c.this.f44582h;
                        }
                    } else {
                        linearLayout = c.this.f44581g;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f44584a;
                    if (view4 == null || view4.getTag() == null || !this.f44584a.getTag().equals("1")) {
                        View view5 = this.f44584a;
                        if (view5 == null || view5.getTag() == null || !this.f44584a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = c.this.f44582h;
                        }
                    } else {
                        linearLayout = c.this.f44581g;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public c(Activity activity, String str, String str2) {
            super(activity);
            this.f44577c = str;
            this.f44578d = str2;
            this.f44576a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (view.getId() == a7.f.f12524s1) {
                    dismiss();
                    if (e.this.f44560b.equalsIgnoreCase("m3u")) {
                        if (this.f44577c.equalsIgnoreCase(TransferTable.COLUMN_FILE)) {
                            e eVar = e.this;
                            eVar.y("", false, eVar.f44565g);
                        } else {
                            e eVar2 = e.this;
                            eVar2.y(this.f44578d, true, eVar2.f44565g);
                        }
                    } else if (!e.this.f44560b.equalsIgnoreCase("api")) {
                        e.this.f44560b.equalsIgnoreCase("onestream_api");
                    }
                } else if (view.getId() != a7.f.f12313X0) {
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
            setContentView(e.this.f44561c.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12819j2 : a7.g.f12813i2);
            this.f44579e = (TextView) findViewById(a7.f.f12524s1);
            this.f44580f = (TextView) findViewById(a7.f.f12313X0);
            this.f44581g = (LinearLayout) findViewById(a7.f.Ia);
            this.f44582h = (LinearLayout) findViewById(a7.f.V8);
            this.f44579e.setOnClickListener(this);
            this.f44580f.setOnClickListener(this);
            TextView textView = this.f44579e;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f44580f;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class d extends AsyncTask {
        public d() {
        }

        public /* synthetic */ d(e eVar, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                URL url = new URL(strArr[0]);
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(e.this.f44559a.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(e.this.f44559a.getFilesDir() + "/data_temp.txt").toString())));
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
                    e.this.new g(true).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, e.this.f44559a.getFilesDir() + "/data_temp.txt");
                } else {
                    w.X();
                    w.P0(e.this.f44559a, "Incorrect File/URL");
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

    /* JADX INFO: renamed from: m7.e$e, reason: collision with other inner class name */
    public class AsyncTaskC0385e extends AsyncTask {
        public AsyncTaskC0385e() {
        }

        public /* synthetic */ AsyncTaskC0385e(e eVar, a aVar) {
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
                Log.e("LOG_TAG", e9.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new f(e.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, e.this.f44563e);
                return;
            }
            w.X();
            e eVar = e.this;
            c cVar = eVar.new c((Activity) eVar.f44559a, "url", e.this.f44563e);
            cVar.setCancelable(false);
            cVar.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            w.N0(e.this.f44559a);
        }
    }

    public class f extends AsyncTask {
        public f() {
        }

        public /* synthetic */ f(e eVar, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                return Boolean.valueOf(responseCode == 200 || responseCode == 405 || responseCode == 404);
            } catch (Exception e9) {
                Log.e("Google", e9.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new d(e.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, e.this.f44563e);
            } else {
                w.X();
                w.P0(e.this.f44559a, e.this.f44559a.getResources().getString(a7.j.f13269h2));
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class g extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f44589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final A7.a f44590b = new A7.a();

        public g(boolean z9) {
            this.f44589a = z9;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return this.f44590b.c(new FileInputStream(new File(strArr[0])), e.this.f44559a);
            } catch (Exception unused) {
                return "";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (str.equals("")) {
                    w.X();
                    Toast.makeText(e.this.f44559a, e.this.f44559a.getResources().getString(a7.j.f13195Z7), 1).show();
                } else {
                    e.this.f44562d = str;
                    e.this.t(this.f44589a);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f44589a) {
                return;
            }
            w.N0(e.this.f44559a);
        }
    }

    public e(Context context, String str) {
        this.f44559a = context;
        this.f44560b = str;
        this.f44561c = new C2858a(context);
    }

    public static long w(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public final void A(ArrayList arrayList) {
        AbstractC2237a.f44482Z = this.f44566h;
        AbstractC2074a.b(this.f44566h + "play/b2c/v1/auth").s(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f44567i).s(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f44568j).t("Content-Type", "FormUrlEncoded").v(k1.e.MEDIUM).u().o(new a(arrayList));
    }

    public final void a(ArrayList arrayList) {
        Context context = this.f44559a;
        if (context != null) {
            SharepreferenceDBHandler.setCurrentAPPType("onestream_api", context);
            String string = this.f44559a.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "");
            this.f44566h = string;
            this.f44566h = string.toLowerCase();
            Log.e("jaskirat", "one stream URl from Back in login helper " + this.f44566h);
            if (!this.f44566h.startsWith("http://") && !this.f44566h.startsWith("https://")) {
                this.f44566h = "http://" + this.f44566h;
            }
            if (!this.f44566h.endsWith("/")) {
                this.f44566h += "/";
            }
            A(arrayList);
        }
    }

    public final void t(boolean z9) {
        String str;
        String str2;
        int autoIdLoggedInUser;
        Context context;
        Activity activity;
        try {
            SharedPreferences.Editor editorEdit = this.f44559a.getSharedPreferences("loginPrefs", 0).edit();
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
            editorEdit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "playlist");
            editorEdit.putString("serverPort", "");
            if (z9) {
                editorEdit.putString("serverUrl", this.f44563e);
                str = this.f44563e;
            } else {
                editorEdit.putString("serverUrl", this.f44564f);
                str = this.f44564f;
            }
            editorEdit.putString("serverM3UUrl", str);
            editorEdit.putString("anyName", this.f44565g);
            editorEdit.apply();
            SharedPreferences sharedPreferences = this.f44559a.getSharedPreferences("allowedFormat", 0);
            SharedPreferences sharedPreferences2 = this.f44559a.getSharedPreferences("timeFormat", 0);
            SharedPreferences sharedPreferences3 = this.f44559a.getSharedPreferences("epgchannelupdate", 0);
            SharedPreferences sharedPreferences4 = this.f44559a.getSharedPreferences("automation_channels", 0);
            SharedPreferences sharedPreferences5 = this.f44559a.getSharedPreferences("automation_epg", 0);
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            SharedPreferences.Editor editorEdit3 = sharedPreferences2.edit();
            SharedPreferences.Editor editorEdit4 = sharedPreferences3.edit();
            SharedPreferences.Editor editorEdit5 = sharedPreferences4.edit();
            SharedPreferences.Editor editorEdit6 = sharedPreferences5.edit();
            try {
                SharedPreferences.Editor editorEdit7 = this.f44559a.getSharedPreferences("auto_start", 0).edit();
                if (editorEdit7 != null) {
                    editorEdit7.putBoolean("full_epg", true);
                    editorEdit7.apply();
                }
                String string = sharedPreferences.getString("allowedFormat", "");
                if (string != null && string.equals("")) {
                    editorEdit2.putString("allowedFormat", "ts");
                    editorEdit2.apply();
                }
                if (sharedPreferences4.getString("automation_channels", "").equals("")) {
                    editorEdit5.putString("automation_channels", "checked");
                    editorEdit5.apply();
                }
                if (sharedPreferences5.getString("automation_epg", "").equals("")) {
                    editorEdit6.putString("automation_epg", "checked");
                    editorEdit6.apply();
                }
                if (sharedPreferences2.getString("timeFormat", AbstractC2237a.f44441E0).equals("")) {
                    editorEdit3.putString("timeFormat", AbstractC2237a.f44441E0);
                    editorEdit3.apply();
                }
                if (sharedPreferences3.getString("epgchannelupdate", "").equals("")) {
                    editorEdit4.putString("epgchannelupdate", "all");
                    editorEdit4.apply();
                }
                AbstractC2237a.f44494d0 = Boolean.TRUE;
                SharepreferenceDBHandler.setCurrentAPPType("m3u", this.f44559a);
                MultiUserDBHandler multiUserDBHandler = new MultiUserDBHandler(this.f44559a);
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f44559a);
                if (z9) {
                    if (!multiUserDBHandler.checkregistration(this.f44565g, "playlist", "playlist", this.f44563e, "m3u", "", "")) {
                        multiUserDBHandler.addmultiusersM3U(this.f44565g, "playlist", "playlist", this.f44563e, "url");
                        Context context2 = this.f44559a;
                        Toast.makeText(context2, context2.getResources().getString(a7.j.f13375r8), 0).show();
                    }
                    SharedPreferences.Editor editorEdit8 = this.f44559a.getSharedPreferences("loginprefsmultiuser", 0).edit();
                    editorEdit8.putString("name", this.f44565g);
                    editorEdit8.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
                    editorEdit8.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "playlist");
                    editorEdit8.putString(AbstractC2237a.f44454L, this.f44563e);
                    editorEdit8.apply();
                    if (this.f44559a != null) {
                        autoIdLoggedInUser = multiUserDBHandler.getAutoIdLoggedInUser(this.f44565g, "playlist", "playlist", this.f44563e, "m3u", "", "");
                        context = this.f44559a;
                        SharepreferenceDBHandler.setUserID(autoIdLoggedInUser, context);
                    }
                } else {
                    if (multiUserDBHandler.checkregistration(this.f44565g, "playlist", "playlist", this.f44564f, "m3u", "", "")) {
                        str2 = CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD;
                    } else {
                        String str3 = this.f44565g;
                        String str4 = this.f44564f;
                        str2 = CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD;
                        multiUserDBHandler.addmultiusersM3U(str3, "playlist", "playlist", str4, TransferTable.COLUMN_FILE);
                        Context context3 = this.f44559a;
                        Toast.makeText(context3, context3.getResources().getString(a7.j.f13375r8), 0).show();
                    }
                    SharedPreferences.Editor editorEdit9 = this.f44559a.getSharedPreferences("loginprefsmultiuser", 0).edit();
                    editorEdit9.putString("name", this.f44565g);
                    editorEdit9.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "playlist");
                    editorEdit9.putString(str2, "playlist");
                    editorEdit9.putString(AbstractC2237a.f44454L, this.f44564f);
                    editorEdit9.apply();
                    if (this.f44559a != null) {
                        autoIdLoggedInUser = new MultiUserDBHandler(this.f44559a).getAutoIdLoggedInUser(this.f44565g, "playlist", "playlist", this.f44564f, "m3u", "", "");
                        context = this.f44559a;
                        SharepreferenceDBHandler.setUserID(autoIdLoggedInUser, context);
                    }
                }
                w.X();
                String str5 = this.f44562d;
                if (str5 != null && !str5.equals("")) {
                    Log.e("jaskirat", "m3uURLGlobal::: " + this.f44562d);
                    SharepreferenceDBHandler.setFirebaseM3uNode(this.f44562d, this.f44559a);
                }
                if (liveStreamDBHandler.getImportTableCount("m3u") == 0) {
                    ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                    ImportStatusModel importStatusModel = new ImportStatusModel();
                    importStatusModel.setType("all");
                    importStatusModel.setStatus("0");
                    importStatusModel.setDate("");
                    arrayList.add(0, importStatusModel);
                    liveStreamDBHandler.importDataStatusArrayList(arrayList, "m3u");
                }
                ImportStatusModel importStatusModel2 = liveStreamDBHandler.getdateDBStatus("all");
                if (importStatusModel2 != null) {
                    if ((importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("0")) && (importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("2"))) {
                        if (importStatusModel2.getStatus() != null && importStatusModel2.getStatus().equals("1")) {
                            long jC = w.C(new SimpleDateFormat("dd/MM/yyyy", Locale.US), importStatusModel2.getDate(), w.q());
                            if (!u() || jC < this.f44561c.g()) {
                                this.f44559a.startActivity(new Intent(this.f44559a, (Class<?>) NewDashboardActivity.class));
                                activity = (Activity) this.f44559a;
                            } else {
                                this.f44559a.startActivity(new Intent(this.f44559a, (Class<?>) ImportM3uActivity.class));
                                activity = (Activity) this.f44559a;
                            }
                        } else {
                            if (importStatusModel2.getStatus() == null || !importStatusModel2.getStatus().equals("3")) {
                                return;
                            }
                            this.f44559a.startActivity(new Intent(this.f44559a, (Class<?>) ImportM3uActivity.class));
                            activity = (Activity) this.f44559a;
                        }
                    } else {
                        if (this.f44559a == null) {
                            return;
                        }
                        this.f44559a.startActivity(new Intent(this.f44559a, (Class<?>) ImportM3uActivity.class));
                        activity = (Activity) this.f44559a;
                    }
                    activity.finish();
                    return;
                }
                return;
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Exception e10) {
            e = e10;
        }
        e.printStackTrace();
    }

    public boolean u() {
        Context context = this.f44559a;
        if (context != null) {
            return context.getSharedPreferences("automation_channels", 0).getString("automation_channels", "").equals("checked");
        }
        return false;
    }

    public final void v(ArrayList arrayList) {
        String oneStreamToken = SharepreferenceDBHandler.getOneStreamToken(this.f44559a);
        SharepreferenceDBHandler.setCurrentAPPType("onestream_api", this.f44559a);
        AbstractC2237a.f44482Z = this.f44566h;
        AbstractC2074a.a(this.f44566h + "play/b2c/v1/user-info?token=" + oneStreamToken).s(k1.e.MEDIUM).q().o(new b(arrayList));
    }

    public final void x(ArrayList arrayList) {
        if (this.f44559a != null) {
            if (arrayList == null || arrayList.size() <= 0) {
                Toast.makeText(this.f44559a.getApplicationContext(), this.f44559a.getResources().getString(a7.j.f12976D2), 0).show();
                return;
            }
            try {
                String strTrim = ((String) arrayList.get(0)).trim();
                this.f44566h = strTrim;
                if (!strTrim.startsWith("http://") && !this.f44566h.startsWith("https://")) {
                    this.f44566h = "http://" + this.f44566h;
                }
                if (!this.f44566h.endsWith("/")) {
                    this.f44566h += "/";
                }
                SharedPreferences.Editor editorEdit = this.f44559a.getSharedPreferences("loginPrefsserverurl", 0).edit();
                editorEdit.putString(AbstractC2237a.f44454L, this.f44566h);
                editorEdit.apply();
                arrayList.remove(0);
                a(arrayList);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public void y(String str, boolean z9, String str2) {
        this.f44565g = str2;
        if (z9) {
            this.f44563e = str;
            new AsyncTaskC0385e(this, null).execute(new Void[0]);
        } else {
            this.f44564f = str;
            new g(false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f44564f);
        }
    }

    public void z(ArrayList arrayList, String str, String str2, String str3) {
        this.f44567i = str;
        this.f44568j = str2;
        this.f44569k = str3;
        a(arrayList);
    }
}
