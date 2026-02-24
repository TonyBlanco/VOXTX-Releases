package p4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import d.AbstractC1617D;
import p4.C2433h;
import t4.C2775b;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: p4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2426a extends AbstractC2985a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f46428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V f46429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2433h f46430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f46431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f46432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2775b f46426l = new C2775b("CastMediaOptions");
    public static final Parcelable.Creator<C2426a> CREATOR = new C2436k();

    /* JADX INFO: renamed from: p4.a$a, reason: collision with other inner class name */
    public static final class C0411a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f46434b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46433a = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C2433h f46435c = new C2433h.a().a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f46436d = true;

        public C2426a a() {
            return new C2426a(this.f46433a, this.f46434b, null, this.f46435c, false, this.f46436d);
        }

        public C0411a b(String str) {
            this.f46434b = str;
            return this;
        }

        public C0411a c(C2433h c2433h) {
            this.f46435c = c2433h;
            return this;
        }
    }

    public C2426a(String str, String str2, IBinder iBinder, C2433h c2433h, boolean z9, boolean z10) {
        V c2414b;
        this.f46427f = str;
        this.f46428g = str2;
        if (iBinder == null) {
            c2414b = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            c2414b = iInterfaceQueryLocalInterface instanceof V ? (V) iInterfaceQueryLocalInterface : new C2414B(iBinder);
        }
        this.f46429h = c2414b;
        this.f46430i = c2433h;
        this.f46431j = z9;
        this.f46432k = z10;
    }

    public String H() {
        return this.f46428g;
    }

    public AbstractC2428c I() {
        V v9 = this.f46429h;
        if (v9 != null) {
            try {
                AbstractC1617D.a(F4.b.E(v9.zzg()));
                return null;
            } catch (RemoteException e9) {
                f46426l.b(e9, "Unable to call %s on %s.", "getWrappedClientObject", V.class.getSimpleName());
            }
        }
        return null;
    }

    public String J() {
        return this.f46427f;
    }

    public boolean K() {
        return this.f46432k;
    }

    public C2433h L() {
        return this.f46430i;
    }

    public final boolean M() {
        return this.f46431j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, J(), false);
        y4.c.t(parcel, 3, H(), false);
        V v9 = this.f46429h;
        y4.c.k(parcel, 4, v9 == null ? null : v9.asBinder(), false);
        y4.c.r(parcel, 5, L(), i9, false);
        y4.c.c(parcel, 6, this.f46431j);
        y4.c.c(parcel, 7, K());
        y4.c.b(parcel, iA);
    }
}
