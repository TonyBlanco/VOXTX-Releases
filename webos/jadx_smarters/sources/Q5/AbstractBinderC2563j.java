package q5;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: q5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2563j extends AbstractBinderC2558e implements InterfaceC2564k {
    public static InterfaceC2564k A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2564k ? (InterfaceC2564k) iInterfaceQueryLocalInterface : new C2562i(iBinder);
    }
}
