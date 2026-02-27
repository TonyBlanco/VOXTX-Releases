package P4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC2985a implements com.google.android.gms.common.api.h {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Intent f7281h;

    public b(int i9, int i10, Intent intent) {
        this.f7279f = i9;
        this.f7280g = i10;
        this.f7281h = intent;
    }

    @Override // com.google.android.gms.common.api.h
    public final Status getStatus() {
        return this.f7280g == 0 ? Status.f26437k : Status.f26441o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.f7279f;
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, i10);
        y4.c.l(parcel, 2, this.f7280g);
        y4.c.r(parcel, 3, this.f7281h, i9, false);
        y4.c.b(parcel, iA);
    }
}
