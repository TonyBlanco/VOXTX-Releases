package o4;

import F4.a;
import android.os.Parcel;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P extends zzb implements Q {
    public P() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) {
        switch (i9) {
            case 1:
                F4.a aVarZzb = zzb();
                parcel2.writeNoException();
                zzc.zze(parcel2, aVarZzb);
                return true;
            case 2:
                F4.a aVarA = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                zzc.zzb(parcel);
                f0(aVarA);
                break;
            case 3:
                F4.a aVarA2 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                String string = parcel.readString();
                zzc.zzb(parcel);
                h(aVarA2, string);
                break;
            case 4:
                F4.a aVarA3 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzc.zzb(parcel);
                S(aVarA3, i11);
                break;
            case 5:
                F4.a aVarA4 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                zzc.zzb(parcel);
                V0(aVarA4);
                break;
            case 6:
                F4.a aVarA5 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzc.zzb(parcel);
                q(aVarA5, i12);
                break;
            case 7:
                F4.a aVarA6 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzc.zzb(parcel);
                U0(aVarA6, string2);
                break;
            case 8:
                F4.a aVarA7 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                boolean zZzf = zzc.zzf(parcel);
                zzc.zzb(parcel);
                X(aVarA7, zZzf);
                break;
            case 9:
                F4.a aVarA8 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzc.zzb(parcel);
                B(aVarA8, i13);
                break;
            case 10:
                F4.a aVarA9 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzc.zzb(parcel);
                w0(aVarA9, i14);
                break;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
