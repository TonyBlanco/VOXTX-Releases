package com.nst.iptvsmarterstvbox.view.activity;

import D.AbstractC0519b;
import a7.f;
import a7.g;
import a7.j;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.core.widget.NestedScrollView;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.io.File;
import java.util.Calendar;
import m7.AbstractC2237a;
import m7.w;
import n7.c;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class CheckAppupdateActivity extends androidx.appcompat.app.b implements c.b, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f29220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f29221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f29222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f29223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f29224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NestedScrollView f29225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f29226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f29227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f29228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f29229m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Context f29232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2858a f29233q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n7.c f29235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f29236t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f29230n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f29231o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Thread f29234r = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(CheckAppupdateActivity.this.f29232p);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(CheckAppupdateActivity.this.f29232p);
                String strA = w.A(string);
                TextView textView = CheckAppupdateActivity.this.f29221e;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = CheckAppupdateActivity.this.f29220d;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    CheckAppupdateActivity.this.v1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class d extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f29240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ProgressDialog f29241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f29242c;

        public d(Context context, String str) {
            this.f29240a = context;
            this.f29242c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
        /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v5, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r15v6, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r15v8, types: [java.net.HttpURLConnection, java.net.URLConnection] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean doInBackground(java.lang.String... r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.CheckAppupdateActivity.d.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        public final /* synthetic */ void c(DialogInterface dialogInterface) {
            cancel(true);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f29241b.dismiss();
            if (bool.booleanValue()) {
                CheckAppupdateActivity checkAppupdateActivity = CheckAppupdateActivity.this;
                checkAppupdateActivity.x1(checkAppupdateActivity);
            } else {
                Toast.makeText(CheckAppupdateActivity.this.getApplicationContext(), "Downloading failed. Please try again.", 0).show();
                Log.e("DownloadTask", "Download failed or canceled.");
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            this.f29241b.setMessage("Downloaded " + numArr[0] + "%");
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            super.onCancelled();
            this.f29241b.dismiss();
            Log.e("DownloadTask", "Download canceled.");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(this.f29240a);
            this.f29241b = progressDialog;
            progressDialog.setMessage("Downloading 0%");
            this.f29241b.setCancelable(false);
            this.f29241b.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: p7.l
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f46658a.c(dialogInterface);
                }
            });
            this.f29241b.show();
        }
    }

    public void A1(boolean z9) {
        if (!z9) {
            this.f29223g.setText(getResources().getString(j.f13295j8) + this.f29230n + " " + getResources().getString(j.f13305k8));
            this.f29222f.setText(getResources().getString(j.f12978D4));
            this.f29228l.setVisibility(8);
            this.f29227k.setText(getResources().getString(j.f13083O));
            this.f29226j.setVisibility(8);
            this.f29227k.requestFocus();
            this.f29227k.requestFocusFromTouch();
            return;
        }
        this.f29225i.setVisibility(0);
        String updateVersionName = SharepreferenceDBHandler.getUpdateVersionName(this.f29232p);
        if (updateVersionName == null || updateVersionName.length() <= 0) {
            return;
        }
        String str = getResources().getString(j.f13013H) + " " + getResources().getString(j.f13003G) + " " + getResources().getString(j.f13023I);
        this.f29223g.setText(str + " " + updateVersionName);
    }

    @Override // n7.c.b
    public void R0() {
        b();
        A1(false);
    }

    public void a() {
        ProgressBar progressBar = this.f29224h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f29225i.setVisibility(8);
    }

    public void b() {
        ProgressBar progressBar = this.f29224h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.f29225i.setVisibility(0);
    }

    @Override // n7.c.b
    public void f(String str) {
        this.f29236t = str;
        b();
        A1(true);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 101) {
            try {
                this.f29230n = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != f.f12534t1) {
            if (id == f.f12382e1) {
                onBackPressed();
                return;
            }
            return;
        }
        try {
            if (w1(this) && y1()) {
                try {
                    x1(this);
                } catch (Exception unused) {
                    Toast.makeText(this.f29232p, "Latest Version is Already installed", 0).show();
                }
            } else if (w1(this)) {
                this.f29224h.setVisibility(8);
                new d(this, "IPTVSmartersPro.apk").execute(this.f29236t);
            } else {
                try {
                    AbstractC0519b.h(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("Exception ppp", e10.toString());
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29232p = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f29232p);
        this.f29233q = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? g.f12870s : g.f12864r);
        w.Y(this);
        this.f29220d = (TextView) findViewById(f.f12129E2);
        this.f29221e = (TextView) findViewById(f.gh);
        this.f29222f = (TextView) findViewById(f.hi);
        this.f29223g = (TextView) findViewById(f.gi);
        this.f29224h = (ProgressBar) findViewById(f.oc);
        this.f29225i = (NestedScrollView) findViewById(f.Ob);
        this.f29226j = (LinearLayout) findViewById(f.f12215M8);
        this.f29227k = (Button) findViewById(f.f12382e1);
        Button button = (Button) findViewById(f.f12534t1);
        this.f29228l = button;
        button.setOnClickListener(this);
        this.f29227k.setOnClickListener(this);
        this.f29229m = (ImageView) findViewById(f.Xa);
        Thread thread = this.f29234r;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f29234r = thread2;
            thread2.start();
        }
        try {
            this.f29230n = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
        }
        Button button2 = this.f29228l;
        button2.setOnFocusChangeListener(new w.k((View) button2, this));
        Button button3 = this.f29227k;
        button3.setOnFocusChangeListener(new w.k((View) button3, this));
        this.f29228l.requestFocus();
        this.f29228l.requestFocusFromTouch();
        a();
        n7.c cVar = new n7.c(this, this.f29232p);
        this.f29235s = cVar;
        cVar.d();
        this.f29229m.setOnClickListener(new a());
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (y1()) {
            z1();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f29234r;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29234r.interrupt();
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
        new d(this, "IPTVSmartersPro.apk").execute(this.f29236t);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f29234r;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f29234r = thread2;
            thread2.start();
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        w.z0(this.f29232p);
    }

    public void v1() {
        runOnUiThread(new b());
    }

    public final boolean w1(Activity activity) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 33 && i9 >= 23) {
            return E.b.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0 && E.b.checkSelfPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        return true;
    }

    public final void x1(Activity activity) {
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

    public final boolean y1() {
        return new File(this.f29232p.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "IPTVSmartersPro.apk").exists();
    }

    public final boolean z1() {
        return new File(this.f29232p.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "IPTVSmartersPro.apk").delete();
    }
}
