package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1404c;
import com.google.android.gms.common.internal.C1407f;
import com.google.android.gms.common.internal.C1417p;
import com.google.android.gms.common.internal.C1419s;
import com.google.android.gms.common.internal.C1420t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import w4.C2914b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1397x0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1363g f26730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1353b f26732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26734e;

    public C1397x0(C1363g c1363g, int i9, C1353b c1353b, long j9, long j10, String str, String str2) {
        this.f26730a = c1363g;
        this.f26731b = i9;
        this.f26732c = c1353b;
        this.f26733d = j9;
        this.f26734e = j10;
    }

    public static C1397x0 a(C1363g c1363g, int i9, C1353b c1353b) {
        boolean zK;
        if (!c1363g.d()) {
            return null;
        }
        C1420t c1420tA = C1419s.b().a();
        if (c1420tA == null) {
            zK = true;
        } else {
            if (!c1420tA.J()) {
                return null;
            }
            zK = c1420tA.K();
            C1372k0 c1372k0S = c1363g.s(c1353b);
            if (c1372k0S != null) {
                if (!(c1372k0S.s() instanceof AbstractC1404c)) {
                    return null;
                }
                AbstractC1404c abstractC1404c = (AbstractC1404c) c1372k0S.s();
                if (abstractC1404c.hasConnectionInfo() && !abstractC1404c.isConnecting()) {
                    C1407f c1407fB = b(c1372k0S, abstractC1404c, i9);
                    if (c1407fB == null) {
                        return null;
                    }
                    c1372k0S.E();
                    zK = c1407fB.L();
                }
            }
        }
        return new C1397x0(c1363g, i9, c1353b, zK ? System.currentTimeMillis() : 0L, zK ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static C1407f b(C1372k0 c1372k0, AbstractC1404c abstractC1404c, int i9) {
        int[] iArrI;
        int[] iArrJ;
        C1407f telemetryConfiguration = abstractC1404c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.K() || ((iArrI = telemetryConfiguration.I()) != null ? !C4.b.a(iArrI, i9) : !((iArrJ = telemetryConfiguration.J()) == null || !C4.b.a(iArrJ, i9))) || c1372k0.q() >= telemetryConfiguration.H()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        C1372k0 c1372k0S;
        int iL;
        int i9;
        int i10;
        int i11;
        int iH;
        long j9;
        long j10;
        int iElapsedRealtime;
        if (this.f26730a.d()) {
            C1420t c1420tA = C1419s.b().a();
            if ((c1420tA == null || c1420tA.J()) && (c1372k0S = this.f26730a.s(this.f26732c)) != null && (c1372k0S.s() instanceof AbstractC1404c)) {
                AbstractC1404c abstractC1404c = (AbstractC1404c) c1372k0S.s();
                boolean zK = this.f26733d > 0;
                int gCoreServiceId = abstractC1404c.getGCoreServiceId();
                if (c1420tA != null) {
                    zK &= c1420tA.K();
                    int iH2 = c1420tA.H();
                    int I9 = c1420tA.I();
                    iL = c1420tA.L();
                    if (abstractC1404c.hasConnectionInfo() && !abstractC1404c.isConnecting()) {
                        C1407f c1407fB = b(c1372k0S, abstractC1404c, this.f26731b);
                        if (c1407fB == null) {
                            return;
                        }
                        boolean z9 = c1407fB.L() && this.f26733d > 0;
                        I9 = c1407fB.H();
                        zK = z9;
                    }
                    i9 = iH2;
                    i10 = I9;
                } else {
                    iL = 0;
                    i9 = 5000;
                    i10 = 100;
                }
                C1363g c1363g = this.f26730a;
                if (task.isSuccessful()) {
                    i11 = 0;
                    iH = 0;
                } else {
                    if (task.isCanceled()) {
                        i11 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.b) {
                            Status status = ((com.google.android.gms.common.api.b) exception).getStatus();
                            int I10 = status.I();
                            C2914b c2914bH = status.H();
                            if (c2914bH == null) {
                                i11 = I10;
                            } else {
                                iH = c2914bH.H();
                                i11 = I10;
                            }
                        } else {
                            i11 = 101;
                        }
                    }
                    iH = -1;
                }
                if (zK) {
                    long j11 = this.f26733d;
                    long j12 = this.f26734e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j12);
                    j9 = j11;
                    j10 = jCurrentTimeMillis;
                } else {
                    j9 = 0;
                    j10 = 0;
                    iElapsedRealtime = -1;
                }
                c1363g.E(new C1417p(this.f26731b, i11, iH, j9, j10, null, null, gCoreServiceId, iElapsedRealtime), iL, i9, i10);
            }
        }
    }
}
