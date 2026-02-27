package S3;

import P3.i;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9408a;

    public b(List list) {
        this.f9408a = list;
    }

    @Override // P3.i
    public int a(long j9) {
        return -1;
    }

    @Override // P3.i
    public List b(long j9) {
        return this.f9408a;
    }

    @Override // P3.i
    public long c(int i9) {
        return 0L;
    }

    @Override // P3.i
    public int h() {
        return 1;
    }
}
