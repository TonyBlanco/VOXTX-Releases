package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1981j0 extends AbstractC1986k0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f42685l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1981j0(AbstractC1940b abstractC1940b, int i9, int i10) {
        super(abstractC1940b, i9);
        this.f42685l = i10;
    }

    @Override // j$.util.stream.AbstractC1940b
    final boolean Q() {
        switch (this.f42685l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC1940b, j$.util.stream.InterfaceC1970h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ InterfaceC2001n0 parallel() {
        switch (this.f42685l) {
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
    public final /* bridge */ /* synthetic */ InterfaceC2001n0 sequential() {
        switch (this.f42685l) {
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
        switch (this.f42685l) {
        }
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final InterfaceC1970h unordered() {
        switch (this.f42685l) {
            case 0:
                if (!L()) {
                }
                break;
            default:
                if (!L()) {
                }
                break;
        }
        return new C2049x(this, EnumC1959e3.f42634r, 4);
    }
}
