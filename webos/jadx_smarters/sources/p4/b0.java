package p4;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2429d f46441a;

    public b0(C2429d c2429d) {
        this.f46441a = c2429d;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C2429d.l(this.f46441a);
    }
}
