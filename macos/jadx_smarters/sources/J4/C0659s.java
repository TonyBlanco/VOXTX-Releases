package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;

/* JADX INFO: renamed from: J4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0659s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = "";
        ArrayList arrayListJ = null;
        String strF2 = null;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                arrayListJ = y4.b.j(parcel, iS, zzbe.CREATOR);
            } else if (iL == 2) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 3) {
                strF = y4.b.f(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                strF2 = y4.b.f(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C0649h(arrayListJ, iU, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new C0649h[i9];
    }
}
