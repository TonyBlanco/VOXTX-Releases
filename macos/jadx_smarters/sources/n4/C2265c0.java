package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import t4.AbstractC2774a;

/* JADX INFO: renamed from: n4.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2265c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iS;
        int iB = y4.b.B(parcel);
        String strF = null;
        long jW = 0;
        String strF2 = null;
        Integer numV = null;
        String strF3 = null;
        while (true) {
            long j9 = jW;
            while (parcel.dataPosition() < iB) {
                iS = y4.b.s(parcel);
                int iL = y4.b.l(iS);
                if (iL == 2) {
                    strF2 = y4.b.f(parcel, iS);
                } else if (iL != 3) {
                    if (iL == 4) {
                        numV = y4.b.v(parcel, iS);
                    } else if (iL == 5) {
                        strF3 = y4.b.f(parcel, iS);
                    } else if (iL != 6) {
                        y4.b.A(parcel, iS);
                    } else {
                        strF = y4.b.f(parcel, iS);
                    }
                }
            }
            y4.b.k(parcel, iB);
            return new MediaError(strF2, j9, numV, strF3, AbstractC2774a.a(strF));
            jW = y4.b.w(parcel, iS);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new MediaError[i9];
    }
}
