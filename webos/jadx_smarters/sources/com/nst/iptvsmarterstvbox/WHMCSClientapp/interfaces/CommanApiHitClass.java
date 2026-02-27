package com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces;

import a7.j;
import android.content.Context;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.ActiveServiceModelClass;
import java.util.ArrayList;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class CommanApiHitClass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AllServiceApiCallBack f28531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f28532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28533c;

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.CommanApiHitClass$2, reason: invalid class name */
    class AnonymousClass2 implements Callback<HashMap> {
        @Override // retrofit2.Callback
        public void onFailure(Call<HashMap> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<HashMap> call, Response<HashMap> response) {
            response.isSuccessful();
        }
    }

    public CommanApiHitClass() {
    }

    public CommanApiHitClass(AllServiceApiCallBack allServiceApiCallBack, Context context, String str) {
        this.f28531a = allServiceApiCallBack;
        this.f28532b = context;
        this.f28533c = str;
    }

    public void a() {
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).d("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetClientproductwithStatus", "yes", ClientSharepreferenceHandler.a(this.f28532b), this.f28533c).enqueue(new Callback<ArrayList<ActiveServiceModelClass>>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.CommanApiHitClass.1
            @Override // retrofit2.Callback
            public void onFailure(Call<ArrayList<ActiveServiceModelClass>> call, Throwable th) {
                CommanApiHitClass.this.f28531a.r(CommanApiHitClass.this.f28532b.getResources().getString(j.f13244e7));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<ArrayList<ActiveServiceModelClass>> call, Response<ArrayList<ActiveServiceModelClass>> response) {
                if (!response.isSuccessful() || response.body() == null) {
                    CommanApiHitClass.this.f28531a.r("Network Error");
                } else {
                    CommanApiHitClass.this.f28531a.W(response.body());
                }
            }
        });
    }
}
