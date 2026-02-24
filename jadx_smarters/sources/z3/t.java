package Z3;

import B3.g0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends AbstractC1069c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f11254i;

    public t(g0 g0Var, int i9, int i10) {
        this(g0Var, i9, i10, 0, null);
    }

    public t(g0 g0Var, int i9, int i10, int i11, Object obj) {
        super(g0Var, new int[]{i9}, i10);
        this.f11253h = i11;
        this.f11254i = obj;
    }

    @Override // Z3.s
    public int b() {
        return 0;
    }

    @Override // Z3.s
    public Object g() {
        return this.f11254i;
    }

    @Override // Z3.s
    public int q() {
        return this.f11253h;
    }

    @Override // Z3.s
    public void r(long j9, long j10, long j11, List list, D3.o[] oVarArr) {
    }
}
