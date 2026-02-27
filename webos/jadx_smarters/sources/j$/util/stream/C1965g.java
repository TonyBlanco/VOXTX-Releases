package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1965g implements BaseStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1970h f42653a;

    private /* synthetic */ C1965g(InterfaceC1970h interfaceC1970h) {
        this.f42653a = interfaceC1970h;
    }

    public static /* synthetic */ BaseStream k(InterfaceC1970h interfaceC1970h) {
        if (interfaceC1970h == null) {
            return null;
        }
        return interfaceC1970h instanceof C1960f ? ((C1960f) interfaceC1970h).f42644a : interfaceC1970h instanceof F ? E.k((F) interfaceC1970h) : interfaceC1970h instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC1970h) : interfaceC1970h instanceof InterfaceC2001n0 ? C1996m0.k((InterfaceC2001n0) interfaceC1970h) : interfaceC1970h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC1970h) : new C1965g(interfaceC1970h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.f42653a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1970h interfaceC1970h = this.f42653a;
        if (obj instanceof C1965g) {
            obj = ((C1965g) obj).f42653a;
        }
        return interfaceC1970h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42653a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f42653a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f42653a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return k(this.f42653a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return k(this.f42653a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return k(this.f42653a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f42653a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return k(this.f42653a.unordered());
    }
}
