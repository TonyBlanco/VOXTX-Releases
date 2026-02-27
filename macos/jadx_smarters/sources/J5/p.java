package J5;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t.AbstractC2754a;

/* JADX INFO: loaded from: classes3.dex */
public class p extends AbstractC2754a implements ScheduledFuture {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ScheduledFuture f3373i;

    public class a implements b {
        public a() {
        }

        @Override // J5.p.b
        public void a(Throwable th) {
            p.this.r(th);
        }

        @Override // J5.p.b
        public void set(Object obj) {
            p.this.q(obj);
        }
    }

    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    public interface c {
        ScheduledFuture a(b bVar);
    }

    public p(c cVar) {
        this.f3373i = cVar.a(new a());
    }

    @Override // t.AbstractC2754a
    public void b() {
        this.f3373i.cancel(t());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f3373i.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f3373i.compareTo(delayed);
    }
}
