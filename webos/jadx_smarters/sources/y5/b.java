package Y5;

import d.AbstractC1617D;
import j6.InterfaceC2101a;
import j6.InterfaceC2102b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Z5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2101a f10679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f10680b = new AtomicReference();

    public b(InterfaceC2101a interfaceC2101a) {
        this.f10679a = interfaceC2101a;
        interfaceC2101a.a(new InterfaceC2101a.InterfaceC0356a() { // from class: Y5.a
            @Override // j6.InterfaceC2101a.InterfaceC0356a
            public final void a(InterfaceC2102b interfaceC2102b) {
                this.f10678a.b(interfaceC2102b);
            }
        });
    }

    public final /* synthetic */ void b(InterfaceC2102b interfaceC2102b) {
        AtomicReference atomicReference = this.f10680b;
        AbstractC1617D.a(interfaceC2102b.get());
        atomicReference.set(null);
    }
}
