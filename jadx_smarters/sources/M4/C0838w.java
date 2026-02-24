package M4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: M4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0838w implements Parcelable.Creator {
    public static void a(C0832v c0832v, Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, c0832v.f5088f, false);
        y4.c.r(parcel, 3, c0832v.f5089g, i9, false);
        y4.c.t(parcel, 4, c0832v.f5090h, false);
        y4.c.o(parcel, 5, c0832v.f5091i);
        y4.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = 0;
        String strF = null;
        C0820t c0820t = null;
        String strF2 = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 3) {
                c0820t = (C0820t) y4.b.e(parcel, iS, C0820t.CREATOR);
            } else if (iL == 4) {
                strF2 = y4.b.f(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                jW = y4.b.w(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C0832v(strF, c0820t, strF2, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C0832v[i9];
    }
}
