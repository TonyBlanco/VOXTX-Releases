package J4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = "";
        ArrayList arrayListH = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                arrayListH = y4.b.h(parcel, iS);
            } else if (iL == 2) {
                pendingIntent = (PendingIntent) y4.b.e(parcel, iS, PendingIntent.CREATOR);
            } else if (iL != 3) {
                y4.b.A(parcel, iS);
            } else {
                strF = y4.b.f(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new P(arrayListH, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new P[i9];
    }
}
