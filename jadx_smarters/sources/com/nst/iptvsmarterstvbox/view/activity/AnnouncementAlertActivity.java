package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.g;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b7.AbstractC1232b;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.JsonElement;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.AnnouncementsData;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AdsLastUpdateResponseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.getAnnouncementsFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.readAnnouncementFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.AnnouncementsSBPSingleton;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;

/* JADX INFO: loaded from: classes4.dex */
public class AnnouncementAlertActivity extends Activity implements FirebaseInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f29061a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f29062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29063d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29064e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29065f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29066g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f29067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f29068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f29069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AnnouncementAlertActivity f29070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FirebasePresenter f29071l;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(AnnouncementAlertActivity.this.f29070k);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(AnnouncementAlertActivity.this.f29070k);
                String strA = w.A(string);
                TextView textView = AnnouncementAlertActivity.this.f29068i;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = AnnouncementAlertActivity.this.f29067h;
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
                    AnnouncementAlertActivity.this.b();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void Q0(getAnnouncementsFirebaseCallback getannouncementsfirebasecallback) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (getannouncementsfirebasecallback != null) {
            try {
                if (getannouncementsfirebasecallback.b() == null || !getannouncementsfirebasecallback.b().equals("success") || getannouncementsfirebasecallback.c() == null) {
                    return;
                }
                if (getannouncementsfirebasecallback.d() == null || getannouncementsfirebasecallback.a() == null || getannouncementsfirebasecallback.a().size() <= 0) {
                    try {
                        SharepreferenceDBHandler.setAnnouncementsList(null, this.f29070k);
                        AnnouncementsSBPSingleton.b().c(null);
                        return;
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
                for (int i9 = 0; i9 < SharepreferenceDBHandler.getAnnouncementsList(this.f29070k).size(); i9++) {
                    arrayList2.add(SharepreferenceDBHandler.getAnnouncementsList(this.f29070k).get(i9).getId());
                }
                for (AnnouncementsData announcementsData : getannouncementsfirebasecallback.a()) {
                    if (arrayList2.contains(announcementsData.getId())) {
                        arrayList.add(announcementsData);
                    }
                }
                AnnouncementsSBPSingleton.b().c(arrayList);
                SharepreferenceDBHandler.setAnnouncementsList(arrayList, this.f29070k);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a() {
        AbstractC1232b.f17695b = String.valueOf(new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS);
    }

    public void b() {
        runOnUiThread(new b());
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void h(AdsLastUpdateResponseCallback adsLastUpdateResponseCallback) {
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void k0(readAnnouncementFirebaseCallback readannouncementfirebasecallback) {
        List listA;
        if (readannouncementfirebasecallback != null) {
            try {
                if (readannouncementfirebasecallback.a() == null || !readannouncementfirebasecallback.a().equals("success") || (listA = AnnouncementsSBPSingleton.b().a()) == null || listA.size() <= 0) {
                    return;
                }
                for (int i9 = 0; i9 < listA.size(); i9++) {
                    if (((AnnouncementsData) listA.get(i9)).getId().equals(this.f29065f)) {
                        AnnouncementsData announcementsData = (AnnouncementsData) listA.get(i9);
                        announcementsData.setSeen(1);
                        listA.set(i9, announcementsData);
                    }
                }
                AnnouncementsSBPSingleton.b().c(listA);
                SharepreferenceDBHandler.setAnnouncementsList(listA, this.f29070k);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12798g);
        this.f29070k = this;
        this.f29067h = (TextView) findViewById(f.f12129E2);
        this.f29068i = (TextView) findViewById(f.gh);
        this.f29069j = (ImageView) findViewById(f.Xa);
        this.f29062c = (TextView) findViewById(f.zh);
        this.f29061a = (TextView) findViewById(f.Ah);
        this.f29071l = new FirebasePresenter(this.f29070k, this);
        Intent intent = getIntent();
        this.f29063d = intent.getStringExtra("Title");
        this.f29064e = intent.getStringExtra("Description");
        this.f29061a.setText(this.f29063d);
        this.f29062c.setText(MyApplication.p().o(this.f29064e));
        this.f29062c.setMovementMethod(LinkMovementMethod.getInstance());
        if (AbstractC2237a.f44475V0.booleanValue()) {
            this.f29065f = intent.getStringExtra(JsonDocumentFields.POLICY_ID);
            String stringExtra = intent.getStringExtra("CheckSeen");
            this.f29066g = stringExtra;
            if (!stringExtra.equals("1")) {
                String str = new SimpleDateFormat("yyyy-MM").format(new Date());
                if (AbstractC1232b.f17695b.equals("")) {
                    a();
                }
                this.f29071l.h(AbstractC2237a.f44469S0, AbstractC2237a.f44471T0, str, w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str), SharepreferenceDBHandler.getDeviceUUID(this), this.f29065f);
            }
        }
        this.f29069j.setOnClickListener(new a());
        new Thread(new c()).start();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        w.z0(this.f29070k);
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface
    public void z(JsonElement jsonElement) {
    }
}
