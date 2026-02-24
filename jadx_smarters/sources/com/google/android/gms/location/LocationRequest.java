package com.google.android.gms.location;

import J4.E;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import org.apache.http.HttpStatus;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationRequest extends AbstractC2985a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new E();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f26933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f26935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f26937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f26938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f26939n;

    @Deprecated
    public LocationRequest() {
        this.f26931f = HttpStatus.SC_PROCESSING;
        this.f26932g = 3600000L;
        this.f26933h = 600000L;
        this.f26934i = false;
        this.f26935j = Long.MAX_VALUE;
        this.f26936k = a.e.API_PRIORITY_OTHER;
        this.f26937l = 0.0f;
        this.f26938m = 0L;
        this.f26939n = false;
    }

    public LocationRequest(int i9, long j9, long j10, boolean z9, long j11, int i10, float f9, long j12, boolean z10) {
        this.f26931f = i9;
        this.f26932g = j9;
        this.f26933h = j10;
        this.f26934i = z9;
        this.f26935j = j11;
        this.f26936k = i10;
        this.f26937l = f9;
        this.f26938m = j12;
        this.f26939n = z10;
    }

    public static LocationRequest H() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.O(true);
        return locationRequest;
    }

    public static void P(long j9) {
        if (j9 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j9);
        throw new IllegalArgumentException(sb.toString());
    }

    public long I() {
        return this.f26932g;
    }

    public long J() {
        long j9 = this.f26938m;
        long j10 = this.f26932g;
        return j9 < j10 ? j10 : j9;
    }

    public LocationRequest K(long j9) {
        P(j9);
        this.f26934i = true;
        this.f26933h = j9;
        return this;
    }

    public LocationRequest L(long j9) {
        P(j9);
        this.f26932g = j9;
        if (!this.f26934i) {
            this.f26933h = (long) (j9 / 6.0d);
        }
        return this;
    }

    public LocationRequest M(long j9) {
        P(j9);
        this.f26938m = j9;
        return this;
    }

    public LocationRequest N(int i9) {
        if (i9 == 100 || i9 == 102 || i9 == 104 || i9 == 105) {
            this.f26931f = i9;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    public LocationRequest O(boolean z9) {
        this.f26939n = z9;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f26931f == locationRequest.f26931f && this.f26932g == locationRequest.f26932g && this.f26933h == locationRequest.f26933h && this.f26934i == locationRequest.f26934i && this.f26935j == locationRequest.f26935j && this.f26936k == locationRequest.f26936k && this.f26937l == locationRequest.f26937l && J() == locationRequest.J() && this.f26939n == locationRequest.f26939n) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f26931f), Long.valueOf(this.f26932g), Float.valueOf(this.f26937l), Long.valueOf(this.f26938m));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i9 = this.f26931f;
        sb.append(i9 != 100 ? i9 != 102 ? i9 != 104 ? i9 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f26931f != 105) {
            sb.append(" requested=");
            sb.append(this.f26932g);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f26933h);
        sb.append("ms");
        if (this.f26938m > this.f26932g) {
            sb.append(" maxWait=");
            sb.append(this.f26938m);
            sb.append("ms");
        }
        if (this.f26937l > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f26937l);
            sb.append("m");
        }
        long j9 = this.f26935j;
        if (j9 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j9 - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.f26936k != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f26936k);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.l(parcel, 1, this.f26931f);
        c.o(parcel, 2, this.f26932g);
        c.o(parcel, 3, this.f26933h);
        c.c(parcel, 4, this.f26934i);
        c.o(parcel, 5, this.f26935j);
        c.l(parcel, 6, this.f26936k);
        c.i(parcel, 7, this.f26937l);
        c.o(parcel, 8, this.f26938m);
        c.c(parcel, 9, this.f26939n);
        c.b(parcel, iA);
    }
}
