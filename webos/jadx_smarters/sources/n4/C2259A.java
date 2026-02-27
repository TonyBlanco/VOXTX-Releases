package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import t4.AbstractC2774a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2259A extends AbstractC2985a {
    public static final Parcelable.Creator<C2259A> CREATOR = new B();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2292y f45261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2292y f45262g;

    public C2259A(C2292y c2292y, C2292y c2292y2) {
        this.f45261f = c2292y;
        this.f45262g = c2292y2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2259A)) {
            return false;
        }
        C2259A c2259a = (C2259A) obj;
        return AbstractC2774a.k(this.f45261f, c2259a.f45261f) && AbstractC2774a.k(this.f45262g, c2259a.f45262g);
    }

    public final int hashCode() {
        return AbstractC1418q.c(this.f45261f, this.f45262g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 2, this.f45261f, i9, false);
        y4.c.r(parcel, 3, this.f45262g, i9, false);
        y4.c.b(parcel, iA);
    }
}
