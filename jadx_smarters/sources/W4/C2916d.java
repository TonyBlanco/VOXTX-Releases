package w4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import org.apache.http.cookie.ClientCookie;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: w4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2916d extends AbstractC2985a {
    public static final Parcelable.Creator<C2916d> CREATOR = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f51654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f51655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f51656h;

    public C2916d(String str, int i9, long j9) {
        this.f51654f = str;
        this.f51655g = i9;
        this.f51656h = j9;
    }

    public C2916d(String str, long j9) {
        this.f51654f = str;
        this.f51656h = j9;
        this.f51655g = -1;
    }

    public long H() {
        long j9 = this.f51656h;
        return j9 == -1 ? this.f51655g : j9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2916d) {
            C2916d c2916d = (C2916d) obj;
            if (((getName() != null && getName().equals(c2916d.getName())) || (getName() == null && c2916d.getName() == null)) && H() == c2916d.H()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f51654f;
    }

    public final int hashCode() {
        return AbstractC1418q.c(getName(), Long.valueOf(H()));
    }

    public final String toString() {
        AbstractC1418q.a aVarD = AbstractC1418q.d(this);
        aVarD.a("name", getName());
        aVarD.a(ClientCookie.VERSION_ATTR, Long.valueOf(H()));
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, getName(), false);
        y4.c.l(parcel, 2, this.f51655g);
        y4.c.o(parcel, 3, H());
        y4.c.b(parcel, iA);
    }
}
