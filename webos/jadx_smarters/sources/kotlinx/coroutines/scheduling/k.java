package kotlinx.coroutines.scheduling;

import G8.P;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f43820d;

    public k(Runnable runnable, long j9, i iVar) {
        super(j9, iVar);
        this.f43820d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f43820d.run();
        } finally {
            this.f43818c.a();
        }
    }

    public String toString() {
        return "Task[" + P.a(this.f43820d) + '@' + P.b(this.f43820d) + ", " + this.f43817a + ", " + this.f43818c + ']';
    }
}
