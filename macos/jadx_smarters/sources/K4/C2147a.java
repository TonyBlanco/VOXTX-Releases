package k4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import y4.b;

/* JADX INFO: renamed from: k4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2147a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
        long jW = 0;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            switch (b.l(iS)) {
                case 1:
                    iU = b.u(parcel, iS);
                    break;
                case 2:
                    strF = b.f(parcel, iS);
                    break;
                case 3:
                    strF2 = b.f(parcel, iS);
                    break;
                case 4:
                    strF3 = b.f(parcel, iS);
                    break;
                case 5:
                    strF4 = b.f(parcel, iS);
                    break;
                case 6:
                    uri = (Uri) b.e(parcel, iS, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = b.f(parcel, iS);
                    break;
                case 8:
                    jW = b.w(parcel, iS);
                    break;
                case 9:
                    strF6 = b.f(parcel, iS);
                    break;
                case 10:
                    arrayListJ = b.j(parcel, iS, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = b.f(parcel, iS);
                    break;
                case 12:
                    strF8 = b.f(parcel, iS);
                    break;
                default:
                    b.A(parcel, iS);
                    break;
            }
        }
        b.k(parcel, iB);
        return new GoogleSignInAccount(iU, strF, strF2, strF3, strF4, uri, strF5, jW, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new GoogleSignInAccount[i9];
    }
}
