package com.google.firebase.sessions;

import A5.f;
import E5.b;
import G8.H;
import I5.C0637c;
import I5.F;
import I5.InterfaceC0639e;
import I5.r;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import j6.InterfaceC2102b;
import java.util.List;
import k6.h;
import kotlin.jvm.internal.g;
import l8.k;
import org.jetbrains.annotations.NotNull;
import t6.l;
import z2.InterfaceC3019g;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    public static final a Companion = new a(null);
    private static final F firebaseApp = F.b(f.class);
    private static final F firebaseInstallationsApi = F.b(h.class);
    private static final F backgroundDispatcher = F.a(E5.a.class, H.class);
    private static final F blockingDispatcher = F.a(b.class, H.class);
    private static final F transportFactory = F.b(InterfaceC3019g.class);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final l m12getComponents$lambda0(InterfaceC0639e interfaceC0639e) {
        Object objB = interfaceC0639e.b(firebaseApp);
        kotlin.jvm.internal.l.d(objB, "container.get(firebaseApp)");
        f fVar = (f) objB;
        Object objB2 = interfaceC0639e.b(firebaseInstallationsApi);
        kotlin.jvm.internal.l.d(objB2, "container.get(firebaseInstallationsApi)");
        h hVar = (h) objB2;
        Object objB3 = interfaceC0639e.b(backgroundDispatcher);
        kotlin.jvm.internal.l.d(objB3, "container.get(backgroundDispatcher)");
        H h9 = (H) objB3;
        Object objB4 = interfaceC0639e.b(blockingDispatcher);
        kotlin.jvm.internal.l.d(objB4, "container.get(blockingDispatcher)");
        H h10 = (H) objB4;
        InterfaceC2102b interfaceC2102bE = interfaceC0639e.e(transportFactory);
        kotlin.jvm.internal.l.d(interfaceC2102bE, "container.getProvider(transportFactory)");
        return new l(fVar, hVar, h9, h10, interfaceC2102bE);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0637c> getComponents() {
        return k.h(C0637c.e(l.class).h(LIBRARY_NAME).b(r.j(firebaseApp)).b(r.j(firebaseInstallationsApi)).b(r.j(backgroundDispatcher)).b(r.j(blockingDispatcher)).b(r.l(transportFactory)).f(new I5.h() { // from class: t6.m
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return FirebaseSessionsRegistrar.m12getComponents$lambda0(interfaceC0639e);
            }
        }).d(), s6.h.b(LIBRARY_NAME, "1.0.2"));
    }
}
