package com.google.firebase.datatransport;

import A2.a;
import C2.u;
import I5.C0637c;
import I5.InterfaceC0639e;
import I5.h;
import I5.r;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import z2.InterfaceC3019g;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3019g lambda$getComponents$0(InterfaceC0639e interfaceC0639e) {
        u.f((Context) interfaceC0639e.a(Context.class));
        return u.c().g(a.f76h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0637c> getComponents() {
        return Arrays.asList(C0637c.e(InterfaceC3019g.class).h(LIBRARY_NAME).b(r.k(Context.class)).f(new h() { // from class: a6.a
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return TransportRegistrar.lambda$getComponents$0(interfaceC0639e);
            }
        }).d(), s6.h.b(LIBRARY_NAME, "18.1.8"));
    }
}
