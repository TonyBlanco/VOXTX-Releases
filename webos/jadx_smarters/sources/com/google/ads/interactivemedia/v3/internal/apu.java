package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Hide;
import java.util.concurrent.Executor;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class apu extends arr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final apu f20501a = new apu();

    private apu() {
    }

    public static apx a(Context context, Executor executor, aff affVar) {
        apx apxVarD = null;
        if (affVar.d() && C2921i.h().j(context, 12800000) == 0) {
            apxVarD = f20501a.d(context, executor, affVar);
        }
        return apxVarD == null ? new apt(context, executor, affVar) : apxVarD;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.ads.interactivemedia.v3.internal.apz, java.lang.Object] */
    private final apx d(Context context, Executor executor, aff affVar) {
        try {
            IBinder iBinderE = c(context).e(arp.c(context), arp.c(executor), affVar.av());
            if (iBinderE == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderE.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            return iInterfaceQueryLocalInterface instanceof apx ? (apx) iInterfaceQueryLocalInterface : new apv(iBinderE);
        } catch (RemoteException | arq | IllegalArgumentException | LinkageError unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.arr
    public final /* synthetic */ Object b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return iInterfaceQueryLocalInterface instanceof apz ? (apz) iInterfaceQueryLocalInterface : new apy(iBinder);
    }
}
