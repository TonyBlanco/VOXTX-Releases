package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class f4 extends AbstractC1955e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC1940b f42648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IntFunction f42649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f42650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f42651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f42652l;

    f4(AbstractC1940b abstractC1940b, AbstractC1940b abstractC1940b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC1940b2, spliterator);
        this.f42648h = abstractC1940b;
        this.f42649i = intFunction;
        this.f42650j = EnumC1959e3.ORDERED.q(abstractC1940b2.K());
    }

    f4(f4 f4Var, Spliterator spliterator) {
        super(f4Var, spliterator);
        this.f42648h = f4Var.f42648h;
        this.f42649i = f4Var.f42649i;
        this.f42650j = f4Var.f42650j;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final Object a() {
        boolean z9 = !d();
        C0 c0N = this.f42614a.N((z9 && this.f42650j && EnumC1959e3.SIZED.t(this.f42648h.f42586c)) ? this.f42648h.G(this.f42615b) : -1L, this.f42649i);
        e4 e4VarK = ((d4) this.f42648h).k(c0N, this.f42650j && z9);
        this.f42614a.V(this.f42615b, e4VarK);
        K0 k0A = c0N.a();
        this.f42651k = k0A.count();
        this.f42652l = e4VarK.g();
        return k0A;
    }

    @Override // j$.util.stream.AbstractC1955e
    protected final AbstractC1955e e(Spliterator spliterator) {
        return new f4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1955e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        K0 k0I;
        Object objC;
        K0 k0I2;
        AbstractC1955e abstractC1955e = this.f42617d;
        if (abstractC1955e != null) {
            if (this.f42650j) {
                f4 f4Var = (f4) abstractC1955e;
                long j9 = f4Var.f42652l;
                this.f42652l = j9;
                if (j9 == f4Var.f42651k) {
                    this.f42652l = j9 + ((f4) this.f42618e).f42652l;
                }
            }
            f4 f4Var2 = (f4) abstractC1955e;
            long j10 = f4Var2.f42651k;
            f4 f4Var3 = (f4) this.f42618e;
            this.f42651k = j10 + f4Var3.f42651k;
            if (f4Var2.f42651k == 0) {
                objC = f4Var3.c();
            } else if (f4Var3.f42651k == 0) {
                objC = f4Var2.c();
            } else {
                k0I = AbstractC2055y0.I(this.f42648h.I(), (K0) ((f4) this.f42617d).c(), (K0) ((f4) this.f42618e).c());
                k0I2 = k0I;
                if (d() && this.f42650j) {
                    k0I2 = k0I2.i(this.f42652l, k0I2.count(), this.f42649i);
                }
                f(k0I2);
            }
            k0I = (K0) objC;
            k0I2 = k0I;
            if (d()) {
                k0I2 = k0I2.i(this.f42652l, k0I2.count(), this.f42649i);
            }
            f(k0I2);
        }
        super.onCompletion(countedCompleter);
    }
}
