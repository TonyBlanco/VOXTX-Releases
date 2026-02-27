package o4;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U extends zzb implements V {
    public U() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) {
        switch (i9) {
            case 1:
                F4.a aVarZzc = zzc();
                parcel2.writeNoException();
                zzc.zze(parcel2, aVarZzc);
                return true;
            case 2:
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                d(bundle);
                break;
            case 3:
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                zzg(bundle2);
                break;
            case 4:
                boolean zZzf = zzc.zzf(parcel);
                zzc.zzb(parcel);
                i(zZzf);
                break;
            case 5:
                long jZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeLong(jZzb);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 7:
                Bundle bundle3 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                h0(bundle3);
                break;
            case 8:
                Bundle bundle4 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                zze(bundle4);
                break;
            case 9:
                Bundle bundle5 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                Y(bundle5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
