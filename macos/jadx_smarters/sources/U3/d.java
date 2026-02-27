package U3;

import P3.i;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9764a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9765c;

    public d(List list, List list2) {
        this.f9764a = list;
        this.f9765c = list2;
    }

    @Override // P3.i
    public int a(long j9) {
        int iD = k0.d(this.f9765c, Long.valueOf(j9), false, false);
        if (iD < this.f9765c.size()) {
            return iD;
        }
        return -1;
    }

    @Override // P3.i
    public List b(long j9) {
        int iG = k0.g(this.f9765c, Long.valueOf(j9), true, false);
        return iG == -1 ? Collections.emptyList() : (List) this.f9764a.get(iG);
    }

    @Override // P3.i
    public long c(int i9) {
        AbstractC1684a.a(i9 >= 0);
        AbstractC1684a.a(i9 < this.f9765c.size());
        return ((Long) this.f9765c.get(i9)).longValue();
    }

    @Override // P3.i
    public int h() {
        return this.f9765c.size();
    }
}
