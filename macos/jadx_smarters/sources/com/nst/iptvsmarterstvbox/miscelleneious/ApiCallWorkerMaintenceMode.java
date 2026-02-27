package com.nst.iptvsmarterstvbox.miscelleneious;

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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import y5.InterfaceFutureC2987b;
import y5.e;

/* JADX INFO: loaded from: classes.dex */
public class ApiCallWorkerMaintenceMode extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f28649g;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f28650a;

        public a(e eVar) {
            this.f28650a = eVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.f28650a.v(ListenableWorker.a.a());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Log.e("isworkschedule<<<>>>>", "onresponse");
            if (response.isSuccessful() && response.body() != null && ((SBPAdvertisementsMaintanceCallBack) response.body()).d() != null && ((SBPAdvertisementsMaintanceCallBack) response.body()).e() != null && ((SBPAdvertisementsMaintanceCallBack) response.body()).d().equals("success")) {
                if (((SBPAdvertisementsMaintanceCallBack) response.body()).b() == null || !((SBPAdvertisementsMaintanceCallBack) response.body()).b().equalsIgnoreCase("on")) {
                    Log.e("isworkschedule<<<>>>>", "maintenance mode off");
                    SharepreferenceDBHandler.setMaintanceModeState(false, ApiCallWorkerMaintenceMode.this.a());
                } else {
                    Log.e("isworkschedule<<<>>>>", "maintenance mode on");
                    SharepreferenceDBHandler.setMaintanceModeState(true, ApiCallWorkerMaintenceMode.this.a());
                    String strA = ((SBPAdvertisementsMaintanceCallBack) response.body()).a() != null ? ((SBPAdvertisementsMaintanceCallBack) response.body()).a() : "";
                    String strC = ((SBPAdvertisementsMaintanceCallBack) response.body()).c() != null ? ((SBPAdvertisementsMaintanceCallBack) response.body()).c() : "";
                    if (strA != null) {
                        SharepreferenceDBHandler.setMaintanceModeFooterMessage(strA, ApiCallWorkerMaintenceMode.this.a());
                    }
                    if (strC != null) {
                        SharepreferenceDBHandler.setMaintanceModeMessage(strC, ApiCallWorkerMaintenceMode.this.a());
                    }
                }
            }
            this.f28650a.v(ListenableWorker.a.c());
        }
    }

    public ApiCallWorkerMaintenceMode(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f28649g = context;
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC2987b p() {
        e eVarX = e.x();
        Retrofit retrofitP = w.P(a());
        if (retrofitP != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitP.create(RetrofitPost.class);
            Log.e("isworkschedule<<<>>>>", "server base url");
            String str = new SimpleDateFormat("yyyy-MM").format(new Date());
            r();
            String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", AbstractC2237a.f44492c1);
            Log.e("isworkschedule<<<>>>>", "params added");
            retrofitPost.getSBPAdvertisementsMaintance(jsonObject).enqueue(new a(eVarX));
        }
        return eVarX;
    }

    public void r() {
        AbstractC1232b.f17695b = String.valueOf(new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS);
    }
}
