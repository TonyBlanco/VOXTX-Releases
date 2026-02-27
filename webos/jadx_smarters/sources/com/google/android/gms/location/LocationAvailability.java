package com.google.android.gms.location;

import J4.D;
import J4.N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationAvailability extends AbstractC2985a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new D();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f26928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public N[] f26930j;

    public LocationAvailability(int i9, int i10, int i11, long j9, N[] nArr) {
        this.f26929i = i9;
        this.f26926f = i10;
        this.f26927g = i11;
        this.f26928h = j9;
        this.f26930j = nArr;
    }

    public boolean H() {
        return this.f26929i < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f26926f == locationAvailability.f26926f && this.f26927g == locationAvailability.f26927g && this.f26928h == locationAvailability.f26928h && this.f26929i == locationAvailability.f26929i && Arrays.equals(this.f26930j, locationAvailability.f26930j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f26929i), Integer.valueOf(this.f26926f), Integer.valueOf(this.f26927g), Long.valueOf(this.f26928h), this.f26930j);
    }

    public String toString() {
        boolean zH = H();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(zH);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.l(parcel, 1, this.f26926f);
        c.l(parcel, 2, this.f26927g);
        c.o(parcel, 3, this.f26928h);
        c.l(parcel, 4, this.f26929i);
        c.w(parcel, 5, this.f26930j, i9, false);
        c.b(parcel, iA);
    }
}
