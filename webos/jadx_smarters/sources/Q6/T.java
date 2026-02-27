package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class T implements Parcelable.Creator {
    public static void c(S s9, Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.e(parcel, 2, s9.f46970f, false);
        y4.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public S createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            if (y4.b.l(iS) != 2) {
                y4.b.A(parcel, iS);
            } else {
                bundleA = y4.b.a(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new S(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public S[] newArray(int i9) {
        return new S[i9];
    }
}
