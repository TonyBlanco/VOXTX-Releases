package J4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC1418q;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends AbstractC2985a {
    public static final Parcelable.Creator<Y> CREATOR = new Z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3271j;

    public Y() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, a.e.API_PRIORITY_OTHER);
    }

    public Y(boolean z9, long j9, float f9, long j10, int i9) {
        this.f3267f = z9;
        this.f3268g = j9;
        this.f3269h = f9;
        this.f3270i = j10;
        this.f3271j = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y9 = (Y) obj;
        return this.f3267f == y9.f3267f && this.f3268g == y9.f3268g && Float.compare(this.f3269h, y9.f3269h) == 0 && this.f3270i == y9.f3270i && this.f3271j == y9.f3271j;
    }

    public final int hashCode() {
        return AbstractC1418q.c(Boolean.valueOf(this.f3267f), Long.valueOf(this.f3268g), Float.valueOf(this.f3269h), Long.valueOf(this.f3270i), Integer.valueOf(this.f3271j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f3267f);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f3268g);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f3269h);
        long j9 = this.f3270i;
        if (j9 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j9 - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.f3271j != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f3271j);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.c(parcel, 1, this.f3267f);
        y4.c.o(parcel, 2, this.f3268g);
        y4.c.i(parcel, 3, this.f3269h);
        y4.c.o(parcel, 4, this.f3270i);
        y4.c.l(parcel, 5, this.f3271j);
        y4.c.b(parcel, iA);
    }
}
