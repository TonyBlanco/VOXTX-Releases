package kotlinx.coroutines.flow;

import k8.q;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f43716a;

    public k(p pVar) {
        this.f43716a = pVar;
    }

    @Override // kotlinx.coroutines.flow.a
    public Object a(c cVar, InterfaceC2372d interfaceC2372d) {
        Object objInvoke = this.f43716a.invoke(cVar, interfaceC2372d);
        return objInvoke == AbstractC2512c.d() ? objInvoke : q.f43674a;
    }
}
