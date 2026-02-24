package p4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: p4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2431f extends AbstractC2985a {
    public static final Parcelable.Creator<C2431f> CREATOR = new e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46460h;

    public C2431f(String str, int i9, String str2) {
        this.f46458f = str;
        this.f46459g = i9;
        this.f46460h = str2;
    }

    public String H() {
        return this.f46458f;
    }

    public String I() {
        return this.f46460h;
    }

    public int J() {
        return this.f46459g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, H(), false);
        y4.c.l(parcel, 3, J());
        y4.c.t(parcel, 4, I(), false);
        y4.c.b(parcel, iA);
    }
}
