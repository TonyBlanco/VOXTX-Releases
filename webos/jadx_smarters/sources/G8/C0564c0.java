package G8;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: G8.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0564c0 implements InterfaceC0566d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future f2323a;

    public C0564c0(Future future) {
        this.f2323a = future;
    }

    @Override // G8.InterfaceC0566d0
    public void dispose() {
        this.f2323a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f2323a + ']';
    }
}
