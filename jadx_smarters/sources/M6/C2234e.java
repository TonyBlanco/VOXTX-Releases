package m6;

import java.util.concurrent.TimeUnit;
import k6.p;

/* JADX INFO: renamed from: m6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2234e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f44426d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f44427e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f44428a = p.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44430c;

    public static boolean c(int i9) {
        return i9 == 429 || (i9 >= 500 && i9 < 600);
    }

    public static boolean d(int i9) {
        return (i9 >= 200 && i9 < 300) || i9 == 401 || i9 == 404;
    }

    public final synchronized long a(int i9) {
        if (c(i9)) {
            return (long) Math.min(Math.pow(2.0d, this.f44430c) + this.f44428a.e(), f44427e);
        }
        return f44426d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f44430c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            k6.p r0 = r5.f44428a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L14
            long r2 = r5.f44429b     // Catch: java.lang.Throwable -> L14
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r5)
            return r0
        L19:
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.C2234e.b():boolean");
    }

    public final synchronized void e() {
        this.f44430c = 0;
    }

    public synchronized void f(int i9) {
        if (d(i9)) {
            e();
            return;
        }
        this.f44430c++;
        this.f44429b = this.f44428a.a() + a(i9);
    }
}
