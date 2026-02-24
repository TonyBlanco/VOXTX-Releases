package com.google.android.gms.internal.flags;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    private static final ClassLoader zza = zzc.class.getClassLoader();

    private zzc() {
    }

    public static void zza(Parcel parcel, boolean z9) {
        parcel.writeInt(z9 ? 1 : 0);
    }

    public static void zzb(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static boolean zzc(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
