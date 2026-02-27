package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1322o implements Comparator<C1319n>, Parcelable {
    public static final Parcelable.Creator<C1322o> CREATOR = new C1316m(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1319n[] f23905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23906d;

    public C1322o(Parcel parcel) {
        this.f23903a = parcel.readString();
        C1319n[] c1319nArr = (C1319n[]) cq.G((C1319n[]) parcel.createTypedArray(C1319n.CREATOR));
        this.f23905c = c1319nArr;
        this.f23904b = c1319nArr.length;
    }

    public C1322o(String str, List list) {
        this(str, false, (C1319n[]) list.toArray(new C1319n[0]));
    }

    private C1322o(String str, boolean z9, C1319n... c1319nArr) {
        this.f23903a = str;
        c1319nArr = z9 ? (C1319n[]) c1319nArr.clone() : c1319nArr;
        this.f23905c = c1319nArr;
        this.f23904b = c1319nArr.length;
        Arrays.sort(c1319nArr, this);
    }

    public C1322o(String str, C1319n... c1319nArr) {
        this(str, true, c1319nArr);
    }

    public C1322o(List list) {
        this(null, false, (C1319n[]) list.toArray(new C1319n[0]));
    }

    public static C1322o c(C1322o c1322o, C1322o c1322o2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c1322o != null) {
            str = c1322o.f23903a;
            for (C1319n c1319n : c1322o.f23905c) {
                if (c1319n.b()) {
                    arrayList.add(c1319n);
                }
            }
        } else {
            str = null;
        }
        if (c1322o2 != null) {
            if (str == null) {
                str = c1322o2.f23903a;
            }
            int size = arrayList.size();
            for (C1319n c1319n2 : c1322o2.f23905c) {
                if (c1319n2.b()) {
                    UUID uuid = c1319n2.f23852a;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size) {
                            arrayList.add(c1319n2);
                            break;
                        }
                        if (((C1319n) arrayList.get(i9)).f23852a.equals(uuid)) {
                            break;
                        }
                        i9++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1322o(str, arrayList);
    }

    public final C1319n a(int i9) {
        return this.f23905c[i9];
    }

    public final C1322o b(String str) {
        return cq.V(this.f23903a, str) ? this : new C1322o(str, false, this.f23905c);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C1319n c1319n, C1319n c1319n2) {
        C1319n c1319n3 = c1319n;
        C1319n c1319n4 = c1319n2;
        UUID uuid = C1304i.f23212a;
        return uuid.equals(c1319n3.f23852a) ? !uuid.equals(c1319n4.f23852a) ? 1 : 0 : c1319n3.f23852a.compareTo(c1319n4.f23852a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1322o.class == obj.getClass()) {
            C1322o c1322o = (C1322o) obj;
            if (cq.V(this.f23903a, c1322o.f23903a) && Arrays.equals(this.f23905c, c1322o.f23905c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f23906d;
        if (i9 != 0) {
            return i9;
        }
        String str = this.f23903a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f23905c);
        this.f23906d = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f23903a);
        parcel.writeTypedArray(this.f23905c, 0);
    }
}
