package d2;

import c2.C1248a;
import f2.C1763c;
import l2.InterfaceC2175b;

/* JADX INFO: renamed from: d2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1657g implements InterfaceC2175b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.e f39528a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1658h f39529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1652b f39530d = new C1652b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S1.b f39531e = C1248a.b();

    public C1657g(V1.b bVar, S1.a aVar) {
        this.f39528a = new C1763c(new q(bVar, aVar));
        this.f39529c = new C1658h(bVar, aVar);
    }

    @Override // l2.InterfaceC2175b
    public S1.b b() {
        return this.f39531e;
    }

    @Override // l2.InterfaceC2175b
    public S1.f e() {
        return this.f39530d;
    }

    @Override // l2.InterfaceC2175b
    public S1.e f() {
        return this.f39529c;
    }

    @Override // l2.InterfaceC2175b
    public S1.e g() {
        return this.f39528a;
    }
}
