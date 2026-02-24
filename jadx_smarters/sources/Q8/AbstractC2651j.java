package q8;

import o8.InterfaceC2372d;

/* JADX INFO: renamed from: q8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2651j extends AbstractC2642a {
    public AbstractC2651j(InterfaceC2372d interfaceC2372d) {
        super(interfaceC2372d);
        if (interfaceC2372d != null && interfaceC2372d.getContext() != o8.h.f46144a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // o8.InterfaceC2372d
    public o8.g getContext() {
        return o8.h.f46144a;
    }
}
