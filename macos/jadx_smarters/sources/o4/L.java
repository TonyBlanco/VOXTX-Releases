package o4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.zzb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L extends zzb implements M {
    public static M A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
        return iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new K(iBinder);
    }
}
