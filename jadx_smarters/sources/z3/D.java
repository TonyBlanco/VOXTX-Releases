package Z3;

import O2.F1;
import O2.V1;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F1[] f11082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s[] f11083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V1 f11084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11085e;

    public D(F1[] f1Arr, s[] sVarArr, V1 v12, Object obj) {
        this.f11082b = f1Arr;
        this.f11083c = (s[]) sVarArr.clone();
        this.f11084d = v12;
        this.f11085e = obj;
        this.f11081a = f1Arr.length;
    }

    public boolean a(D d9) {
        if (d9 == null || d9.f11083c.length != this.f11083c.length) {
            return false;
        }
        for (int i9 = 0; i9 < this.f11083c.length; i9++) {
            if (!b(d9, i9)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(D d9, int i9) {
        return d9 != null && k0.c(this.f11082b[i9], d9.f11082b[i9]) && k0.c(this.f11083c[i9], d9.f11083c[i9]);
    }

    public boolean c(int i9) {
        return this.f11082b[i9] != null;
    }
}
