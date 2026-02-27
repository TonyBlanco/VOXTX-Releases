package H5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: H5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0618i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        ArrayList arrayListJ = null;
        C0620k c0620k = null;
        String strF = null;
        G5.f0 f0Var = null;
        C0611b c0611b = null;
        ArrayList arrayListJ2 = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    arrayListJ = y4.b.j(parcel, iS, G5.J.CREATOR);
                    break;
                case 2:
                    c0620k = (C0620k) y4.b.e(parcel, iS, C0620k.CREATOR);
                    break;
                case 3:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 4:
                    f0Var = (G5.f0) y4.b.e(parcel, iS, G5.f0.CREATOR);
                    break;
                case 5:
                    c0611b = (C0611b) y4.b.e(parcel, iS, C0611b.CREATOR);
                    break;
                case 6:
                    arrayListJ2 = y4.b.j(parcel, iS, G5.M.CREATOR);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C0617h(arrayListJ, c0620k, strF, f0Var, c0611b, arrayListJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C0617h[i9];
    }
}
