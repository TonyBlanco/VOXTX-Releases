package g1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzcd;
import com.google.android.gms.internal.play_billing.zzga;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class V extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f41149c;

    public V(W w9, boolean z9) {
        this.f41149c = w9;
        this.f41148b = z9;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f41147a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f41148b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f41147a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        try {
            if (this.f41147a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f41148b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
            }
            this.f41147a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f41147a) {
            zzb.zzk("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f41147a = false;
        }
    }

    public final void d(Bundle bundle, com.android.billingclient.api.a aVar, int i9) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.f41149c.f41152c.e(AbstractC1806E.a(23, i9, aVar));
            return;
        }
        try {
            this.f41149c.f41152c.e(zzga.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzcd.zza()));
        } catch (Throwable unused) {
            zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            F f9 = this.f41149c.f41152c;
            com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f18461j;
            f9.e(AbstractC1806E.a(11, 1, aVar));
            W w9 = this.f41149c;
            if (w9.f41151b != null) {
                w9.f41151b.e(aVar, null);
                return;
            }
            return;
        }
        com.android.billingclient.api.a aVarZze = zzb.zze(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i9 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("TryRoom") || action.equals("TryRoom")) {
            List listZzi = zzb.zzi(extras);
            if (aVarZze.b() == 0) {
                this.f41149c.f41152c.b(AbstractC1806E.c(i9));
            } else {
                d(extras, aVarZze, i9);
            }
            this.f41149c.f41151b.e(aVarZze, listZzi);
            return;
        }
        if (action.equals("TryRoom")) {
            if (aVarZze.b() != 0) {
                d(extras, aVarZze, i9);
                this.f41149c.f41151b.e(aVarZze, zzai.zzk());
                return;
            }
            W w10 = this.f41149c;
            W.a(w10);
            W.e(w10);
            zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            F f10 = this.f41149c.f41152c;
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f18461j;
            f10.e(AbstractC1806E.a(77, i9, aVar2));
            this.f41149c.f41151b.e(aVar2, zzai.zzk());
        }
    }
}
