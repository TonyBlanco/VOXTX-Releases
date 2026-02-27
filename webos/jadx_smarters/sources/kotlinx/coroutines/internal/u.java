package kotlinx.coroutines.internal;

import G8.P;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u {
    public abstract AbstractC2162c a();

    public final boolean b(u uVar) {
        AbstractC2162c abstractC2162cA;
        AbstractC2162c abstractC2162cA2 = a();
        return (abstractC2162cA2 == null || (abstractC2162cA = uVar.a()) == null || abstractC2162cA2.f() >= abstractC2162cA.f()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return P.a(this) + '@' + P.b(this);
    }
}
