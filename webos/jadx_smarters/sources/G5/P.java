package G5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public class P extends AbstractC2985a {
    public static final Parcelable.Creator<P> CREATOR = new b0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f2200j;

    public P(String str, String str2, boolean z9, boolean z10) {
        this.f2196f = str;
        this.f2197g = str2;
        this.f2198h = z9;
        this.f2199i = z10;
        this.f2200j = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public String H() {
        return this.f2196f;
    }

    public Uri I() {
        return this.f2200j;
    }

    public final boolean J() {
        return this.f2198h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, H(), false);
        y4.c.t(parcel, 3, this.f2197g, false);
        y4.c.c(parcel, 4, this.f2198h);
        y4.c.c(parcel, 5, this.f2199i);
        y4.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f2197g;
    }

    public final boolean zzc() {
        return this.f2199i;
    }
}
