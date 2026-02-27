package V3;

import P3.i;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P3.b[] f10042a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10043c;

    public b(P3.b[] bVarArr, long[] jArr) {
        this.f10042a = bVarArr;
        this.f10043c = jArr;
    }

    @Override // P3.i
    public int a(long j9) {
        int iE = k0.e(this.f10043c, j9, false, false);
        if (iE < this.f10043c.length) {
            return iE;
        }
        return -1;
    }

    @Override // P3.i
    public List b(long j9) {
        P3.b bVar;
        int i9 = k0.i(this.f10043c, j9, true, false);
        return (i9 == -1 || (bVar = this.f10042a[i9]) == P3.b.f7184s) ? Collections.emptyList() : Collections.singletonList(bVar);
    }

    @Override // P3.i
    public long c(int i9) {
        AbstractC1684a.a(i9 >= 0);
        AbstractC1684a.a(i9 < this.f10043c.length);
        return this.f10043c[i9];
    }

    @Override // P3.i
    public int h() {
        return this.f10043c.length;
    }
}
