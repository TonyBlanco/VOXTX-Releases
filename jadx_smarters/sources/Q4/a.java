package Q4;

import C4.h;
import C4.o;
import C4.q;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f8016r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile ScheduledExecutorService f8017s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f8018t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile e f8019u = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f8021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Future f8023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f8025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zzb f8028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C4.e f8029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WorkSource f8030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f8032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f8033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f8034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AtomicInteger f8035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f8036q;

    public a(Context context, int i9, String str) {
        String packageName = context.getPackageName();
        this.f8020a = new Object();
        this.f8022c = 0;
        this.f8025f = new HashSet();
        this.f8026g = true;
        this.f8029j = h.c();
        this.f8034o = new HashMap();
        this.f8035p = new AtomicInteger(0);
        r.n(context, "WakeLock: context must not be null");
        r.h(str, "WakeLock: wakeLockName must not be empty");
        this.f8033n = context.getApplicationContext();
        this.f8032m = str;
        this.f8028i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f8031l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f8031l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i9, str);
        this.f8021b = wakeLockNewWakeLock;
        if (q.c(context)) {
            WorkSource workSourceB = q.b(context, o.b(packageName) ? context.getPackageName() : packageName);
            this.f8030k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f8017s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f8018t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f8017s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f8017s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f8036q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f8020a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f8031l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f8022c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e9) {
            Log.wtf("WakeLock", e9.toString());
        }
    }

    public void a(long j9) {
        this.f8035p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f8016r), 1L);
        if (j9 > 0) {
            jMax = Math.min(j9, jMax);
        }
        synchronized (this.f8020a) {
            try {
                if (!b()) {
                    this.f8028i = zzb.zza(false, null);
                    this.f8021b.acquire();
                    this.f8029j.b();
                }
                this.f8022c++;
                this.f8027h++;
                f(null);
                d dVar = (d) this.f8034o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f8034o.put(null, dVar);
                }
                dVar.f8038a++;
                long jB = this.f8029j.b();
                long j10 = Long.MAX_VALUE - jB > jMax ? jB + jMax : Long.MAX_VALUE;
                if (j10 > this.f8024e) {
                    this.f8024e = j10;
                    Future future = this.f8023d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f8023d = this.f8036q.schedule(new Runnable() { // from class: Q4.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(this.f8037a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z9;
        synchronized (this.f8020a) {
            z9 = this.f8022c > 0;
        }
        return z9;
    }

    public void c() {
        if (this.f8035p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f8031l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f8020a) {
            try {
                f(null);
                if (this.f8034o.containsKey(null)) {
                    d dVar = (d) this.f8034o.get(null);
                    if (dVar != null) {
                        int i9 = dVar.f8038a - 1;
                        dVar.f8038a = i9;
                        if (i9 == 0) {
                            this.f8034o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f8031l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z9) {
        synchronized (this.f8020a) {
            this.f8026g = z9;
        }
    }

    public final String f(String str) {
        if (this.f8026g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f8025f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f8025f);
        this.f8025f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC1617D.a(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[Catch: all -> 0x000b, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {all -> 0x000b, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000e, B:12:0x0013, B:18:0x0020, B:19:0x002d, B:21:0x0033, B:22:0x003c, B:24:0x0046, B:25:0x004f, B:28:0x005e, B:30:0x0062, B:47:0x00a3, B:46:0x0092, B:42:0x008b, B:44:0x008f, B:45:0x0091, B:38:0x0085, B:15:0x001c, B:17:0x001e, B:27:0x0059, B:35:0x0068, B:37:0x0074, B:41:0x008a), top: B:53:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f8020a
            monitor-enter(r6)
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Le
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            goto La5
        Le:
            boolean r0 = r5.f8026g     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            if (r0 == 0) goto L1e
            int r0 = r5.f8022c     // Catch: java.lang.Throwable -> Lb
            int r0 = r0 + (-1)
            r5.f8022c = r0     // Catch: java.lang.Throwable -> Lb
            if (r0 > 0) goto L1c
            goto L20
        L1c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
            return
        L1e:
            r5.f8022c = r1     // Catch: java.lang.Throwable -> Lb
        L20:
            r5.g()     // Catch: java.lang.Throwable -> Lb
            java.util.Map r0 = r5.f8034o     // Catch: java.lang.Throwable -> Lb
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb
        L2d:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Lb
            Q4.d r2 = (Q4.d) r2     // Catch: java.lang.Throwable -> Lb
            r2.f8038a = r1     // Catch: java.lang.Throwable -> Lb
            goto L2d
        L3c:
            java.util.Map r0 = r5.f8034o     // Catch: java.lang.Throwable -> Lb
            r0.clear()     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.Future r0 = r5.f8023d     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            if (r0 == 0) goto L4f
            r0.cancel(r1)     // Catch: java.lang.Throwable -> Lb
            r5.f8023d = r2     // Catch: java.lang.Throwable -> Lb
            r3 = 0
            r5.f8024e = r3     // Catch: java.lang.Throwable -> Lb
        L4f:
            r5.f8027h = r1     // Catch: java.lang.Throwable -> Lb
            android.os.PowerManager$WakeLock r0 = r5.f8021b     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L92
            android.os.PowerManager$WakeLock r0 = r5.f8021b     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L67
            r0.release()     // Catch: java.lang.Throwable -> L65 java.lang.RuntimeException -> L67
            com.google.android.gms.internal.stats.zzb r0 = r5.f8028i     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto La3
        L62:
            r5.f8028i = r2     // Catch: java.lang.Throwable -> Lb
            goto La3
        L65:
            r0 = move-exception
            goto L8b
        L67:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L65
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L8a
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f8031l     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L65
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L65
            com.google.android.gms.internal.stats.zzb r0 = r5.f8028i     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto La3
            goto L62
        L8a:
            throw r0     // Catch: java.lang.Throwable -> L65
        L8b:
            com.google.android.gms.internal.stats.zzb r1 = r5.f8028i     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L91
            r5.f8028i = r2     // Catch: java.lang.Throwable -> Lb
        L91:
            throw r0     // Catch: java.lang.Throwable -> Lb
        L92:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f8031l     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> Lb
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lb
        La3:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
            return
        La5:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.a.h(int):void");
    }
}
