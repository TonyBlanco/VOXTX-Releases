package o4;

import android.os.Parcel;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S extends zzb implements T {
    public S() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) {
        ?? r12;
        if (i9 != 1) {
            if (i9 == 2) {
                boolean zZzd = zzd();
                parcel2.writeNoException();
                int i11 = zzc.zza;
                r12 = zZzd;
            } else if (i9 == 3) {
                String strZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
            } else {
                if (i9 != 4) {
                    return false;
                }
                parcel2.writeNoException();
                r12 = 12451000;
            }
            parcel2.writeInt(r12);
        } else {
            String string = parcel.readString();
            zzc.zzb(parcel);
            F4.a aVarZzb = zzb(string);
            parcel2.writeNoException();
            zzc.zze(parcel2, aVarZzb);
        }
        return true;
    }
}
