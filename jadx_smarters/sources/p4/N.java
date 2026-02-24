package p4;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2434i f46410a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f46411c;

    public N(O o9, C2434i c2434i) {
        this.f46411c = o9;
        this.f46410a = c2434i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        O o9 = this.f46411c;
        o9.f46416e.s0(o9.f46412a);
        O o10 = this.f46411c;
        o10.f46416e.f46519b.postDelayed(this, o10.f46413b);
    }
}
