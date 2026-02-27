package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
final class G1 extends AbstractC2055y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f42430h;

    public /* synthetic */ G1(int i9) {
        this.f42430h = i9;
    }

    @Override // j$.util.stream.AbstractC2055y0, j$.util.stream.K3
    public final Object b(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        switch (this.f42430h) {
            case 0:
                if (!EnumC1959e3.SIZED.q(abstractC1940b.K())) {
                }
                break;
            case 1:
                if (!EnumC1959e3.SIZED.q(abstractC1940b.K())) {
                }
                break;
            case 2:
                if (!EnumC1959e3.SIZED.q(abstractC1940b.K())) {
                }
                break;
            default:
                if (!EnumC1959e3.SIZED.q(abstractC1940b.K())) {
                }
                break;
        }
        return (Long) super.b(abstractC1940b, spliterator);
    }

    @Override // j$.util.stream.AbstractC2055y0, j$.util.stream.K3
    public final Object c(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        switch (this.f42430h) {
            case 0:
                if (!EnumC1959e3.SIZED.q(abstractC1940b.K())) {
                }
                break;
            case 1:
                if (!EnumC1959e3.SIZED.q(abstractC1940b.K())) {
                }
                break;
            case 2:
                if (!EnumC1959e3.SIZED.q(abstractC1940b.K())) {
                }
                break;
            default:
                if (!EnumC1959e3.SIZED.q(abstractC1940b.K())) {
                }
                break;
        }
        return (Long) super.c(abstractC1940b, spliterator);
    }

    @Override // j$.util.stream.AbstractC2055y0, j$.util.stream.K3
    public final int d() {
        switch (this.f42430h) {
        }
        return EnumC1959e3.f42634r;
    }

    @Override // j$.util.stream.AbstractC2055y0
    public final U1 e0() {
        switch (this.f42430h) {
            case 0:
                return new Y1();
            case 1:
                return new W1();
            case 2:
                return new Z1();
            default:
                return new X1();
        }
    }
}
