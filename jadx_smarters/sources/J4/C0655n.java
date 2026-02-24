package J4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: J4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0655n extends AbstractC2985a {
    public static final Parcelable.Creator<C0655n> CREATOR = new M();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3313k;

    public C0655n(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f3308f = z9;
        this.f3309g = z10;
        this.f3310h = z11;
        this.f3311i = z12;
        this.f3312j = z13;
        this.f3313k = z14;
    }

    public boolean H() {
        return this.f3313k;
    }

    public boolean I() {
        return this.f3310h;
    }

    public boolean J() {
        return this.f3311i;
    }

    public boolean K() {
        return this.f3308f;
    }

    public boolean L() {
        return this.f3312j;
    }

    public boolean M() {
        return this.f3309g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.c(parcel, 1, K());
        y4.c.c(parcel, 2, M());
        y4.c.c(parcel, 3, I());
        y4.c.c(parcel, 4, J());
        y4.c.c(parcel, 5, L());
        y4.c.c(parcel, 6, H());
        y4.c.b(parcel, iA);
    }
}
