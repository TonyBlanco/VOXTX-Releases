package kotlinx.coroutines.flow;

import G8.C0587o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k8.j;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import p8.AbstractC2511b;
import p8.AbstractC2512c;
import q8.AbstractC2649h;
import t.AbstractC2755b;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends J8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43728a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");

    @NotNull
    volatile /* synthetic */ Object _state = null;

    @Override // J8.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(l lVar) {
        if (this._state != null) {
            return false;
        }
        this._state = m.f43726a;
        return true;
    }

    public final Object d(InterfaceC2372d interfaceC2372d) {
        C0587o c0587o = new C0587o(AbstractC2511b.c(interfaceC2372d), 1);
        c0587o.v();
        if (!AbstractC2755b.a(f43728a, this, m.f43726a, c0587o)) {
            j.a aVar = k8.j.f43666c;
            c0587o.resumeWith(k8.j.b(q.f43674a));
        }
        Object objR = c0587o.r();
        if (objR == AbstractC2512c.d()) {
            AbstractC2649h.c(interfaceC2372d);
        }
        return objR == AbstractC2512c.d() ? objR : q.f43674a;
    }

    @Override // J8.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC2372d[] b(l lVar) {
        this._state = null;
        return J8.c.f3398a;
    }

    public final void f() {
        while (true) {
            Object obj = this._state;
            if (obj == null || obj == m.f43727b) {
                return;
            }
            if (obj == m.f43726a) {
                if (AbstractC2755b.a(f43728a, this, obj, m.f43727b)) {
                    return;
                }
            } else if (AbstractC2755b.a(f43728a, this, obj, m.f43726a)) {
                j.a aVar = k8.j.f43666c;
                ((C0587o) obj).resumeWith(k8.j.b(q.f43674a));
                return;
            }
        }
    }

    public final boolean g() {
        Object andSet = f43728a.getAndSet(this, m.f43726a);
        kotlin.jvm.internal.l.b(andSet);
        return andSet == m.f43727b;
    }
}
