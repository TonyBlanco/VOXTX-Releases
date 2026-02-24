package com.google.firebase.ktx;

import G8.AbstractC0590p0;
import G8.H;
import I5.C0637c;
import I5.F;
import I5.InterfaceC0639e;
import I5.h;
import I5.r;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.l;
import l8.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27923a = new a();

        @Override // I5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H a(InterfaceC0639e interfaceC0639e) {
            Object objB = interfaceC0639e.b(F.a(E5.a.class, Executor.class));
            l.d(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0590p0.a((Executor) objB);
        }
    }

    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27924a = new b();

        @Override // I5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H a(InterfaceC0639e interfaceC0639e) {
            Object objB = interfaceC0639e.b(F.a(E5.c.class, Executor.class));
            l.d(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0590p0.a((Executor) objB);
        }
    }

    public static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27925a = new c();

        @Override // I5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H a(InterfaceC0639e interfaceC0639e) {
            Object objB = interfaceC0639e.b(F.a(E5.b.class, Executor.class));
            l.d(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0590p0.a((Executor) objB);
        }
    }

    public static final class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27926a = new d();

        @Override // I5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H a(InterfaceC0639e interfaceC0639e) {
            Object objB = interfaceC0639e.b(F.a(E5.d.class, Executor.class));
            l.d(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0590p0.a((Executor) objB);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0637c> getComponents() {
        C0637c c0637cD = C0637c.c(F.a(E5.a.class, H.class)).b(r.j(F.a(E5.a.class, Executor.class))).f(a.f27923a).d();
        l.d(c0637cD, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0637c c0637cD2 = C0637c.c(F.a(E5.c.class, H.class)).b(r.j(F.a(E5.c.class, Executor.class))).f(b.f27924a).d();
        l.d(c0637cD2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0637c c0637cD3 = C0637c.c(F.a(E5.b.class, H.class)).b(r.j(F.a(E5.b.class, Executor.class))).f(c.f27925a).d();
        l.d(c0637cD3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0637c c0637cD4 = C0637c.c(F.a(E5.d.class, H.class)).b(r.j(F.a(E5.d.class, Executor.class))).f(d.f27926a).d();
        l.d(c0637cD4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return k.h(c0637cD, c0637cD2, c0637cD3, c0637cD4);
    }
}
