package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U extends zzb implements InterfaceC1414m {
    public U() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            z(i11, strongBinder, bundle);
        } else if (i9 == 2) {
            int i12 = parcel.readInt();
            Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            o0(i12, bundle2);
        } else {
            if (i9 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            k0 k0Var = (k0) zzc.zza(parcel, k0.CREATOR);
            zzc.zzb(parcel);
            R0(i13, strongBinder2, k0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
