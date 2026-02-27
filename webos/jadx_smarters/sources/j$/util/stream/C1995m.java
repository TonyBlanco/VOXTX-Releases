package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1995m extends AbstractC1998m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42704b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f42705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f42706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1995m(O3 o32, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42706d = o32;
        this.f42705c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1995m(C1963f2 c1963f2, InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
        this.f42706d = c1963f2;
    }

    public /* synthetic */ C1995m(InterfaceC2018q2 interfaceC2018q2) {
        super(interfaceC2018q2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws Exception {
        switch (this.f42704b) {
            case 0:
                InterfaceC2018q2 interfaceC2018q2 = this.f42708a;
                if (obj != null) {
                    Object obj2 = this.f42706d;
                    if (obj2 != null && obj.equals(obj2)) {
                        return;
                    }
                } else {
                    if (this.f42705c) {
                        return;
                    }
                    this.f42705c = true;
                    obj = null;
                }
                this.f42706d = obj;
                interfaceC2018q2.accept(obj);
                return;
            case 1:
                Stream stream = (Stream) ((C1963f2) this.f42706d).f42646n.apply(obj);
                if (stream != null) {
                    try {
                        boolean z9 = this.f42705c;
                        InterfaceC2018q2 interfaceC2018q22 = this.f42708a;
                        if (z9) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC2018q22.o() && spliterator.tryAdvance(interfaceC2018q22)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(interfaceC2018q22);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f42705c) {
                    boolean zTest = ((O3) this.f42706d).f42498m.test(obj);
                    this.f42705c = zTest;
                    if (zTest) {
                        this.f42708a.accept(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public void l() {
        switch (this.f42704b) {
            case 0:
                this.f42705c = false;
                this.f42706d = null;
                this.f42708a.l();
                break;
            default:
                super.l();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        switch (this.f42704b) {
            case 0:
                this.f42705c = false;
                this.f42706d = null;
                this.f42708a.m(-1L);
                break;
            case 1:
                this.f42708a.m(-1L);
                break;
            default:
                this.f42708a.m(-1L);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public boolean o() {
        switch (this.f42704b) {
            case 1:
                this.f42705c = true;
                return this.f42708a.o();
            case 2:
                return !this.f42705c || this.f42708a.o();
            default:
                return super.o();
        }
    }
}
