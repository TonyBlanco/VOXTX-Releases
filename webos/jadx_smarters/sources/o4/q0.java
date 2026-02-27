package o4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 extends zzb implements r0 {
    public q0() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 1) {
            if (i9 == 2) {
                zzd();
            } else if (i9 == 3) {
                zzc();
            } else {
                if (i9 != 4) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
            }
            parcel2.writeNoException();
        } else {
            F4.a aVarZzb = zzb();
            parcel2.writeNoException();
            zzc.zze(parcel2, aVarZzb);
        }
        return true;
    }
}
