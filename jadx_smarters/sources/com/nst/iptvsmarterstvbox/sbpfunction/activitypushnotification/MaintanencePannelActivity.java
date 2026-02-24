package com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification;

import a7.c;
import a7.e;
import a7.f;
import a7.g;
import a7.j;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import b7.AbstractC1232b;
import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.SBPAdvertisementsMaintanceCallBack;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.AdvertisementListSingleton;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class MaintanencePannelActivity extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f28703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f28706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f28707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28708j;

    public final /* synthetic */ void A1(View view) {
        try {
            this.f28706h.setVisibility(0);
            w1();
        } catch (Exception unused) {
            Toast.makeText(this, "Something went Wrong", 0).show();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Log.e("honey", "onBackPressed: ");
        if (this.f28707i + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            finish();
        } else {
            try {
                Toast.makeText(getBaseContext(), getResources().getString(j.f12999F5), 0).show();
            } catch (Exception unused) {
            }
        }
        this.f28707i = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12740X);
        this.f28702d = (TextView) findViewById(f.db);
        this.f28703e = (LinearLayout) findViewById(f.ii);
        this.f28704f = (TextView) findViewById(f.Um);
        this.f28705g = (TextView) findViewById(f.sm);
        this.f28706h = (LinearLayout) findViewById(f.A9);
        if (!SharepreferenceDBHandler.getMaintanceModeMessage(getApplicationContext()).equalsIgnoreCase("")) {
            this.f28702d.setText(SharepreferenceDBHandler.getMaintanceModeMessage(getApplicationContext()));
        }
        if (!SharepreferenceDBHandler.getMaintanceModeFooterMessage(getApplicationContext()).equalsIgnoreCase("")) {
            this.f28704f.setText(SharepreferenceDBHandler.getMaintanceModeFooterMessage(getApplicationContext()));
        }
        this.f28703e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.MaintanencePannelActivity.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                Resources resources;
                int i9;
                TextView textView = MaintanencePannelActivity.this.f28705g;
                if (z9) {
                    textView.setTextColor(MaintanencePannelActivity.this.getResources().getColor(c.f11849G));
                    linearLayout = MaintanencePannelActivity.this.f28703e;
                    resources = MaintanencePannelActivity.this.getResources();
                    i9 = e.f11909F;
                } else {
                    textView.setTextColor(MaintanencePannelActivity.this.getResources().getColor(c.f11850a));
                    linearLayout = MaintanencePannelActivity.this.f28703e;
                    resources = MaintanencePannelActivity.this.getResources();
                    i9 = e.f12078y;
                }
                linearLayout.setBackground(resources.getDrawable(i9));
            }
        });
        this.f28703e.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28737a.A1(view);
            }
        });
    }

    public void v1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f28708j = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    public final void w1() {
        Retrofit retrofitP = w.P(this);
        if (retrofitP != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitP.create(RetrofitPost.class);
            String str = new SimpleDateFormat("yyyy-MM").format(new Date());
            v1();
            String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", AbstractC2237a.f44492c1);
            retrofitPost.getSBPAdvertisementsMaintance(jsonObject).enqueue(new Callback<SBPAdvertisementsMaintanceCallBack>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.MaintanencePannelActivity.2
                @Override // retrofit2.Callback
                public void onFailure(Call<SBPAdvertisementsMaintanceCallBack> call, Throwable th) {
                    MaintanencePannelActivity.this.f28706h.setVisibility(8);
                    MaintanencePannelActivity maintanencePannelActivity = MaintanencePannelActivity.this;
                    Toast.makeText(maintanencePannelActivity, maintanencePannelActivity.getResources().getString(j.f13244e7), 0).show();
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<SBPAdvertisementsMaintanceCallBack> call, Response<SBPAdvertisementsMaintanceCallBack> response) {
                    MaintanencePannelActivity.this.f28706h.setVisibility(8);
                    if (response.isSuccessful() && response.body() != null && response.body().d() != null && response.body().e() != null && response.body().d().equals("success")) {
                        if (response.body().b() == null || !response.body().b().equalsIgnoreCase("on")) {
                            SharepreferenceDBHandler.setMaintanceModeState(false, MaintanencePannelActivity.this.getApplicationContext());
                            MaintanencePannelActivity.this.finish();
                        } else {
                            SharepreferenceDBHandler.setMaintanceModeState(true, MaintanencePannelActivity.this.getApplicationContext());
                        }
                        String strA = response.body().a();
                        String strC = response.body().c();
                        if (strA != null) {
                            SharepreferenceDBHandler.setMaintanceModeFooterMessage(strA, MaintanencePannelActivity.this.getApplicationContext());
                        }
                        if (strC != null) {
                            SharepreferenceDBHandler.setMaintanceModeMessage(strC, MaintanencePannelActivity.this.getApplicationContext());
                        }
                    }
                    AdvertisementListSingleton.b().a().clear();
                }
            });
        }
    }
}
