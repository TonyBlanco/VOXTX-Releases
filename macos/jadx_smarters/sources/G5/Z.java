package G5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzagr;

/* JADX INFO: loaded from: classes3.dex */
public final class Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        zzagr zzagrVar = null;
        long jW = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 2) {
                strF2 = y4.b.f(parcel, iS);
            } else if (iL == 3) {
                jW = y4.b.w(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                zzagrVar = (zzagr) y4.b.e(parcel, iS, zzagr.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new M(strF, strF2, jW, zzagrVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new M[i9];
    }
}
