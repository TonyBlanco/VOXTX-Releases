package kotlinx.coroutines.internal;

import G8.AbstractC0574h0;
import G8.C0587o;
import G8.H;
import G8.InterfaceC0585n;
import G8.P;
import G8.U0;
import G8.Z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import q8.InterfaceC2646e;
import t.AbstractC2755b;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2165f extends Z implements InterfaceC2646e, InterfaceC2372d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43750i = AtomicReferenceFieldUpdater.newUpdater(C2165f.class, Object.class, "_reusableCancellableContinuation");

    @NotNull
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H f43751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2372d f43752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f43753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f43754h;

    public C2165f(H h9, InterfaceC2372d interfaceC2372d) {
        super(-1);
        this.f43751e = h9;
        this.f43752f = interfaceC2372d;
        this.f43753g = AbstractC2166g.f43755a;
        this.f43754h = C.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // G8.Z
    public void a(Object obj, Throwable th) {
        if (obj instanceof G8.C) {
            ((G8.C) obj).f2263b.invoke(th);
        }
    }

    @Override // G8.Z
    public InterfaceC2372d c() {
        return this;
    }

    @Override // q8.InterfaceC2646e
    public InterfaceC2646e getCallerFrame() {
        InterfaceC2372d interfaceC2372d = this.f43752f;
        if (interfaceC2372d instanceof InterfaceC2646e) {
            return (InterfaceC2646e) interfaceC2372d;
        }
        return null;
    }

    @Override // o8.InterfaceC2372d
    public o8.g getContext() {
        return this.f43752f.getContext();
    }

    @Override // G8.Z
    public Object h() {
        Object obj = this.f43753g;
        this.f43753g = AbstractC2166g.f43755a;
        return obj;
    }

    public final void i() {
        while (this._reusableCancellableContinuation == AbstractC2166g.f43756b) {
        }
    }

    public final C0587o j() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = AbstractC2166g.f43756b;
                return null;
            }
            if (obj instanceof C0587o) {
                if (AbstractC2755b.a(f43750i, this, obj, AbstractC2166g.f43756b)) {
                    return (C0587o) obj;
                }
            } else if (obj != AbstractC2166g.f43756b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final C0587o k() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C0587o) {
            return (C0587o) obj;
        }
        return null;
    }

    public final boolean l() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean m(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            y yVar = AbstractC2166g.f43756b;
            if (kotlin.jvm.internal.l.a(obj, yVar)) {
                if (AbstractC2755b.a(f43750i, this, yVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC2755b.a(f43750i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void n() {
        i();
        C0587o c0587oK = k();
        if (c0587oK != null) {
            c0587oK.n();
        }
    }

    public final Throwable o(InterfaceC0585n interfaceC0585n) {
        y yVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            yVar = AbstractC2166g.f43756b;
            if (obj != yVar) {
                if (obj instanceof Throwable) {
                    if (AbstractC2755b.a(f43750i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC2755b.a(f43750i, this, yVar, interfaceC0585n));
        return null;
    }

    @Override // o8.InterfaceC2372d
    public void resumeWith(Object obj) {
        o8.g context = this.f43752f.getContext();
        Object objD = G8.F.d(obj, null, 1, null);
        if (this.f43751e.d0(context)) {
            this.f43753g = objD;
            this.f2315d = 0;
            this.f43751e.c0(context, this);
            return;
        }
        AbstractC0574h0 abstractC0574h0B = U0.f2306a.b();
        if (abstractC0574h0B.m0()) {
            this.f43753g = objD;
            this.f2315d = 0;
            abstractC0574h0B.i0(this);
            return;
        }
        abstractC0574h0B.k0(true);
        try {
            o8.g context2 = getContext();
            Object objC = C.c(context2, this.f43754h);
            try {
                this.f43752f.resumeWith(obj);
                k8.q qVar = k8.q.f43674a;
                while (abstractC0574h0B.p0()) {
                }
            } finally {
                C.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f43751e + ", " + P.c(this.f43752f) + ']';
    }
}
