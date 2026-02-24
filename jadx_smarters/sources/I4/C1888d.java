package i4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: i4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1888d extends AbstractC2985a {
    public static final Parcelable.Creator<C1888d> CREATOR = new C1889e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f41861g;

    public C1888d(String str, String str2) {
        this.f41860f = str;
        this.f41861g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f41860f, false);
        y4.c.t(parcel, 2, this.f41861g, false);
        y4.c.b(parcel, iA);
    }
}
