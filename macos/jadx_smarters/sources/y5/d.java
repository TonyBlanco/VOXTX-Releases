package Y5;

import H5.InterfaceC0610a;
import j6.InterfaceC2101a;
import j6.InterfaceC2102b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class d implements Z5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2101a f10682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f10683b = new AtomicReference();

    public d(InterfaceC2101a interfaceC2101a) {
        this.f10682a = interfaceC2101a;
        interfaceC2101a.a(new InterfaceC2101a.InterfaceC0356a() { // from class: Y5.c
            @Override // j6.InterfaceC2101a.InterfaceC0356a
            public final void a(InterfaceC2102b interfaceC2102b) {
                this.f10681a.b(interfaceC2102b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC2102b interfaceC2102b) {
        this.f10683b.set((InterfaceC0610a) interfaceC2102b.get());
    }
}
