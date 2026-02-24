package J8;

import java.util.Arrays;
import k8.j;
import k8.q;
import kotlin.jvm.internal.l;
import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f3395a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3397d;

    public final d c() {
        d dVarD;
        synchronized (this) {
            try {
                d[] dVarArrE = this.f3395a;
                if (dVarArrE == null) {
                    dVarArrE = e(2);
                    this.f3395a = dVarArrE;
                } else if (this.f3396c >= dVarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrE, dVarArrE.length * 2);
                    l.d(objArrCopyOf, "copyOf(this, newSize)");
                    this.f3395a = (d[]) objArrCopyOf;
                    dVarArrE = (d[]) objArrCopyOf;
                }
                int i9 = this.f3397d;
                do {
                    dVarD = dVarArrE[i9];
                    if (dVarD == null) {
                        dVarD = d();
                        dVarArrE[i9] = dVarD;
                    }
                    i9++;
                    if (i9 >= dVarArrE.length) {
                        i9 = 0;
                    }
                } while (!dVarD.a(this));
                this.f3397d = i9;
                this.f3396c++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarD;
    }

    public abstract d d();

    public abstract d[] e(int i9);

    public final void f(d dVar) {
        int i9;
        InterfaceC2372d[] interfaceC2372dArrB;
        synchronized (this) {
            try {
                int i10 = this.f3396c - 1;
                this.f3396c = i10;
                if (i10 == 0) {
                    this.f3397d = 0;
                }
                interfaceC2372dArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC2372d interfaceC2372d : interfaceC2372dArrB) {
            if (interfaceC2372d != null) {
                j.a aVar = k8.j.f43666c;
                interfaceC2372d.resumeWith(k8.j.b(q.f43674a));
            }
        }
    }

    public final d[] g() {
        return this.f3395a;
    }
}
