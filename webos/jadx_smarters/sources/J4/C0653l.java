package J4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: J4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0653l extends AbstractC2985a {
    public static final Parcelable.Creator<C0653l> CREATOR = new K();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f3302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I f3305i;

    public C0653l(List list, boolean z9, boolean z10, I i9) {
        this.f3302f = list;
        this.f3303g = z9;
        this.f3304h = z10;
        this.f3305i = i9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.x(parcel, 1, Collections.unmodifiableList(this.f3302f), false);
        y4.c.c(parcel, 2, this.f3303g);
        y4.c.c(parcel, 3, this.f3304h);
        y4.c.r(parcel, 5, this.f3305i, i9, false);
        y4.c.b(parcel, iA);
    }
}
