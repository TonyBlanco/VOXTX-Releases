package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: J4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0654m extends AbstractC2985a implements com.google.android.gms.common.api.h {
    public static final Parcelable.Creator<C0654m> CREATOR = new L();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Status f3306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0655n f3307g;

    public C0654m(Status status, C0655n c0655n) {
        this.f3306f = status;
        this.f3307g = c0655n;
    }

    public C0655n H() {
        return this.f3307g;
    }

    @Override // com.google.android.gms.common.api.h
    public Status getStatus() {
        return this.f3306f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 1, getStatus(), i9, false);
        y4.c.r(parcel, 2, H(), i9, false);
        y4.c.b(parcel, iA);
    }
}
