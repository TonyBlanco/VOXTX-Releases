package P4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends AbstractC2985a implements com.google.android.gms.common.api.h {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7283g;

    public h(List list, String str) {
        this.f7282f = list;
        this.f7283g = str;
    }

    @Override // com.google.android.gms.common.api.h
    public final Status getStatus() {
        return this.f7283g != null ? Status.f26437k : Status.f26441o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        List list = this.f7282f;
        int iA = y4.c.a(parcel);
        y4.c.v(parcel, 1, list, false);
        y4.c.t(parcel, 2, this.f7283g, false);
        y4.c.b(parcel, iA);
    }
}
