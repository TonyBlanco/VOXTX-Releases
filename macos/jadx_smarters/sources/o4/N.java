package o4;

import F4.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends zza implements O {
    public N(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // o4.O
    public final void K0(Q q9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, q9);
        zzc(2, parcelZza);
    }

    @Override // o4.O
    public final void d0(Q q9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, q9);
        zzc(3, parcelZza);
    }

    @Override // o4.O
    public final void e0(boolean z9, boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i9 = zzc.zza;
        parcelZza.writeInt(1);
        parcelZza.writeInt(z10 ? 1 : 0);
        zzc(6, parcelZza);
    }

    @Override // o4.O
    public final F4.a zzf() throws RemoteException {
        Parcel parcelZzb = zzb(1, zza());
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return aVarA;
    }

    @Override // o4.O
    public final F4.a zzg() throws RemoteException {
        Parcel parcelZzb = zzb(7, zza());
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return aVarA;
    }
}
