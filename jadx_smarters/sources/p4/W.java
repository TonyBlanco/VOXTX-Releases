package p4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends zza implements X {
    public W(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // p4.X
    public final List zzf() throws RemoteException {
        Parcel parcelZzb = zzb(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(C2431f.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p4.X
    public final int[] zzg() throws RemoteException {
        Parcel parcelZzb = zzb(4, zza());
        int[] iArrCreateIntArray = parcelZzb.createIntArray();
        parcelZzb.recycle();
        return iArrCreateIntArray;
    }
}
