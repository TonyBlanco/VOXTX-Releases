package t4;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.cast.zzdy;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2775b f50760f = new C2775b("RequestTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f50761g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50762a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f50765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f50766e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f50764c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f50763b = new zzdy(Looper.getMainLooper());

    public x(long j9) {
        this.f50762a = j9;
    }

    public static /* synthetic */ void a(x xVar) {
        synchronized (f50761g) {
            try {
                if (xVar.f50764c == -1) {
                    return;
                }
                xVar.h(15, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j9, v vVar) {
        v vVar2;
        long j10;
        Object obj = f50761g;
        synchronized (obj) {
            vVar2 = this.f50765d;
            j10 = this.f50764c;
            this.f50764c = j9;
            this.f50765d = vVar;
        }
        if (vVar2 != null) {
            vVar2.a(j10);
        }
        synchronized (obj) {
            try {
                Runnable runnable = this.f50766e;
                if (runnable != null) {
                    this.f50763b.removeCallbacks(runnable);
                }
                Runnable runnable2 = new Runnable() { // from class: t4.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a(this.f50759a);
                    }
                };
                this.f50766e = runnable2;
                this.f50763b.postDelayed(runnable2, this.f50762a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(int i9) {
        return h(AdError.CACHE_ERROR_CODE, null);
    }

    public final boolean d(long j9, int i9, Object obj) {
        synchronized (f50761g) {
            try {
                long j10 = this.f50764c;
                if (j10 == -1 || j10 != j9) {
                    return false;
                }
                g(i9, obj, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j9)));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        boolean z9;
        synchronized (f50761g) {
            z9 = this.f50764c != -1;
        }
        return z9;
    }

    public final boolean f(long j9) {
        boolean z9;
        synchronized (f50761g) {
            long j10 = this.f50764c;
            z9 = false;
            if (j10 != -1 && j10 == j9) {
                z9 = true;
            }
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        r4 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r4, java.lang.Object r5, java.lang.String r6) {
        /*
            r3 = this;
            t4.b r0 = t4.x.f50760f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.a(r6, r1)
            java.lang.Object r6 = t4.x.f50761g
            monitor-enter(r6)
            t4.v r0 = r3.f50765d     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            long r1 = r3.f50764c     // Catch: java.lang.Throwable -> L15
            r0.b(r1, r4, r5)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r4 = move-exception
            goto L33
        L17:
            r4 = -1
            r3.f50764c = r4     // Catch: java.lang.Throwable -> L15
            r4 = 0
            r3.f50765d = r4     // Catch: java.lang.Throwable -> L15
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L15
            java.lang.Runnable r5 = r3.f50766e     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto L27
        L23:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L25
            goto L2f
        L25:
            r4 = move-exception
            goto L31
        L27:
            android.os.Handler r0 = r3.f50763b     // Catch: java.lang.Throwable -> L25
            r0.removeCallbacks(r5)     // Catch: java.lang.Throwable -> L25
            r3.f50766e = r4     // Catch: java.lang.Throwable -> L25
            goto L23
        L2f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L15
            return
        L31:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L25
            throw r4     // Catch: java.lang.Throwable -> L15
        L33:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L15
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.x.g(int, java.lang.Object, java.lang.String):void");
    }

    public final boolean h(int i9, Object obj) {
        synchronized (f50761g) {
            try {
                long j9 = this.f50764c;
                if (j9 == -1) {
                    return false;
                }
                g(i9, null, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(j9)));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
