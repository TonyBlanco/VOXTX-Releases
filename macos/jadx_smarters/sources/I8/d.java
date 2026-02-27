package I8;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.y;
import l8.AbstractC2212g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class d extends I8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f2977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f2978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f2979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2980i;

    @NotNull
    private volatile /* synthetic */ int size;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2981a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            f2981a = iArr;
        }
    }

    public d(int i9, e eVar, w8.l lVar) {
        super(lVar);
        this.f2976e = i9;
        this.f2977f = eVar;
        if (i9 < 1) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i9 + " was specified").toString());
        }
        this.f2978g = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i9, 8)];
        AbstractC2212g.l(objArr, b.f2966a, 0, 0, 6, null);
        this.f2979h = objArr;
        this.size = 0;
    }

    public final void C(int i9, Object obj) {
        if (i9 < this.f2976e) {
            D(i9);
            Object[] objArr = this.f2979h;
            objArr[(this.f2980i + i9) % objArr.length] = obj;
        } else {
            Object[] objArr2 = this.f2979h;
            int i10 = this.f2980i;
            objArr2[i10 % objArr2.length] = null;
            objArr2[(i9 + i10) % objArr2.length] = obj;
            this.f2980i = (i10 + 1) % objArr2.length;
        }
    }

    public final void D(int i9) {
        Object[] objArr = this.f2979h;
        if (i9 >= objArr.length) {
            int iMin = Math.min(objArr.length * 2, this.f2976e);
            Object[] objArr2 = new Object[iMin];
            for (int i10 = 0; i10 < i9; i10++) {
                Object[] objArr3 = this.f2979h;
                objArr2[i10] = objArr3[(this.f2980i + i10) % objArr3.length];
            }
            AbstractC2212g.j(objArr2, b.f2966a, i9, iMin);
            this.f2979h = objArr2;
            this.f2980i = 0;
        }
    }

    public final y E(int i9) {
        if (i9 < this.f2976e) {
            this.size = i9 + 1;
            return null;
        }
        int i10 = a.f2981a[this.f2977f.ordinal()];
        if (i10 == 1) {
            return b.f2968c;
        }
        if (i10 == 2) {
            return b.f2967b;
        }
        if (i10 == 3) {
            return null;
        }
        throw new k8.h();
    }

    @Override // I8.c
    public String f() {
        return "(buffer:capacity=" + this.f2976e + ",size=" + this.size + ')';
    }

    @Override // I8.c
    public Object m(Object obj) {
        p pVarP;
        ReentrantLock reentrantLock = this.f2978g;
        reentrantLock.lock();
        try {
            int i9 = this.size;
            i iVarG = g();
            if (iVarG != null) {
                return iVarG;
            }
            y yVarE = E(i9);
            if (yVarE != null) {
                return yVarE;
            }
            if (i9 == 0) {
                do {
                    pVarP = p();
                    if (pVarP != null) {
                        if (pVarP instanceof i) {
                            this.size = i9;
                            return pVarP;
                        }
                        kotlin.jvm.internal.l.b(pVarP);
                    }
                } while (pVarP.f(obj, null) == null);
                this.size = i9;
                k8.q qVar = k8.q.f43674a;
                reentrantLock.unlock();
                pVarP.d(obj);
                return pVarP.a();
            }
            C(i9, obj);
            return b.f2967b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // I8.a
    public boolean u(n nVar) {
        ReentrantLock reentrantLock = this.f2978g;
        reentrantLock.lock();
        try {
            return super.u(nVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // I8.a
    public final boolean v() {
        return false;
    }

    @Override // I8.a
    public final boolean w() {
        return this.size == 0;
    }

    @Override // I8.a
    public Object z() {
        ReentrantLock reentrantLock = this.f2978g;
        reentrantLock.lock();
        try {
            int i9 = this.size;
            if (i9 == 0) {
                Object objG = g();
                if (objG == null) {
                    objG = b.f2969d;
                }
                return objG;
            }
            Object[] objArr = this.f2979h;
            int i10 = this.f2980i;
            Object obj = objArr[i10];
            r rVar = null;
            objArr[i10] = null;
            this.size = i9 - 1;
            Object objA = b.f2969d;
            boolean z9 = false;
            if (i9 == this.f2976e) {
                r rVar2 = null;
                while (true) {
                    r rVarQ = q();
                    if (rVarQ == null) {
                        rVar = rVar2;
                        break;
                    }
                    kotlin.jvm.internal.l.b(rVarQ);
                    if (rVarQ.B(null) != null) {
                        objA = rVarQ.A();
                        rVar = rVarQ;
                        z9 = true;
                        break;
                    }
                    rVarQ.C();
                    rVar2 = rVarQ;
                }
            }
            if (objA != b.f2969d && !(objA instanceof i)) {
                this.size = i9;
                Object[] objArr2 = this.f2979h;
                objArr2[(this.f2980i + i9) % objArr2.length] = objA;
            }
            this.f2980i = (this.f2980i + 1) % this.f2979h.length;
            k8.q qVar = k8.q.f43674a;
            if (z9) {
                kotlin.jvm.internal.l.b(rVar);
                rVar.z();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
