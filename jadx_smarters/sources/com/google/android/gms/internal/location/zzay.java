package com.google.android.gms.internal.location;

import J4.C0654m;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1359e;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
final class zzay extends zzan {
    private InterfaceC1359e zza;

    public zzay(InterfaceC1359e interfaceC1359e) {
        r.b(interfaceC1359e != null, "listener can't be null.");
        this.zza = interfaceC1359e;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(C0654m c0654m) throws RemoteException {
        this.zza.setResult(c0654m);
        this.zza = null;
    }
}
