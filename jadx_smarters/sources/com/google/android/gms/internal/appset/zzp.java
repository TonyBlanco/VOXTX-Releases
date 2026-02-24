package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import i4.C1887c;
import i4.C1888d;
import i4.InterfaceC1886b;
import i4.h;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
public final class zzp extends e implements InterfaceC1886b {
    private static final a.g zza;
    private static final a.AbstractC0252a zzb;
    private static final a zzc;
    private final Context zzd;
    private final C2921i zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a("AppSet.API", zznVar, gVar);
    }

    public zzp(Context context, C2921i c2921i) {
        super(context, zzc, a.d.f26451a, e.a.f26452c);
        this.zzd = context;
        this.zze = c2921i;
    }

    @Override // i4.InterfaceC1886b
    public final Task<C1887c> getAppSetIdInfo() {
        return this.zze.j(this.zzd, 212800000) == 0 ? doRead(AbstractC1388t.a().d(h.f41864a).b(new InterfaceC1383q() { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzg) ((zzd) obj).getService()).zzc(new C1888d(null, null), new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        }).c(false).e(27601).a()) : Tasks.forException(new b(new Status(17)));
    }
}
