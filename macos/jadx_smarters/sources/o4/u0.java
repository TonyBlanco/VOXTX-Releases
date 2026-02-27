package o4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends zza implements w0 {
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // o4.w0
    public final void b1(r0 r0Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, r0Var);
        zzc(3, parcelZza);
    }

    @Override // o4.w0
    public final void m0(boolean z9) throws RemoteException {
        Parcel parcelZza = zza();
        int i9 = zzc.zza;
        parcelZza.writeInt(0);
        zzc(14, parcelZza);
    }

    @Override // o4.w0
    public final int zze() throws RemoteException {
        Parcel parcelZzb = zzb(13, zza());
        int i9 = parcelZzb.readInt();
        parcelZzb.recycle();
        return i9;
    }

    @Override // o4.w0
    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzb = zzb(1, zza());
        Bundle bundle = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
        parcelZzb.recycle();
        return bundle;
    }

    @Override // o4.w0
    public final G zzg() throws RemoteException {
        G c2323f;
        Parcel parcelZzb = zzb(6, zza());
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder == null) {
            c2323f = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            c2323f = iInterfaceQueryLocalInterface instanceof G ? (G) iInterfaceQueryLocalInterface : new C2323F(strongBinder);
        }
        parcelZzb.recycle();
        return c2323f;
    }

    @Override // o4.w0
    public final O zzh() throws RemoteException {
        O n9;
        Parcel parcelZzb = zzb(5, zza());
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder == null) {
            n9 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            n9 = iInterfaceQueryLocalInterface instanceof O ? (O) iInterfaceQueryLocalInterface : new N(strongBinder);
        }
        parcelZzb.recycle();
        return n9;
    }
}
