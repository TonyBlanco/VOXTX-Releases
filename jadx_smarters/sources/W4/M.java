package w4;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends O {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Callable f51638f;

    public /* synthetic */ M(Callable callable, L l9) {
        super();
        this.f51638f = callable;
    }

    @Override // w4.O
    public final String a() {
        try {
            return (String) this.f51638f.call();
        } catch (Exception e9) {
            throw new RuntimeException(e9);
        }
    }
}
