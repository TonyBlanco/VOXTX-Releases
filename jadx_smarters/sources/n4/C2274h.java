package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2274h extends AbstractC2985a {
    public static final Parcelable.Creator<C2274h> CREATOR = new C2291x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45393g;

    public C2274h(String str, String str2) {
        this.f45392f = str;
        this.f45393g = str2;
    }

    public String H() {
        return this.f45392f;
    }

    public String I() {
        return this.f45393g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2274h)) {
            return false;
        }
        C2274h c2274h = (C2274h) obj;
        return AbstractC1418q.b(this.f45392f, c2274h.f45392f) && AbstractC1418q.b(this.f45393g, c2274h.f45393g);
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f45392f, this.f45393g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, H(), false);
        y4.c.t(parcel, 2, I(), false);
        y4.c.b(parcel, iA);
    }
}
