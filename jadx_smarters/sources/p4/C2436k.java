package p4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2436k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        IBinder iBinderT = null;
        C2433h c2433h = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 3:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 4:
                    iBinderT = y4.b.t(parcel, iS);
                    break;
                case 5:
                    c2433h = (C2433h) y4.b.e(parcel, iS, C2433h.CREATOR);
                    break;
                case 6:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 7:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2426a(strF, strF2, iBinderT, c2433h, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2426a[i9];
    }
}
