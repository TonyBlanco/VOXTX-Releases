package Y3;

import d4.AbstractC1684a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements P3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10623a;

    public b(List list) {
        this.f10623a = Collections.unmodifiableList(list);
    }

    @Override // P3.i
    public int a(long j9) {
        return j9 < 0 ? 0 : -1;
    }

    @Override // P3.i
    public List b(long j9) {
        return j9 >= 0 ? this.f10623a : Collections.emptyList();
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
