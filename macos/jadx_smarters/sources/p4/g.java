package P4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC1412k;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends zaa implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void A(int i9) throws RemoteException {
        Parcel parcelZaa = zaa();
        parcelZaa.writeInt(i9);
        zac(7, parcelZaa);
    }

    public final void E(InterfaceC1412k interfaceC1412k, int i9, boolean z9) throws RemoteException {
        Parcel parcelZaa = zaa();
        zac.zad(parcelZaa, interfaceC1412k);
        parcelZaa.writeInt(i9);
        parcelZaa.writeInt(z9 ? 1 : 0);
        zac(9, parcelZaa);
    }

    public final void Z(j jVar, f fVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        zac.zac(parcelZaa, jVar);
        zac.zad(parcelZaa, fVar);
        zac(12, parcelZaa);
    }
}
