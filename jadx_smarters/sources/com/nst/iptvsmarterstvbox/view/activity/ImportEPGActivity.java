package com.nst.iptvsmarterstvbox.view.activity;

import B7.d;
import a7.c;
import a7.f;
import a7.g;
import a7.j;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.b;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.utility.LoadingGearSpinner;
import java.util.ArrayList;
import m7.w;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class ImportEPGActivity extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f30247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LiveStreamDBHandler f30248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f30249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f30250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f30251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f30253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f30254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f30255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LoadingGearSpinner f30256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f30257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f30258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2858a f30259p;

    public class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f30260a;

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ImportEPGActivity$a$a, reason: collision with other inner class name */
        public class AsyncTaskC0272a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public volatile boolean f30262a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Context f30263b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f30264c;

            public AsyncTaskC0272a(Context context) {
                this.f30263b = null;
                this.f30264c = ImportEPGActivity.this.f30258o.size();
                this.f30263b = context;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                ImportEPGActivity importEPGActivity = ImportEPGActivity.this;
                LiveStreamDBHandler liveStreamDBHandler = importEPGActivity.f30248e;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.addEPG(importEPGActivity.f30258o);
                }
                return Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                int size = ImportEPGActivity.this.f30258o.size();
                ImportEPGActivity importEPGActivity = ImportEPGActivity.this;
                importEPGActivity.f30257n = importEPGActivity.getSharedPreferences("loginPrefs", 0);
                ImportEPGActivity.this.f30257n.getString("skip", "");
                w.P0(ImportEPGActivity.this.f30247d, ImportEPGActivity.this.getResources().getString(j.f12995F1) + " (" + size + ")");
                ImportEPGActivity.this.f30248e.updateImportStatus("epg", "1");
                if (ImportEPGActivity.this.f30247d != null) {
                    ImportEPGActivity.this.startActivity(new Intent(ImportEPGActivity.this.f30247d, (Class<?>) NewDashboardActivity.class));
                    ImportEPGActivity.this.finish();
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
                this.f30262a = false;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public a() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            d dVar = new d();
            this.f30260a = dVar;
            dVar.a(ImportEPGActivity.this.f30247d);
            ImportEPGActivity.this.f30258o = this.f30260a.b();
            return (ImportEPGActivity.this.f30258o == null || ImportEPGActivity.this.f30258o.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            Intent intent;
            if (bool.booleanValue()) {
                try {
                    ImportEPGActivity importEPGActivity = ImportEPGActivity.this;
                    TextView textView = importEPGActivity.f30250g;
                    if (textView != null) {
                        textView.setText(importEPGActivity.getResources().getString(j.f13409v2));
                    }
                    new AsyncTaskC0272a(ImportEPGActivity.this.f30247d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    return;
                } catch (Exception unused) {
                    ImportEPGActivity.this.f30248e.updateImportStatus("epg", "1");
                    if (ImportEPGActivity.this.f30247d == null) {
                        return;
                    } else {
                        intent = new Intent(ImportEPGActivity.this.f30247d, (Class<?>) NewDashboardActivity.class);
                    }
                }
            } else {
                ImportEPGActivity importEPGActivity2 = ImportEPGActivity.this;
                w.P0(importEPGActivity2.f30247d, importEPGActivity2.getResources().getString(j.f13271h4));
                ImportEPGActivity.this.f30248e.updateImportStatus("epg", "0");
                if (ImportEPGActivity.this.f30247d == null) {
                    return;
                } else {
                    intent = new Intent(ImportEPGActivity.this.f30247d, (Class<?>) NewDashboardActivity.class);
                }
            }
            ImportEPGActivity.this.startActivity(intent);
            ImportEPGActivity.this.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    private void y1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, c.f11860k));
    }

    private void z1() {
        if (this.f30247d != null) {
            this.f30257n = getSharedPreferences("loginPrefs", 0);
            new a().execute(new Void[0]);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12668L);
        this.f30249f = (TextView) findViewById(f.Il);
        this.f30250g = (TextView) findViewById(f.Cj);
        this.f30251h = (ProgressBar) findViewById(f.Nc);
        this.f30252i = (TextView) findViewById(f.Mk);
        this.f30253j = (TextView) findViewById(f.pi);
        this.f30254k = (RelativeLayout) findViewById(f.ve);
        this.f30255l = (RelativeLayout) findViewById(f.ue);
        this.f30256m = (LoadingGearSpinner) findViewById(f.f12436j5);
        y1();
        this.f30247d = this;
        this.f30248e = new LiveStreamDBHandler(this.f30247d);
        C2858a c2858a = new C2858a(this.f30247d);
        this.f30259p = c2858a;
        if (c2858a.c()) {
            w.r(this.f30247d);
        }
        z1();
        getWindow().setFlags(1024, 1024);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f30247d);
        w.z0(this.f30247d);
        getWindow().setFlags(1024, 1024);
    }
}
