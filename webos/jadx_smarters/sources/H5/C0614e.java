package H5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import com.google.android.gms.internal.p001firebaseauthapi.zzafq;
import java.util.ArrayList;

/* JADX INFO: renamed from: H5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0614e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        zzafn zzafnVar = null;
        f0 f0Var = null;
        String strF = null;
        String strF2 = null;
        ArrayList arrayListJ = null;
        ArrayList arrayListH = null;
        String strF3 = null;
        Boolean boolN = null;
        C0613d c0613d = null;
        G5.f0 f0Var2 = null;
        C0634z c0634z = null;
        ArrayList arrayListJ2 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    zzafnVar = (zzafn) y4.b.e(parcel, iS, zzafn.CREATOR);
                    break;
                case 2:
                    f0Var = (f0) y4.b.e(parcel, iS, f0.CREATOR);
                    break;
                case 3:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 4:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 5:
                    arrayListJ = y4.b.j(parcel, iS, f0.CREATOR);
                    break;
                case 6:
                    arrayListH = y4.b.h(parcel, iS);
                    break;
                case 7:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 8:
                    boolN = y4.b.n(parcel, iS);
                    break;
                case 9:
                    c0613d = (C0613d) y4.b.e(parcel, iS, C0613d.CREATOR);
                    break;
                case 10:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 11:
                    f0Var2 = (G5.f0) y4.b.e(parcel, iS, G5.f0.CREATOR);
                    break;
                case 12:
                    c0634z = (C0634z) y4.b.e(parcel, iS, C0634z.CREATOR);
                    break;
                case 13:
                    arrayListJ2 = y4.b.j(parcel, iS, zzafq.CREATOR);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C0611b(zzafnVar, f0Var, strF, strF2, arrayListJ, arrayListH, strF3, boolN, c0613d, zM, f0Var2, c0634z, arrayListJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C0611b[i9];
    }
}
