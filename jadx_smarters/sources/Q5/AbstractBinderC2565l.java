package q5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: q5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2565l extends AbstractBinderC2558e implements InterfaceC2566m {
    public AbstractBinderC2565l() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // q5.AbstractBinderC2558e
    public final boolean a(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i9 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC2559f.a(parcel, Bundle.CREATOR);
        AbstractC2559f.b(parcel);
        b(bundle);
        return true;
    }
}
