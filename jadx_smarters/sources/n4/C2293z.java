package n4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: n4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2293z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        float fQ = 0.0f;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                fQ = y4.b.q(parcel, iS);
            } else if (iL == 3) {
                fQ2 = y4.b.q(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                fQ3 = y4.b.q(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C2292y(fQ, fQ2, fQ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2292y[i9];
    }
}
