package o4;

import android.os.Parcel;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;
import n4.C2276i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s0 extends zzb implements t0 {
    public s0() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzc.zzb(parcel);
            J0(string, string2);
        } else if (i9 == 2) {
            String string3 = parcel.readString();
            C2276i c2276i = (C2276i) zzc.zza(parcel, C2276i.CREATOR);
            zzc.zzb(parcel);
            A0(string3, c2276i);
        } else if (i9 == 3) {
            String string4 = parcel.readString();
            zzc.zzb(parcel);
            p0(string4);
        } else {
            if (i9 != 4) {
                if (i9 != 5) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            }
            int i11 = parcel.readInt();
            zzc.zzb(parcel);
            zzb(i11);
        }
        parcel2.writeNoException();
        return true;
    }
}
