package com.google.firebase.database;

import A5.f;
import F5.a;
import H5.InterfaceC0610a;
import I5.C0637c;
import I5.InterfaceC0639e;
import I5.h;
import I5.r;
import X5.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$getComponents$0(InterfaceC0639e interfaceC0639e) {
        return new b((f) interfaceC0639e.a(f.class), interfaceC0639e.i(InterfaceC0610a.class), interfaceC0639e.i(a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0637c> getComponents() {
        return Arrays.asList(C0637c.e(b.class).h(LIBRARY_NAME).b(r.k(f.class)).b(r.a(InterfaceC0610a.class)).b(r.a(a.class)).f(new h() { // from class: X5.a
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return DatabaseRegistrar.lambda$getComponents$0(interfaceC0639e);
            }
        }).d(), s6.h.b(LIBRARY_NAME, "20.3.0"));
    }
}
