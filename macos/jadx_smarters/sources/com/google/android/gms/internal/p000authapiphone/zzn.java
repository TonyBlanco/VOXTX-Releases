package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class zzn extends e {
    private static final a.g zza;
    private static final a.AbstractC0252a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzr zzrVar = new zzr();
        zzb = zzrVar;
        zzc = new a("SmsCodeAutofill.API", zzrVar, gVar);
    }

    public zzn(Activity activity) {
        super(activity, zzc, (a.d) null, e.a.f26452c);
    }

    public zzn(Context context) {
        super(context, zzc, (a.d) null, e.a.f26452c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(AbstractC1388t.a().d(zzaa.zza).b(new InterfaceC1383q(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzp
            private final zzn zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzj) ((zzv) obj).getService()).zza(new zzt(this.zza, (TaskCompletionSource) obj2));
            }
        }).a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        r.m(str);
        r.b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(AbstractC1388t.a().d(zzaa.zza).b(new InterfaceC1383q(this, str) { // from class: com.google.android.gms.internal.auth-api-phone.zzo
            private final zzn zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzn zznVar = this.zza;
                ((zzj) ((zzv) obj).getService()).zza(this.zzb, new zzs(zznVar, (TaskCompletionSource) obj2));
            }
        }).a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC1388t.a().d(zzaa.zza).b(new InterfaceC1383q(this) { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            private final zzn zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzj) ((zzv) obj).getService()).zza(new zzq(this.zza, (TaskCompletionSource) obj2));
            }
        }).a());
    }
}
