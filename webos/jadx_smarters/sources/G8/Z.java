package G8;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import k8.AbstractC2152a;
import k8.j;
import kotlinx.coroutines.internal.C2165f;
import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Z extends kotlinx.coroutines.scheduling.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2315d;

    public Z(int i9) {
        this.f2315d = i9;
    }

    public abstract void a(Object obj, Throwable th);

    public abstract InterfaceC2372d c();

    public Throwable d(Object obj) {
        B b9 = obj instanceof B ? (B) obj : null;
        if (b9 != null) {
            return b9.f2261a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC2152a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.l.b(th);
        K.a(c().getContext(), new O("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objB;
        Object objB2;
        Object objB3;
        kotlinx.coroutines.scheduling.i iVar = this.f43818c;
        try {
            C2165f c2165f = (C2165f) c();
            InterfaceC2372d interfaceC2372d = c2165f.f43752f;
            Object obj = c2165f.f43754h;
            o8.g context = interfaceC2372d.getContext();
            Object objC = kotlinx.coroutines.internal.C.c(context, obj);
            b1 b1VarG = objC != kotlinx.coroutines.internal.C.f43730a ? G.g(interfaceC2372d, context, objC) : null;
            try {
                o8.g context2 = interfaceC2372d.getContext();
                Object objH = h();
                Throwable thD = d(objH);
                InterfaceC0605x0 interfaceC0605x0 = (thD == null && AbstractC0560a0.b(this.f2315d)) ? (InterfaceC0605x0) context2.a(InterfaceC0605x0.f2366b0) : null;
                if (interfaceC0605x0 != null && !interfaceC0605x0.isActive()) {
                    CancellationException cancellationExceptionH = interfaceC0605x0.h();
                    a(objH, cancellationExceptionH);
                    j.a aVar = k8.j.f43666c;
                    objB2 = k8.j.b(k8.k.a(cancellationExceptionH));
                } else if (thD != null) {
                    j.a aVar2 = k8.j.f43666c;
                    objB2 = k8.j.b(k8.k.a(thD));
                } else {
                    j.a aVar3 = k8.j.f43666c;
                    objB2 = k8.j.b(e(objH));
                }
                interfaceC2372d.resumeWith(objB2);
                k8.q qVar = k8.q.f43674a;
                if (b1VarG == null || b1VarG.P0()) {
                    kotlinx.coroutines.internal.C.a(context, objC);
                }
                try {
                    iVar.a();
                    objB3 = k8.j.b(k8.q.f43674a);
                } catch (Throwable th) {
                    j.a aVar4 = k8.j.f43666c;
                    objB3 = k8.j.b(k8.k.a(th));
                }
                g(null, k8.j.d(objB3));
            } catch (Throwable th2) {
                if (b1VarG == null || b1VarG.P0()) {
                    kotlinx.coroutines.internal.C.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                j.a aVar5 = k8.j.f43666c;
                iVar.a();
                objB = k8.j.b(k8.q.f43674a);
            } catch (Throwable th4) {
                j.a aVar6 = k8.j.f43666c;
                objB = k8.j.b(k8.k.a(th4));
            }
            g(th3, k8.j.d(objB));
        }
    }
}
