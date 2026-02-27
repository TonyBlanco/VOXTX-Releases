package O1;

import d2.AbstractC1654d;
import d2.AbstractC1656f;
import d2.C1658h;
import d2.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends e {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final V1.b f5411E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AbstractC1656f f5412F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public S1.a f5413G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public S1.e f5414H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public S1.e f5415I;

    public a(l2.f fVar, Class cls, e eVar) {
        super(fVar, cls, eVar);
        this.f5412F = AbstractC1656f.f39525c;
        V1.b bVarL = eVar.f5429d.l();
        this.f5411E = bVarL;
        S1.a aVarM = eVar.f5429d.m();
        this.f5413G = aVarM;
        this.f5414H = new q(bVarL, aVarM);
        this.f5415I = new C1658h(bVarL, this.f5413G);
    }

    public a A() {
        return F(this.f5429d.k());
    }

    @Override // O1.e
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a q(int i9, int i10) {
        super.q(i9, i10);
        return this;
    }

    @Override // O1.e
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a s(S1.c cVar) {
        super.s(cVar);
        return this;
    }

    @Override // O1.e
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a t(boolean z9) {
        super.t(z9);
        return this;
    }

    @Override // O1.e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a v(S1.g... gVarArr) {
        super.v(gVarArr);
        return this;
    }

    public a F(AbstractC1654d... abstractC1654dArr) {
        super.v(abstractC1654dArr);
        return this;
    }

    @Override // O1.e
    public void d() {
        w();
    }

    @Override // O1.e
    public void e() {
        A();
    }

    public a w() {
        return F(this.f5429d.j());
    }

    @Override // O1.e
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public a h() {
        return (a) super.h();
    }

    @Override // O1.e
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a i(S1.e eVar) {
        super.i(eVar);
        return this;
    }

    @Override // O1.e
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public a j(U1.b bVar) {
        super.j(bVar);
        return this;
    }
}
