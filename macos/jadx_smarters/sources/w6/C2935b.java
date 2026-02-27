package w6;

import I5.C0637c;
import I5.InterfaceC0639e;
import I5.h;
import I5.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: w6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2935b implements j {
    public static /* synthetic */ Object c(String str, C0637c c0637c, InterfaceC0639e interfaceC0639e) {
        try {
            AbstractC2936c.b(str);
            return c0637c.h().a(interfaceC0639e);
        } finally {
            AbstractC2936c.a();
        }
    }

    @Override // I5.j
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C0637c c0637cT : componentRegistrar.getComponents()) {
            final String strI = c0637cT.i();
            if (strI != null) {
                c0637cT = c0637cT.t(new h() { // from class: w6.a
                    @Override // I5.h
                    public final Object a(InterfaceC0639e interfaceC0639e) {
                        return C2935b.c(strI, c0637cT, interfaceC0639e);
                    }
                });
            }
            arrayList.add(c0637cT);
        }
        return arrayList;
    }
}
