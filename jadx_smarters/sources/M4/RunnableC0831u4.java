package M4;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzqo;

/* JADX INFO: renamed from: M4.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0831u4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5085a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0837v4 f5087d;

    public RunnableC0831u4(C0837v4 c0837v4, long j9, long j10) {
        this.f5087d = c0837v4;
        this.f5085a = j9;
        this.f5086c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5087d.f5101b.f4245a.f().z(new Runnable() { // from class: M4.t4
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC0831u4 runnableC0831u4 = this.f5077a;
                C0837v4 c0837v4 = runnableC0831u4.f5087d;
                long j9 = runnableC0831u4.f5085a;
                long j10 = runnableC0831u4.f5086c;
                c0837v4.f5101b.h();
                c0837v4.f5101b.f4245a.d().q().a("Application going to the background");
                c0837v4.f5101b.f4245a.F().f4417r.a(true);
                c0837v4.f5101b.s(true);
                if (!c0837v4.f5101b.f4245a.z().D()) {
                    c0837v4.f5101b.f5157f.b(j10);
                    c0837v4.f5101b.f5157f.d(false, false, j10);
                }
                zzqo.zzc();
                if (c0837v4.f5101b.f4245a.z().B(null, AbstractC0781m1.f4854D0)) {
                    c0837v4.f5101b.f4245a.d().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(j9));
                } else {
                    c0837v4.f5101b.f4245a.I().v("auto", "_ab", j9, new Bundle());
                }
            }
        });
    }
}
