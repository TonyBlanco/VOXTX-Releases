package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class abe extends aba {
    public static final Parcelable.Creator<abe> CREATOR = new aaq(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18723b;

    /* JADX WARN: Illegal instructions before constructor call */
    public abe(Parcel parcel) {
        String string = parcel.readString();
        int i9 = cq.f22640a;
        super(string);
        this.f18722a = parcel.readString();
        this.f18723b = parcel.readString();
    }

    public abe(String str, String str2, String str3) {
        super(str);
        this.f18722a = str2;
        this.f18723b = str3;
    }

    private static List b(String str) {
        int i9;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                i9 = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        i9 = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                i9 = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(i9));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0106  */
    @Override // com.google.ads.interactivemedia.v3.internal.aba, com.google.ads.interactivemedia.v3.internal.an
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.ak r8) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.abe.a(com.google.ads.interactivemedia.v3.internal.ak):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abe.class == obj.getClass()) {
            abe abeVar = (abe) obj;
            if (cq.V(this.f18711f, abeVar.f18711f) && cq.V(this.f18722a, abeVar.f18722a) && cq.V(this.f18723b, abeVar.f18723b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f18711f.hashCode() + 527) * 31;
        String str = this.f18722a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18723b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba
    public final String toString() {
        return this.f18711f + ": description=" + this.f18722a + ": value=" + this.f18723b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18711f);
        parcel.writeString(this.f18722a);
        parcel.writeString(this.f18723b);
    }
}
