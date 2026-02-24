package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2292y extends AbstractC2985a {
    public static final Parcelable.Creator<C2292y> CREATOR = new C2293z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f45541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f45542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f45543h;

    public C2292y(float f9, float f10, float f11) {
        this.f45541f = f9;
        this.f45542g = f10;
        this.f45543h = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2292y)) {
            return false;
        }
        C2292y c2292y = (C2292y) obj;
        return this.f45541f == c2292y.f45541f && this.f45542g == c2292y.f45542g && this.f45543h == c2292y.f45543h;
    }

    public final int hashCode() {
        return AbstractC1418q.c(Float.valueOf(this.f45541f), Float.valueOf(this.f45542g), Float.valueOf(this.f45543h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.i(parcel, 2, this.f45541f);
        y4.c.i(parcel, 3, this.f45542g);
        y4.c.i(parcel, 4, this.f45543h);
        y4.c.b(parcel, iA);
    }
}
