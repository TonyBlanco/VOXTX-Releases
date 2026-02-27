package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC1906b;
import j$.time.temporal.w;

/* JADX INFO: loaded from: classes2.dex */
final class o implements j$.time.temporal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1906b f42081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.time.temporal.o f42082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.n f42083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ZoneId f42084d;

    o(InterfaceC1906b interfaceC1906b, j$.time.temporal.o oVar, j$.time.chrono.n nVar, ZoneId zoneId) {
        this.f42081a = interfaceC1906b;
        this.f42082b = oVar;
        this.f42083c = nVar;
        this.f42084d = zoneId;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        InterfaceC1906b interfaceC1906b = this.f42081a;
        return (interfaceC1906b == null || !rVar.u()) ? this.f42082b.f(rVar) : interfaceC1906b.f(rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int i(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final w l(j$.time.temporal.r rVar) {
        InterfaceC1906b interfaceC1906b = this.f42081a;
        return (interfaceC1906b == null || !rVar.u()) ? this.f42082b.l(rVar) : interfaceC1906b.l(rVar);
    }

    @Override // j$.time.temporal.o
    public final long q(j$.time.temporal.r rVar) {
        InterfaceC1906b interfaceC1906b = this.f42081a;
        return (interfaceC1906b == null || !rVar.u()) ? this.f42082b.q(rVar) : interfaceC1906b.q(rVar);
    }

    @Override // j$.time.temporal.o
    public final Object t(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? this.f42083c : tVar == j$.time.temporal.n.k() ? this.f42084d : tVar == j$.time.temporal.n.i() ? this.f42082b.t(tVar) : tVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.n nVar = this.f42083c;
        if (nVar != null) {
            str = " with chronology " + nVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f42084d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f42082b + str + str2;
    }
}
