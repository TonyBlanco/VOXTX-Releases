package I8;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.G;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.y;

/* JADX INFO: loaded from: classes4.dex */
public class l extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantLock f2990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2991f;

    public l(w8.l lVar) {
        super(lVar);
        this.f2990e = new ReentrantLock();
        this.f2991f = b.f2966a;
    }

    public final G C(Object obj) {
        w8.l lVar;
        Object obj2 = this.f2991f;
        G gD = null;
        if (obj2 != b.f2966a && (lVar = this.f2973b) != null) {
            gD = t.d(lVar, obj2, null, 2, null);
        }
        this.f2991f = obj;
        return gD;
    }

    @Override // I8.c
    public String f() {
        ReentrantLock reentrantLock = this.f2990e;
        reentrantLock.lock();
        try {
            return "(value=" + this.f2991f + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // I8.c
    public Object m(Object obj) {
        p pVarP;
        ReentrantLock reentrantLock = this.f2990e;
        reentrantLock.lock();
        try {
            i iVarG = g();
            if (iVarG != null) {
                return iVarG;
            }
            if (this.f2991f == b.f2966a) {
                do {
                    pVarP = p();
                    if (pVarP != null) {
                        if (pVarP instanceof i) {
                            return pVarP;
                        }
                        kotlin.jvm.internal.l.b(pVarP);
                    }
                } while (pVarP.f(obj, null) == null);
                k8.q qVar = k8.q.f43674a;
                reentrantLock.unlock();
                pVarP.d(obj);
                return pVarP.a();
            }
            G gC = C(obj);
            if (gC == null) {
                return b.f2967b;
            }
            throw gC;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // I8.a
    public boolean u(n nVar) {
        ReentrantLock reentrantLock = this.f2990e;
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
        ReentrantLock reentrantLock = this.f2990e;
        reentrantLock.lock();
        try {
            return this.f2991f == b.f2966a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // I8.a
    public Object z() {
        ReentrantLock reentrantLock = this.f2990e;
        reentrantLock.lock();
        try {
            Object obj = this.f2991f;
            y yVar = b.f2966a;
            if (obj != yVar) {
                this.f2991f = yVar;
                k8.q qVar = k8.q.f43674a;
                return obj;
            }
            Object objG = g();
            if (objG == null) {
                objG = b.f2969d;
            }
            return objG;
        } finally {
            reentrantLock.unlock();
        }
    }
}
