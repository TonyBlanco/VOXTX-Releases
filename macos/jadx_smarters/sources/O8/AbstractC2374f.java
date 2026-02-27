package o8;

import k8.j;
import k8.q;
import p8.AbstractC2511b;
import w8.l;
import w8.p;

/* JADX INFO: renamed from: o8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2374f {
    public static final void a(l lVar, InterfaceC2372d completion) {
        kotlin.jvm.internal.l.e(lVar, "<this>");
        kotlin.jvm.internal.l.e(completion, "completion");
        InterfaceC2372d interfaceC2372dC = AbstractC2511b.c(AbstractC2511b.a(lVar, completion));
        j.a aVar = j.f43666c;
        interfaceC2372dC.resumeWith(j.b(q.f43674a));
    }

    public static final void b(p pVar, Object obj, InterfaceC2372d completion) {
        kotlin.jvm.internal.l.e(pVar, "<this>");
        kotlin.jvm.internal.l.e(completion, "completion");
        InterfaceC2372d interfaceC2372dC = AbstractC2511b.c(AbstractC2511b.b(pVar, obj, completion));
        j.a aVar = j.f43666c;
        interfaceC2372dC.resumeWith(j.b(q.f43674a));
    }
}
