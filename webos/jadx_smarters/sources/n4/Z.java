package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class Z extends AbstractC2985a {
    public static final Parcelable.Creator<Z> CREATOR = new C2261a0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45346f;

    public Z(int i9) {
        this.f45346f = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Z) && this.f45346f == ((Z) obj).f45346f;
    }

    public final int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f45346f));
    }

    public final String toString() {
        int i9 = this.f45346f;
        return String.format("joinOptions(connectionType=%s)", i9 != 0 ? i9 != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 2, this.f45346f);
        y4.c.b(parcel, iA);
    }
}
