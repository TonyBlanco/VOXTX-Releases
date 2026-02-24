package com.onesignal;

import com.onesignal.C1597w1;
import com.onesignal.F1;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.onesignal.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1584s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Date f38826c = new Date();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f38827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38828b = new ArrayList();

    /* JADX INFO: renamed from: com.onesignal.s0$a */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38829a;

        public a(String str) {
            this.f38829a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C1584s0.this.f38828b.remove(this.f38829a);
            C1584s0.this.f38827a.b();
        }
    }

    /* JADX INFO: renamed from: com.onesignal.s0$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38832b;

        static {
            int[] iArr = new int[C1597w1.b.values().length];
            f38832b = iArr;
            try {
                iArr[C1597w1.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38832b[C1597w1.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38832b[C1597w1.b.GREATER_THAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38832b[C1597w1.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38832b[C1597w1.b.EQUAL_TO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38832b[C1597w1.b.NOT_EQUAL_TO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[C1597w1.a.values().length];
            f38831a = iArr2;
            try {
                iArr2[C1597w1.a.SESSION_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38831a[C1597w1.a.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.s0$c */
    public interface c {
        void b();

        void c(String str);
    }

    public C1584s0(c cVar) {
        this.f38827a = cVar;
    }

    public static boolean d(double d9, double d10, C1597w1.b bVar) {
        switch (b.f38832b[bVar.ordinal()]) {
            case 1:
                return d10 < d9;
            case 2:
                return d10 <= d9 || f(d9, d10);
            case 3:
                return d10 >= d9;
            case 4:
                return d10 >= d9 || f(d9, d10);
            case 5:
                return f(d9, d10);
            case 6:
                return !f(d9, d10);
            default:
                F1.c1(F1.v.ERROR, "Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar.toString());
                return false;
        }
    }

    public static void e() {
        f38826c = new Date();
    }

    public static boolean f(double d9, double d10) {
        return Math.abs(d9 - d10) < 0.3d;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:7:0x0009, B:9:0x000f, B:13:0x0014, B:28:0x005b, B:30:0x0077, B:31:0x007c, B:33:0x007e, B:35:0x0083, B:37:0x0085, B:39:0x008d, B:41:0x008f, B:42:0x009c, B:18:0x0028, B:20:0x0032, B:22:0x0034, B:25:0x0040, B:26:0x0049, B:27:0x004f), top: B:46:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:7:0x0009, B:9:0x000f, B:13:0x0014, B:28:0x005b, B:30:0x0077, B:31:0x007c, B:33:0x007e, B:35:0x0083, B:37:0x0085, B:39:0x008d, B:41:0x008f, B:42:0x009c, B:18:0x0028, B:20:0x0032, B:22:0x0034, B:25:0x0040, B:26:0x0049, B:27:0x004f), top: B:46:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(com.onesignal.C1597w1 r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r15.f38947e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList r0 = r14.f38828b
            monitor-enter(r0)
            java.lang.Object r2 = r15.f38947e     // Catch: java.lang.Throwable -> L11
            boolean r2 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r15 = move-exception
            goto L9e
        L14:
            int[] r2 = com.onesignal.C1584s0.b.f38831a     // Catch: java.lang.Throwable -> L11
            com.onesignal.w1$a r3 = r15.f38944b     // Catch: java.lang.Throwable -> L11
            int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L11
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L11
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L4f
            r6 = 2
            if (r2 == r6) goto L28
            r6 = r4
            goto L5b
        L28:
            com.onesignal.B0 r2 = com.onesignal.F1.b0()     // Catch: java.lang.Throwable -> L11
            boolean r2 = r2.U()     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L34:
            com.onesignal.B0 r2 = com.onesignal.F1.b0()     // Catch: java.lang.Throwable -> L11
            java.util.Date r2 = r2.f38143t     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L40
            r6 = 999999(0xf423f, double:4.94065E-318)
            goto L5b
        L40:
            java.util.Date r6 = new java.util.Date     // Catch: java.lang.Throwable -> L11
            r6.<init>()     // Catch: java.lang.Throwable -> L11
            long r6 = r6.getTime()     // Catch: java.lang.Throwable -> L11
        L49:
            long r8 = r2.getTime()     // Catch: java.lang.Throwable -> L11
            long r6 = r6 - r8
            goto L5b
        L4f:
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            long r6 = r2.getTime()     // Catch: java.lang.Throwable -> L11
            java.util.Date r2 = com.onesignal.C1584s0.f38826c     // Catch: java.lang.Throwable -> L11
            goto L49
        L5b:
            java.lang.String r2 = r15.f38943a     // Catch: java.lang.Throwable -> L11
            java.lang.Object r8 = r15.f38947e     // Catch: java.lang.Throwable -> L11
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L11
            double r8 = r8.doubleValue()     // Catch: java.lang.Throwable -> L11
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r10
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L11
            double r10 = (double) r8     // Catch: java.lang.Throwable -> L11
            double r12 = (double) r6     // Catch: java.lang.Throwable -> L11
            com.onesignal.w1$b r15 = r15.f38946d     // Catch: java.lang.Throwable -> L11
            boolean r15 = d(r10, r12, r15)     // Catch: java.lang.Throwable -> L11
            if (r15 == 0) goto L7e
            com.onesignal.s0$c r15 = r14.f38827a     // Catch: java.lang.Throwable -> L11
            r15.c(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r3
        L7e:
            long r8 = r8 - r6
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 > 0) goto L85
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L85:
            java.util.ArrayList r15 = r14.f38828b     // Catch: java.lang.Throwable -> L11
            boolean r15 = r15.contains(r2)     // Catch: java.lang.Throwable -> L11
            if (r15 == 0) goto L8f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L8f:
            com.onesignal.s0$a r15 = new com.onesignal.s0$a     // Catch: java.lang.Throwable -> L11
            r15.<init>(r2)     // Catch: java.lang.Throwable -> L11
            com.onesignal.AbstractC1587t0.a(r15, r2, r8)     // Catch: java.lang.Throwable -> L11
            java.util.ArrayList r15 = r14.f38828b     // Catch: java.lang.Throwable -> L11
            r15.add(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C1584s0.c(com.onesignal.w1):boolean");
    }
}
