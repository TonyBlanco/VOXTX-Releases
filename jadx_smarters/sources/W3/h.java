package W3;

import P3.i;
import d4.k0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f10299a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f10301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f10302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f10303f;

    public h(d dVar, Map map, Map map2, Map map3) {
        this.f10299a = dVar;
        this.f10302e = map2;
        this.f10303f = map3;
        this.f10301d = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f10300c = dVar.j();
    }

    @Override // P3.i
    public int a(long j9) {
        int iE = k0.e(this.f10300c, j9, false, false);
        if (iE < this.f10300c.length) {
            return iE;
        }
        return -1;
    }

    @Override // P3.i
    public List b(long j9) {
        return this.f10299a.h(j9, this.f10301d, this.f10302e, this.f10303f);
    }

    @Override // P3.i
    public long c(int i9) {
        return this.f10300c[i9];
    }

    @Override // P3.i
    public int h() {
        return this.f10300c.length;
    }
}
