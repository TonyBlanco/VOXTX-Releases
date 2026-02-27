package G8;

import k8.j;
import kotlinx.coroutines.internal.C2165f;
import o8.InterfaceC2372d;

/* JADX INFO: renamed from: G8.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0560a0 {
    public static final void a(Z z9, int i9) {
        InterfaceC2372d interfaceC2372dC = z9.c();
        boolean z10 = i9 == 4;
        if (z10 || !(interfaceC2372dC instanceof C2165f) || b(i9) != b(z9.f2315d)) {
            d(z9, interfaceC2372dC, z10);
            return;
        }
        H h9 = ((C2165f) interfaceC2372dC).f43751e;
        o8.g context = interfaceC2372dC.getContext();
        if (h9.d0(context)) {
            h9.c0(context, z9);
        } else {
            e(z9);
        }
    }

    public static final boolean b(int i9) {
        return i9 == 1 || i9 == 2;
    }

    public static final boolean c(int i9) {
        return i9 == 2;
    }

    public static final void d(Z z9, InterfaceC2372d interfaceC2372d, boolean z10) {
        Object objE;
        Object objH = z9.h();
        Throwable thD = z9.d(objH);
        if (thD != null) {
            j.a aVar = k8.j.f43666c;
            objE = k8.k.a(thD);
        } else {
            j.a aVar2 = k8.j.f43666c;
            objE = z9.e(objH);
        }
        Object objB = k8.j.b(objE);
        if (!z10) {
            interfaceC2372d.resumeWith(objB);
            return;
        }
        C2165f c2165f = (C2165f) interfaceC2372d;
        InterfaceC2372d interfaceC2372d2 = c2165f.f43752f;
        Object obj = c2165f.f43754h;
        o8.g context = interfaceC2372d2.getContext();
        Object objC = kotlinx.coroutines.internal.C.c(context, obj);
        b1 b1VarG = objC != kotlinx.coroutines.internal.C.f43730a ? G.g(interfaceC2372d2, context, objC) : null;
        try {
            c2165f.f43752f.resumeWith(objB);
            k8.q qVar = k8.q.f43674a;
        } finally {
            if (b1VarG == null || b1VarG.P0()) {
                kotlinx.coroutines.internal.C.a(context, objC);
            }
        }
    }

    public static final void e(Z z9) {
        AbstractC0574h0 abstractC0574h0B = U0.f2306a.b();
        if (abstractC0574h0B.m0()) {
            abstractC0574h0B.i0(z9);
            return;
        }
        abstractC0574h0B.k0(true);
        try {
            d(z9, z9.c(), true);
            do {
            } while (abstractC0574h0B.p0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
