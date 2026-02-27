package P4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.N;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractC2985a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N f7285g;

    public j(int i9, N n9) {
        this.f7284f = i9;
        this.f7285g = n9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f7284f);
        y4.c.r(parcel, 2, this.f7285g, i9, false);
        y4.c.b(parcel, iA);
    }
}
