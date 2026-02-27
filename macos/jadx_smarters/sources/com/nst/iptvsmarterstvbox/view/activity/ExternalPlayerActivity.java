package com.nst.iptvsmarterstvbox.view.activity;

import a7.g;
import a7.j;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.C2631o;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class ExternalPlayerActivity extends androidx.appcompat.app.b implements C2631o.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f29805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f29806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PackageManager f29807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f29808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f29809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f29810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f29811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f29812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f29813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f29814m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ExternalPlayerDataBase f29816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2858a f29817p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AlertDialog f29815n = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Thread f29818q = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(ExternalPlayerActivity.this.f29808g);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(ExternalPlayerActivity.this.f29808g);
                String strA = w.A(string);
                TextView textView = ExternalPlayerActivity.this.f29813l;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = ExternalPlayerActivity.this.f29812k;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f29821a;

        public c(PopupWindow popupWindow) {
            this.f29821a = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = this.f29821a;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f29821a.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29823a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f29825d;

        public d(String str, String str2, PopupWindow popupWindow) {
            this.f29823a = str;
            this.f29824c = str2;
            this.f29825d = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExternalPlayerActivity.this.f29816o = new ExternalPlayerDataBase(ExternalPlayerActivity.this.f29808g);
            if (ExternalPlayerActivity.this.f29816o.CheckPlayerExistense(this.f29823a)) {
                w.P0(ExternalPlayerActivity.this.f29808g, "Already Added");
            } else {
                ExternalPlayerActivity.this.f29816o.addExternalPlayer(this.f29823a, this.f29824c);
                w.P0(ExternalPlayerActivity.this.f29808g, this.f29823a + " " + ExternalPlayerActivity.this.getResources().getString(j.f13386t));
                ExternalPlayerActivity.this.onBackPressed();
            }
            PopupWindow popupWindow = this.f29825d;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f29825d.dismiss();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ExternalPlayerActivity.this.A1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class f extends AsyncTask {
        public f() {
        }

        public /* synthetic */ f(ExternalPlayerActivity externalPlayerActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return ExternalPlayerActivity.this.B1();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            List list;
            super.onPostExecute(bool);
            ExternalPlayerActivity.this.f29809h.setVisibility(8);
            if (!bool.booleanValue() || (list = ExternalPlayerActivity.this.f29806e) == null || list.size() <= 0) {
                ExternalPlayerActivity.this.C1(Boolean.FALSE);
                return;
            }
            ExternalPlayerActivity.this.C1(Boolean.TRUE);
            ExternalPlayerActivity externalPlayerActivity = ExternalPlayerActivity.this;
            externalPlayerActivity.f29811j.setLayoutManager(new LinearLayoutManager(externalPlayerActivity.f29808g, 1, false));
            ExternalPlayerActivity externalPlayerActivity2 = ExternalPlayerActivity.this;
            RecyclerView recyclerView = externalPlayerActivity2.f29811j;
            Context context = externalPlayerActivity2.f29808g;
            ExternalPlayerActivity externalPlayerActivity3 = ExternalPlayerActivity.this;
            recyclerView.setAdapter(new C2631o(context, externalPlayerActivity3.f29806e, externalPlayerActivity3));
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ExternalPlayerActivity.this.f29810i.setVisibility(8);
            ExternalPlayerActivity.this.f29811j.setVisibility(8);
            ExternalPlayerActivity.this.f29809h.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean B1() {
        this.f29805d = new ArrayList();
        this.f29806e = new ArrayList();
        PackageManager packageManager = this.f29808g.getPackageManager();
        this.f29807f = packageManager;
        this.f29805d = packageManager.getInstalledApplications(128);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(new File("content://media/internal/video/media")), "video/*");
        Iterator<ResolveInfo> it = getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            try {
                this.f29806e.add(this.f29807f.getApplicationInfo(it.next().activityInfo.packageName, 128));
            } catch (PackageManager.NameNotFoundException e9) {
                e9.printStackTrace();
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C1(Boolean bool) {
        if (bool.booleanValue()) {
            this.f29810i.setVisibility(8);
            this.f29811j.setVisibility(0);
        } else {
            this.f29810i.setVisibility(0);
            this.f29811j.setVisibility(8);
        }
    }

    private void z1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public void A1() {
        runOnUiThread(new b());
    }

    public final void D1(String str, String str2) {
        try {
            View viewInflate = ((LayoutInflater) this.f29808g.getSystemService("layout_inflater")).inflate(g.f12777c4, (RelativeLayout) findViewById(a7.f.Re));
            PopupWindow popupWindow = new PopupWindow(this.f29808g);
            popupWindow.setContentView(viewInflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12412h1);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12544u1);
            ((TextView) viewInflate.findViewById(a7.f.Di)).setText(getResources().getString(j.f13033J));
            button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
            button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
            button.setOnClickListener(new c(popupWindow));
            button2.setOnClickListener(new d(str, str2, popupWindow));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void E1() {
        new f(this, null).execute(new Boolean[0]);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29808g = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f29808g);
        this.f29817p = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? g.f12626E : g.f12620D);
        w.Y(this);
        this.f29809h = (LinearLayout) findViewById(a7.f.B9);
        this.f29810i = (LinearLayout) findViewById(a7.f.Y8);
        this.f29811j = (RecyclerView) findViewById(a7.f.Cd);
        this.f29812k = (TextView) findViewById(a7.f.f12129E2);
        this.f29813l = (TextView) findViewById(a7.f.gh);
        this.f29814m = (ImageView) findViewById(a7.f.Xa);
        getWindow().setFlags(1024, 1024);
        z1();
        Thread thread = this.f29818q;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new e());
            this.f29818q = thread2;
            thread2.start();
        }
        E1();
        this.f29814m.setOnClickListener(new a());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f29818q;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29818q.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f29818q;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new e());
            this.f29818q = thread2;
            thread2.start();
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        w.z0(this.f29808g);
    }

    @Override // q7.C2631o.b
    public void s0(View view, String str, String str2) {
        D1(str, str2);
    }
}
