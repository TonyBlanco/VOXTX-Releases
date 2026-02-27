package W1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10204a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0133c f10205b = new C0133c();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lock f10206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10207b;

        public b() {
            this.f10206a = new ReentrantLock();
        }
    }

    /* JADX INFO: renamed from: W1.c$c, reason: collision with other inner class name */
    public static class C0133c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue f10208a;

        public C0133c() {
            this.f10208a = new ArrayDeque();
        }

        public b a() {
            b bVar;
            synchronized (this.f10208a) {
                bVar = (b) this.f10208a.poll();
            }
            return bVar == null ? new b() : bVar;
        }

        public void b(b bVar) {
            synchronized (this.f10208a) {
                try {
                    if (this.f10208a.size() < 10) {
                        this.f10208a.offer(bVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(S1.c cVar) {
        b bVarA;
        synchronized (this) {
            try {
                bVarA = (b) this.f10204a.get(cVar);
                if (bVarA == null) {
                    bVarA = this.f10205b.a();
                    this.f10204a.put(cVar, bVarA);
                }
                bVarA.f10207b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        bVarA.f10206a.lock();
    }

    public void b(S1.c cVar) {
        b bVar;
        int i9;
        synchronized (this) {
            try {
                bVar = (b) this.f10204a.get(cVar);
                if (bVar != null && (i9 = bVar.f10207b) > 0) {
                    int i10 = i9 - 1;
                    bVar.f10207b = i10;
                    if (i10 == 0) {
                        b bVar2 = (b) this.f10204a.remove(cVar);
                        if (!bVar2.equals(bVar)) {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", key: " + cVar);
                        }
                        this.f10205b.b(bVar2);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot release a lock that is not held, key: ");
                sb.append(cVar);
                sb.append(", interestedThreads: ");
                sb.append(bVar == null ? 0 : bVar.f10207b);
                throw new IllegalArgumentException(sb.toString());
            } finally {
            }
        }
        bVar.f10206a.unlock();
    }
}
