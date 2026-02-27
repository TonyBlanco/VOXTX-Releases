package j$.util.stream;

import j$.util.C1921e;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Q0 implements LongFunction, IntFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IntFunction f42510a;

    @Override // java.util.function.IntFunction
    public Object apply(int i9) {
        Object objApply = this.f42510a.apply(i9);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        C1921e.a("java.util.stream.IntStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j9) {
        return AbstractC2055y0.D(j9, this.f42510a);
    }
}
