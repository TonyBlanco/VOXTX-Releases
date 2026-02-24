package M6;

import java.util.Map;
import x6.C2962c;
import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f5198i = new e();

    public static x6.o s(x6.o oVar) throws x6.g {
        String strF = oVar.f();
        if (strF.charAt(0) != '0') {
            throw x6.g.a();
        }
        x6.o oVar2 = new x6.o(strF.substring(1), null, oVar.e(), EnumC2960a.UPC_A);
        if (oVar.d() != null) {
            oVar2.g(oVar.d());
        }
        return oVar2;
    }

    @Override // M6.k, x6.m
    public x6.o a(C2962c c2962c) {
        return s(this.f5198i.a(c2962c));
    }

    @Override // M6.k, x6.m
    public x6.o b(C2962c c2962c, Map map) {
        return s(this.f5198i.b(c2962c, map));
    }

    @Override // M6.p, M6.k
    public x6.o c(int i9, D6.a aVar, Map map) {
        return s(this.f5198i.c(i9, aVar, map));
    }

    @Override // M6.p
    public int l(D6.a aVar, int[] iArr, StringBuilder sb) {
        return this.f5198i.l(aVar, iArr, sb);
    }

    @Override // M6.p
    public x6.o m(int i9, D6.a aVar, int[] iArr, Map map) {
        return s(this.f5198i.m(i9, aVar, iArr, map));
    }

    @Override // M6.p
    public EnumC2960a q() {
        return EnumC2960a.UPC_A;
    }
}
