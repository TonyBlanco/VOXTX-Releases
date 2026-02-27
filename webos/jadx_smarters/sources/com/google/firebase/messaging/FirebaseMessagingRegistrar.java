package com.google.firebase.messaging;

import A5.f;
import I5.C0637c;
import I5.InterfaceC0639e;
import I5.r;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import d.AbstractC1617D;
import g6.d;
import h6.j;
import i6.InterfaceC1901a;
import java.util.Arrays;
import java.util.List;
import k6.h;
import s6.i;
import z2.InterfaceC3019g;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC0639e interfaceC0639e) {
        f fVar = (f) interfaceC0639e.a(f.class);
        AbstractC1617D.a(interfaceC0639e.a(InterfaceC1901a.class));
        return new FirebaseMessaging(fVar, null, interfaceC0639e.g(i.class), interfaceC0639e.g(j.class), (h) interfaceC0639e.a(h.class), (InterfaceC3019g) interfaceC0639e.a(InterfaceC3019g.class), (d) interfaceC0639e.a(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0637c> getComponents() {
        return Arrays.asList(C0637c.e(FirebaseMessaging.class).b(r.k(f.class)).b(r.h(InterfaceC1901a.class)).b(r.i(i.class)).b(r.i(j.class)).b(r.h(InterfaceC3019g.class)).b(r.k(h.class)).b(r.k(d.class)).f(new I5.h() { // from class: q6.A
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(interfaceC0639e);
            }
        }).c().d(), s6.h.b("fire-fcm", "23.0.0"));
    }
}
