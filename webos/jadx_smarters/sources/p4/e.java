package P4;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends zab implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i9, Parcel parcel, Parcel parcel2, int i10) {
        switch (i9) {
            case 3:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 7:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                l lVar = (l) zac.zaa(parcel, l.CREATOR);
                zac.zab(parcel);
                M0(lVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zac.zab(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
