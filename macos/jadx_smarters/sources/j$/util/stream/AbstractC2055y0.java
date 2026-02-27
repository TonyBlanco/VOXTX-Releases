package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2055y0 implements K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1952d1 f42790a = new C1952d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final G0 f42791b = new C1942b1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final I0 f42792c = new C1947c1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final E0 f42793d = new C1937a1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f42794e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f42795f = new long[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double[] f42796g = new double[0];

    AbstractC2055y0(EnumC1964f3 enumC1964f3) {
    }

    static long A(long j9, long j10, long j11) {
        if (j9 >= 0) {
            return Math.max(-1L, Math.min(j9 - j10, j11));
        }
        return -1L;
    }

    static long B(long j9, long j10) {
        long j11 = j10 >= 0 ? j9 + j10 : Long.MAX_VALUE;
        if (j11 >= 0) {
            return j11;
        }
        return Long.MAX_VALUE;
    }

    static Spliterator C(EnumC1964f3 enumC1964f3, Spliterator spliterator, long j9, long j10) {
        long j11 = j10 >= 0 ? j9 + j10 : Long.MAX_VALUE;
        long j12 = j11 >= 0 ? j11 : Long.MAX_VALUE;
        int i9 = AbstractC2062z2.f42805a[enumC1964f3.ordinal()];
        if (i9 == 1) {
            return new C2058y3(spliterator, j9, j12);
        }
        if (i9 == 2) {
            return new C2043v3((j$.util.H) spliterator, j9, j12);
        }
        if (i9 == 3) {
            return new C2048w3((j$.util.K) spliterator, j9, j12);
        }
        if (i9 == 4) {
            return new C2038u3((j$.util.E) spliterator, j9, j12);
        }
        throw new IllegalStateException("Unknown shape " + enumC1964f3);
    }

    static C0 D(long j9, IntFunction intFunction) {
        return (j9 < 0 || j9 >= 2147483639) ? new C2051x1() : new C1962f1(j9, intFunction);
    }

    public static K0 E(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9, IntFunction intFunction) {
        long jG = abstractC1940b.G(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            Q0 q02 = new Q0();
            q02.f42510a = intFunction;
            K0 k02 = (K0) new P0(abstractC1940b, spliterator, q02, new C2015q(14), 3).invoke();
            return z9 ? N(k02, intFunction) : k02;
        }
        if (jG >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jG);
        new C2041v1(spliterator, abstractC1940b, objArr).invoke();
        return new N0(objArr);
    }

    public static E0 F(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9) {
        long jG = abstractC1940b.G(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            E0 e02 = (E0) new P0(abstractC1940b, spliterator, new C2015q(8), new C2015q(9), 0).invoke();
            return z9 ? O(e02) : e02;
        }
        if (jG >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jG];
        new C2026s1(spliterator, abstractC1940b, dArr).invoke();
        return new X0(dArr);
    }

    public static G0 G(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9) {
        long jG = abstractC1940b.G(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            G0 g02 = (G0) new P0(abstractC1940b, spliterator, new C2015q(10), new C2015q(11), 1).invoke();
            return z9 ? P(g02) : g02;
        }
        if (jG >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jG];
        new C2031t1(spliterator, abstractC1940b, iArr).invoke();
        return new C1967g1(iArr);
    }

    public static I0 H(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9) {
        long jG = abstractC1940b.G(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            I0 i02 = (I0) new P0(abstractC1940b, spliterator, new C2015q(12), new C2015q(13), 2).invoke();
            return z9 ? Q(i02) : i02;
        }
        if (jG >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jG];
        new C2036u1(spliterator, abstractC1940b, jArr).invoke();
        return new C2012p1(jArr);
    }

    static M0 I(EnumC1964f3 enumC1964f3, K0 k02, K0 k03) {
        int i9 = L0.f42466a[enumC1964f3.ordinal()];
        if (i9 == 1) {
            return new W0(k02, k03);
        }
        if (i9 == 2) {
            return new T0((G0) k02, (G0) k03);
        }
        if (i9 == 3) {
            return new U0((I0) k02, (I0) k03);
        }
        if (i9 == 4) {
            return new S0((E0) k02, (E0) k03);
        }
        throw new IllegalStateException("Unknown shape " + enumC1964f3);
    }

    static InterfaceC2060z0 J(long j9) {
        return (j9 < 0 || j9 >= 2147483639) ? new Z0() : new Y0(j9);
    }

    public static F K(j$.util.E e9) {
        return new A(e9, EnumC1959e3.l(e9), false);
    }

    static AbstractC1957e1 L(EnumC1964f3 enumC1964f3) {
        K0 k02;
        int i9 = L0.f42466a[enumC1964f3.ordinal()];
        if (i9 == 1) {
            return f42790a;
        }
        if (i9 == 2) {
            k02 = f42791b;
        } else if (i9 == 3) {
            k02 = f42792c;
        } else {
            if (i9 != 4) {
                throw new IllegalStateException("Unknown shape " + enumC1964f3);
            }
            k02 = f42793d;
        }
        return (AbstractC1957e1) k02;
    }

    private static int M(long j9) {
        return (j9 != -1 ? EnumC1959e3.f42637u : 0) | EnumC1959e3.f42636t;
    }

    public static K0 N(K0 k02, IntFunction intFunction) {
        if (k02.r() <= 0) {
            return k02;
        }
        long jCount = k02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C2061z1(k02, objArr, 1).invoke();
        return new N0(objArr);
    }

    public static E0 O(E0 e02) {
        if (e02.r() <= 0) {
            return e02;
        }
        long jCount = e02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C2056y1(e02, dArr, 0).invoke();
        return new X0(dArr);
    }

    public static G0 P(G0 g02) {
        if (g02.r() <= 0) {
            return g02;
        }
        long jCount = g02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C2056y1(g02, iArr, 0).invoke();
        return new C1967g1(iArr);
    }

    public static I0 Q(I0 i02) {
        if (i02.r() <= 0) {
            return i02;
        }
        long jCount = i02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C2056y1(i02, jArr, 0).invoke();
        return new C2012p1(jArr);
    }

    public static C1935a R(Function function) {
        C1935a c1935a = new C1935a(8);
        c1935a.f42580b = function;
        return c1935a;
    }

    static A0 S(long j9) {
        return (j9 < 0 || j9 >= 2147483639) ? new C1977i1() : new C1972h1(j9);
    }

    public static IntStream T(j$.util.H h9) {
        return new C1936a0(h9, EnumC1959e3.l(h9), false);
    }

    static B0 U(long j9) {
        return (j9 < 0 || j9 >= 2147483639) ? new C2021r1() : new C2017q1(j9);
    }

    public static InterfaceC2001n0 V(j$.util.K k9) {
        return new C1976i0(k9, EnumC1959e3.l(k9), false);
    }

    public static F W(AbstractC1940b abstractC1940b, long j9, long j10) {
        if (j9 >= 0) {
            return new C2057y2(abstractC1940b, M(j10), j9, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j9);
    }

    public static C2045w0 X(EnumC2040v0 enumC2040v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC2040v0);
        return new C2045w0(EnumC1964f3.DOUBLE_VALUE, enumC2040v0, new C2006o0(enumC2040v0, 2));
    }

    public static IntStream Y(AbstractC1940b abstractC1940b, long j9, long j10) {
        if (j9 >= 0) {
            return new C2037u2(abstractC1940b, M(j10), j9, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j9);
    }

    public static C2045w0 Z(EnumC2040v0 enumC2040v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC2040v0);
        return new C2045w0(EnumC1964f3.INT_VALUE, enumC2040v0, new C2006o0(enumC2040v0, 1));
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC2001n0 a0(AbstractC1940b abstractC1940b, long j9, long j10) {
        if (j9 >= 0) {
            return new C2047w2(abstractC1940b, M(j10), j9, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j9);
    }

    public static C2045w0 b0(EnumC2040v0 enumC2040v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC2040v0);
        return new C2045w0(EnumC1964f3.LONG_VALUE, enumC2040v0, new C2006o0(enumC2040v0, 0));
    }

    public static C2045w0 c0(EnumC2040v0 enumC2040v0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC2040v0);
        return new C2045w0(EnumC1964f3.REFERENCE, enumC2040v0, new C2011p0(0, enumC2040v0, predicate));
    }

    public static Stream d0(AbstractC1940b abstractC1940b, long j9, long j10) {
        if (j9 >= 0) {
            return new C2027s2(abstractC1940b, M(j10), j9, j10);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j9);
    }

    public static void e(InterfaceC2003n2 interfaceC2003n2, Double d9) {
        if (N3.f42490a) {
            N3.a(interfaceC2003n2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC2003n2.accept(d9.doubleValue());
    }

    public static Stream f0(Spliterator spliterator, boolean z9) {
        Objects.requireNonNull(spliterator);
        return new C1968g2(spliterator, EnumC1959e3.l(spliterator), z9);
    }

    public static void g(InterfaceC2008o2 interfaceC2008o2, Integer num) {
        if (N3.f42490a) {
            N3.a(interfaceC2008o2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC2008o2.accept(num.intValue());
    }

    public static void i(InterfaceC2013p2 interfaceC2013p2, Long l9) {
        if (N3.f42490a) {
            N3.a(interfaceC2013p2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC2013p2.accept(l9.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(J0 j02, IntFunction intFunction) {
        if (N3.f42490a) {
            N3.a(j02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (j02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j02.count());
        j02.j(objArr, 0);
        return objArr;
    }

    public static void n(E0 e02, Double[] dArr, int i9) {
        if (N3.f42490a) {
            N3.a(e02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) e02.e();
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr[i9 + i10] = Double.valueOf(dArr2[i10]);
        }
    }

    public static void o(G0 g02, Integer[] numArr, int i9) {
        if (N3.f42490a) {
            N3.a(g02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) g02.e();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i9 + i10] = Integer.valueOf(iArr[i10]);
        }
    }

    public static void p(I0 i02, Long[] lArr, int i9) {
        if (N3.f42490a) {
            N3.a(i02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) i02.e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i9 + i10] = Long.valueOf(jArr[i10]);
        }
    }

    public static void q(E0 e02, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e02.f((DoubleConsumer) consumer);
        } else {
            if (N3.f42490a) {
                N3.a(e02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.E) e02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(G0 g02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g02.f((IntConsumer) consumer);
        } else {
            if (N3.f42490a) {
                N3.a(g02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.H) g02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(I0 i02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            i02.f((LongConsumer) consumer);
        } else {
            if (N3.f42490a) {
                N3.a(i02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.K) i02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static E0 t(E0 e02, long j9, long j10) {
        if (j9 == 0 && j10 == e02.count()) {
            return e02;
        }
        long j11 = j10 - j9;
        j$.util.E e9 = (j$.util.E) e02.spliterator();
        InterfaceC2060z0 interfaceC2060z0J = J(j11);
        interfaceC2060z0J.m(j11);
        for (int i9 = 0; i9 < j9 && e9.tryAdvance((DoubleConsumer) new D0(0)); i9++) {
        }
        if (j10 == e02.count()) {
            e9.forEachRemaining((DoubleConsumer) interfaceC2060z0J);
        } else {
            for (int i10 = 0; i10 < j11 && e9.tryAdvance((DoubleConsumer) interfaceC2060z0J); i10++) {
            }
        }
        interfaceC2060z0J.l();
        return interfaceC2060z0J.a();
    }

    public static G0 u(G0 g02, long j9, long j10) {
        if (j9 == 0 && j10 == g02.count()) {
            return g02;
        }
        long j11 = j10 - j9;
        j$.util.H h9 = (j$.util.H) g02.spliterator();
        A0 a0S = S(j11);
        a0S.m(j11);
        for (int i9 = 0; i9 < j9 && h9.tryAdvance((IntConsumer) new F0(0)); i9++) {
        }
        if (j10 == g02.count()) {
            h9.forEachRemaining((IntConsumer) a0S);
        } else {
            for (int i10 = 0; i10 < j11 && h9.tryAdvance((IntConsumer) a0S); i10++) {
            }
        }
        a0S.l();
        return a0S.a();
    }

    public static I0 v(I0 i02, long j9, long j10) {
        if (j9 == 0 && j10 == i02.count()) {
            return i02;
        }
        long j11 = j10 - j9;
        j$.util.K k9 = (j$.util.K) i02.spliterator();
        B0 b0U = U(j11);
        b0U.m(j11);
        for (int i9 = 0; i9 < j9 && k9.tryAdvance((LongConsumer) new H0(0)); i9++) {
        }
        if (j10 == i02.count()) {
            k9.forEachRemaining((LongConsumer) b0U);
        } else {
            for (int i10 = 0; i10 < j11 && k9.tryAdvance((LongConsumer) b0U); i10++) {
            }
        }
        b0U.l();
        return b0U.a();
    }

    public static K0 w(K0 k02, long j9, long j10, IntFunction intFunction) {
        if (j9 == 0 && j10 == k02.count()) {
            return k02;
        }
        Spliterator spliterator = k02.spliterator();
        long j11 = j10 - j9;
        C0 c0D = D(j11, intFunction);
        c0D.m(j11);
        for (int i9 = 0; i9 < j9 && spliterator.tryAdvance(new C2024s(28)); i9++) {
        }
        if (j10 == k02.count()) {
            spliterator.forEachRemaining(c0D);
        } else {
            for (int i10 = 0; i10 < j11 && spliterator.tryAdvance(c0D); i10++) {
            }
        }
        c0D.l();
        return c0D.a();
    }

    @Override // j$.util.stream.K3
    public Object b(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        U1 u1E0 = e0();
        abstractC1940b.V(spliterator, u1E0);
        return u1E0.get();
    }

    @Override // j$.util.stream.K3
    public Object c(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        return ((U1) new C1943b2(this, abstractC1940b, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.K3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract U1 e0();
}
