package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.g;
import a7.j;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import m7.w;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.C2619c;
import x5.AbstractC2959b;

/* JADX INFO: loaded from: classes4.dex */
public class AnnouncementsActivity extends androidx.appcompat.app.b implements InterfaceC1233c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f29077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressBar f29078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f29079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f29080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f29081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f29082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView.o f29083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView.g f29084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f29085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Thread f29086o = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(AnnouncementsActivity.this.f29085n);
        }
    }

    public class b extends AbstractC2959b {
        public b() {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(AnnouncementsActivity.this.f29085n);
                String strA = w.A(string);
                TextView textView = AnnouncementsActivity.this.f29081j;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = AnnouncementsActivity.this.f29080i;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    AnnouncementsActivity.this.v1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        x1(getResources().getString(j.f12946A2));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12804h);
        b7.g.f17718c = new b7.g(this);
        this.f29085n = this;
        this.f29077f = (RecyclerView) findViewById(f.ub);
        this.f29078g = (ProgressBar) findViewById(f.oc);
        this.f29079h = (TextView) findViewById(f.Qb);
        this.f29080i = (TextView) findViewById(f.f12129E2);
        this.f29081j = (TextView) findViewById(f.gh);
        this.f29082k = (ImageView) findViewById(f.Xa);
        u1();
        w1();
        Thread thread = this.f29086o;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f29086o = thread2;
            thread2.start();
        }
        this.f29082k.setOnClickListener(new a());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f29086o;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29086o.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f29086o;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f29086o = thread2;
            thread2.start();
        }
        w.z0(this.f29085n);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public void u1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f29075d = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    public void v1() {
        runOnUiThread(new c());
    }

    public void w1() {
        this.f29076e = LoginActivity.S1(b7.f.b(this) + "*" + b7.f.d(this) + "-" + AbstractC1232b.f17695b);
        ArrayList arrayList = new ArrayList();
        b7.g.f17717b = arrayList;
        arrayList.add(b7.g.a("action", "getAnnouncement"));
        b7.g.f17717b.add(b7.g.a("sc", this.f29076e));
        b7.g.f17717b.add(b7.g.a("apikey", b7.f.b(this)));
        b7.g.f17717b.add(b7.g.a("rand_num", AbstractC1232b.f17695b));
        b7.g.f17718c.c(this);
    }

    public void x1(String str) {
        ProgressBar progressBar = this.f29078g;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.f29079h.setText(str);
        this.f29079h.setVisibility(0);
        this.f29077f.setVisibility(8);
    }

    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public void K0(String str, int i9, boolean z9) {
        String string;
        if (z9) {
            if (i9 != 1) {
                return;
            }
            try {
                if (str.isEmpty() && str.equalsIgnoreCase("")) {
                    string = getResources().getString(j.f13431x4);
                } else {
                    AbstractC1232b.f17694a = new JSONObject(str);
                    Gson gson = new Gson();
                    if (!AbstractC1232b.f17694a.getBoolean("status")) {
                        return;
                    }
                    JSONArray jSONArray = AbstractC1232b.f17694a.getJSONArray("response");
                    this.f29077f.setHasFixedSize(true);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
                    this.f29083l = linearLayoutManager;
                    this.f29077f.setLayoutManager(linearLayoutManager);
                    List list = (List) gson.fromJson(jSONArray.toString(), new b().b());
                    if (!list.isEmpty()) {
                        C2619c c2619c = new C2619c(list, this, this);
                        this.f29084m = c2619c;
                        this.f29077f.setAdapter(c2619c);
                        ProgressBar progressBar = this.f29078g;
                        if (progressBar != null) {
                            progressBar.setVisibility(8);
                        }
                        this.f29079h.setVisibility(8);
                        return;
                    }
                    string = getResources().getString(j.f13431x4);
                }
                x1(string);
                return;
            } catch (Exception e9) {
                Log.e("Get Announcements", e9.getMessage());
            }
        }
        x1(getResources().getString(j.f13431x4));
    }
}
