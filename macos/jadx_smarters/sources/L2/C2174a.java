package l2;

import Z1.l;
import i2.InterfaceC1881c;

/* JADX INFO: renamed from: l2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2174a implements f, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f43874a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public S1.e f43875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S1.e f43876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S1.f f43877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1881c f43878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public S1.b f43879g;

    public C2174a(f fVar) {
        this.f43874a = fVar;
    }

    @Override // l2.InterfaceC2175b
    public S1.b b() {
        S1.b bVar = this.f43879g;
        return bVar != null ? bVar : this.f43874a.b();
    }

    @Override // l2.f
    public InterfaceC1881c d() {
        InterfaceC1881c interfaceC1881c = this.f43878f;
        return interfaceC1881c != null ? interfaceC1881c : this.f43874a.d();
    }

    @Override // l2.InterfaceC2175b
    public S1.f e() {
        S1.f fVar = this.f43877e;
        return fVar != null ? fVar : this.f43874a.e();
    }

    @Override // l2.InterfaceC2175b
    public S1.e f() {
        S1.e eVar = this.f43876d;
        return eVar != null ? eVar : this.f43874a.f();
    }

    @Override // l2.InterfaceC2175b
    public S1.e g() {
        S1.e eVar = this.f43875c;
        return eVar != null ? eVar : this.f43874a.g();
    }

    @Override // l2.f
    public l h() {
        return this.f43874a.h();
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C2174a clone() {
        try {
            return (C2174a) super.clone();
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
        }
    }

    public void j(S1.e eVar) {
        this.f43876d = eVar;
    }

    public void k(S1.b bVar) {
        this.f43879g = bVar;
    }
}
