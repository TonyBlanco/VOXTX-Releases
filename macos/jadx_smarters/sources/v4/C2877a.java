package v4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: v4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2877a extends AbstractC2985a {
    public static final Parcelable.Creator<C2877a> CREATOR = new C2880d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f51338f;

    public C2877a(Intent intent) {
        this.f51338f = intent;
    }

    public Intent H() {
        return this.f51338f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 1, this.f51338f, i9, false);
        y4.c.b(parcel, iA);
    }
}
