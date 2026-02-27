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
import com.nst.iptvsmarterstvbox.sbpfunction.adsdatacallback.AdsDataResponse;
import com.nst.iptvsmarterstvbox.sbpfunction.adsdatacallback.DashboardData;
import com.nst.iptvsmarterstvbox.sbpfunction.adsdatacallback.RewardedData;
import com.nst.iptvsmarterstvbox.sbpfunction.maintanencemodel.AdvertismentModel;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.AdsInterface;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.AddSpeedPresenter;
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
import y5.InterfaceFutureC2987b;
import y5.e;

/* JADX INFO: loaded from: classes.dex */
public class ApiCallWorker extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f28634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AddSpeedPresenter f28635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f28636i;

    public class a implements AdsInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f28637a;

        public a(e eVar) {
            this.f28637a = eVar;
        }

        @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.AdsInterface
        public void a(AdsDataResponse adsDataResponse) {
            Log.e("jaskirat", "success");
            if (adsDataResponse == null || !adsDataResponse.b().equalsIgnoreCase("success")) {
                Listsingleton.b().d(null);
                SharepreferenceDBHandler.setRewardedImageList(null, ApiCallWorker.this.f28634g);
                SharepreferenceDBHandler.setRewardedTextList(null, ApiCallWorker.this.f28634g);
                Listsingleton.b().f(null);
            } else {
                if (adsDataResponse.c() == null || !adsDataResponse.c().a().equalsIgnoreCase("1")) {
                    Listsingleton.b().d(null);
                    SharepreferenceDBHandler.setRewardedImageList(null, ApiCallWorker.this.f28634g);
                    SharepreferenceDBHandler.setRewardedTextList(null, ApiCallWorker.this.f28634g);
                    Listsingleton.b().f(null);
                } else {
                    SharepreferenceDBHandler.setPrefAdsStatus(adsDataResponse.c().a(), ApiCallWorker.this.f28634g);
                    SharepreferenceDBHandler.setViewableRate(Integer.parseInt(adsDataResponse.c().b()), ApiCallWorker.this.f28634g);
                    AbstractC2237a.f44498e1 = SharepreferenceDBHandler.getPrefAdsStatus(ApiCallWorker.this.f28634g);
                    AbstractC2237a.f44501f1 = SharepreferenceDBHandler.getViewableRate(ApiCallWorker.this.f28634g);
                    ApiCallWorker.this.w(adsDataResponse);
                }
                if (!AbstractC2237a.f44526o.booleanValue()) {
                    if (adsDataResponse.a() == null || !adsDataResponse.a().a().equalsIgnoreCase("1")) {
                        DashBoardListssingleton.b().d(null);
                        DashBoardListssingleton.b().g(null);
                        SharepreferenceDBHandler.setDashboardImageList(null, ApiCallWorker.this.f28634g);
                        SharepreferenceDBHandler.setDashboardTextList(null, ApiCallWorker.this.f28634g);
                    } else {
                        ApiCallWorker.this.v(adsDataResponse);
                    }
                }
            }
            C2386a.b(ApiCallWorker.this.f28634g).d(new Intent(TransferService.INTENT_KEY_NOTIFICATION));
            this.f28637a.v(ListenableWorker.a.c());
        }

        @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.AdsInterface
        public void b(String str) {
            Log.e("jaskirat", "failure");
            this.f28637a.v(ListenableWorker.a.a());
        }
    }

    public ApiCallWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f28636i = new ArrayList();
        this.f28634g = context;
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC2987b p() {
        e eVarX = e.x();
        this.f28635h = new AddSpeedPresenter(this.f28634g, new a(eVarX));
        String str = new SimpleDateFormat("yyyy-MM").format(new Date());
        r();
        this.f28635h.b(AbstractC2237a.f44469S0, AbstractC2237a.f44471T0, AbstractC1232b.f17695b, str, w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str), "get-allcombinedashrequest");
        Log.e("jaskirat", "final exit");
        return eVarX;
    }

    public void r() {
        AbstractC1232b.f17695b = String.valueOf(new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS);
    }

    public final void v(AdsDataResponse adsDataResponse) {
        List list;
        ArrayList arrayList = null;
        if (adsDataResponse.a().b() == null || adsDataResponse.a().c() == null || adsDataResponse.a().c().intValue() <= 0 || adsDataResponse.a().b().size() <= 0) {
            DashBoardListssingleton.b().d(null);
            SharepreferenceDBHandler.setDashboardTextList(null, this.f28634g);
            SharepreferenceDBHandler.setDashboardImageList(null, this.f28634g);
        } else {
            DashBoardListssingleton.b().d(null);
            DashBoardListssingleton.b().g(null);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            List listB = adsDataResponse.a().b();
            int i9 = 0;
            while (i9 < listB.size()) {
                if (((DashboardData) listB.get(i9)).b() == null || !((DashboardData) listB.get(i9)).b().equalsIgnoreCase("dashboard")) {
                    list = listB;
                } else {
                    DashboardData dashboardData = (DashboardData) listB.get(i9);
                    String strE = dashboardData.e();
                    if (strE != null && strE.equalsIgnoreCase("image")) {
                        String strB = dashboardData.b();
                        dashboardData.e();
                        String strC = dashboardData.c();
                        List listA = dashboardData.a();
                        int i10 = 0;
                        while (i10 < listA.size()) {
                            String str = (String) listA.get(i10);
                            AdvertismentModel advertismentModel = new AdvertismentModel();
                            advertismentModel.e(strE);
                            advertismentModel.c(strB);
                            advertismentModel.a(str);
                            advertismentModel.b("");
                            advertismentModel.d(strC);
                            this.f28636i.add(advertismentModel);
                            arrayList4.add(strC);
                            arrayList2.add(str);
                            i10++;
                            listB = listB;
                        }
                    }
                    list = listB;
                    String strB2 = dashboardData.b();
                    String strE2 = dashboardData.e();
                    String strD = dashboardData.d();
                    String strC2 = dashboardData.c();
                    AdvertismentModel advertismentModel2 = new AdvertismentModel();
                    advertismentModel2.e(strE2);
                    advertismentModel2.c(strB2);
                    advertismentModel2.a("");
                    advertismentModel2.b(strD);
                    advertismentModel2.d(strC2);
                    this.f28636i.add(advertismentModel2);
                    arrayList5.add(strC2);
                    arrayList3.add(strD);
                }
                i9++;
                listB = list;
            }
            if (arrayList2.size() > 0) {
                SharepreferenceDBHandler.setDashboardImageList(arrayList2, this.f28634g);
                arrayList = null;
            } else {
                arrayList = null;
                DashBoardListssingleton.b().d(null);
                SharepreferenceDBHandler.setDashboardImageList(null, this.f28634g);
            }
            if (arrayList3.size() > 0) {
                SharepreferenceDBHandler.setDashboardTextList(arrayList3, this.f28634g);
                return;
            }
            SharepreferenceDBHandler.setDashboardTextList(arrayList, this.f28634g);
        }
        DashBoardListssingleton.b().g(arrayList);
    }

    public final void w(AdsDataResponse adsDataResponse) {
        ArrayList arrayList;
        if (adsDataResponse.c().d() == null || adsDataResponse.c().d().intValue() <= 0 || adsDataResponse.c().c() == null || adsDataResponse.c().c().size() <= 0) {
            arrayList = null;
            Listsingleton.b().d(null);
            SharepreferenceDBHandler.setRewardedImageList(null, this.f28634g);
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            List listC = adsDataResponse.c().c();
            for (int i9 = 0; i9 < listC.size(); i9++) {
                if (((RewardedData) listC.get(i9)).b() != null && ((RewardedData) listC.get(i9)).b().equalsIgnoreCase("dashboard")) {
                    RewardedData rewardedData = (RewardedData) listC.get(i9);
                    String strE = rewardedData.e();
                    if (strE != null && strE.equalsIgnoreCase("image")) {
                        String strB = rewardedData.b();
                        rewardedData.e();
                        String strC = rewardedData.c();
                        List listA = rewardedData.a();
                        for (int i10 = 0; i10 < listA.size(); i10++) {
                            String str = (String) listA.get(i10);
                            AdvertismentModel advertismentModel = new AdvertismentModel();
                            advertismentModel.e(strE);
                            advertismentModel.c(strB);
                            advertismentModel.a(str);
                            advertismentModel.b("");
                            advertismentModel.d(strC);
                            this.f28636i.add(advertismentModel);
                            arrayList4.add(strC);
                            arrayList2.add(str);
                        }
                    } else if (strE != null && strE.equalsIgnoreCase("message")) {
                        String strB2 = rewardedData.b();
                        String strE2 = rewardedData.e();
                        String strD = rewardedData.d();
                        String strC2 = rewardedData.c();
                        AdvertismentModel advertismentModel2 = new AdvertismentModel();
                        advertismentModel2.e(strE2);
                        advertismentModel2.c(strB2);
                        advertismentModel2.a("");
                        advertismentModel2.b(strD);
                        advertismentModel2.d(strC2);
                        this.f28636i.add(advertismentModel2);
                        arrayList5.add(strC2);
                        arrayList3.add(strD);
                    }
                }
            }
            if (arrayList2.size() > 0) {
                arrayList = null;
                Listsingleton.b().d(null);
                SharepreferenceDBHandler.setRewardedImageList(null, this.f28634g);
                SharepreferenceDBHandler.setRewardedImageList(arrayList2, this.f28634g);
            } else {
                arrayList = null;
                Listsingleton.b().d(null);
                SharepreferenceDBHandler.setRewardedImageList(null, this.f28634g);
            }
            if (arrayList3.size() > 0) {
                SharepreferenceDBHandler.setRewardedTextList(arrayList, this.f28634g);
                Listsingleton.b().f(arrayList);
                SharepreferenceDBHandler.setRewardedTextList(arrayList3, this.f28634g);
                return;
            }
        }
        SharepreferenceDBHandler.setRewardedTextList(arrayList, this.f28634g);
        Listsingleton.b().f(arrayList);
    }
}
