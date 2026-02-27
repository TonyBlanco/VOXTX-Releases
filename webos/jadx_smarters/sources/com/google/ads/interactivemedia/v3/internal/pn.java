package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pn implements an {
    public static final Parcelable.Creator<pn> CREATOR = new pl(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24116c;

    public pn(Parcel parcel) {
        this.f24114a = parcel.readString();
        this.f24115b = parcel.readString();
        int i9 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add((pm) parcel.readParcelable(pm.class.getClassLoader()));
        }
        this.f24116c = Collections.unmodifiableList(arrayList);
    }

    public pn(String str, String str2, List list) {
        this.f24114a = str;
        this.f24115b = str2;
        this.f24116c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final /* synthetic */ void a(ak akVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pn.class == obj.getClass()) {
            pn pnVar = (pn) obj;
            if (TextUtils.equals(this.f24114a, pnVar.f24114a) && TextUtils.equals(this.f24115b, pnVar.f24115b) && this.f24116c.equals(pnVar.f24116c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24114a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24115b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f24116c.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f24114a;
        if (str2 != null) {
            str = " [" + str2 + ", " + this.f24115b + "]";
        } else {
            str = "";
        }
        return "HlsTrackMetadataEntry".concat(String.valueOf(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f24114a);
        parcel.writeString(this.f24115b);
        int size = this.f24116c.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeParcelable((Parcelable) this.f24116c.get(i10), 0);
        }
    }
}
