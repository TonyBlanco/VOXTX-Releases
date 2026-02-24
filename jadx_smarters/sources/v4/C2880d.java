package v4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: v4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2880d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            if (y4.b.l(iS) != 1) {
                y4.b.A(parcel, iS);
            } else {
                intent = (Intent) y4.b.e(parcel, iS, Intent.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new C2877a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new C2877a[i9];
    }
}
