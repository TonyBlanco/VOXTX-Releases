package t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.Locale;
import n4.C2259A;
import n4.C2266d;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: t4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2778e extends AbstractC2985a {
    public static final Parcelable.Creator<C2778e> CREATOR = new C2779f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f50714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f50716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2266d f50717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f50718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2259A f50719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f50720l;

    public C2778e(double d9, boolean z9, int i9, C2266d c2266d, int i10, C2259A c2259a, double d10) {
        this.f50714f = d9;
        this.f50715g = z9;
        this.f50716h = i9;
        this.f50717i = c2266d;
        this.f50718j = i10;
        this.f50719k = c2259a;
        this.f50720l = d10;
    }

    public final double H() {
        return this.f50720l;
    }

    public final double I() {
        return this.f50714f;
    }

    public final int J() {
        return this.f50716h;
    }

    public final int K() {
        return this.f50718j;
    }

    public final C2266d L() {
        return this.f50717i;
    }

    public final C2259A M() {
        return this.f50719k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2778e)) {
            return false;
        }
        C2778e c2778e = (C2778e) obj;
        if (this.f50714f == c2778e.f50714f && this.f50715g == c2778e.f50715g && this.f50716h == c2778e.f50716h && AbstractC2774a.k(this.f50717i, c2778e.f50717i) && this.f50718j == c2778e.f50718j) {
            C2259A c2259a = this.f50719k;
            if (AbstractC2774a.k(c2259a, c2259a) && this.f50720l == c2778e.f50720l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1418q.c(Double.valueOf(this.f50714f), Boolean.valueOf(this.f50715g), Integer.valueOf(this.f50716h), this.f50717i, Integer.valueOf(this.f50718j), this.f50719k, Double.valueOf(this.f50720l));
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f50714f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.g(parcel, 2, this.f50714f);
        y4.c.c(parcel, 3, this.f50715g);
        y4.c.l(parcel, 4, this.f50716h);
        y4.c.r(parcel, 5, this.f50717i, i9, false);
        y4.c.l(parcel, 6, this.f50718j);
        y4.c.r(parcel, 7, this.f50719k, i9, false);
        y4.c.g(parcel, 8, this.f50720l);
        y4.c.b(parcel, iA);
    }

    public final boolean zzg() {
        return this.f50715g;
    }
}
