package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.Locale;
import t4.AbstractC2774a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2276i extends AbstractC2985a {
    public static final Parcelable.Creator<C2276i> CREATOR = new C2263b0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2274h f45397i;

    public C2276i() {
        this(false, AbstractC2774a.h(Locale.getDefault()), false, null);
    }

    public C2276i(boolean z9, String str, boolean z10, C2274h c2274h) {
        this.f45394f = z9;
        this.f45395g = str;
        this.f45396h = z10;
        this.f45397i = c2274h;
    }

    public boolean H() {
        return this.f45396h;
    }

    public C2274h I() {
        return this.f45397i;
    }

    public String J() {
        return this.f45395g;
    }

    public boolean K() {
        return this.f45394f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2276i)) {
            return false;
        }
        C2276i c2276i = (C2276i) obj;
        return this.f45394f == c2276i.f45394f && AbstractC2774a.k(this.f45395g, c2276i.f45395g) && this.f45396h == c2276i.f45396h && AbstractC2774a.k(this.f45397i, c2276i.f45397i);
    }

    public int hashCode() {
        return AbstractC1418q.c(Boolean.valueOf(this.f45394f), this.f45395g, Boolean.valueOf(this.f45396h), this.f45397i);
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.f45394f), this.f45395g, Boolean.valueOf(this.f45396h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.c(parcel, 2, K());
        y4.c.t(parcel, 3, J(), false);
        y4.c.c(parcel, 4, H());
        y4.c.r(parcel, 5, I(), i9, false);
        y4.c.b(parcel, iA);
    }
}
