package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: J4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0649h extends AbstractC2985a {
    public static final Parcelable.Creator<C0649h> CREATOR = new C0659s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f3289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3292i;

    /* JADX INFO: renamed from: J4.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3293a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3294b = 5;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3295c = "";

        public a a(InterfaceC0647f interfaceC0647f) {
            com.google.android.gms.common.internal.r.n(interfaceC0647f, "geofence can't be null.");
            com.google.android.gms.common.internal.r.b(interfaceC0647f instanceof zzbe, "Geofence must be created using Geofence.Builder.");
            this.f3293a.add((zzbe) interfaceC0647f);
            return this;
        }

        public a b(List list) {
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC0647f interfaceC0647f = (InterfaceC0647f) it.next();
                    if (interfaceC0647f != null) {
                        a(interfaceC0647f);
                    }
                }
            }
            return this;
        }

        public C0649h c() {
            com.google.android.gms.common.internal.r.b(!this.f3293a.isEmpty(), "No geofence has been added to this request.");
            return new C0649h(this.f3293a, this.f3294b, this.f3295c, null);
        }

        public a d(int i9) {
            this.f3294b = i9 & 7;
            return this;
        }
    }

    public C0649h(List list, int i9, String str, String str2) {
        this.f3289f = list;
        this.f3290g = i9;
        this.f3291h = str;
        this.f3292i = str2;
    }

    public int H() {
        return this.f3290g;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f3289f + ", initialTrigger=" + this.f3290g + ", tag=" + this.f3291h + ", attributionTag=" + this.f3292i + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.x(parcel, 1, this.f3289f, false);
        y4.c.l(parcel, 2, H());
        y4.c.t(parcel, 3, this.f3291h, false);
        y4.c.t(parcel, 4, this.f3292i, false);
        y4.c.b(parcel, iA);
    }
}
