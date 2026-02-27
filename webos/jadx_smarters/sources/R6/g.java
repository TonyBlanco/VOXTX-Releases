package R6;

import java.util.Formatter;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f9343b;

    public g(c cVar) {
        this.f9342a = new c(cVar);
        this.f9343b = new d[(cVar.e() - cVar.g()) + 1];
    }

    public final c a() {
        return this.f9342a;
    }

    public final d b(int i9) {
        return this.f9343b[e(i9)];
    }

    public final d c(int i9) {
        d dVar;
        d dVar2;
        d dVarB = b(i9);
        if (dVarB != null) {
            return dVarB;
        }
        for (int i10 = 1; i10 < 5; i10++) {
            int iE = e(i9) - i10;
            if (iE >= 0 && (dVar2 = this.f9343b[iE]) != null) {
                return dVar2;
            }
            int iE2 = e(i9) + i10;
            d[] dVarArr = this.f9343b;
            if (iE2 < dVarArr.length && (dVar = dVarArr[iE2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    public final d[] d() {
        return this.f9343b;
    }

    public final int e(int i9) {
        return i9 - this.f9342a.g();
    }

    public final void f(int i9, d dVar) {
        this.f9343b[e(i9)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i9 = 0;
            for (d dVar : this.f9343b) {
                if (dVar == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i9));
                    i9++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i9), Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                    i9++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
