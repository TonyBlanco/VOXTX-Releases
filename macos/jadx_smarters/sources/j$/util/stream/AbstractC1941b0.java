package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1941b0 extends AbstractC1946c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f42595l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1941b0(AbstractC1940b abstractC1940b, int i9, int i10) {
        super(abstractC1940b, i9);
        this.f42595l = i10;
    }

    @Override // j$.util.stream.AbstractC1940b
    final boolean Q() {
        switch (this.f42595l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        switch (this.f42595l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        switch (this.f42595l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f42595l) {
        }
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final InterfaceC1970h unordered() {
        switch (this.f42595l) {
            case 0:
                if (!L()) {
                }
                break;
            default:
                if (!L()) {
                }
                break;
        }
        return new C2044w(this, EnumC1959e3.f42634r, 2);
    }
}
