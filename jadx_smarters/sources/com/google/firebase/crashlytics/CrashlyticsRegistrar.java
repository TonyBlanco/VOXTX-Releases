package com.google.firebase.crashlytics;

import A5.f;
import I5.C0637c;
import I5.InterfaceC0639e;
import I5.r;
import K5.g;
import L5.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k6.h;
import t6.l;
import u6.C2856a;
import u6.InterfaceC2857b;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        C2856a.f51213a.a(InterfaceC2857b.a.CRASHLYTICS);
    }

    public final g b(InterfaceC0639e interfaceC0639e) {
        return g.a((f) interfaceC0639e.a(f.class), (h) interfaceC0639e.a(h.class), (l) interfaceC0639e.a(l.class), interfaceC0639e.i(a.class), interfaceC0639e.i(C5.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C0637c.e(g.class).h("fire-cls").b(r.k(f.class)).b(r.k(h.class)).b(r.k(l.class)).b(r.a(a.class)).b(r.a(C5.a.class)).f(new I5.h() { // from class: K5.f
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return this.f3817a.b(interfaceC0639e);
            }
        }).e().d(), s6.h.b("fire-cls", "18.4.1"));
    }
}
