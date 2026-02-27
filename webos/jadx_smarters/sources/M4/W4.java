package M4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class W4 implements Parcelable.Creator {
    public static void a(V4 v42, Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, v42.f4518f);
        y4.c.t(parcel, 2, v42.f4519g, false);
        y4.c.o(parcel, 3, v42.f4520h);
        y4.c.q(parcel, 4, v42.f4521i, false);
        y4.c.j(parcel, 5, null, false);
        y4.c.t(parcel, 6, v42.f4522j, false);
        y4.c.t(parcel, 7, v42.f4523k, false);
        y4.c.h(parcel, 8, v42.f4524l, false);
        y4.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        Long lX = null;
        Float fR = null;
        String strF2 = null;
        String strF3 = null;
        Double dP = null;
        long jW = 0;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 2:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 3:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 4:
                    lX = y4.b.x(parcel, iS);
                    break;
                case 5:
                    fR = y4.b.r(parcel, iS);
                    break;
                case 6:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 7:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 8:
                    dP = y4.b.p(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new V4(iU, strF, jW, lX, fR, strF2, strF3, dP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new V4[i9];
    }
}
