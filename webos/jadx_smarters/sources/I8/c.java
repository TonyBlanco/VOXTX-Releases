package I8;

import G8.AbstractC0589p;
import G8.P;
import I8.h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.y;
import org.jetbrains.annotations.NotNull;
import t.AbstractC2755b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2972d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8.l f2973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.internal.k f2974c = new kotlinx.coroutines.internal.k();

    @NotNull
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a extends r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f2975e;

        public a(Object obj) {
            this.f2975e = obj;
        }

        @Override // I8.r
        public Object A() {
            return this.f2975e;
        }

        @Override // I8.r
        public y B(m.b bVar) {
            return AbstractC0589p.f2355a;
        }

        @Override // kotlinx.coroutines.internal.m
        public String toString() {
            return "SendBuffered@" + P.b(this) + '(' + this.f2975e + ')';
        }

        @Override // I8.r
        public void z() {
        }
    }

    public c(w8.l lVar) {
        this.f2973b = lVar;
    }

    @Override // I8.s
    public final Object a(Object obj) {
        h.b bVar;
        i iVarG;
        Object objM = m(obj);
        if (objM == b.f2967b) {
            return h.f2985b.c(k8.q.f43674a);
        }
        if (objM == b.f2968c) {
            iVarG = g();
            if (iVarG == null) {
                return h.f2985b.b();
            }
            bVar = h.f2985b;
        } else {
            if (!(objM instanceof i)) {
                throw new IllegalStateException(("trySend returned " + objM).toString());
            }
            bVar = h.f2985b;
            iVarG = (i) objM;
        }
        return bVar.a(k(iVarG));
    }

    @Override // I8.s
    public boolean c(Throwable th) {
        boolean z9;
        i iVar = new i(th);
        kotlinx.coroutines.internal.m mVar = this.f2974c;
        while (true) {
            kotlinx.coroutines.internal.m mVarQ = mVar.q();
            z9 = true;
            if (!(!(mVarQ instanceof i))) {
                z9 = false;
                break;
            }
            if (mVarQ.j(iVar, mVar)) {
                break;
            }
        }
        if (!z9) {
            iVar = (i) this.f2974c.q();
        }
        j(iVar);
        if (z9) {
            l(th);
        }
        return z9;
    }

    public final int e() {
        kotlinx.coroutines.internal.k kVar = this.f2974c;
        int i9 = 0;
        for (kotlinx.coroutines.internal.m mVarP = (kotlinx.coroutines.internal.m) kVar.o(); !kotlin.jvm.internal.l.a(mVarP, kVar); mVarP = mVarP.p()) {
            if (mVarP instanceof kotlinx.coroutines.internal.m) {
                i9++;
            }
        }
        return i9;
    }

    public String f() {
        return "";
    }

    public final i g() {
        kotlinx.coroutines.internal.m mVarQ = this.f2974c.q();
        i iVar = mVarQ instanceof i ? (i) mVarQ : null;
        if (iVar == null) {
            return null;
        }
        j(iVar);
        return iVar;
    }

    public final kotlinx.coroutines.internal.k h() {
        return this.f2974c;
    }

    public final String i() {
        String string;
        kotlinx.coroutines.internal.m mVarP = this.f2974c.p();
        if (mVarP == this.f2974c) {
            return "EmptyQueue";
        }
        if (mVarP instanceof i) {
            string = mVarP.toString();
        } else if (mVarP instanceof n) {
            string = "ReceiveQueued";
        } else if (mVarP instanceof r) {
            string = "SendQueued";
        } else {
            string = "UNEXPECTED:" + mVarP;
        }
        kotlinx.coroutines.internal.m mVarQ = this.f2974c.q();
        if (mVarQ == mVarP) {
            return string;
        }
        String str = string + ",queueSize=" + e();
        if (!(mVarQ instanceof i)) {
            return str;
        }
        return str + ",closedForSend=" + mVarQ;
    }

    public final void j(i iVar) {
        Object objB = kotlinx.coroutines.internal.h.b(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.m mVarQ = iVar.q();
            n nVar = mVarQ instanceof n ? (n) mVarQ : null;
            if (nVar == null) {
                break;
            } else if (nVar.u()) {
                objB = kotlinx.coroutines.internal.h.c(objB, nVar);
            } else {
                nVar.r();
            }
        }
        if (objB != null) {
            if (objB instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((n) arrayList.get(size)).B(iVar);
                }
            } else {
                ((n) objB).B(iVar);
            }
        }
        n(iVar);
    }

    public final Throwable k(i iVar) {
        j(iVar);
        return iVar.G();
    }

    public final void l(Throwable th) {
        y yVar;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (yVar = b.f2971f) || !AbstractC2755b.a(f2972d, this, obj, yVar)) {
            return;
        }
        ((w8.l) F.b(obj, 1)).invoke(th);
    }

    public Object m(Object obj) {
        p pVarP;
        do {
            pVarP = p();
            if (pVarP == null) {
                return b.f2968c;
            }
        } while (pVarP.f(obj, null) == null);
        pVarP.d(obj);
        return pVarP.a();
    }

    public void n(kotlinx.coroutines.internal.m mVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p o(Object obj) {
        kotlinx.coroutines.internal.m mVarQ;
        kotlinx.coroutines.internal.k kVar = this.f2974c;
        a aVar = new a(obj);
        do {
            mVarQ = kVar.q();
            if (mVarQ instanceof p) {
                return (p) mVarQ;
            }
        } while (!mVarQ.j(aVar, kVar));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.m] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public I8.p p() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.k r0 = r4.f2974c
        L2:
            java.lang.Object r1 = r0.o()
            kotlinx.coroutines.internal.m r1 = (kotlinx.coroutines.internal.m) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof I8.p
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            I8.p r2 = (I8.p) r2
            boolean r2 = r2 instanceof I8.i
            if (r2 == 0) goto L20
            boolean r2 = r1.t()
            if (r2 != 0) goto L20
            goto L26
        L20:
            kotlinx.coroutines.internal.m r2 = r1.w()
            if (r2 != 0) goto L29
        L26:
            I8.p r1 = (I8.p) r1
            return r1
        L29:
            r2.s()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: I8.c.p():I8.p");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final I8.r q() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.k r0 = r4.f2974c
        L2:
            java.lang.Object r1 = r0.o()
            kotlinx.coroutines.internal.m r1 = (kotlinx.coroutines.internal.m) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof I8.r
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            I8.r r2 = (I8.r) r2
            boolean r2 = r2 instanceof I8.i
            if (r2 == 0) goto L20
            boolean r2 = r1.t()
            if (r2 != 0) goto L20
            goto L26
        L20:
            kotlinx.coroutines.internal.m r2 = r1.w()
            if (r2 != 0) goto L29
        L26:
            I8.r r1 = (I8.r) r1
            return r1
        L29:
            r2.s()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: I8.c.q():I8.r");
    }

    public String toString() {
        return P.a(this) + '@' + P.b(this) + '{' + i() + '}' + f();
    }
}
