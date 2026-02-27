package o4;

import android.content.Context;
import android.os.RemoteException;
import t4.C2775b;

/* JADX INFO: renamed from: o4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2346x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2775b f46077c = new C2775b("SessionManager");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f46078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46079b;

    public C2346x(O o9, Context context) {
        this.f46078a = o9;
        this.f46079b = context;
    }

    public void a(InterfaceC2347y interfaceC2347y, Class cls) {
        if (interfaceC2347y == null) {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
        com.google.android.gms.common.internal.r.m(cls);
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        try {
            this.f46078a.K0(new Z(interfaceC2347y, cls));
        } catch (RemoteException e9) {
            f46077c.b(e9, "Unable to call %s on %s.", "addSessionManagerListener", O.class.getSimpleName());
        }
    }

    public void b(boolean z9) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        try {
            f46077c.e("End session for %s", this.f46079b.getPackageName());
            this.f46078a.e0(true, z9);
        } catch (RemoteException e9) {
            f46077c.b(e9, "Unable to call %s on %s.", "endCurrentSession", O.class.getSimpleName());
        }
    }

    public C2328e c() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        AbstractC2345w abstractC2345wD = d();
        if (abstractC2345wD == null || !(abstractC2345wD instanceof C2328e)) {
            return null;
        }
        return (C2328e) abstractC2345wD;
    }

    public AbstractC2345w d() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        try {
            return (AbstractC2345w) F4.b.E(this.f46078a.zzf());
        } catch (RemoteException e9) {
            f46077c.b(e9, "Unable to call %s on %s.", "getWrappedCurrentSession", O.class.getSimpleName());
            return null;
        }
    }

    public void e(InterfaceC2347y interfaceC2347y, Class cls) {
        com.google.android.gms.common.internal.r.m(cls);
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (interfaceC2347y == null) {
            return;
        }
        try {
            this.f46078a.d0(new Z(interfaceC2347y, cls));
        } catch (RemoteException e9) {
            f46077c.b(e9, "Unable to call %s on %s.", "removeSessionManagerListener", O.class.getSimpleName());
        }
    }

    public final F4.a f() {
        try {
            return this.f46078a.zzg();
        } catch (RemoteException e9) {
            f46077c.b(e9, "Unable to call %s on %s.", "getWrappedThis", O.class.getSimpleName());
            return null;
        }
    }
}
