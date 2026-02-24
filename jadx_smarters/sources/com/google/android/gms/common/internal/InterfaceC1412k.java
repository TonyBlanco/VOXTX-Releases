package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1412k extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.k$a */
    public static abstract class a extends zzb implements InterfaceC1412k {
        public static InterfaceC1412k A(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1412k ? (InterfaceC1412k) iInterfaceQueryLocalInterface : new w0(iBinder);
        }
    }

    Account zzb();
}
