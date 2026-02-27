package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1973h2 extends AbstractC1978i2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f42676l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1973h2(AbstractC1940b abstractC1940b, int i9, int i10) {
        super(abstractC1940b, i9);
        this.f42676l = i10;
    }

    @Override // j$.util.stream.AbstractC1940b
    final boolean Q() {
        switch (this.f42676l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC1970h
    public final InterfaceC1970h unordered() {
        switch (this.f42676l) {
            case 0:
                if (!L()) {
                }
                break;
            default:
                if (!L()) {
                }
                break;
        }
        return new C1958e2(this, EnumC1959e3.f42634r, 1);
    }
}
