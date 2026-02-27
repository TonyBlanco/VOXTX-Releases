package com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces;

import a7.j;
import android.content.Context;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.CallBacks.InvoiceData;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.InvoicesModelClass;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class InvoicesApiHitClass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InvoiceData f28535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f28536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28537c;

    public InvoicesApiHitClass(InvoiceData invoiceData, Context context, String str) {
        this.f28536b = context;
        this.f28537c = str;
        this.f28535a = invoiceData;
    }

    public void a() {
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).j("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetInvoices", "no", ClientSharepreferenceHandler.a(this.f28536b), this.f28537c).enqueue(new Callback<InvoicesModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.InvoicesApiHitClass.1
            @Override // retrofit2.Callback
            public void onFailure(Call<InvoicesModelClass> call, Throwable th) {
                InvoicesApiHitClass.this.f28535a.j0(InvoicesApiHitClass.this.f28536b.getResources().getString(j.f13244e7));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<InvoicesModelClass> call, Response<InvoicesModelClass> response) {
                if (response.body() == null || !response.isSuccessful()) {
                    InvoicesApiHitClass.this.f28535a.j0(InvoicesApiHitClass.this.f28536b.getResources().getString(j.f13244e7));
                } else {
                    InvoicesApiHitClass.this.f28535a.w(response.body().a().a());
                }
            }
        });
    }
}
