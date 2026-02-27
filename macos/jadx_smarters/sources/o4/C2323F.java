package o4;

import F4.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zza;

/* JADX INFO: renamed from: o4.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2323F extends zza implements G {
    public C2323F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // o4.G
    public final F4.a zze() throws RemoteException {
        Parcel parcelZzb = zzb(5, zza());
        F4.a aVarA = a.AbstractBinderC0028a.A(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return aVarA;
    }
}
