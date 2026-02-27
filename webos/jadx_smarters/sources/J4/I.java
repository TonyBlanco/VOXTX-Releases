package J4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends AbstractC2985a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3255h;

    public I(String str, String str2, String str3) {
        this.f3255h = str;
        this.f3253f = str2;
        this.f3254g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f3253f, false);
        y4.c.t(parcel, 2, this.f3254g, false);
        y4.c.t(parcel, 5, this.f3255h, false);
        y4.c.b(parcel, iA);
    }
}
