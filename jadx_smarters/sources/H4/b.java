package H4;

import F4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.flags.zzb;
import com.google.android.gms.internal.flags.zzc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends zzb implements c {
    public b() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // com.google.android.gms.internal.flags.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 == 1) {
            init(a.AbstractBinderC0028a.A(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i9 == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), zzc.zzc(parcel), parcel.readInt());
            parcel2.writeNoException();
            zzc.zza(parcel2, booleanFlagValue);
        } else if (i9 == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i9 == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else {
            if (i9 != 5) {
                return false;
            }
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
