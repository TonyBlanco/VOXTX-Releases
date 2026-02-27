package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
abstract class E2 extends AbstractC1998m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Comparator f42417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f42418c;

    E2(InterfaceC2018q2 interfaceC2018q2, Comparator comparator) {
        super(interfaceC2018q2);
        this.f42417b = comparator;
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        this.f42418c = true;
        return false;
    }
}
