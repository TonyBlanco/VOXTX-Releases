package P4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.P;
import w4.C2914b;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends AbstractC2985a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2914b f7287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P f7288h;

    public l(int i9, C2914b c2914b, P p9) {
        this.f7286f = i9;
        this.f7287g = c2914b;
        this.f7288h = p9;
    }

    public final C2914b H() {
        return this.f7287g;
    }

    public final P I() {
        return this.f7288h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f7286f);
        y4.c.r(parcel, 2, this.f7287g, i9, false);
        y4.c.r(parcel, 3, this.f7288h, i9, false);
        y4.c.b(parcel, iA);
    }
}
