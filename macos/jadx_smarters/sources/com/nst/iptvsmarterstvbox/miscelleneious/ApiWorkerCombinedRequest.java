package com.nst.iptvsmarterstvbox.miscelleneious;

import android.content.Context;
import android.content.Intent;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import b7.AbstractC1232b;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.CheckMaintainencemode;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.DashboardData;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.GetAllcombinedashrequest;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.GetAnnouncements;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.GetApkversion;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.GetAppStoragePrefences;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.GetLastupdated;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.RewardedData;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.SbpCombinedResponse;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.maintanencemodel.AdvertismentModel;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.AnnouncementsSBPSingleton;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.DashBoardListssingleton;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import p0.C2386a;
import retrofit2.Response;
import y5.InterfaceFutureC2987b;
import y5.e;

/* JADX INFO: loaded from: classes.dex */
public class ApiWorkerCombinedRequest extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f28652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FirebasePresenter f28653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f28654i;

    public class a implements FirebasePresenter.OnCombinedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f28655a;

        public a(e eVar) {
            this.f28655a = eVar;
        }

        @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnCombinedListener
        public void a() {
            this.f28655a.v(ListenableWorker.a.a());
        }

        @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnCombinedListener
        public void b(Response response) {
            if (response.body() == null || !response.isSuccessful() || ((SbpCombinedResponse) response.body()).getResult() == null || !((SbpCombinedResponse) response.body()).getResult().equalsIgnoreCase("success") || ((SbpCombinedResponse) response.body()).getSc() == null || ((SbpCombinedResponse) response.body()).getSc().length() <= 0) {
                return;
            }
            ApiWorkerCombinedRequest.this.H("Api success");
            if (((SbpCombinedResponse) response.body()).getGetAllcombinedashrequest() != null) {
                ApiWorkerCombinedRequest.this.z(((SbpCombinedResponse) response.body()).getGetAllcombinedashrequest());
            }
            if (((SbpCombinedResponse) response.body()).getCheckMaintainencemode() != null) {
                ApiWorkerCombinedRequest.this.F(((SbpCombinedResponse) response.body()).getCheckMaintainencemode());
            }
            if (((SbpCombinedResponse) response.body()).getGetAnnouncements() != null) {
                ApiWorkerCombinedRequest.this.A(((SbpCombinedResponse) response.body()).getGetAnnouncements());
            }
            if (((SbpCombinedResponse) response.body()).getGetAppStoragePrefences() != null) {
                ApiWorkerCombinedRequest.this.C(((SbpCombinedResponse) response.body()).getGetAppStoragePrefences());
            }
            if (((SbpCombinedResponse) response.body()).getGetLastupdated() == null || ((SbpCombinedResponse) response.body()).getGetLastupdated().getNextrequest() == null || ((SbpCombinedResponse) response.body()).getGetLastupdated().getNextrequest().length() <= 0) {
                SharepreferenceDBHandler.setLastUpdate(24, ApiWorkerCombinedRequest.this.f28652g);
                SharepreferenceDBHandler.setLastUpdateTime(w.p(), ApiWorkerCombinedRequest.this.f28652g);
            } else {
                ApiWorkerCombinedRequest.this.E(((SbpCombinedResponse) response.body()).getGetLastupdated());
            }
            if (((SbpCombinedResponse) response.body()).getGetApkversion() != null) {
                ApiWorkerCombinedRequest.this.B(((SbpCombinedResponse) response.body()).getGetApkversion());
            }
            ApiWorkerCombinedRequest.this.H("Result.success()");
            this.f28655a.v(ListenableWorker.a.c());
        }
    }

    public ApiWorkerCombinedRequest(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f28654i = new ArrayList();
        this.f28652g = context;
    }

    public final void A(GetAnnouncements getAnnouncements) {
        try {
            if (getAnnouncements.getTotalrecords() == null || getAnnouncements.getData() == null || getAnnouncements.getData().size() <= 0) {
                SharepreferenceDBHandler.setAnnouncementsList(null, this.f28652g);
                AnnouncementsSBPSingleton.b().c(null);
            } else {
                AnnouncementsSBPSingleton.b().c(getAnnouncements.getData());
                SharepreferenceDBHandler.setAnnouncementsList(getAnnouncements.getData(), this.f28652g);
            }
            C2386a.b(this.f28652g).d(new Intent(TransferService.INTENT_KEY_NOTIFICATION).putExtra("noti_announcements", "announcement"));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        H("setAnnouncementsData");
    }

    public final void B(GetApkversion getApkversion) {
        String appversion;
        String apkversionname;
        String appdownloadlink;
        try {
            appversion = getApkversion.getData().getAppversion();
            try {
                apkversionname = getApkversion.getData().getApkversionname();
            } catch (Exception e9) {
                e = e9;
                apkversionname = "";
            }
        } catch (Exception e10) {
            e = e10;
            appversion = "";
            apkversionname = appversion;
        }
        try {
            appdownloadlink = getApkversion.getData().getAppdownloadlink();
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
            appdownloadlink = "";
        }
        if (appversion == null || appversion.length() <= 0) {
            SharepreferenceDBHandler.setUpdateVersionCode(a(), "", "", "");
        } else if (!appversion.contains(InstructionFileId.DOT)) {
            if (Integer.parseInt(appversion) > 108) {
                SharepreferenceDBHandler.setUpdateVersionCode(a(), appversion, appdownloadlink, apkversionname);
                Intent intent = new Intent(TransferService.INTENT_KEY_NOTIFICATION);
                intent.putExtra("app_version", "appversion");
                C2386a.b(this.f28652g).d(intent);
            } else {
                SharepreferenceDBHandler.setUpdateVersionCode(a(), String.valueOf(108), "", "5.0");
            }
        }
        H("setApkVersionData");
    }

    public final void C(GetAppStoragePrefences getAppStoragePrefences) {
        Intent intent;
        String str;
        if (getAppStoragePrefences.getData().getMode().equalsIgnoreCase("1")) {
            if (SharepreferenceDBHandler.isLocalDb(this.f28652g)) {
                SharepreferenceDBHandler.setLocalDb(this.f28652g, false);
                intent = new Intent(TransferService.INTENT_KEY_NOTIFICATION);
                str = "firebase";
                intent.putExtra("notification_popup", str);
                C2386a.b(this.f28652g).d(intent);
            }
        } else if (!SharepreferenceDBHandler.isLocalDb(this.f28652g)) {
            SharepreferenceDBHandler.setLocalDb(this.f28652g, true);
            intent = new Intent(TransferService.INTENT_KEY_NOTIFICATION);
            str = "local";
            intent.putExtra("notification_popup", str);
            C2386a.b(this.f28652g).d(intent);
        }
        H("setAppStoragePref");
    }

    public final void D(GetAllcombinedashrequest getAllcombinedashrequest) {
        List<DashboardData> list;
        ArrayList arrayList = null;
        if (getAllcombinedashrequest.getDashboard().getData() == null || getAllcombinedashrequest.getDashboard().getTotalrecords() == null || getAllcombinedashrequest.getDashboard().getTotalrecords().intValue() <= 0 || getAllcombinedashrequest.getDashboard().getData().size() <= 0) {
            DashBoardListssingleton.b().d(null);
            SharepreferenceDBHandler.setDashboardTextList(null, this.f28652g);
            SharepreferenceDBHandler.setDashboardImageList(null, this.f28652g);
        } else {
            DashBoardListssingleton.b().d(null);
            DashBoardListssingleton.b().g(null);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            List<DashboardData> data = getAllcombinedashrequest.getDashboard().getData();
            int i9 = 0;
            while (i9 < data.size()) {
                if (data.get(i9).getPages() == null || !data.get(i9).getPages().equalsIgnoreCase("dashboard")) {
                    list = data;
                } else {
                    DashboardData dashboardData = data.get(i9);
                    String type = dashboardData.getType();
                    if (type != null && type.equalsIgnoreCase("image")) {
                        String pages = dashboardData.getPages();
                        dashboardData.getType();
                        String redirectLink = dashboardData.getRedirectLink();
                        List<String> images = dashboardData.getImages();
                        int i10 = 0;
                        while (i10 < images.size()) {
                            String str = images.get(i10);
                            AdvertismentModel advertismentModel = new AdvertismentModel();
                            advertismentModel.e(type);
                            advertismentModel.c(pages);
                            advertismentModel.a(str);
                            advertismentModel.b("");
                            advertismentModel.d(redirectLink);
                            this.f28654i.add(advertismentModel);
                            arrayList4.add(redirectLink);
                            arrayList2.add(str);
                            i10++;
                            data = data;
                        }
                    }
                    list = data;
                    String pages2 = dashboardData.getPages();
                    String type2 = dashboardData.getType();
                    String text = dashboardData.getText();
                    String redirectLink2 = dashboardData.getRedirectLink();
                    AdvertismentModel advertismentModel2 = new AdvertismentModel();
                    advertismentModel2.e(type2);
                    advertismentModel2.c(pages2);
                    advertismentModel2.a("");
                    advertismentModel2.b(text);
                    advertismentModel2.d(redirectLink2);
                    this.f28654i.add(advertismentModel2);
                    arrayList5.add(redirectLink2);
                    arrayList3.add(text);
                }
                i9++;
                data = list;
            }
            if (arrayList2.size() > 0) {
                SharepreferenceDBHandler.setDashboardImageList(arrayList2, this.f28652g);
                arrayList = null;
            } else {
                arrayList = null;
                DashBoardListssingleton.b().d(null);
                SharepreferenceDBHandler.setDashboardImageList(null, this.f28652g);
            }
            if (arrayList3.size() > 0) {
                SharepreferenceDBHandler.setDashboardTextList(arrayList3, this.f28652g);
                H("setDashboardResults");
            }
            SharepreferenceDBHandler.setDashboardTextList(arrayList, this.f28652g);
        }
        DashBoardListssingleton.b().g(arrayList);
        H("setDashboardResults");
    }

    public final void E(GetLastupdated getLastupdated) {
        int i9;
        SharepreferenceDBHandler.setVPNLastUpdate(true, this.f28652g);
        String nextrequest = getLastupdated.getNextrequest();
        if (nextrequest.contains(InstructionFileId.DOT)) {
            nextrequest = nextrequest.substring(0, nextrequest.indexOf(46));
        }
        try {
            i9 = Integer.parseInt(nextrequest);
        } catch (NumberFormatException e9) {
            e9.printStackTrace();
            i9 = 24;
        }
        SharepreferenceDBHandler.setLastUpdate(i9, this.f28652g);
        SharepreferenceDBHandler.setLastUpdateTime(w.p(), this.f28652g);
        H("setLastUpdate");
    }

    public final void F(CheckMaintainencemode checkMaintainencemode) {
        if (checkMaintainencemode.getMaintenancemode() == null || !checkMaintainencemode.getMaintenancemode().equalsIgnoreCase("on")) {
            H("maintenance mode off");
            SharepreferenceDBHandler.setMaintanceModeState(false, a());
        } else {
            H("maintenance mode on");
            SharepreferenceDBHandler.setMaintanceModeState(true, this.f28652g);
            String footercontent = checkMaintainencemode.getFootercontent() != null ? checkMaintainencemode.getFootercontent() : "";
            String message = checkMaintainencemode.getMessage() != null ? checkMaintainencemode.getMessage() : "";
            if (footercontent != null) {
                SharepreferenceDBHandler.setMaintanceModeFooterMessage(footercontent, a());
            }
            if (message != null) {
                SharepreferenceDBHandler.setMaintanceModeMessage(message, a());
            }
        }
        C2386a.b(this.f28652g).d(new Intent(TransferService.INTENT_KEY_NOTIFICATION).putExtra("sbp_maintenance_mode", "maintenance_mode"));
        H("setMaintenanceModeResult");
    }

    public final void G(GetAllcombinedashrequest getAllcombinedashrequest) {
        ArrayList arrayList;
        if (getAllcombinedashrequest.getRewarded().getTotalrecords() != null && getAllcombinedashrequest.getRewarded().getTotalrecords().intValue() > 0 && getAllcombinedashrequest.getRewarded().getData() != null && getAllcombinedashrequest.getRewarded().getData().size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            List<RewardedData> data = getAllcombinedashrequest.getRewarded().getData();
            for (int i9 = 0; i9 < data.size(); i9++) {
                if (data.get(i9).getPages() != null && data.get(i9).getPages().equalsIgnoreCase("dashboard")) {
                    RewardedData rewardedData = data.get(i9);
                    String type = rewardedData.getType();
                    if (type != null && type.equalsIgnoreCase("image")) {
                        String pages = rewardedData.getPages();
                        rewardedData.getType();
                        String redirectLink = rewardedData.getRedirectLink();
                        List<String> images = rewardedData.getImages();
                        for (int i10 = 0; i10 < images.size(); i10++) {
                            String str = images.get(i10);
                            AdvertismentModel advertismentModel = new AdvertismentModel();
                            advertismentModel.e(type);
                            advertismentModel.c(pages);
                            advertismentModel.a(str);
                            advertismentModel.b("");
                            advertismentModel.d(redirectLink);
                            this.f28654i.add(advertismentModel);
                            arrayList4.add(redirectLink);
                            arrayList2.add(str);
                        }
                    } else if (type != null && type.equalsIgnoreCase("message")) {
                        String pages2 = rewardedData.getPages();
                        String type2 = rewardedData.getType();
                        String text = rewardedData.getText();
                        String redirectLink2 = rewardedData.getRedirectLink();
                        AdvertismentModel advertismentModel2 = new AdvertismentModel();
                        advertismentModel2.e(type2);
                        advertismentModel2.c(pages2);
                        advertismentModel2.a("");
                        advertismentModel2.b(text);
                        advertismentModel2.d(redirectLink2);
                        this.f28654i.add(advertismentModel2);
                        arrayList5.add(redirectLink2);
                        arrayList3.add(text);
                    }
                }
            }
            if (arrayList2.size() > 0) {
                arrayList = null;
                Listsingleton.b().d(null);
                SharepreferenceDBHandler.setRewardedImageList(null, this.f28652g);
                SharepreferenceDBHandler.setRewardedImageList(arrayList2, this.f28652g);
            } else {
                arrayList = null;
                Listsingleton.b().d(null);
                SharepreferenceDBHandler.setRewardedImageList(null, this.f28652g);
            }
            if (arrayList3.size() > 0) {
                SharepreferenceDBHandler.setRewardedTextList(arrayList, this.f28652g);
                Listsingleton.b().f(arrayList);
                SharepreferenceDBHandler.setRewardedTextList(arrayList3, this.f28652g);
            }
            H("setRewardedResults");
        }
        arrayList = null;
        Listsingleton.b().d(null);
        SharepreferenceDBHandler.setRewardedImageList(null, this.f28652g);
        SharepreferenceDBHandler.setRewardedTextList(arrayList, this.f28652g);
        Listsingleton.b().f(arrayList);
        H("setRewardedResults");
    }

    public final void H(String str) {
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC2987b p() {
        e eVarX = e.x();
        this.f28653h = new FirebasePresenter(this.f28652g, new a(eVarX));
        String str = new SimpleDateFormat("yyyy-MM").format(new Date());
        r();
        this.f28653h.l(AbstractC2237a.f44469S0, AbstractC2237a.f44471T0, AbstractC1232b.f17695b, str, w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str), "get-allcombinedashrequest", (SharepreferenceDBHandler.getDeviceUUID(this.f28652g) == null || SharepreferenceDBHandler.getDeviceUUID(this.f28652g).length() <= 0) ? "" : SharepreferenceDBHandler.getDeviceUUID(this.f28652g));
        return eVarX;
    }

    public void r() {
        AbstractC1232b.f17695b = String.valueOf(new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS);
    }

    public void z(GetAllcombinedashrequest getAllcombinedashrequest) {
        if (getAllcombinedashrequest == null || !getAllcombinedashrequest.getResult().equalsIgnoreCase("success")) {
            Listsingleton.b().d(null);
            SharepreferenceDBHandler.setRewardedImageList(null, this.f28652g);
            SharepreferenceDBHandler.setRewardedTextList(null, this.f28652g);
            Listsingleton.b().f(null);
        } else {
            if (getAllcombinedashrequest.getRewarded() == null || !getAllcombinedashrequest.getRewarded().getAddStatus().equalsIgnoreCase("1")) {
                Listsingleton.b().d(null);
                SharepreferenceDBHandler.setRewardedImageList(null, this.f28652g);
                SharepreferenceDBHandler.setRewardedTextList(null, this.f28652g);
                Listsingleton.b().f(null);
            } else {
                SharepreferenceDBHandler.setPrefAdsStatus(getAllcombinedashrequest.getRewarded().getAddStatus(), this.f28652g);
                SharepreferenceDBHandler.setViewableRate(Integer.parseInt(getAllcombinedashrequest.getRewarded().getAddViewableRate()), this.f28652g);
                AbstractC2237a.f44498e1 = SharepreferenceDBHandler.getPrefAdsStatus(this.f28652g);
                AbstractC2237a.f44501f1 = SharepreferenceDBHandler.getViewableRate(this.f28652g);
                G(getAllcombinedashrequest);
            }
            if (!AbstractC2237a.f44526o.booleanValue()) {
                if (getAllcombinedashrequest.getDashboard() == null || !getAllcombinedashrequest.getDashboard().getAddStatus().equalsIgnoreCase("1")) {
                    DashBoardListssingleton.b().d(null);
                    DashBoardListssingleton.b().g(null);
                    SharepreferenceDBHandler.setDashboardImageList(null, this.f28652g);
                    SharepreferenceDBHandler.setDashboardTextList(null, this.f28652g);
                } else {
                    D(getAllcombinedashrequest);
                }
            }
        }
        C2386a.b(this.f28652g).d(new Intent(TransferService.INTENT_KEY_NOTIFICATION).putExtra("sbp_panel_ads", "ads_data"));
        H("adsDataResponseSuccess");
    }
}
