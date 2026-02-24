package M4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import w4.AbstractC2925m;
import w4.C2926n;

/* JADX INFO: loaded from: classes3.dex */
public final class D2 extends AbstractBinderC0793o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S4 f4226a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f4227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4228d;

    public D2(S4 s42, String str) {
        com.google.android.gms.common.internal.r.m(s42);
        this.f4226a = s42;
        this.f4228d = null;
    }

    public final void A(C0832v c0832v, f5 f5Var) {
        this.f4226a.e();
        this.f4226a.j(c0832v, f5Var);
    }

    @Override // M4.InterfaceC0799p1
    public final void C(long j9, String str, String str2, String str3) {
        d1(new C2(this, str2, str3, str, j9));
    }

    @Override // M4.InterfaceC0799p1
    public final void C0(C0725d c0725d) {
        com.google.android.gms.common.internal.r.m(c0725d);
        com.google.android.gms.common.internal.r.m(c0725d.f4639h);
        com.google.android.gms.common.internal.r.g(c0725d.f4637f);
        f1(c0725d.f4637f, true);
        d1(new RunnableC0794o2(this, new C0725d(c0725d)));
    }

    public final C0832v E(C0832v c0832v, f5 f5Var) {
        C0820t c0820t;
        if ("_cmp".equals(c0832v.f5088f) && (c0820t = c0832v.f5089g) != null && c0820t.H() != 0) {
            String strN = c0832v.f5089g.N("_cis");
            if ("referrer broadcast".equals(strN) || "referrer API".equals(strN)) {
                this.f4226a.d().u().b("Event has been filtered ", c0832v.toString());
                return new C0832v("_cmpx", c0832v.f5089g, c0832v.f5090h, c0832v.f5091i);
            }
        }
        return c0832v;
    }

    @Override // M4.InterfaceC0799p1
    public final byte[] F(C0832v c0832v, String str) {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.m(c0832v);
        f1(str, true);
        this.f4226a.d().q().b("Log and bundle. event", this.f4226a.W().d(c0832v.f5088f));
        long jNanoTime = this.f4226a.a().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f4226a.f().t(new CallableC0853y2(this, c0832v, str)).get();
            if (bArr == null) {
                this.f4226a.d().r().b("Log and bundle returned null. appId", C0858z1.z(str));
                bArr = new byte[0];
            }
            this.f4226a.d().q().d("Log and bundle processed. event, size, time_ms", this.f4226a.W().d(c0832v.f5088f), Integer.valueOf(bArr.length), Long.valueOf((this.f4226a.a().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e9) {
            e = e9;
            this.f4226a.d().r().d("Failed to log and bundle. appId, event, error", C0858z1.z(str), this.f4226a.W().d(c0832v.f5088f), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            this.f4226a.d().r().d("Failed to log and bundle. appId, event, error", C0858z1.z(str), this.f4226a.W().d(c0832v.f5088f), e);
            return null;
        }
    }

    @Override // M4.InterfaceC0799p1
    public final String I(f5 f5Var) {
        e1(f5Var, false);
        return this.f4226a.j0(f5Var);
    }

    @Override // M4.InterfaceC0799p1
    public final void N(C0832v c0832v, f5 f5Var) {
        com.google.android.gms.common.internal.r.m(c0832v);
        e1(f5Var, false);
        d1(new RunnableC0841w2(this, c0832v, f5Var));
    }

    @Override // M4.InterfaceC0799p1
    public final void P0(C0725d c0725d, f5 f5Var) {
        com.google.android.gms.common.internal.r.m(c0725d);
        com.google.android.gms.common.internal.r.m(c0725d.f4639h);
        e1(f5Var, false);
        C0725d c0725d2 = new C0725d(c0725d);
        c0725d2.f4637f = f5Var.f4686f;
        d1(new RunnableC0788n2(this, c0725d2, f5Var));
    }

    @Override // M4.InterfaceC0799p1
    public final void T0(f5 f5Var) {
        com.google.android.gms.common.internal.r.g(f5Var.f4686f);
        f1(f5Var.f4686f, false);
        d1(new RunnableC0823t2(this, f5Var));
    }

    @Override // M4.InterfaceC0799p1
    public final void a1(V4 v42, f5 f5Var) {
        com.google.android.gms.common.internal.r.m(v42);
        e1(f5Var, false);
        d1(new RunnableC0859z2(this, v42, f5Var));
    }

    @Override // M4.InterfaceC0799p1
    public final List b(String str, String str2, boolean z9, f5 f5Var) {
        e1(f5Var, false);
        String str3 = f5Var.f4686f;
        com.google.android.gms.common.internal.r.m(str3);
        try {
            List<X4> list = (List) this.f4226a.f().s(new CallableC0800p2(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (X4 x42 : list) {
                if (z9 || !a5.Y(x42.f4545c)) {
                    arrayList.add(new V4(x42));
                }
            }
            return arrayList;
        } catch (InterruptedException e9) {
            e = e9;
            this.f4226a.d().r().c("Failed to query user properties. appId", C0858z1.z(f5Var.f4686f), e);
            return Collections.emptyList();
        } catch (ExecutionException e10) {
            e = e10;
            this.f4226a.d().r().c("Failed to query user properties. appId", C0858z1.z(f5Var.f4686f), e);
            return Collections.emptyList();
        }
    }

    @Override // M4.InterfaceC0799p1
    public final List b0(String str, String str2, String str3, boolean z9) {
        f1(str, true);
        try {
            List<X4> list = (List) this.f4226a.f().s(new CallableC0806q2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (X4 x42 : list) {
                if (z9 || !a5.Y(x42.f4545c)) {
                    arrayList.add(new V4(x42));
                }
            }
            return arrayList;
        } catch (InterruptedException e9) {
            e = e9;
            this.f4226a.d().r().c("Failed to get user properties as. appId", C0858z1.z(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e10) {
            e = e10;
            this.f4226a.d().r().c("Failed to get user properties as. appId", C0858z1.z(str), e);
            return Collections.emptyList();
        }
    }

    public final void c0(C0832v c0832v, f5 f5Var) {
        C0846x1 c0846x1V;
        String str;
        String str2;
        if (!this.f4226a.Z().C(f5Var.f4686f)) {
            A(c0832v, f5Var);
            return;
        }
        this.f4226a.d().v().b("EES config found for", f5Var.f4686f);
        C0722c2 c0722c2Z = this.f4226a.Z();
        String str3 = f5Var.f4686f;
        zzc zzcVar = TextUtils.isEmpty(str3) ? null : (zzc) c0722c2Z.f4626j.get(str3);
        if (zzcVar != null) {
            try {
                Map mapK = this.f4226a.g0().K(c0832v.f5089g.J(), true);
                String strA = L2.a(c0832v.f5088f);
                if (strA == null) {
                    strA = c0832v.f5088f;
                }
                if (zzcVar.zze(new zzaa(strA, c0832v.f5091i, mapK))) {
                    if (zzcVar.zzg()) {
                        this.f4226a.d().v().b("EES edited event", c0832v.f5088f);
                        c0832v = this.f4226a.g0().C(zzcVar.zza().zzb());
                    }
                    A(c0832v, f5Var);
                    if (zzcVar.zzf()) {
                        for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                            this.f4226a.d().v().b("EES logging created event", zzaaVar.zzd());
                            A(this.f4226a.g0().C(zzaaVar), f5Var);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f4226a.d().r().c("EES error. appId, eventName", f5Var.f4687g, c0832v.f5088f);
            }
            c0846x1V = this.f4226a.d().v();
            str = c0832v.f5088f;
            str2 = "EES was not applied to event";
        } else {
            c0846x1V = this.f4226a.d().v();
            str = f5Var.f4686f;
            str2 = "EES not loaded for";
        }
        c0846x1V.b(str2, str);
        A(c0832v, f5Var);
    }

    public final /* synthetic */ void c1(String str, Bundle bundle) {
        C0773l c0773lV = this.f4226a.V();
        c0773lV.h();
        c0773lV.i();
        byte[] bArrZzbx = c0773lV.f4234b.g0().D(new C0803q(c0773lV.f4245a, "", str, "dep", 0L, 0L, bundle)).zzbx();
        c0773lV.f4245a.d().v().c("Saving default event parameters, appId, data size", c0773lV.f4245a.D().d(str), Integer.valueOf(bArrZzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzbx);
        try {
            if (c0773lV.P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c0773lV.f4245a.d().r().b("Failed to insert default event parameters (got -1). appId", C0858z1.z(str));
            }
        } catch (SQLiteException e9) {
            c0773lV.f4245a.d().r().c("Error storing default event parameters. appId", C0858z1.z(str), e9);
        }
    }

    public final void d1(Runnable runnable) {
        com.google.android.gms.common.internal.r.m(runnable);
        if (this.f4226a.f().C()) {
            runnable.run();
        } else {
            this.f4226a.f().z(runnable);
        }
    }

    public final void e1(f5 f5Var, boolean z9) {
        com.google.android.gms.common.internal.r.m(f5Var);
        com.google.android.gms.common.internal.r.g(f5Var.f4686f);
        f1(f5Var.f4686f, false);
        this.f4226a.h0().M(f5Var.f4687g, f5Var.f4702v);
    }

    public final void f1(String str, boolean z9) {
        if (TextUtils.isEmpty(str)) {
            this.f4226a.d().r().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z9) {
            try {
                if (this.f4227c == null) {
                    this.f4227c = Boolean.valueOf("com.google.android.gms".equals(this.f4228d) || C4.p.a(this.f4226a.c(), Binder.getCallingUid()) || C2926n.a(this.f4226a.c()).c(Binder.getCallingUid()));
                }
                if (this.f4227c.booleanValue()) {
                    return;
                }
            } catch (SecurityException e9) {
                this.f4226a.d().r().b("Measurement Service called with invalid calling package. appId", C0858z1.z(str));
                throw e9;
            }
        }
        if (this.f4228d == null && AbstractC2925m.l(this.f4226a.c(), Binder.getCallingUid(), str)) {
            this.f4228d = str;
        }
        if (str.equals(this.f4228d)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // M4.InterfaceC0799p1
    public final void g(C0832v c0832v, String str, String str2) {
        com.google.android.gms.common.internal.r.m(c0832v);
        com.google.android.gms.common.internal.r.g(str);
        f1(str, true);
        d1(new RunnableC0847x2(this, c0832v, str));
    }

    @Override // M4.InterfaceC0799p1
    public final void j0(f5 f5Var) {
        com.google.android.gms.common.internal.r.g(f5Var.f4686f);
        com.google.android.gms.common.internal.r.m(f5Var.f4681A);
        RunnableC0835v2 runnableC0835v2 = new RunnableC0835v2(this, f5Var);
        com.google.android.gms.common.internal.r.m(runnableC0835v2);
        if (this.f4226a.f().C()) {
            runnableC0835v2.run();
        } else {
            this.f4226a.f().A(runnableC0835v2);
        }
    }

    @Override // M4.InterfaceC0799p1
    public final List l0(String str, String str2, String str3) {
        f1(str, true);
        try {
            return (List) this.f4226a.f().s(new CallableC0817s2(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e9) {
            this.f4226a.d().r().b("Failed to get conditional user properties as", e9);
            return Collections.emptyList();
        }
    }

    @Override // M4.InterfaceC0799p1
    public final void r(f5 f5Var) {
        e1(f5Var, false);
        d1(new B2(this, f5Var));
    }

    @Override // M4.InterfaceC0799p1
    public final List s0(String str, String str2, f5 f5Var) {
        e1(f5Var, false);
        String str3 = f5Var.f4686f;
        com.google.android.gms.common.internal.r.m(str3);
        try {
            return (List) this.f4226a.f().s(new CallableC0811r2(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e9) {
            this.f4226a.d().r().b("Failed to get conditional user properties", e9);
            return Collections.emptyList();
        }
    }

    @Override // M4.InterfaceC0799p1
    public final void u0(f5 f5Var) {
        e1(f5Var, false);
        d1(new RunnableC0829u2(this, f5Var));
    }

    @Override // M4.InterfaceC0799p1
    public final List y(f5 f5Var, boolean z9) {
        e1(f5Var, false);
        String str = f5Var.f4686f;
        com.google.android.gms.common.internal.r.m(str);
        try {
            List<X4> list = (List) this.f4226a.f().s(new A2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (X4 x42 : list) {
                if (z9 || !a5.Y(x42.f4545c)) {
                    arrayList.add(new V4(x42));
                }
            }
            return arrayList;
        } catch (InterruptedException e9) {
            e = e9;
            this.f4226a.d().r().c("Failed to get user properties. appId", C0858z1.z(f5Var.f4686f), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            this.f4226a.d().r().c("Failed to get user properties. appId", C0858z1.z(f5Var.f4686f), e);
            return null;
        }
    }

    @Override // M4.InterfaceC0799p1
    public final void z0(final Bundle bundle, f5 f5Var) {
        e1(f5Var, false);
        final String str = f5Var.f4686f;
        com.google.android.gms.common.internal.r.m(str);
        d1(new Runnable() { // from class: M4.m2
            @Override // java.lang.Runnable
            public final void run() {
                this.f4936a.c1(str, bundle);
            }
        });
    }
}
