package H5;

import G5.InterfaceC0539f;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements InterfaceC0539f {
    public static final Parcelable.Creator<b0> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2664a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f2666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2667e;

    public b0(String str, String str2, boolean z9) {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g(str2);
        this.f2664a = str;
        this.f2665c = str2;
        this.f2666d = AbstractC0632x.d(str2);
        this.f2667e = z9;
    }

    public b0(boolean z9) {
        this.f2667e = z9;
        this.f2665c = null;
        this.f2664a = null;
        this.f2666d = null;
    }

    public final String a() {
        return this.f2664a;
    }

    public final boolean c() {
        return this.f2667e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, a(), false);
        y4.c.t(parcel, 2, this.f2665c, false);
        y4.c.c(parcel, 3, c());
        y4.c.b(parcel, iA);
    }
}
