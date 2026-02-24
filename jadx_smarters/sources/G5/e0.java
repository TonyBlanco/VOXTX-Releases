package G5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        zzagt zzagtVar = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 2:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 3:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 4:
                    zzagtVar = (zzagt) y4.b.e(parcel, iS, zzagt.CREATOR);
                    break;
                case 5:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                case 6:
                    strF5 = y4.b.f(parcel, iS);
                    break;
                case 7:
                    strF6 = y4.b.f(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new f0(strF, strF2, strF3, zzagtVar, strF4, strF5, strF6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new f0[i9];
    }
}
