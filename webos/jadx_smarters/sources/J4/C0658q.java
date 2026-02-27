package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.List;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: J4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0658q extends AbstractC2985a {
    public static final Parcelable.Creator<C0658q> CREATOR = new S();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f3314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3315g;

    public C0658q(List list, int i9) {
        this.f3314f = list;
        this.f3315g = i9;
    }

    public int H() {
        return this.f3315g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0658q)) {
            return false;
        }
        C0658q c0658q = (C0658q) obj;
        return AbstractC1418q.b(this.f3314f, c0658q.f3314f) && this.f3315g == c0658q.f3315g;
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f3314f, Integer.valueOf(this.f3315g));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        com.google.android.gms.common.internal.r.m(parcel);
        int iA = y4.c.a(parcel);
        y4.c.x(parcel, 1, this.f3314f, false);
        y4.c.l(parcel, 2, H());
        y4.c.b(parcel, iA);
    }
}
