package j$.util.stream;

import j$.util.C1921e;
import j$.util.Spliterator;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1935a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42580b;

    public /* synthetic */ C1935a(int i9) {
        this.f42579a = i9;
    }

    public /* synthetic */ C1935a(Object obj, int i9) {
        this.f42579a = i9;
        this.f42580b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f42579a) {
            case 1:
                ((InterfaceC2018q2) this.f42580b).accept(obj);
                break;
            default:
                ((List) this.f42580b).add(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f42579a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d9) {
        Object objApply = ((DoubleFunction) this.f42580b).apply(d9);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof F) {
            return E.k((F) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return D.k((DoubleStream) objApply);
        }
        C1921e.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j9) {
        Object objApply = ((LongFunction) this.f42580b).apply(j9);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC2001n0) {
            return C1996m0.k((InterfaceC2001n0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C1991l0.k((LongStream) objApply);
        }
        C1921e.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f42580b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return C1944b3.k((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof F) {
            return E.k((F) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return D.k((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC2001n0) {
            return C1996m0.k((InterfaceC2001n0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C1991l0.k((LongStream) objApply);
        }
        C1921e.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f42579a) {
            case 0:
                return ((AbstractC1940b) this.f42580b).M();
            default:
                return (Spliterator) this.f42580b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f42579a) {
            case 2:
                C2014p3 c2014p3 = (C2014p3) this.f42580b;
                return c2014p3.f42662d.tryAdvance(c2014p3.f42663e);
            case 3:
                C2023r3 c2023r3 = (C2023r3) this.f42580b;
                return c2023r3.f42662d.tryAdvance(c2023r3.f42663e);
            case 4:
                C2033t3 c2033t3 = (C2033t3) this.f42580b;
                return c2033t3.f42662d.tryAdvance(c2033t3.f42663e);
            default:
                I3 i32 = (I3) this.f42580b;
                return i32.f42662d.tryAdvance(i32.f42663e);
        }
    }
}
