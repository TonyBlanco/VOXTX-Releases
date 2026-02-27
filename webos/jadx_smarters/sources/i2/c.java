package I2;

import C2.p;
import C2.u;
import D2.m;
import J2.x;
import K2.InterfaceC0689d;
import L2.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import z2.InterfaceC3020h;

/* JADX INFO: loaded from: classes3.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f2815f = Logger.getLogger(u.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f2816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f2817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D2.e f2818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0689d f2819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L2.b f2820e;

    public c(Executor executor, D2.e eVar, x xVar, InterfaceC0689d interfaceC0689d, L2.b bVar) {
        this.f2817b = executor;
        this.f2818c = eVar;
        this.f2816a = xVar;
        this.f2819d = interfaceC0689d;
        this.f2820e = bVar;
    }

    @Override // I2.e
    public void a(final p pVar, final C2.i iVar, final InterfaceC3020h interfaceC3020h) {
        this.f2817b.execute(new Runnable() { // from class: I2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f2808a.e(pVar, interfaceC3020h, iVar);
            }
        });
    }

    public final /* synthetic */ Object d(p pVar, C2.i iVar) {
        this.f2819d.R(pVar, iVar);
        this.f2816a.b(pVar, 1);
        return null;
    }

    public final /* synthetic */ void e(final p pVar, InterfaceC3020h interfaceC3020h, C2.i iVar) {
        try {
            m mVar = this.f2818c.get(pVar.b());
            if (mVar == null) {
                String str = String.format("Transport backend '%s' is not registered", pVar.b());
                f2815f.warning(str);
                interfaceC3020h.a(new IllegalArgumentException(str));
            } else {
                final C2.i iVarA = mVar.a(iVar);
                this.f2820e.a(new b.a() { // from class: I2.b
                    @Override // L2.b.a
                    public final Object execute() {
                        return this.f2812a.d(pVar, iVarA);
                    }
                });
                interfaceC3020h.a(null);
            }
        } catch (Exception e9) {
            f2815f.warning("Error scheduling event " + e9.getMessage());
            interfaceC3020h.a(e9);
        }
    }
}
