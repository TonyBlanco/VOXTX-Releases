package G4;

import F4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends zza implements IInterface {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int A(F4.a aVar, String str, boolean z9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z9 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i9 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i9;
    }

    public final int E(F4.a aVar, String str, boolean z9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z9 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i9 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i9;
    }

    public final F4.a Z(F4.a aVar, String str, int i9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i9);
        Parcel parcelZzB = zzB(2, parcelZza);
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final F4.a c0(F4.a aVar, String str, int i9, F4.a aVar2) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i9);
        zzc.zze(parcelZza, aVar2);
        Parcel parcelZzB = zzB(8, parcelZza);
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final F4.a c1(F4.a aVar, String str, int i9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i9);
        Parcel parcelZzB = zzB(4, parcelZza);
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final F4.a d1(F4.a aVar, String str, boolean z9, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z9 ? 1 : 0);
        parcelZza.writeLong(j9);
        Parcel parcelZzB = zzB(7, parcelZza);
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final int zze() throws RemoteException {
        Parcel parcelZzB = zzB(6, zza());
        int i9 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i9;
    }
}
