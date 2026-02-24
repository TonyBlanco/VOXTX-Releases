package o4;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.internal.cast.zzaf;
import com.google.android.gms.internal.cast.zzbf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n4.AbstractC2268e;
import n4.C2266d;
import n4.D0;
import p4.C2426a;
import p4.C2433h;
import p4.C2434i;
import t4.C2775b;
import t4.C2791s;

/* JADX INFO: renamed from: o4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2328e extends AbstractC2345w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2775b f45868o = new C2775b("CastSession");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f45869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f45870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2322E f45871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2326c f45872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzbf f45873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q4.w f45874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public D0 f45875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2434i f45876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CastDevice f45877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC2268e.a f45878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g0 f45879n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2328e(Context context, String str, String str2, C2326c c2326c, zzbf zzbfVar, q4.w wVar) {
        super(context, str, str2);
        g0 g0Var = new Object() { // from class: o4.g0
        };
        this.f45870e = new HashSet();
        this.f45869d = context.getApplicationContext();
        this.f45872g = c2326c;
        this.f45873h = zzbfVar;
        this.f45874i = wVar;
        this.f45879n = g0Var;
        this.f45871f = zzaf.zzb(context, c2326c, o(), new k0(this, null));
    }

    public static /* bridge */ /* synthetic */ void A(C2328e c2328e, int i9) {
        c2328e.f45874i.i(i9);
        D0 d02 = c2328e.f45875j;
        if (d02 != null) {
            d02.zzf();
            c2328e.f45875j = null;
        }
        c2328e.f45877l = null;
        C2434i c2434i = c2328e.f45876k;
        if (c2434i != null) {
            c2434i.n0(null);
            c2328e.f45876k = null;
        }
        c2328e.f45878m = null;
    }

    public static /* bridge */ /* synthetic */ void B(C2328e c2328e, String str, Task task) {
        if (c2328e.f45871f == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                AbstractC2268e.a aVar = (AbstractC2268e.a) task.getResult();
                c2328e.f45878m = aVar;
                if (aVar.getStatus() != null && aVar.getStatus().L()) {
                    f45868o.a("%s() -> success result", str);
                    C2434i c2434i = new C2434i(new C2791s(null));
                    c2328e.f45876k = c2434i;
                    c2434i.n0(c2328e.f45875j);
                    c2328e.f45876k.l0();
                    c2328e.f45874i.h(c2328e.f45876k, c2328e.q());
                    c2328e.f45871f.M((C2266d) com.google.android.gms.common.internal.r.m(aVar.A()), aVar.f(), (String) com.google.android.gms.common.internal.r.m(aVar.getSessionId()), aVar.d());
                    return;
                }
                if (aVar.getStatus() != null) {
                    f45868o.a("%s() -> failure result", str);
                    c2328e.f45871f.zzg(aVar.getStatus().I());
                    return;
                }
            } else {
                Exception exception = task.getException();
                if (exception instanceof com.google.android.gms.common.api.b) {
                    c2328e.f45871f.zzg(((com.google.android.gms.common.api.b) exception).getStatusCode());
                    return;
                }
            }
            c2328e.f45871f.zzg(2476);
        } catch (RemoteException e9) {
            f45868o.b(e9, "Unable to call %s on %s.", "methods", InterfaceC2322E.class.getSimpleName());
        }
    }

    public final boolean C() {
        return this.f45873h.zzs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(Bundle bundle) {
        CastDevice castDeviceK = CastDevice.K(bundle);
        this.f45877l = castDeviceK;
        if (castDeviceK == null) {
            if (e()) {
                f(2153);
                return;
            } else {
                g(2151);
                return;
            }
        }
        D0 d02 = this.f45875j;
        l0 l0Var = null;
        Object[] objArr = 0;
        if (d02 != null) {
            d02.zzf();
            this.f45875j = null;
        }
        f45868o.a("Acquiring a connection to Google Play Services for %s", this.f45877l);
        CastDevice castDevice = (CastDevice) com.google.android.gms.common.internal.r.m(this.f45877l);
        Bundle bundle2 = new Bundle();
        C2326c c2326c = this.f45872g;
        C2426a c2426aH = c2326c == null ? null : c2326c.H();
        C2433h c2433hL = c2426aH == null ? null : c2426aH.L();
        boolean z9 = c2426aH != null && c2426aH.M();
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", c2433hL != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z9);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.f45873h.zzs());
        AbstractC2268e.c.a aVar = new AbstractC2268e.c.a(castDevice, new m0(this, l0Var));
        aVar.d(bundle2);
        D0 d0A = AbstractC2268e.a(this.f45869d, aVar.a());
        d0A.b(new o0(this, objArr == true ? 1 : 0));
        this.f45875j = d0A;
        d0A.zze();
    }

    @Override // o4.AbstractC2345w
    public void a(boolean z9) {
        InterfaceC2322E interfaceC2322E = this.f45871f;
        if (interfaceC2322E != null) {
            try {
                interfaceC2322E.W(z9, 0);
            } catch (RemoteException e9) {
                f45868o.b(e9, "Unable to call %s on %s.", "disconnectFromDevice", InterfaceC2322E.class.getSimpleName());
            }
            h(0);
        }
    }

    @Override // o4.AbstractC2345w
    public long b() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        C2434i c2434i = this.f45876k;
        if (c2434i == null) {
            return 0L;
        }
        return c2434i.p() - this.f45876k.g();
    }

    @Override // o4.AbstractC2345w
    public void i(Bundle bundle) {
        this.f45877l = CastDevice.K(bundle);
    }

    @Override // o4.AbstractC2345w
    public void j(Bundle bundle) {
        this.f45877l = CastDevice.K(bundle);
    }

    @Override // o4.AbstractC2345w
    public void k(Bundle bundle) {
        D(bundle);
    }

    @Override // o4.AbstractC2345w
    public void l(Bundle bundle) {
        D(bundle);
    }

    @Override // o4.AbstractC2345w
    public final void m(Bundle bundle) {
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice castDeviceK = CastDevice.K(bundle);
        if (castDeviceK == null || castDeviceK.equals(this.f45877l)) {
            return;
        }
        boolean z9 = !TextUtils.isEmpty(castDeviceK.J()) && ((castDevice2 = this.f45877l) == null || !TextUtils.equals(castDevice2.J(), castDeviceK.J()));
        this.f45877l = castDeviceK;
        f45868o.a("update to device (%s) with name %s", castDeviceK, true != z9 ? "unchanged" : "changed");
        if (!z9 || (castDevice = this.f45877l) == null) {
            return;
        }
        q4.w wVar = this.f45874i;
        if (wVar != null) {
            wVar.k(castDevice);
        }
        Iterator it = new HashSet(this.f45870e).iterator();
        while (it.hasNext()) {
            ((AbstractC2268e.d) it.next()).onDeviceNameChanged();
        }
    }

    public void p(AbstractC2268e.d dVar) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (dVar != null) {
            this.f45870e.add(dVar);
        }
    }

    public CastDevice q() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return this.f45877l;
    }

    public C2434i r() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return this.f45876k;
    }

    public boolean s() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        D0 d02 = this.f45875j;
        return d02 != null && d02.zzl() && d02.zzm();
    }

    public void t(AbstractC2268e.d dVar) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (dVar != null) {
            this.f45870e.remove(dVar);
        }
    }

    public void u(final boolean z9) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        D0 d02 = this.f45875j;
        if (d02 == null || !d02.zzl()) {
            return;
        }
        final n4.Y y9 = (n4.Y) d02;
        y9.doWrite(AbstractC1388t.a().b(new InterfaceC1383q() { // from class: n4.H
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) {
                y9.s(z9, (t4.S) obj, (TaskCompletionSource) obj2);
            }
        }).e(8412).a());
    }
}
