package o4;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends zza implements J {
    public H(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // o4.J
    public final int X0(Intent intent, int i9, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, intent);
        parcelZza.writeInt(i9);
        parcelZza.writeInt(i10);
        Parcel parcelZzb = zzb(2, parcelZza);
        int i11 = parcelZzb.readInt();
        parcelZzb.recycle();
        return i11;
    }

    @Override // o4.J
    public final IBinder v(Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, intent);
        Parcel parcelZzb = zzb(3, parcelZza);
        IBinder strongBinder = parcelZzb.readStrongBinder();
        parcelZzb.recycle();
        return strongBinder;
    }

    @Override // o4.J
    public final void zzg() throws RemoteException {
        zzc(1, zza());
    }

    @Override // o4.J
    public final void zzh() throws RemoteException {
        zzc(4, zza());
    }
}
