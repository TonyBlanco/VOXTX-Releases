package com.google.android.gms.location;

import J4.F;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationResult extends AbstractC2985a implements ReflectedParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f26941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f26940g = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new F();

    public LocationResult(List list) {
        this.f26941f = list;
    }

    public List H() {
        return this.f26941f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f26941f.size() != this.f26941f.size()) {
            return false;
        }
        Iterator it = locationResult.f26941f.iterator();
        Iterator it2 = this.f26941f.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator it = this.f26941f.iterator();
        int i9 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i9 = (i9 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i9;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f26941f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.x(parcel, 1, H(), false);
        c.b(parcel, iA);
    }
}
