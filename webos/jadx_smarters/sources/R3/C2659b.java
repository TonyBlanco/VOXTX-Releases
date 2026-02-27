package r3;

import d4.L;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import q3.C2540a;
import q3.C2544e;
import q3.h;
import r5.AbstractC2675d;

/* JADX INFO: renamed from: r3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2659b extends h {
    public static C2540a c(L l9) {
        l9.r(12);
        int iD = (l9.d() + l9.h(12)) - 4;
        l9.r(44);
        l9.s(l9.h(12));
        l9.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (l9.d() >= iD) {
                break;
            }
            l9.r(48);
            int iH = l9.h(8);
            l9.r(4);
            int iD2 = l9.d() + l9.h(12);
            String strL2 = null;
            while (l9.d() < iD2) {
                int iH2 = l9.h(8);
                int iH3 = l9.h(8);
                int iD3 = l9.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = l9.h(16);
                    l9.r(8);
                    if (iH4 == 3) {
                        while (l9.d() < iD3) {
                            strL = l9.l(l9.h(8), AbstractC2675d.f49722a);
                            int iH5 = l9.h(8);
                            for (int i9 = 0; i9 < iH5; i9++) {
                                l9.s(l9.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = l9.l(iH3, AbstractC2675d.f49722a);
                }
                l9.p(iD3 * 8);
            }
            l9.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new C2658a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2540a(arrayList);
    }

    @Override // q3.h
    public C2540a b(C2544e c2544e, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new L(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
