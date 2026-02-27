package t4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: renamed from: t4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2785l extends zza implements IInterface {
    public C2785l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    public final void A(InterfaceC2781h interfaceC2781h, String[] strArr) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC2781h);
        parcelZza.writeStringArray(strArr);
        zzd(5, parcelZza);
    }

    public final void E(InterfaceC2781h interfaceC2781h, String[] strArr) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC2781h);
        parcelZza.writeStringArray(strArr);
        zzd(7, parcelZza);
    }

    public final void Z(InterfaceC2781h interfaceC2781h, String[] strArr) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC2781h);
        parcelZza.writeStringArray(strArr);
        zzd(6, parcelZza);
    }
}
