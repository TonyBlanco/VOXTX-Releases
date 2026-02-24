package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import x4.C2957a;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        int iU = 0;
        ArrayList arrayListJ = null;
        Bundle bundleA = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                arrayListJ = y4.b.j(parcel, iS, C2957a.CREATOR);
            } else if (iL == 3) {
                bundleA = y4.b.a(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                iU = y4.b.u(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C2281m(arrayListJ, bundleA, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2281m[i9];
    }
}
