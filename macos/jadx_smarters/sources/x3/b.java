package X3;

import P3.i;
import d4.AbstractC1684a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f10453c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10454a;

    public b() {
        this.f10454a = Collections.emptyList();
    }

    public b(P3.b bVar) {
        this.f10454a = Collections.singletonList(bVar);
    }

    @Override // P3.i
    public int a(long j9) {
        return j9 < 0 ? 0 : -1;
    }

    @Override // P3.i
    public List b(long j9) {
        return j9 >= 0 ? this.f10454a : Collections.emptyList();
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
