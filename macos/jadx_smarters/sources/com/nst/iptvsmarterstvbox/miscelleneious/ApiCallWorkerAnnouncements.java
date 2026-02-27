package com.nst.iptvsmarterstvbox.miscelleneious;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import b7.AbstractC1232b;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.getAnnouncementsFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.AnnouncementsSBPSingleton;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import p0.C2386a;
import y5.InterfaceFutureC2987b;
import y5.e;

/* JADX INFO: loaded from: classes.dex */
public class ApiCallWorkerAnnouncements extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f28639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FirebasePresenter f28640h;

    public class a implements FirebasePresenter.OnAnnouncementReceived {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f28641a;

        public a(e eVar) {
            this.f28641a = eVar;
        }

        @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnAnnouncementReceived
        public void a(getAnnouncementsFirebaseCallback getannouncementsfirebasecallback) {
            Log.e("jaskirat", "success");
            if (getannouncementsfirebasecallback != null) {
                try {
                    if (getannouncementsfirebasecallback.b() != null && getannouncementsfirebasecallback.b().equals("success") && getannouncementsfirebasecallback.c() != null) {
                        if (getannouncementsfirebasecallback.d() == null || getannouncementsfirebasecallback.a() == null || getannouncementsfirebasecallback.a().size() <= 0) {
                            SharepreferenceDBHandler.setAnnouncementsList(null, ApiCallWorkerAnnouncements.this.f28639g);
                            AnnouncementsSBPSingleton.b().c(null);
                        } else {
                            AnnouncementsSBPSingleton.b().c(getannouncementsfirebasecallback.a());
                            SharepreferenceDBHandler.setAnnouncementsList(getannouncementsfirebasecallback.a(), ApiCallWorkerAnnouncements.this.f28639g);
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            Intent intent = new Intent(TransferService.INTENT_KEY_NOTIFICATION);
            intent.putExtra("noti_announcements", "announcements");
            C2386a.b(ApiCallWorkerAnnouncements.this.f28639g).d(intent);
            this.f28641a.v(ListenableWorker.a.c());
        }

        @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnAnnouncementReceived
        public void b() {
            this.f28641a.v(ListenableWorker.a.a());
        }
    }

    public ApiCallWorkerAnnouncements(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f28639g = context;
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC2987b p() {
        e eVarX = e.x();
        this.f28640h = new FirebasePresenter(this.f28639g, new a(eVarX));
        String str = new SimpleDateFormat("yyyy-MM").format(new Date());
        if (AbstractC1232b.f17695b.equals("")) {
            r();
        }
        this.f28640h.i(AbstractC2237a.f44469S0, AbstractC2237a.f44471T0, str, w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str), SharepreferenceDBHandler.getDeviceUUID(this.f28639g));
        Log.e("jaskirat", "final exit");
        return eVarX;
    }

    public void r() {
        AbstractC1232b.f17695b = String.valueOf(new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS);
    }
}
