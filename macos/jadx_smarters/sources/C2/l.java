package C2;

import z2.EnumC3016d;
import z2.InterfaceC3018f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static void a(InterfaceC3018f interfaceC3018f, EnumC3016d enumC3016d) {
        if (!(interfaceC3018f instanceof s)) {
            G2.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", interfaceC3018f);
        } else {
            u.c().e().u(((s) interfaceC3018f).d().f(enumC3016d), 1);
        }
    }
}
