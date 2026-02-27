package androidx.core.graphics.drawable;

import M0.b;
import android.content.res.ColorStateList;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f14529a = bVar.p(iconCompat.f14529a, 1);
        iconCompat.f14531c = bVar.j(iconCompat.f14531c, 2);
        iconCompat.f14532d = bVar.r(iconCompat.f14532d, 3);
        iconCompat.f14533e = bVar.p(iconCompat.f14533e, 4);
        iconCompat.f14534f = bVar.p(iconCompat.f14534f, 5);
        iconCompat.f14535g = (ColorStateList) bVar.r(iconCompat.f14535g, 6);
        iconCompat.f14537i = bVar.t(iconCompat.f14537i, 7);
        iconCompat.f14538j = bVar.t(iconCompat.f14538j, 8);
        iconCompat.k();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.x(true, true);
        iconCompat.l(bVar.f());
        int i9 = iconCompat.f14529a;
        if (-1 != i9) {
            bVar.F(i9, 1);
        }
        byte[] bArr = iconCompat.f14531c;
        if (bArr != null) {
            bVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f14532d;
        if (parcelable != null) {
            bVar.H(parcelable, 3);
        }
        int i10 = iconCompat.f14533e;
        if (i10 != 0) {
            bVar.F(i10, 4);
        }
        int i11 = iconCompat.f14534f;
        if (i11 != 0) {
            bVar.F(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f14535g;
        if (colorStateList != null) {
            bVar.H(colorStateList, 6);
        }
        String str = iconCompat.f14537i;
        if (str != null) {
            bVar.J(str, 7);
        }
        String str2 = iconCompat.f14538j;
        if (str2 != null) {
            bVar.J(str2, 8);
        }
    }
}
