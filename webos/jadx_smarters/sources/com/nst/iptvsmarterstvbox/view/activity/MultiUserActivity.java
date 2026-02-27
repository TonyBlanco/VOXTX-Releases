package com.nst.iptvsmarterstvbox.view.activity;

import T.d;
import a7.c;
import a7.f;
import a7.g;
import a7.j;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.nst.iptvsmarterstvbox.model.MultiUserDBModel;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import m7.AbstractC2237a;
import m7.w;
import q7.F;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class MultiUserActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f30976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f30977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f30978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MultiUserDBHandler f30979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f30980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f30981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f30982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f30983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f30984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f30985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f30986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F f30987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Intent f30988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f30989q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f30990r = "false";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2858a f30991s;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://www.iptvsmarters.com/terms-and-conditions/"));
                MultiUserActivity.this.startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(MultiUserActivity.this.getApplicationContext(), "Your Device Not Supported !!", 1).show();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultiUserActivity.this.f30989q = false;
        }
    }

    private void v1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, c.f11860k));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f30989q) {
            finish();
            finishAffinity();
            return;
        }
        this.f30989q = true;
        try {
            Toast.makeText(this, getResources().getString(j.f12999F5), 0).show();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        new Handler().postDelayed(new b(), 2000L);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f30977e = this;
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
        C2858a c2858a = new C2858a(this.f30977e);
        this.f30991s = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? g.f12766b0 : g.f12759a0);
        this.f30980h = (ProgressBar) findViewById(f.ec);
        this.f30981i = (RecyclerView) findViewById(f.ub);
        this.f30982j = (TextView) findViewById(f.Rj);
        this.f30983k = (TextView) findViewById(f.Qj);
        this.f30984l = (LinearLayout) findViewById(f.sa);
        this.f30985m = (LinearLayout) findViewById(f.f12377d7);
        if (AbstractC2237a.f44526o.booleanValue()) {
            this.f30984l.setVisibility(0);
        } else {
            this.f30984l.setVisibility(8);
        }
        this.f30976d = new d(this);
        Intent intent = getIntent();
        this.f30988p = intent;
        String stringExtra = intent.getStringExtra("from_login");
        this.f30990r = stringExtra;
        if (stringExtra == null) {
            this.f30990r = "false";
        }
        this.f30990r.equals("true");
        getWindow().setFlags(1024, 1024);
        v1();
        this.f30983k.setOnClickListener(new a());
        getSharedPreferences("Accept_clicked", 0).getString("Accept_clicked", "true");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedprefremberme", 0);
        this.f30986n = sharedPreferences;
        sharedPreferences.getBoolean("savelogin", false);
        this.f30979g = new MultiUserDBHandler(this.f30977e);
        w1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.z0(this.f30977e);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public void w1() {
        Handler handler = new Handler();
        this.f30978f = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.f30980h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        x1();
        ProgressBar progressBar2 = this.f30980h;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
    }

    public void x1() {
        ArrayList<MultiUserDBModel> allUsersM3U = this.f30979g.getAllUsersM3U();
        MultiUserDBModel multiUserDBModel = (!SharepreferenceDBHandler.getCurrentAPPType(this.f30977e).equals("m3u") || allUsersM3U.size() <= 0) ? null : allUsersM3U.get(0);
        ArrayList<MultiUserDBModel> allUsers = this.f30979g.getAllUsers();
        if ((SharepreferenceDBHandler.getCurrentAPPType(this.f30977e).equals("api") && allUsers.size() > 0) || (SharepreferenceDBHandler.getCurrentAPPType(this.f30977e).equals("onestream_api") && allUsers.size() > 0)) {
            multiUserDBModel = allUsers.get(0);
        }
        MultiUserDBModel multiUserDBModel2 = multiUserDBModel;
        allUsersM3U.addAll(allUsers);
        allUsersM3U.add(new MultiUserDBModel("", "", "", "", "add_playlist", "", ""));
        if (allUsersM3U.size() > 0) {
            this.f30987o = new F(this, allUsersM3U, this.f30977e, this.f30990r, multiUserDBModel2, this.f30985m);
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.f30977e);
            flexboxLayoutManager.f3(2);
            flexboxLayoutManager.c3(2);
            flexboxLayoutManager.d3(0);
            flexboxLayoutManager.e3(1);
            this.f30981i.setLayoutManager(flexboxLayoutManager);
            this.f30981i.setItemAnimator(new androidx.recyclerview.widget.c());
            this.f30981i.setAdapter(this.f30987o);
        }
        AbstractC2237a.f44494d0 = Boolean.FALSE;
    }
}
