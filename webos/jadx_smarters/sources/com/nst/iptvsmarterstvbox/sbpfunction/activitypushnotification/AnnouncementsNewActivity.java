package com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification;

import a7.f;
import a7.g;
import a7.j;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b7.AbstractC1232b;
import b7.InterfaceC1233c;
import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.Gson;
import com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification.AnnouncementsAdapterNew;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import m7.w;
import org.json.JSONArray;
import org.json.JSONObject;
import x5.AbstractC2959b;

/* JADX INFO: loaded from: classes.dex */
public class AnnouncementsNewActivity extends b implements InterfaceC1233c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f28687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressBar f28688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f28691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f28692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView.o f28693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView.g f28694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f28695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Thread f28696o = null;

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    AnnouncementsNewActivity.this.x1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28701a;

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28701a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28701a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28701a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            if (z9) {
                f9 = z9 ? 1.23f : 1.0f;
                b(f9);
                c(f9);
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
            }
        }
    }

    @Override // b7.InterfaceC1233c
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
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
                    this.f28687f.setHasFixedSize(true);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
                    this.f28693l = linearLayoutManager;
                    this.f28687f.setLayoutManager(linearLayoutManager);
                    List list = (List) gson.fromJson(jSONArray.toString(), new AbstractC2959b() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.AnnouncementsNewActivity.2
                    }.b());
                    if (!list.isEmpty()) {
                        AnnouncementsAdapterNew announcementsAdapterNew = new AnnouncementsAdapterNew(list, this);
                        this.f28694m = announcementsAdapterNew;
                        this.f28687f.setAdapter(announcementsAdapterNew);
                        ProgressBar progressBar = this.f28688g;
                        if (progressBar != null) {
                            progressBar.setVisibility(8);
                        }
                        this.f28689h.setVisibility(8);
                        return;
                    }
                    string = getResources().getString(j.f13431x4);
                }
                z1(string);
                return;
            } catch (Exception e9) {
                Log.e("Get Announcements", e9.getMessage());
            }
        }
        z1(getResources().getString(j.f13431x4));
    }

    @Override // b7.InterfaceC1233c
    public void b0(int i9) {
        z1(getResources().getString(j.f12946A2));
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
        this.f28695n = this;
        this.f28687f = (RecyclerView) findViewById(f.ub);
        this.f28688g = (ProgressBar) findViewById(f.oc);
        this.f28689h = (TextView) findViewById(f.Qb);
        this.f28690i = (TextView) findViewById(f.f12129E2);
        this.f28691j = (TextView) findViewById(f.gh);
        this.f28692k = (ImageView) findViewById(f.Xa);
        u1();
        y1();
        Thread thread = this.f28696o;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28696o = thread2;
            thread2.start();
        }
        this.f28692k.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.AnnouncementsNewActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                w.j(AnnouncementsNewActivity.this.f28695n);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28696o;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28696o.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28696o;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28696o = thread2;
            thread2.start();
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public void u1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f28685d = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    public void x1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.AnnouncementsNewActivity.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(AnnouncementsNewActivity.this.f28695n);
                    String strA = w.A(string);
                    if (AnnouncementsNewActivity.this.f28691j != null) {
                        AnnouncementsNewActivity.this.f28691j.setText(strR);
                    }
                    if (AnnouncementsNewActivity.this.f28690i != null) {
                        AnnouncementsNewActivity.this.f28690i.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void y1() {
        this.f28686e = LoginActivity.S1(b7.f.b(this) + "*" + b7.f.d(this) + "-" + AbstractC1232b.f17695b);
        ArrayList arrayList = new ArrayList();
        b7.g.f17717b = arrayList;
        arrayList.add(b7.g.a("action", "getAnnouncement"));
        b7.g.f17717b.add(b7.g.a("sc", this.f28686e));
        b7.g.f17717b.add(b7.g.a("apikey", b7.f.b(this)));
        b7.g.f17717b.add(b7.g.a("rand_num", AbstractC1232b.f17695b));
        b7.g.f17718c.c(this);
    }

    public void z1(String str) {
        ProgressBar progressBar = this.f28688g;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.f28689h.setText(str);
        this.f28689h.setVisibility(0);
        this.f28687f.setVisibility(8);
    }
}
