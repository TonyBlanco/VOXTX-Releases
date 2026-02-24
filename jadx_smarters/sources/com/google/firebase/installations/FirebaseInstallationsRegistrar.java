package com.google.firebase.installations;

import A5.f;
import E5.a;
import E5.b;
import I5.C0637c;
import I5.F;
import I5.InterfaceC0639e;
import I5.r;
import J5.A;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import h6.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k6.g;
import k6.h;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h lambda$getComponents$0(InterfaceC0639e interfaceC0639e) {
        return new g((f) interfaceC0639e.a(f.class), interfaceC0639e.g(i.class), (ExecutorService) interfaceC0639e.b(F.a(a.class, ExecutorService.class)), A.a((Executor) interfaceC0639e.b(F.a(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0637c> getComponents() {
        return Arrays.asList(C0637c.e(h.class).h(LIBRARY_NAME).b(r.k(f.class)).b(r.i(i.class)).b(r.j(F.a(a.class, ExecutorService.class))).b(r.j(F.a(b.class, Executor.class))).f(new I5.h() { // from class: k6.j
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC0639e);
            }
        }).d(), h6.h.a(), s6.h.b(LIBRARY_NAME, "17.1.3"));
    }
}
