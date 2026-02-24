package com.nst.iptvsmarterstvbox.sbpfunction.sbpmaintenance;

import android.content.Context;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
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
import t.AbstractC2756c;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public class WMClass extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractC2756c.a f28855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28856h;

    public WMClass(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.e("honey", "entry");
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC2987b p() {
        return AbstractC2756c.a(new AbstractC2756c.InterfaceC0454c() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.sbpmaintenance.a
            @Override // t.AbstractC2756c.InterfaceC0454c
            public final Object attachCompleter(AbstractC2756c.a aVar) {
                return this.f28858a.v(aVar);
            }
        });
    }

    public void s() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f28856h = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    public final void t() {
        Log.e("honey", "1");
        Retrofit retrofitP = w.P(a());
        if (retrofitP != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitP.create(RetrofitPost.class);
            Log.e("honey", "2");
            String str = new SimpleDateFormat("yyyy-MM").format(new Date());
            s();
            String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", AbstractC2237a.f44492c1);
            Log.e("honey", "3");
            retrofitPost.getSBPAdvertisementsMaintance(jsonObject).enqueue(new Callback<SBPAdvertisementsMaintanceCallBack>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.sbpmaintenance.WMClass.1
                @Override // retrofit2.Callback
                public void onFailure(Call<SBPAdvertisementsMaintanceCallBack> call, Throwable th) {
                    Log.e("honey", "8");
                    if (WMClass.this.f28855g != null) {
                        WMClass.this.f28855g.b(ListenableWorker.a.b());
                    }
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<SBPAdvertisementsMaintanceCallBack> call, Response<SBPAdvertisementsMaintanceCallBack> response) {
                    Log.e("honey", "4");
                    if (WMClass.this.f28855g != null) {
                        WMClass.this.f28855g.b(ListenableWorker.a.c());
                    }
                    if (!response.isSuccessful() || response.body() == null || response.body().d() == null || response.body().e() == null || !response.body().d().equals("success")) {
                        return;
                    }
                    AdvertisementListSingleton.b().a().clear();
                    if (response.body().b() == null || !response.body().b().equalsIgnoreCase("on")) {
                        Log.e("honey", "7");
                        SharepreferenceDBHandler.setMaintanceModeState(false, WMClass.this.a());
                        return;
                    }
                    Log.e("honey", "6");
                    SharepreferenceDBHandler.setMaintanceModeState(true, WMClass.this.a());
                    String strA = response.body().a() != null ? response.body().a() : "";
                    String strC = response.body().c() != null ? response.body().c() : "";
                    if (strA != null) {
                        SharepreferenceDBHandler.setMaintanceModeFooterMessage(strA, WMClass.this.a());
                    }
                    if (strC != null) {
                        SharepreferenceDBHandler.setMaintanceModeMessage(strC, WMClass.this.a());
                    }
                }
            });
        }
    }

    public final /* synthetic */ Object v(AbstractC2756c.a aVar) {
        this.f28855g = aVar;
        t();
        return "HitAPIToGetMaintenanceMode";
    }
}
