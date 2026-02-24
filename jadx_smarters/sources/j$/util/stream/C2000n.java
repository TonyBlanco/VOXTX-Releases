package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2000n extends AbstractC1998m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f42713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2000n(AbstractC1940b abstractC1940b, InterfaceC2018q2 interfaceC2018q2, int i9) {
        super(interfaceC2018q2);
        this.f42712b = i9;
        this.f42713c = abstractC1940b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2000n(InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42712b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f42712b) {
            case 0:
                if (!((HashSet) this.f42713c).contains(obj)) {
                    ((HashSet) this.f42713c).add(obj);
                    this.f42708a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((C2034u) this.f42713c).f42756n).accept(obj);
                this.f42708a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((C2034u) this.f42713c).f42756n).test(obj)) {
                    this.f42708a.accept(obj);
                }
                break;
            case 3:
                this.f42708a.accept(((C1963f2) this.f42713c).f42646n.apply(obj));
                break;
            case 4:
                this.f42708a.accept(((ToIntFunction) ((X) this.f42713c).f42561n).applyAsInt(obj));
                break;
            case 5:
                this.f42708a.accept(((ToLongFunction) ((C1971h0) this.f42713c).f42675n).applyAsLong(obj));
                break;
            default:
                this.f42708a.accept(((ToDoubleFunction) ((C2059z) this.f42713c).f42800n).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public void l() {
        switch (this.f42712b) {
            case 0:
                this.f42713c = null;
                this.f42708a.l();
                break;
            default:
                super.l();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public void m(long j9) {
        switch (this.f42712b) {
            case 0:
                this.f42713c = new HashSet();
                this.f42708a.m(-1L);
                break;
            case 1:
            default:
                super.m(j9);
                break;
            case 2:
                this.f42708a.m(-1L);
                break;
        }
    }
}
