package M4;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class L4 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S4 f4364b;

    public L4(S4 s42, f5 f5Var) {
        this.f4364b = s42;
        this.f4363a = f5Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        K2 k2C0 = this.f4364b.c0((String) com.google.android.gms.common.internal.r.m(this.f4363a.f4686f));
        J2 j22 = J2.ANALYTICS_STORAGE;
        if (k2C0.j(j22) && K2.c(this.f4363a.f4681A, 100).j(j22)) {
            return this.f4364b.S(this.f4363a).m0();
        }
        this.f4364b.d().v().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
