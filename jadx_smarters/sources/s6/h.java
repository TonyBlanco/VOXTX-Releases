package s6;

import I5.C0637c;
import I5.InterfaceC0639e;
import I5.r;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C0637c b(String str, String str2) {
        return C0637c.l(f.a(str, str2), f.class);
    }

    public static C0637c c(final String str, final a aVar) {
        return C0637c.m(f.class).b(r.k(Context.class)).f(new I5.h() { // from class: s6.g
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return h.d(str, aVar, interfaceC0639e);
            }
        }).d();
    }

    public static /* synthetic */ f d(String str, a aVar, InterfaceC0639e interfaceC0639e) {
        return f.a(str, aVar.a((Context) interfaceC0639e.a(Context.class)));
    }
}
