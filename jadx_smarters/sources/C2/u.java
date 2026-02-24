package C2;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import z2.C3014b;
import z2.InterfaceC3019g;
import z2.InterfaceC3020h;

/* JADX INFO: loaded from: classes3.dex */
public class u implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile v f1026e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M2.a f1027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M2.a f1028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I2.e f1029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.r f1030d;

    public u(M2.a aVar, M2.a aVar2, I2.e eVar, J2.r rVar, J2.v vVar) {
        this.f1027a = aVar;
        this.f1028b = aVar2;
        this.f1029c = eVar;
        this.f1030d = rVar;
        vVar.c();
    }

    public static u c() {
        v vVar = f1026e;
        if (vVar != null) {
            return vVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(C3014b.b("proto"));
    }

    public static void f(Context context) {
        if (f1026e == null) {
            synchronized (u.class) {
                try {
                    if (f1026e == null) {
                        f1026e = e.d().a(context).build();
                    }
                } finally {
                }
            }
        }
    }

    @Override // C2.t
    public void a(o oVar, InterfaceC3020h interfaceC3020h) {
        this.f1029c.a(oVar.f().f(oVar.c().c()), b(oVar), interfaceC3020h);
    }

    public final i b(o oVar) {
        return i.a().i(this.f1027a.a()).k(this.f1028b.a()).j(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a()).d();
    }

    public J2.r e() {
        return this.f1030d;
    }

    public InterfaceC3019g g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
