package s4;

import o4.AbstractC2342t;
import p4.C2434i;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements C2434i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2709a f49962a;

    public /* synthetic */ q(AbstractActivityC2709a abstractActivityC2709a, p pVar) {
        this.f49962a = abstractActivityC2709a;
    }

    @Override // p4.C2434i.b
    public final void a() {
        this.f49962a.J1();
    }

    @Override // p4.C2434i.b
    public final void b() {
        this.f49962a.I1();
    }

    @Override // p4.C2434i.b
    public final void c() {
    }

    @Override // p4.C2434i.b
    public final void d() {
        AbstractActivityC2709a abstractActivityC2709a = this.f49962a;
        abstractActivityC2709a.f49939x.setText(abstractActivityC2709a.getResources().getString(AbstractC2342t.f46005g));
    }

    @Override // p4.C2434i.b
    public final void e() {
    }

    @Override // p4.C2434i.b
    public final void f() {
        C2434i c2434iD1 = this.f49962a.D1();
        if (c2434iD1 == null || !c2434iD1.q()) {
            AbstractActivityC2709a abstractActivityC2709a = this.f49962a;
            if (abstractActivityC2709a.f49915P) {
                return;
            }
            abstractActivityC2709a.finish();
            return;
        }
        AbstractActivityC2709a abstractActivityC2709a2 = this.f49962a;
        abstractActivityC2709a2.f49915P = false;
        abstractActivityC2709a2.H1();
        this.f49962a.J1();
    }
}
