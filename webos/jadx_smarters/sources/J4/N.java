package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends AbstractC2985a {
    public static final Parcelable.Creator<N> CREATOR = new O();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f3259i;

    public N(int i9, int i10, long j9, long j10) {
        this.f3256f = i9;
        this.f3257g = i10;
        this.f3258h = j9;
        this.f3259i = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            N n9 = (N) obj;
            if (this.f3256f == n9.f3256f && this.f3257g == n9.f3257g && this.f3258h == n9.f3258h && this.f3259i == n9.f3259i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f3257g), Integer.valueOf(this.f3256f), Long.valueOf(this.f3259i), Long.valueOf(this.f3258h));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f3256f + " Cell status: " + this.f3257g + " elapsed time NS: " + this.f3259i + " system time ms: " + this.f3258h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f3256f);
        y4.c.l(parcel, 2, this.f3257g);
        y4.c.o(parcel, 3, this.f3258h);
        y4.c.o(parcel, 4, this.f3259i);
        y4.c.b(parcel, iA);
    }
}
