package p4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: p4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2427b extends AbstractC2985a {
    public static final Parcelable.Creator<C2427b> CREATOR = new Y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46440h;

    public C2427b(int i9, int i10, int i11) {
        this.f46438f = i9;
        this.f46439g = i10;
        this.f46440h = i11;
    }

    public int H() {
        return this.f46440h;
    }

    public int I() {
        return this.f46438f;
    }

    public int J() {
        return this.f46439g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 2, I());
        y4.c.l(parcel, 3, J());
        y4.c.l(parcel, 4, H());
        y4.c.b(parcel, iA);
    }
}
