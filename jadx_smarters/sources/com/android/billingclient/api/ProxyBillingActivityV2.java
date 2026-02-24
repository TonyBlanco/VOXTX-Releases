package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.e;
import b.d;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.activity.result.c f18433a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.activity.result.c f18434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResultReceiver f18435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ResultReceiver f18436e;

    public final void f1(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int iB = zzb.zze(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f18435d;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.c() != -1 || iB != 0) {
            zzb.zzk("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.c() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    public final void g1(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int iB = zzb.zze(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f18436e;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.c() != -1 || iB != 0) {
            zzb.zzk("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.c()), Integer.valueOf(iB)));
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18433a = registerForActivityResult(new d(), new androidx.activity.result.b() { // from class: g1.N
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                this.f41141a.f1((androidx.activity.result.a) obj);
            }
        });
        this.f18434c = registerForActivityResult(new d(), new androidx.activity.result.b() { // from class: g1.O
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                this.f41142a.g1((androidx.activity.result.a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f18435d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f18436e = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        zzb.zzj("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f18435d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f18433a.a(new e.b(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f18436e = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f18434c.a(new e.b(pendingIntent2).a());
        }
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f18435d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f18436e;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
