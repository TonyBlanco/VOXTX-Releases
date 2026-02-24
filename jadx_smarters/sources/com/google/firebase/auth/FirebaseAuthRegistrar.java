package com.google.firebase.auth;

import A5.f;
import E5.d;
import H5.InterfaceC0610a;
import H5.h0;
import I5.C0637c;
import I5.F;
import I5.InterfaceC0639e;
import I5.h;
import I5.r;
import androidx.annotation.Keep;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import h6.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(F f9, F f10, F f11, F f12, F f13, InterfaceC0639e interfaceC0639e) {
        return new h0((f) interfaceC0639e.a(f.class), interfaceC0639e.g(F5.a.class), interfaceC0639e.g(i.class), (Executor) interfaceC0639e.b(f9), (Executor) interfaceC0639e.b(f10), (Executor) interfaceC0639e.b(f11), (ScheduledExecutorService) interfaceC0639e.b(f12), (Executor) interfaceC0639e.b(f13));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0637c> getComponents() {
        final F fA = F.a(E5.a.class, Executor.class);
        final F fA2 = F.a(E5.b.class, Executor.class);
        final F fA3 = F.a(E5.c.class, Executor.class);
        final F fA4 = F.a(E5.c.class, ScheduledExecutorService.class);
        final F fA5 = F.a(d.class, Executor.class);
        return Arrays.asList(C0637c.f(FirebaseAuth.class, InterfaceC0610a.class).b(r.k(f.class)).b(r.m(i.class)).b(r.j(fA)).b(r.j(fA2)).b(r.j(fA3)).b(r.j(fA4)).b(r.j(fA5)).b(r.i(F5.a.class)).f(new h() { // from class: G5.T
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(fA, fA2, fA3, fA4, fA5, interfaceC0639e);
            }
        }).d(), h6.h.a(), s6.h.b("fire-auth", "22.3.0"));
    }
}
