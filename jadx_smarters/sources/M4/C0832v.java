package M4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: M4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0832v extends AbstractC2985a {
    public static final Parcelable.Creator<C0832v> CREATOR = new C0838w();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0820t f5089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5091i;

    public C0832v(C0832v c0832v, long j9) {
        com.google.android.gms.common.internal.r.m(c0832v);
        this.f5088f = c0832v.f5088f;
        this.f5089g = c0832v.f5089g;
        this.f5090h = c0832v.f5090h;
        this.f5091i = j9;
    }

    public C0832v(String str, C0820t c0820t, String str2, long j9) {
        this.f5088f = str;
        this.f5089g = c0820t;
        this.f5090h = str2;
        this.f5091i = j9;
    }

    public final String toString() {
        return "origin=" + this.f5090h + ",name=" + this.f5088f + ",params=" + String.valueOf(this.f5089g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        C0838w.a(this, parcel, i9);
    }
}
