package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzdq extends zzb implements zzdr {
    public zzdq() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 == 1) {
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            Surface surface = (Surface) zzc.zza(parcel, Surface.CREATOR);
            zzc.zzb(parcel);
            zzb(i11, i12, surface);
        } else if (i9 == 2) {
            int i13 = parcel.readInt();
            zzc.zzb(parcel);
            zzd(i13);
        } else if (i9 == 3) {
            zzf();
        } else if (i9 == 4) {
            zzc();
        } else {
            if (i9 != 5) {
                return false;
            }
            boolean zZzf = zzc.zzf(parcel);
            zzc.zzb(parcel);
            zze(zZzf);
        }
        parcel2.writeNoException();
        return true;
    }
}
