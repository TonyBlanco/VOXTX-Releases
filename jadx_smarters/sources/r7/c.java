package R7;

import com.onesignal.G1;
import com.onesignal.InterfaceC1565l1;
import com.onesignal.L1;
import com.onesignal.P0;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P0 f9352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1 f9353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f9354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S7.c f9355d;

    public c(P0 logger, G1 apiClient, L1 l12, InterfaceC1565l1 interfaceC1565l1) {
        l.e(logger, "logger");
        l.e(apiClient, "apiClient");
        this.f9352a = logger;
        this.f9353b = apiClient;
        l.b(l12);
        l.b(interfaceC1565l1);
        this.f9354c = new a(logger, l12, interfaceC1565l1);
    }

    public final d a() {
        return this.f9354c.j() ? new g(this.f9352a, this.f9354c, new h(this.f9353b)) : new e(this.f9352a, this.f9354c, new f(this.f9353b));
    }

    public final S7.c b() {
        return this.f9355d != null ? c() : a();
    }

    public final S7.c c() {
        if (!this.f9354c.j()) {
            S7.c cVar = this.f9355d;
            if (cVar instanceof e) {
                l.b(cVar);
                return cVar;
            }
        }
        if (this.f9354c.j()) {
            S7.c cVar2 = this.f9355d;
            if (cVar2 instanceof g) {
                l.b(cVar2);
                return cVar2;
            }
        }
        return a();
    }
}
