package com.nst.iptvsmarterstvbox.view.activity;

import a7.c;
import a7.f;
import a7.g;
import a7.j;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import m7.w;
import q7.f0;

/* JADX INFO: loaded from: classes4.dex */
public class TVArchiveActivity extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f32660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TabLayout f32661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewPager f32662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f32663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Toolbar f32664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AppBarLayout f32665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f32666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f32667k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LiveStreamDBHandler f32669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f32670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f32671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f32672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f32673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f32674r;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f32668l = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f32675s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f32676t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32677u = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32678v = new DatabaseUpdatedStatusDBModel();

    public class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i9, float f9, int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i9) {
        }
    }

    private void u1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, c.f11860k));
    }

    private ArrayList v1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f32669m.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f32666j));
        this.f32670n = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f32668l.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f32668l;
    }

    private ArrayList w1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) it.next();
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (liveStreamCategoryIdDBModel.getLiveStreamCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    } else {
                        ArrayList arrayList3 = this.f32671o;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamCategoryIdDBModel);
                        }
                    }
                }
            }
        }
        return this.f32671o;
    }

    private void x1() {
        this.f32660d = (ProgressBar) findViewById(f.ec);
        this.f32661e = (TabLayout) findViewById(f.ig);
        this.f32662f = (ViewPager) findViewById(f.Om);
        this.f32663g = (ImageView) findViewById(f.Bj);
        this.f32664h = (Toolbar) findViewById(f.kh);
        this.f32665i = (AppBarLayout) findViewById(f.f12303W);
    }

    private void y1() {
        ViewPager viewPager;
        try {
            if (this.f32666j != null) {
                this.f32669m = new LiveStreamDBHandler(this.f32666j);
                this.f32670n = new ArrayList();
                this.f32671o = new ArrayList();
                this.f32672p = new ArrayList();
                this.f32673q = new ArrayList();
                this.f32674r = new ArrayList();
                this.f32674r = this.f32669m.getAllliveCategories();
                ArrayList<LiveStreamCategoryIdDBModel> allliveCategories = this.f32669m.getAllliveCategories();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                new LiveStreamCategoryIdDBModel();
                liveStreamCategoryIdDBModel.setLiveStreamCategoryID("0");
                liveStreamCategoryIdDBModel.setLiveStreamCategoryName(getResources().getString(j.f13426x));
                if (this.f32669m.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f32666j)) <= 0 || allliveCategories == null) {
                    allliveCategories.add(0, liveStreamCategoryIdDBModel);
                } else {
                    ArrayList arrayListV1 = v1();
                    this.f32668l = arrayListV1;
                    this.f32672p = w1(allliveCategories, arrayListV1);
                    this.f32671o.add(0, liveStreamCategoryIdDBModel);
                    allliveCategories = this.f32672p;
                }
                this.f32673q = allliveCategories;
                ArrayList arrayList = this.f32673q;
                if (arrayList == null || (viewPager = this.f32662f) == null || this.f32661e == null) {
                    return;
                }
                viewPager.setAdapter(new f0(arrayList, getSupportFragmentManager(), this));
                this.f32661e.setupWithViewPager(this.f32662f);
                this.f32662f.setOnPageChangeListener(new a());
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void b() {
        ProgressBar progressBar = this.f32660d;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12842n1);
        x1();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        u1();
        r1((Toolbar) findViewById(f.kh));
        getWindow().setFlags(1024, 1024);
        this.f32666j = this;
        y1();
        ImageView imageView = this.f32663g;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f32666j);
        w.z0(this.f32666j);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32667k = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f32667k.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f32666j != null) {
            b();
        }
    }
}
