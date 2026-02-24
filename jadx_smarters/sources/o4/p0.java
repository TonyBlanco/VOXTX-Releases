package o4;

import android.os.RemoteException;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2775b f45925b = new C2775b("DiscoveryManager");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f45926a;

    public p0(G g9) {
        this.f45926a = g9;
    }

    public final F4.a a() {
        try {
            return this.f45926a.zze();
        } catch (RemoteException e9) {
            f45925b.b(e9, "Unable to call %s on %s.", "getWrappedThis", G.class.getSimpleName());
            return null;
        }
    }
}
