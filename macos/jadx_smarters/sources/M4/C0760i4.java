package M4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: M4.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0760i4 extends G1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ServiceConnectionC0754h4 f4742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0799p1 f4743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f4744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0791o f4745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A4 f4746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f4747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC0791o f4748i;

    public C0760i4(C0776l2 c0776l2) {
        super(c0776l2);
        this.f4747h = new ArrayList();
        this.f4746g = new A4(c0776l2.a());
        this.f4742c = new ServiceConnectionC0754h4(this);
        this.f4745f = new S3(this, c0776l2);
        this.f4748i = new U3(this, c0776l2);
    }

    public static /* bridge */ /* synthetic */ void M(C0760i4 c0760i4, ComponentName componentName) {
        c0760i4.h();
        if (c0760i4.f4743d != null) {
            c0760i4.f4743d = null;
            c0760i4.f4245a.d().v().b("Disconnected from device MeasurementService", componentName);
            c0760i4.h();
            c0760i4.P();
        }
    }

    public final boolean A() {
        h();
        i();
        return !B() || this.f4245a.N().q0() >= ((Integer) AbstractC0781m1.f4903j0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B() {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0760i4.B():boolean");
    }

    public final f5 C(boolean z9) {
        Pair pairA;
        this.f4245a.b();
        C0805q1 c0805q1B = this.f4245a.B();
        String str = null;
        if (z9) {
            C0858z1 c0858z1D = this.f4245a.d();
            if (c0858z1D.f4245a.F().f4403d != null && (pairA = c0858z1D.f4245a.F().f4403d.a()) != null && pairA != P1.f4401y) {
                str = String.valueOf(pairA.second) + ":" + ((String) pairA.first);
            }
        }
        return c0805q1B.q(str);
    }

    public final void D() {
        h();
        this.f4245a.d().v().b("Processing queued up service tasks", Integer.valueOf(this.f4747h.size()));
        Iterator it = this.f4747h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e9) {
                this.f4245a.d().r().b("Task exception while flushing queue", e9);
            }
        }
        this.f4747h.clear();
        this.f4748i.b();
    }

    public final void E() {
        h();
        this.f4746g.b();
        AbstractC0791o abstractC0791o = this.f4745f;
        this.f4245a.z();
        abstractC0791o.d(((Long) AbstractC0781m1.f4869L.a(null)).longValue());
    }

    public final void F(Runnable runnable) {
        h();
        if (z()) {
            runnable.run();
            return;
        }
        long size = this.f4747h.size();
        this.f4245a.z();
        if (size >= 1000) {
            this.f4245a.d().r().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f4747h.add(runnable);
        this.f4748i.d(60000L);
        P();
    }

    public final boolean G() {
        this.f4245a.b();
        return true;
    }

    public final Boolean J() {
        return this.f4744e;
    }

    public final void O() {
        h();
        i();
        f5 f5VarC = C(true);
        this.f4245a.C().r();
        F(new P3(this, f5VarC));
    }

    public final void P() {
        h();
        i();
        if (z()) {
            return;
        }
        if (B()) {
            this.f4742c.c();
            return;
        }
        if (this.f4245a.z().G()) {
            return;
        }
        this.f4245a.b();
        List<ResolveInfo> listQueryIntentServices = this.f4245a.c().getPackageManager().queryIntentServices(new Intent().setClassName(this.f4245a.c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.f4245a.d().r().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextC = this.f4245a.c();
        this.f4245a.b();
        intent.setComponent(new ComponentName(contextC, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f4742c.b(intent);
    }

    public final void Q() {
        h();
        i();
        this.f4742c.d();
        try {
            B4.b.b().c(this.f4245a.c(), this.f4742c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f4743d = null;
    }

    public final void R(zzcf zzcfVar) {
        h();
        i();
        F(new O3(this, C(false), zzcfVar));
    }

    public final void S(AtomicReference atomicReference) {
        h();
        i();
        F(new N3(this, atomicReference, C(false)));
    }

    public final void T(zzcf zzcfVar, String str, String str2) {
        h();
        i();
        F(new RunnableC0712a4(this, str, str2, C(false), zzcfVar));
    }

    public final void U(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        i();
        F(new Z3(this, atomicReference, null, str2, str3, C(false)));
    }

    public final void V(zzcf zzcfVar, String str, String str2, boolean z9) {
        h();
        i();
        F(new K3(this, str, str2, C(false), z9, zzcfVar));
    }

    public final void W(AtomicReference atomicReference, String str, String str2, String str3, boolean z9) {
        h();
        i();
        F(new RunnableC0718b4(this, atomicReference, null, str2, str3, C(false), z9));
    }

    @Override // M4.G1
    public final boolean n() {
        return false;
    }

    public final void o(C0832v c0832v, String str) {
        com.google.android.gms.common.internal.r.m(c0832v);
        h();
        i();
        G();
        F(new X3(this, true, C(true), this.f4245a.C().v(c0832v), c0832v, str));
    }

    public final void p(zzcf zzcfVar, C0832v c0832v, String str) {
        h();
        i();
        if (this.f4245a.N().r0(12451000) == 0) {
            F(new T3(this, c0832v, str, zzcfVar));
        } else {
            this.f4245a.d().w().a("Not bundling data. Service unavailable or out of date");
            this.f4245a.N().H(zzcfVar, new byte[0]);
        }
    }

    public final void q() {
        h();
        i();
        f5 f5VarC = C(false);
        G();
        this.f4245a.C().q();
        F(new M3(this, f5VarC));
    }

    public final void r(InterfaceC0799p1 interfaceC0799p1, AbstractC2985a abstractC2985a, f5 f5Var) {
        int size;
        C0846x1 c0846x1R;
        String str;
        h();
        i();
        G();
        this.f4245a.z();
        int i9 = 0;
        int i10 = 100;
        while (i9 < 1001 && i10 == 100) {
            ArrayList arrayList = new ArrayList();
            List listP = this.f4245a.C().p(100);
            if (listP != null) {
                arrayList.addAll(listP);
                size = listP.size();
            } else {
                size = 0;
            }
            if (abstractC2985a != null && size < 100) {
                arrayList.add(abstractC2985a);
            }
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AbstractC2985a abstractC2985a2 = (AbstractC2985a) arrayList.get(i11);
                if (abstractC2985a2 instanceof C0832v) {
                    try {
                        interfaceC0799p1.N((C0832v) abstractC2985a2, f5Var);
                    } catch (RemoteException e9) {
                        e = e9;
                        c0846x1R = this.f4245a.d().r();
                        str = "Failed to send event to the service";
                        c0846x1R.b(str, e);
                    }
                } else if (abstractC2985a2 instanceof V4) {
                    try {
                        interfaceC0799p1.a1((V4) abstractC2985a2, f5Var);
                    } catch (RemoteException e10) {
                        e = e10;
                        c0846x1R = this.f4245a.d().r();
                        str = "Failed to send user property to the service";
                        c0846x1R.b(str, e);
                    }
                } else if (abstractC2985a2 instanceof C0725d) {
                    try {
                        interfaceC0799p1.P0((C0725d) abstractC2985a2, f5Var);
                    } catch (RemoteException e11) {
                        e = e11;
                        c0846x1R = this.f4245a.d().r();
                        str = "Failed to send conditional user property to the service";
                        c0846x1R.b(str, e);
                    }
                } else {
                    this.f4245a.d().r().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i9++;
            i10 = size;
        }
    }

    public final void s(C0725d c0725d) {
        com.google.android.gms.common.internal.r.m(c0725d);
        h();
        i();
        this.f4245a.b();
        F(new Y3(this, true, C(true), this.f4245a.C().u(c0725d), new C0725d(c0725d), c0725d));
    }

    public final void t(boolean z9) {
        h();
        i();
        if (z9) {
            G();
            this.f4245a.C().q();
        }
        if (A()) {
            F(new W3(this, C(false)));
        }
    }

    public final void u(A3 a32) {
        h();
        i();
        F(new Q3(this, a32));
    }

    public final void v(Bundle bundle) {
        h();
        i();
        F(new R3(this, C(false), bundle));
    }

    public final void w() {
        h();
        i();
        F(new V3(this, C(true)));
    }

    public final void x(InterfaceC0799p1 interfaceC0799p1) {
        h();
        com.google.android.gms.common.internal.r.m(interfaceC0799p1);
        this.f4743d = interfaceC0799p1;
        E();
        D();
    }

    public final void y(V4 v42) {
        h();
        i();
        G();
        F(new L3(this, C(true), this.f4245a.C().w(v42), v42));
    }

    public final boolean z() {
        h();
        i();
        return this.f4743d != null;
    }
}
