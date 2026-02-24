package J4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends AbstractC2985a {
    public static final Parcelable.Creator<P> CREATOR = new Q();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f3260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f3261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3262h;

    public P(List list, PendingIntent pendingIntent, String str) {
        this.f3260f = list == null ? zzbs.zzi() : zzbs.zzj(list);
        this.f3261g = pendingIntent;
        this.f3262h = str;
    }

    public static P c(List list) {
        com.google.android.gms.common.internal.r.n(list, "geofence can't be null.");
        com.google.android.gms.common.internal.r.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new P(list, null, "");
    }

    public static P e(PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.r.n(pendingIntent, "PendingIntent can not be null.");
        return new P(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.v(parcel, 1, this.f3260f, false);
        y4.c.r(parcel, 2, this.f3261g, i9, false);
        y4.c.t(parcel, 3, this.f3262h, false);
        y4.c.b(parcel, iA);
    }
}
