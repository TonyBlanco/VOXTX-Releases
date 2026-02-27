package p4;

import F4.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;

/* JADX INFO: renamed from: p4.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2414B extends zza implements V {
    public C2414B(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // p4.V
    public final F4.a zzg() throws RemoteException {
        Parcel parcelZzb = zzb(2, zza());
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return aVarA;
    }
}
