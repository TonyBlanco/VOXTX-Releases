package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.f;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import o4.C2328e;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbr {
    public static f zza(Task task, final zzbq zzbqVar, final zzbq zzbqVar2) {
        final zzbp zzbpVar = new zzbp(zzbqVar2);
        task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzbn
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                zzbp zzbpVar2 = zzbpVar;
                C2775b c2775b = C2328e.f45868o;
                zzbpVar2.setResult(new Status(0));
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast.zzbo
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzbp zzbpVar2 = zzbpVar;
                Status status = new Status(8, "unknown error");
                if (exc instanceof b) {
                    b bVar = (b) exc;
                    status = new Status(bVar.getStatusCode(), bVar.getMessage());
                }
                C2775b c2775b = C2328e.f45868o;
                zzbpVar2.setResult(status);
            }
        });
        return zzbpVar;
    }
}
