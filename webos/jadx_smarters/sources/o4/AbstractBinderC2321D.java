package o4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.zzb;

/* JADX INFO: renamed from: o4.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2321D extends zzb implements InterfaceC2322E {
    public static InterfaceC2322E A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2322E ? (InterfaceC2322E) iInterfaceQueryLocalInterface : new C2320C(iBinder);
    }
}
