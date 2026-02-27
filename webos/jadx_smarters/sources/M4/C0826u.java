package M4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: M4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0826u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
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
        return new C0820t(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C0820t[i9];
    }
}
