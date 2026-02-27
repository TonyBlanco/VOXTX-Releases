package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class T extends AbstractC2985a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3266i;

    public T(int i9, int i10, int i11, int i12) {
        com.google.android.gms.common.internal.r.q(i9 >= 0 && i9 <= 23, "Start hour must be in range [0, 23].");
        com.google.android.gms.common.internal.r.q(i10 >= 0 && i10 <= 59, "Start minute must be in range [0, 59].");
        com.google.android.gms.common.internal.r.q(i11 >= 0 && i11 <= 23, "End hour must be in range [0, 23].");
        com.google.android.gms.common.internal.r.q(i12 >= 0 && i12 <= 59, "End minute must be in range [0, 59].");
        com.google.android.gms.common.internal.r.q(((i9 + i10) + i11) + i12 > 0, "Parameters can't be all 0.");
        this.f3263f = i9;
        this.f3264g = i10;
        this.f3265h = i11;
        this.f3266i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t9 = (T) obj;
        return this.f3263f == t9.f3263f && this.f3264g == t9.f3264g && this.f3265h == t9.f3265h && this.f3266i == t9.f3266i;
    }

    public final int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f3263f), Integer.valueOf(this.f3264g), Integer.valueOf(this.f3265h), Integer.valueOf(this.f3266i));
    }

    public final String toString() {
        int i9 = this.f3263f;
        int i10 = this.f3264g;
        int i11 = this.f3265h;
        int i12 = this.f3266i;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i9);
        sb.append(", startMinute=");
        sb.append(i10);
        sb.append(", endHour=");
        sb.append(i11);
        sb.append(", endMinute=");
        sb.append(i12);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        com.google.android.gms.common.internal.r.m(parcel);
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f3263f);
        y4.c.l(parcel, 2, this.f3264g);
        y4.c.l(parcel, 3, this.f3265h);
        y4.c.l(parcel, 4, this.f3266i);
        y4.c.b(parcel, iA);
    }
}
