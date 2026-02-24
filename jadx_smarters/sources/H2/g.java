package h2;

import f2.C1763c;
import l2.InterfaceC2175b;

/* JADX INFO: loaded from: classes.dex */
public class g implements InterfaceC2175b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.e f41613a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S1.e f41614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S1.f f41615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S1.b f41616e;

    public g(InterfaceC2175b interfaceC2175b, InterfaceC2175b interfaceC2175b2, V1.b bVar) {
        C1851c c1851c = new C1851c(interfaceC2175b.f(), interfaceC2175b2.f(), bVar);
        this.f41613a = new C1763c(new e(c1851c));
        this.f41614c = c1851c;
        this.f41615d = new d(interfaceC2175b.e(), interfaceC2175b2.e());
        this.f41616e = interfaceC2175b.b();
    }

    @Override // l2.InterfaceC2175b
    public S1.b b() {
        return this.f41616e;
    }

    @Override // l2.InterfaceC2175b
    public S1.f e() {
        return this.f41615d;
    }

    @Override // l2.InterfaceC2175b
    public S1.e f() {
        return this.f41614c;
    }

    @Override // l2.InterfaceC2175b
    public S1.e g() {
        return this.f41613a;
    }
}
