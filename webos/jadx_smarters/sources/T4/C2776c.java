package t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: t4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2776c extends AbstractC2985a {
    public static final Parcelable.Creator<C2776c> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f50713f;

    public C2776c(String str) {
        this.f50713f = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2776c) {
            return AbstractC2774a.k(this.f50713f, ((C2776c) obj).f50713f);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1418q.c(this.f50713f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, this.f50713f, false);
        y4.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f50713f;
    }
}
