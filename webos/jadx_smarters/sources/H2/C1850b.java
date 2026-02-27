package h2;

import U1.l;

/* JADX INFO: renamed from: h2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1850b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1849a f41598a;

    public C1850b(C1849a c1849a) {
        if (c1849a == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f41598a = c1849a;
    }

    @Override // U1.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1849a get() {
        return this.f41598a;
    }

    @Override // U1.l
    public void b() {
        l lVarA = this.f41598a.a();
        if (lVarA != null) {
            lVarA.b();
        }
        l lVarB = this.f41598a.b();
        if (lVarB != null) {
            lVarB.b();
        }
    }

    @Override // U1.l
    public int getSize() {
        return this.f41598a.c();
    }
}
