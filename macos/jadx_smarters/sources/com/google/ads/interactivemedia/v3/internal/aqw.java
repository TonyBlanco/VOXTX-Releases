package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aqw extends apq implements aqx {
    public aqw() {
        super("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apq
    public final boolean a(int i9, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i9 == 1) {
            arc arcVar = (arc) apr.a(parcel, arc.CREATOR);
            apr.b(parcel);
            c(arcVar);
        } else {
            if (i9 != 2) {
                return false;
            }
            int i10 = parcel.readInt();
            apr.b(parcel);
            b(i10);
        }
        return true;
    }
}
