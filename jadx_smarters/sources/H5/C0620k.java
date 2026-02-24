package H5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: H5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0620k extends G5.D {
    public static final Parcelable.Creator<C0620k> CREATOR = new C0619j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f2697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f2698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0611b f2699j;

    public C0620k() {
    }

    public C0620k(String str, String str2, List list, List list2, C0611b c0611b) {
        this.f2695f = str;
        this.f2696g = str2;
        this.f2697h = list;
        this.f2698i = list2;
        this.f2699j = c0611b;
    }

    public static C0620k c(List list, String str) {
        List list2;
        G5.B b9;
        com.google.android.gms.common.internal.r.m(list);
        com.google.android.gms.common.internal.r.g(str);
        C0620k c0620k = new C0620k();
        c0620k.f2697h = new ArrayList();
        c0620k.f2698i = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            G5.B b10 = (G5.B) it.next();
            if (b10 instanceof G5.J) {
                list2 = c0620k.f2697h;
                b9 = (G5.J) b10;
            } else {
                if (!(b10 instanceof G5.M)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + b10.J());
                }
                list2 = c0620k.f2698i;
                b9 = (G5.M) b10;
            }
            list2.add(b9);
        }
        c0620k.f2696g = str;
        return c0620k;
    }

    public final String H() {
        return this.f2695f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f2695f, false);
        y4.c.t(parcel, 2, this.f2696g, false);
        y4.c.x(parcel, 3, this.f2697h, false);
        y4.c.x(parcel, 4, this.f2698i, false);
        y4.c.r(parcel, 5, this.f2699j, i9, false);
        y4.c.b(parcel, iA);
    }

    public final String zzc() {
        return this.f2696g;
    }
}
