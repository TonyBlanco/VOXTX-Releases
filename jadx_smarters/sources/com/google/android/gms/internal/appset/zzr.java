package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import i4.C1887c;
import i4.InterfaceC1886b;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
public final class zzr implements InterfaceC1886b {
    private final InterfaceC1886b zza;
    private final InterfaceC1886b zzb;

    public zzr(Context context) {
        this.zza = new zzp(context, C2921i.h());
        this.zzb = zzl.zzc(context);
    }

    public static /* synthetic */ Task zza(zzr zzrVar, Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return task;
        }
        Exception exception = task.getException();
        if (!(exception instanceof b)) {
            return task;
        }
        int statusCode = ((b) exception).getStatusCode();
        return (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) ? zzrVar.zzb.getAppSetIdInfo() : statusCode == 43000 ? Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : statusCode != 15 ? task : Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // i4.InterfaceC1886b
    public final Task<C1887c> getAppSetIdInfo() {
        return this.zza.getAppSetIdInfo().continueWithTask(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzr.zza(this.zza, task);
            }
        });
    }
}
