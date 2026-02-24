package w4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends AbstractC2985a {
    public static final Parcelable.Creator<H> CREATOR = new I();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f51630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f51631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f51632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f51633i;

    public H(boolean z9, String str, int i9, int i10) {
        this.f51630f = z9;
        this.f51631g = str;
        this.f51632h = P.a(i9) - 1;
        this.f51633i = u.a(i10) - 1;
    }

    public final boolean H() {
        return this.f51630f;
    }

    public final int I() {
        return u.a(this.f51633i);
    }

    public final int J() {
        return P.a(this.f51632h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.c(parcel, 1, this.f51630f);
        y4.c.t(parcel, 2, this.f51631g, false);
        y4.c.l(parcel, 3, this.f51632h);
        y4.c.l(parcel, 4, this.f51633i);
        y4.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f51631g;
    }
}
