package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j4.AbstractC2097b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzu extends AbstractC2097b {
    public zzu(Activity activity) {
        super(activity);
    }

    public zzu(Context context) {
        super(context);
    }

    @Override // j4.AbstractC2097b
    public final Task<Void> startSmsRetriever() {
        return doWrite(AbstractC1388t.a().b(new InterfaceC1383q(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            private final zzu zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzj) ((zzv) obj).getService()).zza(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        }).d(zzaa.zzb).a());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(AbstractC1388t.a().b(new InterfaceC1383q(this, str) { // from class: com.google.android.gms.internal.auth-api-phone.zzw
            private final zzu zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzu zzuVar = this.zza;
                ((zzj) ((zzv) obj).getService()).zza(this.zzb, new zzy(zzuVar, (TaskCompletionSource) obj2));
            }
        }).d(zzaa.zzc).a());
    }
}
