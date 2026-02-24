package o4;

import F4.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends zza implements M {
    public K(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // o4.M
    public final void e(int i9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i9);
        zzc(12, parcelZza);
    }

    @Override // o4.M
    public final void x0(int i9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i9);
        zzc(13, parcelZza);
    }

    @Override // o4.M
    public final int zze() throws RemoteException {
        Parcel parcelZzb = zzb(17, zza());
        int i9 = parcelZzb.readInt();
        parcelZzb.recycle();
        return i9;
    }

    @Override // o4.M
    public final int zzf() throws RemoteException {
        Parcel parcelZzb = zzb(18, zza());
        int i9 = parcelZzb.readInt();
        parcelZzb.recycle();
        return i9;
    }

    @Override // o4.M
    public final F4.a zzg() throws RemoteException {
        Parcel parcelZzb = zzb(1, zza());
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return aVarA;
    }

    @Override // o4.M
    public final void zzj(int i9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i9);
        zzc(15, parcelZza);
    }

    @Override // o4.M
    public final boolean zzp() throws RemoteException {
        Parcel parcelZzb = zzb(5, zza());
        boolean zZzf = zzc.zzf(parcelZzb);
        parcelZzb.recycle();
        return zZzf;
    }

    @Override // o4.M
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzb = zzb(6, zza());
        boolean zZzf = zzc.zzf(parcelZzb);
        parcelZzb.recycle();
        return zZzf;
    }

    @Override // o4.M
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzb = zzb(9, zza());
        boolean zZzf = zzc.zzf(parcelZzb);
        parcelZzb.recycle();
        return zZzf;
    }
}
