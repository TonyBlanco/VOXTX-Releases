package Q3;

import P3.i;
import d4.AbstractC1684a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8015a;

    public f(List list) {
        this.f8015a = list;
    }

    @Override // P3.i
    public int a(long j9) {
        return j9 < 0 ? 0 : -1;
    }

    @Override // P3.i
    public List b(long j9) {
        return j9 >= 0 ? this.f8015a : Collections.emptyList();
    }

    @Override // P3.i
    public long c(int i9) {
        AbstractC1684a.a(i9 == 0);
        return 0L;
    }

    @Override // P3.i
    public int h() {
        return 1;
    }
}
