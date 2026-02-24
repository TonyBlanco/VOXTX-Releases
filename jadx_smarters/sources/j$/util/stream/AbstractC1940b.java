package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1940b implements InterfaceC1970h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1940b f42584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1940b f42585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f42586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC1940b f42587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Spliterator f42590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f42593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42594k;

    AbstractC1940b(Spliterator spliterator, int i9, boolean z9) {
        this.f42585b = null;
        this.f42590g = spliterator;
        this.f42584a = this;
        int i10 = EnumC1959e3.f42623g & i9;
        this.f42586c = i10;
        this.f42589f = (~(i10 << 1)) & EnumC1959e3.f42628l;
        this.f42588e = 0;
        this.f42594k = z9;
    }

    AbstractC1940b(AbstractC1940b abstractC1940b, int i9) {
        if (abstractC1940b.f42591h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC1940b.f42591h = true;
        abstractC1940b.f42587d = this;
        this.f42585b = abstractC1940b;
        this.f42586c = EnumC1959e3.f42624h & i9;
        this.f42589f = EnumC1959e3.i(i9, abstractC1940b.f42589f);
        AbstractC1940b abstractC1940b2 = abstractC1940b.f42584a;
        this.f42584a = abstractC1940b2;
        if (Q()) {
            abstractC1940b2.f42592i = true;
        }
        this.f42588e = abstractC1940b.f42588e + 1;
    }

    private Spliterator S(int i9) {
        int i10;
        int i11;
        AbstractC1940b abstractC1940b = this.f42584a;
        Spliterator spliteratorP = abstractC1940b.f42590g;
        if (spliteratorP == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC1940b.f42590g = null;
        if (abstractC1940b.f42594k && abstractC1940b.f42592i) {
            AbstractC1940b abstractC1940b2 = abstractC1940b.f42587d;
            int i12 = 1;
            while (abstractC1940b != this) {
                int i13 = abstractC1940b2.f42586c;
                if (abstractC1940b2.Q()) {
                    if (EnumC1959e3.SHORT_CIRCUIT.q(i13)) {
                        i13 &= ~EnumC1959e3.f42637u;
                    }
                    spliteratorP = abstractC1940b2.P(abstractC1940b, spliteratorP);
                    if (spliteratorP.hasCharacteristics(64)) {
                        i10 = (~EnumC1959e3.f42636t) & i13;
                        i11 = EnumC1959e3.f42635s;
                    } else {
                        i10 = (~EnumC1959e3.f42635s) & i13;
                        i11 = EnumC1959e3.f42636t;
                    }
                    i13 = i10 | i11;
                    i12 = 0;
                }
                abstractC1940b2.f42588e = i12;
                abstractC1940b2.f42589f = EnumC1959e3.i(i13, abstractC1940b.f42589f);
                i12++;
                AbstractC1940b abstractC1940b3 = abstractC1940b2;
                abstractC1940b2 = abstractC1940b2.f42587d;
                abstractC1940b = abstractC1940b3;
            }
        }
        if (i9 != 0) {
            this.f42589f = EnumC1959e3.i(i9, this.f42589f);
        }
        return spliteratorP;
    }

    final void A(Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2) {
        Objects.requireNonNull(interfaceC2018q2);
        if (EnumC1959e3.SHORT_CIRCUIT.q(this.f42589f)) {
            B(spliterator, interfaceC2018q2);
            return;
        }
        interfaceC2018q2.m(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC2018q2);
        interfaceC2018q2.l();
    }

    final boolean B(Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2) {
        AbstractC1940b abstractC1940b = this;
        while (abstractC1940b.f42588e > 0) {
            abstractC1940b = abstractC1940b.f42585b;
        }
        interfaceC2018q2.m(spliterator.getExactSizeIfKnown());
        boolean zH = abstractC1940b.H(spliterator, interfaceC2018q2);
        interfaceC2018q2.l();
        return zH;
    }

    final K0 C(Spliterator spliterator, boolean z9, IntFunction intFunction) {
        if (this.f42584a.f42594k) {
            return F(this, spliterator, z9, intFunction);
        }
        C0 c0N = N(G(spliterator), intFunction);
        V(spliterator, c0N);
        return c0N.a();
    }

    final Object D(K3 k32) {
        if (this.f42591h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f42591h = true;
        return this.f42584a.f42594k ? k32.c(this, S(k32.d())) : k32.b(this, S(k32.d()));
    }

    final K0 E(IntFunction intFunction) {
        AbstractC1940b abstractC1940b;
        if (this.f42591h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f42591h = true;
        if (!this.f42584a.f42594k || (abstractC1940b = this.f42585b) == null || !Q()) {
            return C(S(0), true, intFunction);
        }
        this.f42588e = 0;
        return O(abstractC1940b, abstractC1940b.S(0), intFunction);
    }

    abstract K0 F(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9, IntFunction intFunction);

    final long G(Spliterator spliterator) {
        if (EnumC1959e3.SIZED.q(this.f42589f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean H(Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2);

    abstract EnumC1964f3 I();

    final EnumC1964f3 J() {
        AbstractC1940b abstractC1940b = this;
        while (abstractC1940b.f42588e > 0) {
            abstractC1940b = abstractC1940b.f42585b;
        }
        return abstractC1940b.I();
    }

    final int K() {
        return this.f42589f;
    }

    final boolean L() {
        return EnumC1959e3.ORDERED.q(this.f42589f);
    }

    final /* synthetic */ Spliterator M() {
        return S(0);
    }

    abstract C0 N(long j9, IntFunction intFunction);

    K0 O(AbstractC1940b abstractC1940b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator P(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        return O(abstractC1940b, spliterator, new C2015q(15)).spliterator();
    }

    abstract boolean Q();

    abstract InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2);

    final Spliterator T() {
        AbstractC1940b abstractC1940b = this.f42584a;
        if (this != abstractC1940b) {
            throw new IllegalStateException();
        }
        if (this.f42591h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f42591h = true;
        Spliterator spliterator = abstractC1940b.f42590g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC1940b.f42590g = null;
        return spliterator;
    }

    abstract Spliterator U(AbstractC1940b abstractC1940b, Supplier supplier, boolean z9);

    final InterfaceC2018q2 V(Spliterator spliterator, InterfaceC2018q2 interfaceC2018q2) {
        A(spliterator, W((InterfaceC2018q2) Objects.requireNonNull(interfaceC2018q2)));
        return interfaceC2018q2;
    }

    final InterfaceC2018q2 W(InterfaceC2018q2 interfaceC2018q2) {
        Objects.requireNonNull(interfaceC2018q2);
        AbstractC1940b abstractC1940b = this;
        while (abstractC1940b.f42588e > 0) {
            AbstractC1940b abstractC1940b2 = abstractC1940b.f42585b;
            interfaceC2018q2 = abstractC1940b.R(abstractC1940b2.f42589f, interfaceC2018q2);
            abstractC1940b = abstractC1940b2;
        }
        return interfaceC2018q2;
    }

    final Spliterator X(Spliterator spliterator) {
        return this.f42588e == 0 ? spliterator : U(this, new C1935a(spliterator, 6), this.f42584a.f42594k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f42591h = true;
        this.f42590g = null;
        AbstractC1940b abstractC1940b = this.f42584a;
        Runnable runnable = abstractC1940b.f42593j;
        if (runnable != null) {
            abstractC1940b.f42593j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final boolean isParallel() {
        return this.f42584a.f42594k;
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final InterfaceC1970h onClose(Runnable runnable) {
        if (this.f42591h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC1940b abstractC1940b = this.f42584a;
        Runnable runnable2 = abstractC1940b.f42593j;
        if (runnable2 != null) {
            runnable = new J3(runnable2, runnable);
        }
        abstractC1940b.f42593j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final InterfaceC1970h parallel() {
        this.f42584a.f42594k = true;
        return this;
    }

    @Override // j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final InterfaceC1970h sequential() {
        this.f42584a.f42594k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC1970h
    public Spliterator spliterator() {
        if (this.f42591h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f42591h = true;
        AbstractC1940b abstractC1940b = this.f42584a;
        if (this != abstractC1940b) {
            return U(this, new C1935a(this, 0), abstractC1940b.f42594k);
        }
        Spliterator spliterator = abstractC1940b.f42590g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC1940b.f42590g = null;
        return spliterator;
    }
}
