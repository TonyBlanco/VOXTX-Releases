package com.nst.iptvsmarterstvbox.miscelleneious;

import android.content.Context;
import android.content.Intent;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import b7.AbstractC1232b;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.model.callback.storage.GetStorageAccessCallback;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import p0.C2386a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import y5.InterfaceFutureC2987b;
import y5.e;

/* JADX INFO: loaded from: classes.dex */
public class ApiCallWorkerDbStorage extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f28646g;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f28647a;

        public a(e eVar) {
            this.f28647a = eVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            SharepreferenceDBHandler.setLocalDb(ApiCallWorkerDbStorage.this.f28646g, true);
            this.f28647a.v(ListenableWorker.a.a());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response == null || !response.isSuccessful() || response.body() == null || ((GetStorageAccessCallback) response.body()).getData() == null) {
                SharepreferenceDBHandler.setLocalDb(ApiCallWorkerDbStorage.this.f28646g, true);
            } else {
                if (((GetStorageAccessCallback) response.body()).getData().getMode().equalsIgnoreCase("1")) {
                    if (SharepreferenceDBHandler.isLocalDb(ApiCallWorkerDbStorage.this.f28646g)) {
                        C2386a.b(ApiCallWorkerDbStorage.this.f28646g).d(new Intent("notification_popup"));
                    }
                    SharepreferenceDBHandler.setLocalDb(ApiCallWorkerDbStorage.this.f28646g, false);
                } else {
                    SharepreferenceDBHandler.setLocalDb(ApiCallWorkerDbStorage.this.f28646g, true);
                }
                Intent intent = new Intent(TransferService.INTENT_KEY_NOTIFICATION);
                intent.putExtra("local_fav_storage", "local_storage");
                C2386a.b(ApiCallWorkerDbStorage.this.f28646g).d(intent);
            }
            this.f28647a.v(ListenableWorker.a.c());
        }
    }

    public ApiCallWorkerDbStorage(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f28646g = context;
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC2987b p() {
        e eVarX = e.x();
        Retrofit retrofitF0 = w.F0(this.f28646g);
        if (retrofitF0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitF0.create(RetrofitPost.class);
            String str = new SimpleDateFormat("yyyy-MM").format(new Date());
            r();
            String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", "get-app-storage-prefences");
            retrofitPost.getAppStorageAccess(jsonObject).enqueue(new a(eVarX));
        }
        return eVarX;
    }

    public void r() {
        AbstractC1232b.f17695b = String.valueOf(new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS);
    }
}
