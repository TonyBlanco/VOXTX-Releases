package G4;

import F4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends zza implements IInterface {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final F4.a A(F4.a aVar, String str, int i9, F4.a aVar2) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i9);
        zzc.zze(parcelZza, aVar2);
        Parcel parcelZzB = zzB(2, parcelZza);
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final F4.a E(F4.a aVar, String str, int i9, F4.a aVar2) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i9);
        zzc.zze(parcelZza, aVar2);
        Parcel parcelZzB = zzB(3, parcelZza);
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }
}
