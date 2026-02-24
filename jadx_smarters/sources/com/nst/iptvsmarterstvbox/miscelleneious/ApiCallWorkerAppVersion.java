package com.nst.iptvsmarterstvbox.miscelleneious;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import b7.AbstractC1232b;
import com.amazonaws.services.s3.internal.Constants;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import y5.InterfaceFutureC2987b;
import y5.e;

/* JADX INFO: loaded from: classes.dex */
public class ApiCallWorkerAppVersion extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f28643g;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f28644a;

        public a(e eVar) {
            this.f28644a = eVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            SharepreferenceDBHandler.setUpdateVersionCode(ApiCallWorkerAppVersion.this.a(), "", "", "");
            this.f28644a.v(ListenableWorker.a.a());
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
        @Override // retrofit2.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onResponse(retrofit2.Call r5, retrofit2.Response r6) {
            /*
                r4 = this;
                boolean r5 = r6.isSuccessful()
                java.lang.String r0 = ""
                if (r5 == 0) goto La8
                java.lang.Object r5 = r6.body()
                if (r5 == 0) goto L9e
                java.lang.Object r5 = r6.body()
                com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.DownloadResponseModel r5 = (com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.DownloadResponseModel) r5
                com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.Data r5 = r5.a()
                if (r5 == 0) goto L9e
                java.lang.Object r5 = r6.body()     // Catch: java.lang.Exception -> L4a
                com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.DownloadResponseModel r5 = (com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.DownloadResponseModel) r5     // Catch: java.lang.Exception -> L4a
                com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.Data r5 = r5.a()     // Catch: java.lang.Exception -> L4a
                java.lang.String r5 = r5.c()     // Catch: java.lang.Exception -> L4a
                java.lang.Object r1 = r6.body()     // Catch: java.lang.Exception -> L47
                com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.DownloadResponseModel r1 = (com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.DownloadResponseModel) r1     // Catch: java.lang.Exception -> L47
                com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.Data r1 = r1.a()     // Catch: java.lang.Exception -> L47
                java.lang.String r1 = r1.a()     // Catch: java.lang.Exception -> L47
                java.lang.Object r6 = r6.body()     // Catch: java.lang.Exception -> L45
                com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.DownloadResponseModel r6 = (com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.DownloadResponseModel) r6     // Catch: java.lang.Exception -> L45
                com.nst.iptvsmarterstvbox.sbpfunction.downloadmodel.Data r6 = r6.a()     // Catch: java.lang.Exception -> L45
                java.lang.String r6 = r6.b()     // Catch: java.lang.Exception -> L45
                goto L51
            L45:
                r6 = move-exception
                goto L4d
            L47:
                r6 = move-exception
                r1 = r0
                goto L4d
            L4a:
                r6 = move-exception
                r5 = r0
                r1 = r5
            L4d:
                r6.printStackTrace()
                r6 = r0
            L51:
                if (r5 == 0) goto L9e
                int r2 = r5.length()
                if (r2 <= 0) goto L9e
                java.lang.String r2 = "."
                boolean r2 = r5.contains(r2)
                if (r2 != 0) goto Laf
                int r2 = java.lang.Integer.parseInt(r5)
                r3 = 108(0x6c, float:1.51E-43)
                if (r2 <= r3) goto L8e
                com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion r0 = com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion.this
                android.content.Context r0 = r0.a()
                com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.setUpdateVersionCode(r0, r5, r6, r1)
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r6 = "notification"
                r5.<init>(r6)
                java.lang.String r6 = "app_version"
                java.lang.String r0 = "appversion"
                r5.putExtra(r6, r0)
                com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion r6 = com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion.this
                android.content.Context r6 = com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion.s(r6)
                p0.a r6 = p0.C2386a.b(r6)
                r6.d(r5)
                goto Laf
            L8e:
                com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion r5 = com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion.this
                android.content.Context r5 = r5.a()
                java.lang.String r6 = java.lang.String.valueOf(r3)
                java.lang.String r1 = "5.0"
                com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.setUpdateVersionCode(r5, r6, r0, r1)
                goto Laf
            L9e:
                com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion r5 = com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion.this
                android.content.Context r5 = r5.a()
                com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.setUpdateVersionCode(r5, r0, r0, r0)
                goto Laf
            La8:
                java.lang.Object r5 = r6.body()
                if (r5 != 0) goto Laf
                goto L9e
            Laf:
                y5.e r5 = r4.f28644a
                androidx.work.ListenableWorker$a r6 = androidx.work.ListenableWorker.a.c()
                r5.v(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.miscelleneious.ApiCallWorkerAppVersion.a.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public ApiCallWorkerAppVersion(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f28643g = context;
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC2987b p() {
        e eVarX = e.x();
        Retrofit retrofitD0 = w.D0(a());
        if (retrofitD0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitD0.create(RetrofitPost.class);
            String str = new SimpleDateFormat("yyyy-MM").format(new Date());
            r();
            String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", AbstractC2237a.f44495d1);
            retrofitPost.getDownloadInfo(jsonObject).enqueue(new a(eVarX));
        }
        return eVarX;
    }

    public void r() {
        AbstractC1232b.f17695b = String.valueOf(new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS);
    }
}
