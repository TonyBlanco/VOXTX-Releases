package com.google.android.gms.measurement.internal;

import F4.a;
import F4.b;
import M4.AbstractC0860z3;
import M4.C0776l2;
import M4.C0818s3;
import M4.C0820t;
import M4.C0824t3;
import M4.C0832v;
import M4.J3;
import M4.K4;
import M4.P2;
import M4.RunnableC0747g3;
import M4.RunnableC0759i3;
import M4.RunnableC0766j4;
import M4.RunnableC0807q3;
import M4.X2;
import M4.a5;
import M4.b5;
import M4.c5;
import M4.d5;
import M4.e5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0776l2 f26947a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f26948c = new C2695a();

    public final void A() {
        if (this.f26947a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void E(zzcf zzcfVar, String str) {
        A();
        this.f26947a.N().K(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(String str, long j9) throws RemoteException {
        A();
        this.f26947a.y().l(str, j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        A();
        this.f26947a.I().o(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j9) throws RemoteException {
        A();
        this.f26947a.I().I(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(String str, long j9) throws RemoteException {
        A();
        this.f26947a.y().m(str, j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(zzcf zzcfVar) throws RemoteException {
        A();
        long jT0 = this.f26947a.N().t0();
        A();
        this.f26947a.N().J(zzcfVar, jT0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(zzcf zzcfVar) throws RemoteException {
        A();
        this.f26947a.f().z(new RunnableC0759i3(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException {
        A();
        E(zzcfVar, this.f26947a.I().V());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException {
        A();
        this.f26947a.f().z(new b5(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException {
        A();
        E(zzcfVar, this.f26947a.I().W());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(zzcf zzcfVar) throws RemoteException {
        A();
        E(zzcfVar, this.f26947a.I().X());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(zzcf zzcfVar) throws RemoteException {
        String strB;
        A();
        C0824t3 c0824t3I = this.f26947a.I();
        if (c0824t3I.f4245a.O() != null) {
            strB = c0824t3I.f4245a.O();
        } else {
            try {
                strB = AbstractC0860z3.b(c0824t3I.f4245a.c(), "google_app_id", c0824t3I.f4245a.R());
            } catch (IllegalStateException e9) {
                c0824t3I.f4245a.d().r().b("getGoogleAppId failed with exception", e9);
                strB = null;
            }
        }
        E(zzcfVar, strB);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException {
        A();
        this.f26947a.I().Q(str);
        A();
        this.f26947a.N().I(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getSessionId(zzcf zzcfVar) throws RemoteException {
        A();
        C0824t3 c0824t3I = this.f26947a.I();
        c0824t3I.f4245a.f().z(new RunnableC0747g3(c0824t3I, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(zzcf zzcfVar, int i9) throws RemoteException {
        A();
        if (i9 == 0) {
            this.f26947a.N().K(zzcfVar, this.f26947a.I().Y());
            return;
        }
        if (i9 == 1) {
            this.f26947a.N().J(zzcfVar, this.f26947a.I().U().longValue());
            return;
        }
        if (i9 != 2) {
            if (i9 == 3) {
                this.f26947a.N().I(zzcfVar, this.f26947a.I().T().intValue());
                return;
            } else {
                if (i9 != 4) {
                    return;
                }
                this.f26947a.N().E(zzcfVar, this.f26947a.I().R().booleanValue());
                return;
            }
        }
        a5 a5VarN = this.f26947a.N();
        double dDoubleValue = this.f26947a.I().S().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e9) {
            a5VarN.f4245a.d().w().b("Error returning double value to wrapper", e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z9, zzcf zzcfVar) throws RemoteException {
        A();
        this.f26947a.f().z(new RunnableC0766j4(this, zzcfVar, str, str2, z9));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(Map map) throws RemoteException {
        A();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(a aVar, zzcl zzclVar, long j9) throws RemoteException {
        C0776l2 c0776l2 = this.f26947a;
        if (c0776l2 == null) {
            this.f26947a = C0776l2.H((Context) r.m((Context) b.E(aVar)), zzclVar, Long.valueOf(j9));
        } else {
            c0776l2.d().w().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException {
        A();
        this.f26947a.f().z(new c5(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j9) throws RemoteException {
        A();
        this.f26947a.I().s(str, str2, bundle, z9, z10, j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j9) throws RemoteException {
        A();
        r.g(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f26947a.f().z(new J3(this, zzcfVar, new C0832v(str2, new C0820t(bundle), "app", j9), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i9, String str, a aVar, a aVar2, a aVar3) throws RemoteException {
        A();
        this.f26947a.d().G(i9, true, false, str, aVar == null ? null : b.E(aVar), aVar2 == null ? null : b.E(aVar2), aVar3 != null ? b.E(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(a aVar, Bundle bundle, long j9) throws RemoteException {
        A();
        C0818s3 c0818s3 = this.f26947a.I().f5065c;
        if (c0818s3 != null) {
            this.f26947a.I().p();
            c0818s3.onActivityCreated((Activity) b.E(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(a aVar, long j9) throws RemoteException {
        A();
        C0818s3 c0818s3 = this.f26947a.I().f5065c;
        if (c0818s3 != null) {
            this.f26947a.I().p();
            c0818s3.onActivityDestroyed((Activity) b.E(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(a aVar, long j9) throws RemoteException {
        A();
        C0818s3 c0818s3 = this.f26947a.I().f5065c;
        if (c0818s3 != null) {
            this.f26947a.I().p();
            c0818s3.onActivityPaused((Activity) b.E(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(a aVar, long j9) throws RemoteException {
        A();
        C0818s3 c0818s3 = this.f26947a.I().f5065c;
        if (c0818s3 != null) {
            this.f26947a.I().p();
            c0818s3.onActivityResumed((Activity) b.E(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(a aVar, zzcf zzcfVar, long j9) throws RemoteException {
        A();
        C0818s3 c0818s3 = this.f26947a.I().f5065c;
        Bundle bundle = new Bundle();
        if (c0818s3 != null) {
            this.f26947a.I().p();
            c0818s3.onActivitySaveInstanceState((Activity) b.E(aVar), bundle);
        }
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e9) {
            this.f26947a.d().w().b("Error returning bundle value to wrapper", e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(a aVar, long j9) throws RemoteException {
        A();
        if (this.f26947a.I().f5065c != null) {
            this.f26947a.I().p();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(a aVar, long j9) throws RemoteException {
        A();
        if (this.f26947a.I().f5065c != null) {
            this.f26947a.I().p();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, zzcf zzcfVar, long j9) throws RemoteException {
        A();
        zzcfVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        P2 e5Var;
        A();
        synchronized (this.f26948c) {
            try {
                e5Var = (P2) this.f26948c.get(Integer.valueOf(zzciVar.zzd()));
                if (e5Var == null) {
                    e5Var = new e5(this, zzciVar);
                    this.f26948c.put(Integer.valueOf(zzciVar.zzd()), e5Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f26947a.I().x(e5Var);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j9) throws RemoteException {
        A();
        this.f26947a.I().y(j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(Bundle bundle, long j9) throws RemoteException {
        A();
        if (bundle == null) {
            this.f26947a.d().r().a("Conditional user property must not be null");
        } else {
            this.f26947a.I().E(bundle, j9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(final Bundle bundle, final long j9) throws RemoteException {
        A();
        final C0824t3 c0824t3I = this.f26947a.I();
        c0824t3I.f4245a.f().A(new Runnable() { // from class: M4.S2
            @Override // java.lang.Runnable
            public final void run() {
                C0824t3 c0824t3 = c0824t3I;
                Bundle bundle2 = bundle;
                long j10 = j9;
                if (TextUtils.isEmpty(c0824t3.f4245a.B().t())) {
                    c0824t3.G(bundle2, 0, j10);
                } else {
                    c0824t3.f4245a.d().x().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(Bundle bundle, long j9) throws RemoteException {
        A();
        this.f26947a.I().G(bundle, -20, j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(a aVar, String str, String str2, long j9) throws RemoteException {
        A();
        this.f26947a.K().D((Activity) b.E(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z9) throws RemoteException {
        A();
        C0824t3 c0824t3I = this.f26947a.I();
        c0824t3I.i();
        c0824t3I.f4245a.f().z(new RunnableC0807q3(c0824t3I, z9));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(Bundle bundle) {
        A();
        final C0824t3 c0824t3I = this.f26947a.I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        c0824t3I.f4245a.f().z(new Runnable() { // from class: M4.T2
            @Override // java.lang.Runnable
            public final void run() {
                c0824t3I.q(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(zzci zzciVar) throws RemoteException {
        A();
        d5 d5Var = new d5(this, zzciVar);
        if (this.f26947a.f().C()) {
            this.f26947a.I().H(d5Var);
        } else {
            this.f26947a.f().z(new K4(this, d5Var));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(zzck zzckVar) throws RemoteException {
        A();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z9, long j9) throws RemoteException {
        A();
        this.f26947a.I().I(Boolean.valueOf(z9));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j9) throws RemoteException {
        A();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j9) throws RemoteException {
        A();
        C0824t3 c0824t3I = this.f26947a.I();
        c0824t3I.f4245a.f().z(new X2(c0824t3I, j9));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(final String str, long j9) throws RemoteException {
        A();
        final C0824t3 c0824t3I = this.f26947a.I();
        if (str != null && TextUtils.isEmpty(str)) {
            c0824t3I.f4245a.d().w().a("User ID must be non-empty or null");
        } else {
            c0824t3I.f4245a.f().z(new Runnable() { // from class: M4.U2
                @Override // java.lang.Runnable
                public final void run() {
                    C0824t3 c0824t3 = c0824t3I;
                    if (c0824t3.f4245a.B().w(str)) {
                        c0824t3.f4245a.B().v();
                    }
                }
            });
            c0824t3I.L(null, "_id", str, true, j9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(String str, String str2, a aVar, boolean z9, long j9) throws RemoteException {
        A();
        this.f26947a.I().L(str, str2, b.E(aVar), z9, j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        P2 e5Var;
        A();
        synchronized (this.f26948c) {
            e5Var = (P2) this.f26948c.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (e5Var == null) {
            e5Var = new e5(this, zzciVar);
        }
        this.f26947a.I().N(e5Var);
    }
}
