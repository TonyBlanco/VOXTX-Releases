package com.nst.iptvsmarterstvbox.view.activity;

import D.AbstractC0519b;
import a7.f;
import a7.g;
import a7.j;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.model.MultiUserDBModel;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.utility.LoadingGearSpinner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import m7.w;

/* JADX INFO: loaded from: classes4.dex */
public class ImportM3uActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f30266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f30267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f30268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressBar f30269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f30270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f30272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f30273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LoadingGearSpinner f30274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LiveStreamDBHandler f30275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f30276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InputStream f30277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final A7.a f30278p = new A7.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MultiUserDBHandler f30279q;

    public class b extends AsyncTask {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            String string;
            try {
                URL url = new URL(strArr[0]);
                ImportM3uActivity.this.y1();
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(ImportM3uActivity.this.f30266d.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                Log.e("file size", "size" + file2.length());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = Build.VERSION.SDK_INT >= 26 ? new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get(new File(ImportM3uActivity.this.f30266d.getFilesDir() + "/data_temp.txt").toString(), new String[0]), new OpenOption[0]))) : null;
                if (file2.length() > 50) {
                    string = "";
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        string = (string + line) + "\n";
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line2 = bufferedReader.readLine();
                        if (line2 == null) {
                            break;
                        }
                        sb.append(line2);
                        sb.append('\n');
                    }
                    string = sb.toString();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
                return Boolean.TRUE;
            } catch (Exception e10) {
                Log.d("Google", "DownloadFileFromUrl " + e10.getMessage());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (!bool.booleanValue()) {
                    w.P0(ImportM3uActivity.this.f30266d, "Incorrect File/URL");
                    ImportM3uActivity.this.onBackPressed();
                    return;
                }
                ImportM3uActivity importM3uActivity = ImportM3uActivity.this;
                TextView textView = importM3uActivity.f30268f;
                if (textView != null) {
                    textView.setText(importM3uActivity.getResources().getString(j.f13399u2));
                }
                ImportM3uActivity.this.new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ImportM3uActivity.this.f30266d.getFilesDir() + "/data_temp.txt");
            } catch (Exception unused) {
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

    public class c extends AsyncTask {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                ImportM3uActivity.this.f30277o = new FileInputStream(new File(strArr[0]));
                ImportM3uActivity importM3uActivity = ImportM3uActivity.this;
                if (importM3uActivity.f30278p.d(importM3uActivity.f30277o, importM3uActivity.f30266d)) {
                    ImportM3uActivity.this.f30275m.deleteChannelsHistoryDuplicateM3U();
                    ImportM3uActivity.this.f30275m.deleteFavDuplicateM3U();
                }
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            } catch (OutOfMemoryError unused2) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            Intent intent;
            super.onPostExecute(bool);
            try {
                File file = new File(ImportM3uActivity.this.f30266d.getFilesDir() + "/data_temp.txt");
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            if (bool.booleanValue()) {
                LiveStreamDBHandler liveStreamDBHandler = ImportM3uActivity.this.f30275m;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.updateImportStatus("all", "1");
                }
                SharedPreferences sharedPreferences = ImportM3uActivity.this.getSharedPreferences("loginPrefs", 0);
                sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                String string = sharedPreferences.getString("serverUrl", "");
                sharedPreferences.getString("serverM3UUrl", "");
                sharedPreferences.getString("anyName", "M3ULine");
                if (!string.startsWith("http://")) {
                    string.startsWith("https://");
                }
                SharepreferenceDBHandler.setCurrentAPPType("m3u", ImportM3uActivity.this.f30266d);
                ImportM3uActivity.this.f30279q = new MultiUserDBHandler(ImportM3uActivity.this.f30266d);
                if (ImportM3uActivity.this.f30266d == null) {
                    return;
                } else {
                    intent = new Intent(ImportM3uActivity.this.f30266d, (Class<?>) NewDashboardActivity.class);
                }
            } else {
                LiveStreamDBHandler liveStreamDBHandler2 = ImportM3uActivity.this.f30275m;
                if (liveStreamDBHandler2 != null) {
                    liveStreamDBHandler2.updateImportStatus("all", "2");
                }
                if (ImportM3uActivity.this.f30266d == null) {
                    return;
                } else {
                    intent = new Intent(ImportM3uActivity.this.f30266d, (Class<?>) NewDashboardActivity.class);
                }
            }
            ImportM3uActivity.this.startActivity(intent);
            ImportM3uActivity.this.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            LiveStreamDBHandler liveStreamDBHandler = ImportM3uActivity.this.f30275m;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.updateImportStatus("all", "3");
            }
        }
    }

    private void v1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void x1() {
        Intent intent;
        if (this.f30266d != null) {
            this.f30276n = getSharedPreferences("loginPrefs", 0);
            ArrayList<MultiUserDBModel> userDetails = this.f30279q.getUserDetails(SharepreferenceDBHandler.getUserID(this.f30266d));
            if (userDetails == null || userDetails.size() <= 0) {
                Context context = this.f30266d;
                w.P0(context, context.getResources().getString(j.f13385s8));
                intent = new Intent(this.f30266d, (Class<?>) NewDashboardActivity.class);
            } else {
                String str = userDetails.get(0).getmagportal();
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (userDetails.get(0).getM3uType().equals(TransferTable.COLUMN_FILE)) {
                    if (!str.equals("")) {
                        TextView textView = this.f30268f;
                        if (textView != null) {
                            textView.setText(getResources().getString(j.f13399u2));
                        }
                        new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
                        return;
                    }
                    Context context2 = this.f30266d;
                    w.P0(context2, context2.getResources().getString(j.f13260g3));
                    intent = new Intent(this.f30266d, (Class<?>) NewDashboardActivity.class);
                } else if (!str.equals("")) {
                    new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
                    return;
                } else {
                    Context context3 = this.f30266d;
                    w.P0(context3, context3.getResources().getString(j.f13270h3));
                    intent = new Intent(this.f30266d, (Class<?>) NewDashboardActivity.class);
                }
            }
            startActivity(intent);
            finish();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12674M);
        w.Y(this);
        this.f30267e = (TextView) findViewById(f.Il);
        this.f30268f = (TextView) findViewById(f.Dj);
        this.f30269g = (ProgressBar) findViewById(f.Nc);
        this.f30270h = (TextView) findViewById(f.Mk);
        this.f30271i = (TextView) findViewById(f.pi);
        this.f30272j = (LinearLayout) findViewById(f.ve);
        this.f30273k = (RelativeLayout) findViewById(f.ue);
        this.f30274l = (LoadingGearSpinner) findViewById(f.f12436j5);
        v1();
        getWindow().setFlags(1024, 1024);
        this.f30266d = this;
        this.f30275m = new LiveStreamDBHandler(this.f30266d);
        this.f30279q = new MultiUserDBHandler(this.f30266d);
        if (this.f30275m.getImportTableCount("m3u") == 0) {
            ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
            ImportStatusModel importStatusModel = new ImportStatusModel();
            importStatusModel.setType("all");
            importStatusModel.setStatus("0");
            importStatusModel.setDate("");
            arrayList.add(0, importStatusModel);
            this.f30275m.importDataStatusArrayList(arrayList, "m3u");
        }
        w1();
        x1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f30266d);
        w.z0(this.f30266d);
        getWindow().setFlags(1024, 1024);
    }

    public void w1() {
        LiveStreamDBHandler liveStreamDBHandler = this.f30275m;
        if (liveStreamDBHandler != null) {
            liveStreamDBHandler.makeEmptyAllTablesRecordsM3U();
        }
    }

    public void y1() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23) {
            if (i9 >= 33) {
                if (checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                    return;
                }
                AbstractC0519b.h(this, new String[]{"android.permission.READ_MEDIA_AUDIO"}, 101);
                return;
            } else if (E.b.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGEandroid.permission.READ_EXTERNAL_STORAGE") != 0) {
                Log.v("TAG", "Permission is revoked");
                AbstractC0519b.h(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
                return;
            }
        }
        Log.v("TAG", "Permission is granted");
    }
}
