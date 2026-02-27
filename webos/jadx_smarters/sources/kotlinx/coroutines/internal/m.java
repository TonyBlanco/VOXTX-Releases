package kotlinx.coroutines.internal;

import G8.P;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import t.AbstractC2755b;

/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43764a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43765c = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_prev");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43766d = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_removedRef");

    @NotNull
    volatile /* synthetic */ Object _next = this;

    @NotNull
    volatile /* synthetic */ Object _prev = this;

    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends AbstractC2162c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f43767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m f43768c;

        public a(m mVar) {
            this.f43767b = mVar;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2162c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(m mVar, Object obj) {
            boolean z9 = obj == null;
            m mVar2 = z9 ? this.f43767b : this.f43768c;
            if (mVar2 != null && AbstractC2755b.a(m.f43764a, mVar, this, mVar2) && z9) {
                m mVar3 = this.f43767b;
                m mVar4 = this.f43768c;
                kotlin.jvm.internal.l.b(mVar4);
                mVar3.n(mVar4);
            }
        }
    }

    public static final class b extends u {
    }

    public final void i(m mVar) {
        while (!q().j(mVar, this)) {
        }
    }

    public final boolean j(m mVar, m mVar2) {
        f43765c.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43764a;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        if (!AbstractC2755b.a(atomicReferenceFieldUpdater, this, mVar2, mVar)) {
            return false;
        }
        mVar.n(mVar2);
        return true;
    }

    public final boolean k(m mVar) {
        f43765c.lazySet(mVar, this);
        f43764a.lazySet(mVar, this);
        while (o() == this) {
            if (AbstractC2755b.a(f43764a, this, this, mVar)) {
                mVar.n(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (t.AbstractC2755b.a(kotlinx.coroutines.internal.m.f43764a, r3, r2, ((kotlinx.coroutines.internal.v) r4).f43784a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.m l(kotlinx.coroutines.internal.u r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.m r0 = (kotlinx.coroutines.internal.m) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.m.f43765c
            boolean r0 = t.AbstractC2755b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.t()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.u
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.u r0 = (kotlinx.coroutines.internal.u) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.u r4 = (kotlinx.coroutines.internal.u) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.v
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.m.f43764a
            kotlinx.coroutines.internal.v r4 = (kotlinx.coroutines.internal.v) r4
            kotlinx.coroutines.internal.m r4 = r4.f43784a
            boolean r2 = t.AbstractC2755b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.m r2 = (kotlinx.coroutines.internal.m) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.m r3 = (kotlinx.coroutines.internal.m) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.m.l(kotlinx.coroutines.internal.u):kotlinx.coroutines.internal.m");
    }

    public final m m(m mVar) {
        while (mVar.t()) {
            mVar = (m) mVar._prev;
        }
        return mVar;
    }

    public final void n(m mVar) {
        m mVar2;
        do {
            mVar2 = (m) mVar._prev;
            if (o() != mVar) {
                return;
            }
        } while (!AbstractC2755b.a(f43765c, mVar, mVar2, this));
        if (t()) {
            mVar.l(null);
        }
    }

    public final Object o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof u)) {
                return obj;
            }
            ((u) obj).c(this);
        }
    }

    public final m p() {
        return l.b(o());
    }

    public final m q() {
        m mVarL = l(null);
        return mVarL == null ? m((m) this._prev) : mVarL;
    }

    public final void r() {
        ((v) o()).f43784a.s();
    }

    public final void s() {
        m mVar = this;
        while (true) {
            Object objO = mVar.o();
            if (!(objO instanceof v)) {
                mVar.l(null);
                return;
            }
            mVar = ((v) objO).f43784a;
        }
    }

    public boolean t() {
        return o() instanceof v;
    }

    public String toString() {
        return new kotlin.jvm.internal.u(this) { // from class: kotlinx.coroutines.internal.m.c
            @Override // C8.j
            public Object get() {
                return P.a(this.receiver);
            }
        } + '@' + P.b(this);
    }

    public boolean u() {
        return w() == null;
    }

    public final m v() {
        while (true) {
            m mVar = (m) o();
            if (mVar == this) {
                return null;
            }
            if (mVar.u()) {
                return mVar;
            }
            mVar.r();
        }
    }

    public final m w() {
        Object objO;
        m mVar;
        do {
            objO = o();
            if (objO instanceof v) {
                return ((v) objO).f43784a;
            }
            if (objO == this) {
                return (m) objO;
            }
            mVar = (m) objO;
        } while (!AbstractC2755b.a(f43764a, this, objO, mVar.x()));
        mVar.l(null);
        return null;
    }

    public final v x() {
        v vVar = (v) this._removedRef;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this);
        f43766d.lazySet(this, vVar2);
        return vVar2;
    }

    public final int y(m mVar, m mVar2, a aVar) {
        f43765c.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43764a;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        aVar.f43768c = mVar2;
        if (AbstractC2755b.a(atomicReferenceFieldUpdater, this, mVar2, aVar)) {
            return aVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }
}
