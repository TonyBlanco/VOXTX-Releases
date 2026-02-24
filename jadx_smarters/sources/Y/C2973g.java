package y;

import y.C2972f;

/* JADX INFO: renamed from: y.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2973g extends C2972f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f52053m;

    public C2973g(AbstractC2979m abstractC2979m) {
        super(abstractC2979m);
        this.f52045e = abstractC2979m instanceof C2976j ? C2972f.a.HORIZONTAL_DIMENSION : C2972f.a.VERTICAL_DIMENSION;
    }

    @Override // y.C2972f
    public void d(int i9) {
        if (this.f52050j) {
            return;
        }
        this.f52050j = true;
        this.f52047g = i9;
        for (InterfaceC2970d interfaceC2970d : this.f52051k) {
            interfaceC2970d.a(interfaceC2970d);
        }
    }
}
