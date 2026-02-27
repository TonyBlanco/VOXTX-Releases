package i4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: i4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1890f extends AbstractC2985a {
    public static final Parcelable.Creator<C1890f> CREATOR = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f41863g;

    public C1890f(String str, int i9) {
        this.f41862f = str;
        this.f41863g = i9;
    }

    public final int H() {
        return this.f41863g;
    }

    public final String I() {
        return this.f41862f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f41862f, false);
        y4.c.l(parcel, 2, this.f41863g);
        y4.c.b(parcel, iA);
    }
}
