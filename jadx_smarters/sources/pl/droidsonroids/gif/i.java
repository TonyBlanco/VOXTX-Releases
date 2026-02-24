package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class i extends j {
    public i(a aVar) {
        super(aVar);
    }

    @Override // pl.droidsonroids.gif.j
    public void a() {
        a aVar = this.f46738a;
        long jQ = aVar.f46710h.q(aVar.f46709g);
        if (jQ >= 0) {
            this.f46738a.f46706d = SystemClock.uptimeMillis() + jQ;
            if (this.f46738a.isVisible() && this.f46738a.f46705c) {
                a aVar2 = this.f46738a;
                if (!aVar2.f46715m) {
                    aVar2.f46704a.remove(this);
                    a aVar3 = this.f46738a;
                    aVar3.f46719q = aVar3.f46704a.schedule(this, jQ, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f46738a.f46711i.isEmpty() && this.f46738a.b() == this.f46738a.f46710h.i() - 1) {
                a aVar4 = this.f46738a;
                aVar4.f46716n.sendEmptyMessageAtTime(aVar4.c(), this.f46738a.f46706d);
            }
        } else {
            a aVar5 = this.f46738a;
            aVar5.f46706d = Long.MIN_VALUE;
            aVar5.f46705c = false;
        }
        if (!this.f46738a.isVisible() || this.f46738a.f46716n.hasMessages(-1)) {
            return;
        }
        this.f46738a.f46716n.sendEmptyMessageAtTime(-1, 0L);
    }
}
