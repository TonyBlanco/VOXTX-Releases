package o4;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zzaf;
import t4.C2775b;

/* JADX INFO: renamed from: o4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2345w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2775b f46074c = new C2775b("Session");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f46075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f46076b;

    public AbstractC2345w(Context context, String str, String str2) {
        Y y9 = new Y(this, null);
        this.f46076b = y9;
        this.f46075a = zzaf.zzd(context, str, str2, y9);
    }

    public abstract void a(boolean z9);

    public abstract long b();

    public boolean c() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        M m9 = this.f46075a;
        if (m9 != null) {
            try {
                return m9.zzp();
            } catch (RemoteException e9) {
                f46074c.b(e9, "Unable to call %s on %s.", "isConnected", M.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean d() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        M m9 = this.f46075a;
        if (m9 != null) {
            try {
                return m9.zzq();
            } catch (RemoteException e9) {
                f46074c.b(e9, "Unable to call %s on %s.", "isConnecting", M.class.getSimpleName());
            }
        }
        return false;
    }

    public boolean e() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        M m9 = this.f46075a;
        if (m9 != null) {
            try {
                return m9.zzt();
            } catch (RemoteException e9) {
                f46074c.b(e9, "Unable to call %s on %s.", "isResuming", M.class.getSimpleName());
            }
        }
        return false;
    }

    public final void f(int i9) {
        M m9 = this.f46075a;
        if (m9 != null) {
            try {
                m9.zzj(i9);
            } catch (RemoteException e9) {
                f46074c.b(e9, "Unable to call %s on %s.", "notifyFailedToResumeSession", M.class.getSimpleName());
            }
        }
    }

    public final void g(int i9) {
        M m9 = this.f46075a;
        if (m9 != null) {
            try {
                m9.e(i9);
            } catch (RemoteException e9) {
                f46074c.b(e9, "Unable to call %s on %s.", "notifyFailedToStartSession", M.class.getSimpleName());
            }
        }
    }

    public final void h(int i9) {
        M m9 = this.f46075a;
        if (m9 != null) {
            try {
                m9.x0(i9);
            } catch (RemoteException e9) {
                f46074c.b(e9, "Unable to call %s on %s.", "notifySessionEnded", M.class.getSimpleName());
            }
        }
    }

    public abstract void i(Bundle bundle);

    public abstract void j(Bundle bundle);

    public abstract void k(Bundle bundle);

    public abstract void l(Bundle bundle);

    public abstract void m(Bundle bundle);

    public final int n() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        M m9 = this.f46075a;
        if (m9 != null) {
            try {
                if (m9.zze() >= 211100000) {
                    return this.f46075a.zzf();
                }
            } catch (RemoteException e9) {
                f46074c.b(e9, "Unable to call %s on %s.", "getSessionStartType", M.class.getSimpleName());
            }
        }
        return 0;
    }

    public final F4.a o() {
        M m9 = this.f46075a;
        if (m9 != null) {
            try {
                return m9.zzg();
            } catch (RemoteException e9) {
                f46074c.b(e9, "Unable to call %s on %s.", "getWrappedObject", M.class.getSimpleName());
            }
        }
        return null;
    }
}
