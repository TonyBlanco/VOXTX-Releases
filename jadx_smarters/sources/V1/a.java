package V1;

import java.util.Queue;
import q2.AbstractC2539h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f9846a = AbstractC2539h.c(20);

    public abstract f a();

    public f b() {
        f fVar = (f) this.f9846a.poll();
        return fVar == null ? a() : fVar;
    }

    public void c(f fVar) {
        if (this.f9846a.size() < 20) {
            this.f9846a.offer(fVar);
        }
    }
}
