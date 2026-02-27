package s4;

import android.os.Looper;
import com.google.android.gms.internal.cast.zzdy;
import java.util.TimerTask;
import p4.C2434i;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2434i f49958a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2709a f49959c;

    public l(AbstractActivityC2709a abstractActivityC2709a, C2434i c2434i) {
        this.f49959c = abstractActivityC2709a;
        this.f49958a = c2434i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        new zzdy(Looper.getMainLooper()).post(new k(this));
    }
}
