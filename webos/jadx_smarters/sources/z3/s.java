package Z3;

import B3.C;
import B3.g0;
import O2.C0936z0;
import O2.Q1;
import b4.InterfaceC1215f;
import d4.AbstractC1681B;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface s extends v {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g0 f11250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f11251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11252c;

        public a(g0 g0Var, int... iArr) {
            this(g0Var, iArr, 0);
        }

        public a(g0 g0Var, int[] iArr, int i9) {
            if (iArr.length == 0) {
                AbstractC1681B.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f11250a = g0Var;
            this.f11251b = iArr;
            this.f11252c = i9;
        }
    }

    public interface b {
        s[] a(a[] aVarArr, InterfaceC1215f interfaceC1215f, C.b bVar, Q1 q12);
    }

    boolean a(int i9, long j9);

    int b();

    void disable();

    boolean e(int i9, long j9);

    void enable();

    void f(float f9);

    Object g();

    void h();

    boolean j(long j9, D3.f fVar, List list);

    void m(boolean z9);

    int n(long j9, List list);

    int o();

    C0936z0 p();

    int q();

    void r(long j9, long j10, long j11, List list, D3.o[] oVarArr);

    void s();
}
