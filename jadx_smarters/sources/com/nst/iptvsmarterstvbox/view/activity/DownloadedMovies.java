package com.nst.iptvsmarterstvbox.view.activity;

import a7.c;
import a7.f;
import a7.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.DownloadedDataModel;
import com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import m7.AbstractC2237a;
import m7.w;
import q7.C2617a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class DownloadedMovies extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DownloadedDBHandler f29244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f29245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f29246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f29247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2617a f29248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f29249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f29250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f29251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f29252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f29253m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f29257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GridLayoutManager f29258r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C2858a f29260t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f29254n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f29255o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Thread f29256p = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f29259s = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public BroadcastReceiver f29261u = new b();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadedMovies.this.onBackPressed();
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadedMovies downloadedMovies;
            C2617a c2617a;
            try {
                String stringExtra = intent.getStringExtra("status");
                int i9 = 0;
                if (stringExtra.equals("completed")) {
                    int intExtra = intent.getIntExtra("percent", 0);
                    String stringExtra2 = intent.getStringExtra("url");
                    Log.i("getPercent", "percent:" + intExtra);
                    DownloadedMovies downloadedMovies2 = DownloadedMovies.this;
                    downloadedMovies2.f29245e = downloadedMovies2.f29244d.getDownloadedData();
                    while (i9 < DownloadedMovies.this.f29245e.size()) {
                        if (((DownloadedDataModel) DownloadedMovies.this.f29245e.get(i9)).getMovieURL().equals(stringExtra2)) {
                            ((DownloadedDataModel) DownloadedMovies.this.f29245e.get(i9)).setMovieState("Completed");
                            ((DownloadedDataModel) DownloadedMovies.this.f29245e.get(i9)).setMoviePercentage(intExtra);
                            downloadedMovies = DownloadedMovies.this;
                            c2617a = downloadedMovies.f29248h;
                            if (c2617a == null) {
                                return;
                            }
                        } else {
                            i9++;
                        }
                    }
                    return;
                }
                if (stringExtra.equals("downloading")) {
                    int intExtra2 = intent.getIntExtra("percent", 0);
                    String stringExtra3 = intent.getStringExtra("url");
                    Log.i("getPercent", "percent:" + intExtra2);
                    DownloadedMovies downloadedMovies3 = DownloadedMovies.this;
                    downloadedMovies3.f29245e = downloadedMovies3.f29244d.getDownloadedData();
                    while (i9 < DownloadedMovies.this.f29245e.size()) {
                        if (!((DownloadedDataModel) DownloadedMovies.this.f29245e.get(i9)).getMovieURL().equals(stringExtra3)) {
                            i9++;
                        } else {
                            if (intExtra2 == 0) {
                                return;
                            }
                            ((DownloadedDataModel) DownloadedMovies.this.f29245e.get(i9)).setMoviePercentage(intExtra2);
                            downloadedMovies = DownloadedMovies.this;
                            c2617a = downloadedMovies.f29248h;
                            if (c2617a == null) {
                                return;
                            }
                        }
                    }
                    return;
                }
                if (stringExtra.equals("failed")) {
                    int intExtra3 = intent.getIntExtra("percent", 0);
                    String stringExtra4 = intent.getStringExtra("url");
                    Log.i("getPercent", "percent:" + intExtra3);
                    DownloadedMovies downloadedMovies4 = DownloadedMovies.this;
                    downloadedMovies4.f29245e = downloadedMovies4.f29244d.getDownloadedData();
                    while (i9 < DownloadedMovies.this.f29245e.size()) {
                        if (((DownloadedDataModel) DownloadedMovies.this.f29245e.get(i9)).getMovieURL().equals(stringExtra4)) {
                            ((DownloadedDataModel) DownloadedMovies.this.f29245e.get(i9)).setMovieState("Failed");
                            ((DownloadedDataModel) DownloadedMovies.this.f29245e.get(i9)).setMoviePercentage(intExtra3);
                            downloadedMovies = DownloadedMovies.this;
                            c2617a = downloadedMovies.f29248h;
                            if (c2617a == null) {
                                return;
                            }
                        } else {
                            i9++;
                        }
                    }
                    return;
                }
                return;
                c2617a.F0(downloadedMovies.f29245e);
            } catch (Exception unused) {
            }
        }
    }

    private void w1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, c.f11860k));
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29257q = this;
        x1();
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f29257q);
        this.f29260t = c2858a;
        if (c2858a.A().equals(AbstractC2237a.f44453K0)) {
            this.f29259s = "tv";
        } else {
            this.f29259s = "mobile";
        }
        setContentView(this.f29259s.equals("mobile") ? g.f12876t : g.f12882u);
        this.f29249i = (RecyclerView) findViewById(f.Dd);
        this.f29250j = (TextView) findViewById(f.f12129E2);
        this.f29251k = (TextView) findViewById(f.gh);
        this.f29252l = (ImageView) findViewById(f.f12141F4);
        this.f29253m = (TextView) findViewById(f.vk);
        getWindow().setFlags(1024, 1024);
        w1();
        u1();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.i("methodCalled", "onResume");
        y1();
        w.z0(this.f29257q);
    }

    public final void u1() {
        this.f29252l.setOnClickListener(new a());
    }

    public void x1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void y1() {
        StringBuilder sb;
        try {
            this.f29244d = new DownloadedDBHandler(this.f29257q);
            this.f29245e = new ArrayList();
            this.f29246f = new ArrayList();
            this.f29247g = new ArrayList();
            ArrayList<DownloadedDataModel> downloadedData = this.f29244d.getDownloadedData();
            this.f29245e = downloadedData;
            if (downloadedData.size() <= 0) {
                this.f29253m.setVisibility(0);
                return;
            }
            int i9 = 0;
            while (i9 < this.f29245e.size()) {
                if (((DownloadedDataModel) this.f29245e.get(i9)).getMovieType().equals("TYPE_API")) {
                    this.f29246f.add((DownloadedDataModel) this.f29245e.get(i9));
                    sb = new StringBuilder();
                    sb.append("type:");
                    sb.append(i9);
                } else {
                    this.f29247g.add((DownloadedDataModel) this.f29245e.get(i9));
                    sb = new StringBuilder();
                    sb.append("single:");
                    sb.append(i9);
                }
                Log.i("filterDataIS", sb.toString());
                i9++;
                if (i9 == this.f29245e.size()) {
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f29257q).equals("api")) {
                        try {
                            if (this.f29246f.size() > 0) {
                                this.f29248h = new C2617a(this.f29257q, this.f29246f, this.f29249i, this.f29253m);
                            } else {
                                this.f29253m.setVisibility(0);
                            }
                        } catch (Exception unused) {
                            this.f29253m.setVisibility(0);
                        }
                    } else if (this.f29247g.size() > 0) {
                        this.f29248h = new C2617a(this.f29257q, this.f29247g, this.f29249i, this.f29253m);
                    } else {
                        this.f29253m.setVisibility(0);
                    }
                    this.f29249i.setAdapter(this.f29248h);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f29257q, 7);
                    this.f29258r = gridLayoutManager;
                    this.f29249i.setLayoutManager(gridLayoutManager);
                    this.f29249i.requestFocus();
                }
            }
        } catch (Exception unused2) {
            this.f29253m.setVisibility(0);
        }
    }
}
