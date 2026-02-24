package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
final class Z1 extends AbstractC1938a2 {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f42581b++;
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f42581b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        this.f42581b += ((AbstractC1938a2) u12).f42581b;
    }
}
