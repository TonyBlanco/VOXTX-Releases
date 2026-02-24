package t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends AbstractC2985a {
    public static final Parcelable.Creator<U> CREATOR = new C2777d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f50704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f50705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f50706h;

    public U(int i9, boolean z9, boolean z10) {
        this.f50704f = i9;
        this.f50705g = z9;
        this.f50706h = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u9 = (U) obj;
        return this.f50704f == u9.f50704f && this.f50705g == u9.f50705g && this.f50706h == u9.f50706h;
    }

    public final int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f50704f), Boolean.valueOf(this.f50705g), Boolean.valueOf(this.f50706h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 2, this.f50704f);
        y4.c.c(parcel, 3, this.f50705g);
        y4.c.c(parcel, 4, this.f50706h);
        y4.c.b(parcel, iA);
    }
}
