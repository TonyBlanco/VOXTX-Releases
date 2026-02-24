package t4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1359e;
import com.google.android.gms.common.internal.AbstractC1409h;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.C1406e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import n4.AbstractC2268e;
import n4.C2259A;
import n4.C2266d;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class Q extends AbstractC1409h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2266d f50676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CastDevice f50677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2268e.d f50678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f50679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f50680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f50681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public P f50682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f50683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f50684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f50685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f50686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f50687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f50688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2259A f50689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f50690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f50691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicLong f50692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f50693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f50694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bundle f50695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f50696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC1359e f50697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InterfaceC1359e f50698y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C2775b f50675z = new C2775b("CastClientImpl");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Object f50673A = new Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Object f50674B = new Object();

    public Q(Context context, Looper looper, C1406e c1406e, CastDevice castDevice, long j9, AbstractC2268e.d dVar, Bundle bundle, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 10, c1406e, bVar, cVar);
        this.f50677d = castDevice;
        this.f50678e = dVar;
        this.f50680g = j9;
        this.f50681h = bundle;
        this.f50679f = new HashMap();
        this.f50692s = new AtomicLong(0L);
        this.f50696w = new HashMap();
        s();
        w();
    }

    public static /* bridge */ /* synthetic */ void n(Q q9, C2776c c2776c) {
        boolean z9;
        String strZza = c2776c.zza();
        if (AbstractC2774a.k(strZza, q9.f50683j)) {
            z9 = false;
        } else {
            q9.f50683j = strZza;
            z9 = true;
        }
        f50675z.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z9), Boolean.valueOf(q9.f50685l));
        AbstractC2268e.d dVar = q9.f50678e;
        if (dVar != null && (z9 || q9.f50685l)) {
            dVar.onApplicationStatusChanged();
        }
        q9.f50685l = false;
    }

    public static /* bridge */ /* synthetic */ void o(Q q9, C2778e c2778e) {
        boolean z9;
        boolean z10;
        boolean z11;
        C2266d c2266dL = c2778e.L();
        if (!AbstractC2774a.k(c2266dL, q9.f50676c)) {
            q9.f50676c = c2266dL;
            q9.f50678e.onApplicationMetadataChanged(c2266dL);
        }
        double dI = c2778e.I();
        if (Double.isNaN(dI) || Math.abs(dI - q9.f50688o) <= 1.0E-7d) {
            z9 = false;
        } else {
            q9.f50688o = dI;
            z9 = true;
        }
        boolean zZzg = c2778e.zzg();
        if (zZzg != q9.f50684k) {
            q9.f50684k = zZzg;
            z9 = true;
        }
        Double.isNaN(c2778e.H());
        C2775b c2775b = f50675z;
        c2775b.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z9), Boolean.valueOf(q9.f50686m));
        AbstractC2268e.d dVar = q9.f50678e;
        if (dVar != null && (z9 || q9.f50686m)) {
            dVar.onVolumeChanged();
        }
        int iJ = c2778e.J();
        if (iJ != q9.f50690q) {
            q9.f50690q = iJ;
            z10 = true;
        } else {
            z10 = false;
        }
        c2775b.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(q9.f50686m));
        AbstractC2268e.d dVar2 = q9.f50678e;
        if (dVar2 != null && (z10 || q9.f50686m)) {
            dVar2.onActiveInputStateChanged(q9.f50690q);
        }
        int iK = c2778e.K();
        if (iK != q9.f50691r) {
            q9.f50691r = iK;
            z11 = true;
        } else {
            z11 = false;
        }
        c2775b.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(q9.f50686m));
        AbstractC2268e.d dVar3 = q9.f50678e;
        if (dVar3 != null && (z11 || q9.f50686m)) {
            dVar3.onStandbyStateChanged(q9.f50691r);
        }
        if (!AbstractC2774a.k(q9.f50689p, c2778e.M())) {
            q9.f50689p = c2778e.M();
        }
        q9.f50686m = false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof C2782i ? (C2782i) iInterfaceQueryLocalInterface : new C2782i(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        C2775b c2775b = f50675z;
        c2775b.a("disconnect(); ServiceListener=%s, isConnected=%b", this.f50682i, Boolean.valueOf(isConnected()));
        P p9 = this.f50682i;
        this.f50682i = null;
        if (p9 == null || p9.A() == null) {
            c2775b.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        t();
        try {
            try {
                ((C2782i) getService()).zzf();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e9) {
            f50675z.b(e9, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final Bundle getConnectionHint() {
        Bundle bundle = this.f50695v;
        if (bundle == null) {
            return super.getConnectionHint();
        }
        this.f50695v = null;
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f50675z.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f50693t, this.f50694u);
        this.f50677d.P(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f50680g);
        Bundle bundle2 = this.f50681h;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.f50682i = new P(this);
        bundle.putParcelable("listener", new BinderWrapper(this.f50682i));
        String str = this.f50693t;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f50694u;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final void onConnectionFailed(C2914b c2914b) {
        super.onConnectionFailed(c2914b);
        t();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final void onPostInitHandler(int i9, IBinder iBinder, Bundle bundle, int i10) {
        f50675z.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i9));
        if (i9 == 0 || i9 == 2300) {
            this.f50687n = true;
            this.f50685l = true;
            this.f50686m = true;
        } else {
            this.f50687n = false;
        }
        if (i9 == 2300) {
            Bundle bundle2 = new Bundle();
            this.f50695v = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i9 = 0;
        }
        super.onPostInitHandler(i9, iBinder, bundle, i10);
    }

    public final void r(int i9) {
        synchronized (f50673A) {
            try {
                InterfaceC1359e interfaceC1359e = this.f50697x;
                if (interfaceC1359e != null) {
                    interfaceC1359e.setResult(new K(new Status(i9), null, null, null, false));
                    this.f50697x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        this.f50687n = false;
        this.f50690q = -1;
        this.f50691r = -1;
        this.f50676c = null;
        this.f50683j = null;
        this.f50688o = 0.0d;
        w();
        this.f50684k = false;
        this.f50689p = null;
    }

    public final void t() {
        f50675z.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f50679f) {
            this.f50679f.clear();
        }
    }

    public final void u(long j9, int i9) {
        InterfaceC1359e interfaceC1359e;
        synchronized (this.f50696w) {
            interfaceC1359e = (InterfaceC1359e) this.f50696w.remove(Long.valueOf(j9));
        }
        if (interfaceC1359e != null) {
            interfaceC1359e.setResult(new Status(i9));
        }
    }

    public final void v(int i9) {
        synchronized (f50674B) {
            try {
                InterfaceC1359e interfaceC1359e = this.f50698y;
                if (interfaceC1359e != null) {
                    interfaceC1359e.setResult(new Status(i9));
                    this.f50698y = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final double w() {
        com.google.android.gms.common.internal.r.n(this.f50677d, "device should not be null");
        if (this.f50677d.O(2048)) {
            return 0.02d;
        }
        return (!this.f50677d.O(4) || this.f50677d.O(1) || "Chromecast Audio".equals(this.f50677d.M())) ? 0.05d : 0.02d;
    }
}
