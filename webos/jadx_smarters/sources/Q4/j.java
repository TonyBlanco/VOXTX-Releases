package q4;

import android.os.Parcel;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends zzb implements k {
    public j() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 == 1) {
            long j9 = parcel.readLong();
            long j10 = parcel.readLong();
            zzc.zzb(parcel);
            p(j9, j10);
            parcel2.writeNoException();
        } else {
            if (i9 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
        }
        return true;
    }
}
