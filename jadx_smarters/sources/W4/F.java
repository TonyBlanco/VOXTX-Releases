package w4;

import F4.a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends AbstractC2985a {
    public static final Parcelable.Creator<F> CREATOR = new G();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f51624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f51625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f51626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f51627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f51628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f51629k;

    public F(String str, boolean z9, boolean z10, IBinder iBinder, boolean z11, boolean z12) {
        this.f51624f = str;
        this.f51625g = z9;
        this.f51626h = z10;
        this.f51627i = (Context) F4.b.E(a.AbstractBinderC0028a.A(iBinder));
        this.f51628j = z11;
        this.f51629k = z12;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [F4.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String str = this.f51624f;
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, str, false);
        y4.c.c(parcel, 2, this.f51625g);
        y4.c.c(parcel, 3, this.f51626h);
        y4.c.k(parcel, 4, F4.b.Z(this.f51627i), false);
        y4.c.c(parcel, 5, this.f51628j);
        y4.c.c(parcel, 6, this.f51629k);
        y4.c.b(parcel, iA);
    }
}
