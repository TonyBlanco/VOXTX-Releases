package n4;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.common.api.internal.C1381p;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.common.internal.AbstractC1403b;
import com.google.android.gms.internal.cast.zzdy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import n4.AbstractC2268e;
import t4.AbstractC2774a;
import t4.AbstractC2786m;
import t4.C2775b;
import t4.C2776c;
import t4.C2778e;
import t4.C2782i;
import t4.InterfaceC2784k;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends com.google.android.gms.common.api.e implements D0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a.AbstractC0252a f45321A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f45322B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C2775b f45323z = new C2775b("CastClient");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X f45324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f45325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TaskCompletionSource f45328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TaskCompletionSource f45329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicLong f45330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f45331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f45332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2266d f45333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f45334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f45335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2259A f45339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CastDevice f45340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Map f45341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map f45342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC2268e.d f45343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f45344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f45345y;

    static {
        O o9 = new O();
        f45321A = o9;
        f45322B = new com.google.android.gms.common.api.a("Cast.API_CXLESS", o9, AbstractC2786m.f50722b);
    }

    public Y(Context context, AbstractC2268e.c cVar) {
        super(context, f45322B, cVar, e.a.f26452c);
        this.f45324d = new X(this);
        this.f45331k = new Object();
        this.f45332l = new Object();
        this.f45344x = Collections.synchronizedList(new ArrayList());
        com.google.android.gms.common.internal.r.n(context, "context cannot be null");
        com.google.android.gms.common.internal.r.n(cVar, "CastOptions cannot be null");
        this.f45343w = cVar.f45384c;
        this.f45340t = cVar.f45383b;
        this.f45341u = new HashMap();
        this.f45342v = new HashMap();
        this.f45330j = new AtomicLong(0L);
        this.f45345y = 1;
        C();
    }

    public static /* bridge */ /* synthetic */ Handler D(Y y9) {
        if (y9.f45325e == null) {
            y9.f45325e = new zzdy(y9.getLooper());
        }
        return y9.f45325e;
    }

    public static /* bridge */ /* synthetic */ void N(Y y9) {
        y9.f45337q = -1;
        y9.f45338r = -1;
        y9.f45333m = null;
        y9.f45334n = null;
        y9.f45335o = 0.0d;
        y9.C();
        y9.f45336p = false;
        y9.f45339s = null;
    }

    public static /* bridge */ /* synthetic */ void O(Y y9, C2776c c2776c) {
        boolean z9;
        String strZza = c2776c.zza();
        if (AbstractC2774a.k(strZza, y9.f45334n)) {
            z9 = false;
        } else {
            y9.f45334n = strZza;
            z9 = true;
        }
        f45323z.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z9), Boolean.valueOf(y9.f45327g));
        AbstractC2268e.d dVar = y9.f45343w;
        if (dVar != null && (z9 || y9.f45327g)) {
            dVar.onApplicationStatusChanged();
        }
        y9.f45327g = false;
    }

    public static /* bridge */ /* synthetic */ void h(Y y9, C2778e c2778e) {
        boolean z9;
        boolean z10;
        boolean z11;
        C2266d c2266dL = c2778e.L();
        if (!AbstractC2774a.k(c2266dL, y9.f45333m)) {
            y9.f45333m = c2266dL;
            y9.f45343w.onApplicationMetadataChanged(c2266dL);
        }
        double dI = c2778e.I();
        if (Double.isNaN(dI) || Math.abs(dI - y9.f45335o) <= 1.0E-7d) {
            z9 = false;
        } else {
            y9.f45335o = dI;
            z9 = true;
        }
        boolean zZzg = c2778e.zzg();
        if (zZzg != y9.f45336p) {
            y9.f45336p = zZzg;
            z9 = true;
        }
        C2775b c2775b = f45323z;
        c2775b.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z9), Boolean.valueOf(y9.f45326f));
        AbstractC2268e.d dVar = y9.f45343w;
        if (dVar != null && (z9 || y9.f45326f)) {
            dVar.onVolumeChanged();
        }
        Double.isNaN(c2778e.H());
        int iJ = c2778e.J();
        if (iJ != y9.f45337q) {
            y9.f45337q = iJ;
            z10 = true;
        } else {
            z10 = false;
        }
        c2775b.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(y9.f45326f));
        AbstractC2268e.d dVar2 = y9.f45343w;
        if (dVar2 != null && (z10 || y9.f45326f)) {
            dVar2.onActiveInputStateChanged(y9.f45337q);
        }
        int iK = c2778e.K();
        if (iK != y9.f45338r) {
            y9.f45338r = iK;
            z11 = true;
        } else {
            z11 = false;
        }
        c2775b.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(y9.f45326f));
        AbstractC2268e.d dVar3 = y9.f45343w;
        if (dVar3 != null && (z11 || y9.f45326f)) {
            dVar3.onStandbyStateChanged(y9.f45338r);
        }
        if (!AbstractC2774a.k(y9.f45339s, c2778e.M())) {
            y9.f45339s = c2778e.M();
        }
        y9.f45326f = false;
    }

    public static /* bridge */ /* synthetic */ void k(Y y9, AbstractC2268e.a aVar) {
        synchronized (y9.f45331k) {
            try {
                TaskCompletionSource taskCompletionSource = y9.f45328h;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(aVar);
                }
                y9.f45328h = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void l(Y y9, long j9, int i9) {
        TaskCompletionSource taskCompletionSource;
        synchronized (y9.f45341u) {
            Map map = y9.f45341u;
            Long lValueOf = Long.valueOf(j9);
            taskCompletionSource = (TaskCompletionSource) map.get(lValueOf);
            y9.f45341u.remove(lValueOf);
        }
        if (taskCompletionSource != null) {
            if (i9 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(v(i9));
            }
        }
    }

    public static /* bridge */ /* synthetic */ void m(Y y9, int i9) {
        synchronized (y9.f45332l) {
            try {
                TaskCompletionSource taskCompletionSource = y9.f45329i;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i9 == 0) {
                    taskCompletionSource.setResult(new Status(0));
                } else {
                    taskCompletionSource.setException(v(i9));
                }
                y9.f45329i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static com.google.android.gms.common.api.b v(int i9) {
        return AbstractC1403b.a(new Status(i9));
    }

    public final void A(int i9) {
        synchronized (this.f45331k) {
            try {
                TaskCompletionSource taskCompletionSource = this.f45328h;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(v(i9));
                }
                this.f45328h = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B() {
        com.google.android.gms.common.internal.r.q(this.f45345y != 1, "Not active connection");
    }

    public final double C() {
        if (this.f45340t.O(2048)) {
            return 0.02d;
        }
        return (!this.f45340t.O(4) || this.f45340t.O(1) || "Chromecast Audio".equals(this.f45340t.M())) ? 0.05d : 0.02d;
    }

    @Override // n4.D0
    public final void b(C0 c02) {
        com.google.android.gms.common.internal.r.m(c02);
        this.f45344x.add(c02);
    }

    @Override // n4.D0
    public final Task c(final String str, final String str2) {
        AbstractC2774a.f(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() <= 524288) {
            final String str3 = null;
            return doWrite(AbstractC1388t.a().b(new InterfaceC1383q(str3, str, str2) { // from class: n4.G

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f45282b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f45283c;

                {
                    this.f45282b = str;
                    this.f45283c = str2;
                }

                @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
                public final void accept(Object obj, Object obj2) {
                    this.f45281a.q(null, this.f45282b, this.f45283c, (t4.S) obj, (TaskCompletionSource) obj2);
                }
            }).e(8405).a());
        }
        f45323z.f("Message send failed. Message exceeds maximum size", new Object[0]);
        throw new IllegalArgumentException("Message exceeds maximum size524288");
    }

    @Override // n4.D0
    public final Task d(final String str, final AbstractC2268e.InterfaceC0394e interfaceC0394e) {
        AbstractC2774a.f(str);
        if (interfaceC0394e != null) {
            synchronized (this.f45342v) {
                this.f45342v.put(str, interfaceC0394e);
            }
        }
        return doWrite(AbstractC1388t.a().b(new InterfaceC1383q() { // from class: n4.N
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) {
                this.f45302a.r(str, interfaceC0394e, (t4.S) obj, (TaskCompletionSource) obj2);
            }
        }).e(8413).a());
    }

    @Override // n4.D0
    public final Task e(final String str) {
        final AbstractC2268e.InterfaceC0394e interfaceC0394e;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.f45342v) {
            interfaceC0394e = (AbstractC2268e.InterfaceC0394e) this.f45342v.remove(str);
        }
        return doWrite(AbstractC1388t.a().b(new InterfaceC1383q() { // from class: n4.M
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) {
                this.f45299a.p(interfaceC0394e, str, (t4.S) obj, (TaskCompletionSource) obj2);
            }
        }).e(8414).a());
    }

    public final /* synthetic */ void n(String str, String str2, Z z9, t4.S s9, TaskCompletionSource taskCompletionSource) {
        x();
        ((C2782i) s9.getService()).A(str, str2, null);
        z(taskCompletionSource);
    }

    public final /* synthetic */ void o(String str, C2276i c2276i, t4.S s9, TaskCompletionSource taskCompletionSource) {
        x();
        ((C2782i) s9.getService()).E(str, c2276i);
        z(taskCompletionSource);
    }

    public final /* synthetic */ void p(AbstractC2268e.InterfaceC0394e interfaceC0394e, String str, t4.S s9, TaskCompletionSource taskCompletionSource) {
        B();
        if (interfaceC0394e != null) {
            ((C2782i) s9.getService()).g1(str);
        }
        taskCompletionSource.setResult(null);
    }

    public final /* synthetic */ void q(String str, String str2, String str3, t4.S s9, TaskCompletionSource taskCompletionSource) {
        long jIncrementAndGet = this.f45330j.incrementAndGet();
        x();
        try {
            this.f45341u.put(Long.valueOf(jIncrementAndGet), taskCompletionSource);
            ((C2782i) s9.getService()).c1(str2, str3, jIncrementAndGet);
        } catch (RemoteException e9) {
            this.f45341u.remove(Long.valueOf(jIncrementAndGet));
            taskCompletionSource.setException(e9);
        }
    }

    public final /* synthetic */ void r(String str, AbstractC2268e.InterfaceC0394e interfaceC0394e, t4.S s9, TaskCompletionSource taskCompletionSource) {
        B();
        ((C2782i) s9.getService()).g1(str);
        if (interfaceC0394e != null) {
            ((C2782i) s9.getService()).c0(str);
        }
        taskCompletionSource.setResult(null);
    }

    public final /* synthetic */ void s(boolean z9, t4.S s9, TaskCompletionSource taskCompletionSource) {
        ((C2782i) s9.getService()).d1(z9, this.f45335o, this.f45336p);
        taskCompletionSource.setResult(null);
    }

    public final /* synthetic */ void t(String str, t4.S s9, TaskCompletionSource taskCompletionSource) {
        x();
        ((C2782i) s9.getService()).e1(str);
        synchronized (this.f45332l) {
            try {
                if (this.f45329i != null) {
                    taskCompletionSource.setException(v(AdError.INTERNAL_ERROR_CODE));
                } else {
                    this.f45329i = taskCompletionSource;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task w(InterfaceC2784k interfaceC2784k) {
        return doUnregisterEventListener((C1371k.a) com.google.android.gms.common.internal.r.n(registerListener(interfaceC2784k, "castDeviceControllerListenerKey").b(), "Key must not be null"), 8415);
    }

    public final void x() {
        com.google.android.gms.common.internal.r.q(zzl(), "Not connected to device");
    }

    public final void y() {
        f45323z.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f45342v) {
            this.f45342v.clear();
        }
    }

    public final void z(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f45331k) {
            try {
                if (this.f45328h != null) {
                    A(2477);
                }
                this.f45328h = taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n4.D0
    public final Task zze() {
        C1371k c1371kRegisterListener = registerListener(this.f45324d, "castDeviceControllerListenerKey");
        C1381p.a aVarA = C1381p.a();
        return doRegisterEventListener(aVarA.f(c1371kRegisterListener).b(new InterfaceC1383q() { // from class: n4.D
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                t4.S s9 = (t4.S) obj;
                ((C2782i) s9.getService()).Z(this.f45277a.f45324d);
                ((C2782i) s9.getService()).zze();
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).e(new InterfaceC1383q() { // from class: n4.J
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                C2775b c2775b = Y.f45323z;
                ((C2782i) ((t4.S) obj).getService()).f1();
                ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
            }
        }).c(C.f45264b).d(8428).a());
    }

    @Override // n4.D0
    public final Task zzf() {
        Task taskDoWrite = doWrite(AbstractC1388t.a().b(new InterfaceC1383q() { // from class: n4.K
            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                C2775b c2775b = Y.f45323z;
                ((C2782i) ((t4.S) obj).getService()).zzf();
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).e(8403).a());
        y();
        w(this.f45324d);
        return taskDoWrite;
    }

    @Override // n4.D0
    public final boolean zzl() {
        return this.f45345y == 2;
    }

    @Override // n4.D0
    public final boolean zzm() {
        x();
        return this.f45336p;
    }
}
