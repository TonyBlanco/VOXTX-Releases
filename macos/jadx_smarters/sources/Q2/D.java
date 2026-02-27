package Q2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7537f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f7538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f7539b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f7541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f7542e;

        public a(AudioTrack audioTrack) {
            this.f7538a = audioTrack;
        }

        public long a() {
            return this.f7542e;
        }

        public long b() {
            return this.f7539b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f7538a.getTimestamp(this.f7539b);
            if (timestamp) {
                long j9 = this.f7539b.framePosition;
                if (this.f7541d > j9) {
                    this.f7540c++;
                }
                this.f7541d = j9;
                this.f7542e = j9 + (this.f7540c << 32);
            }
            return timestamp;
        }
    }

    public D(AudioTrack audioTrack) {
        if (d4.k0.f39777a >= 19) {
            this.f7532a = new a(audioTrack);
            g();
        } else {
            this.f7532a = null;
            h(3);
        }
    }

    public void a() {
        if (this.f7533b == 4) {
            g();
        }
    }

    public long b() {
        a aVar = this.f7532a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f7532a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f7533b == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(long r8) {
        /*
            r7 = this;
            Q2.D$a r0 = r7.f7532a
            r1 = 0
            if (r0 == 0) goto L70
            long r2 = r7.f7536e
            long r2 = r8 - r2
            long r4 = r7.f7535d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10
            goto L70
        L10:
            r7.f7536e = r8
            boolean r0 = r0.c()
            int r2 = r7.f7533b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L48
            r8 = 2
            if (r2 == r4) goto L36
            if (r2 == r8) goto L33
            if (r2 == r3) goto L2d
            r8 = 4
            if (r2 != r8) goto L27
            goto L6f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L2d:
            if (r0 == 0) goto L6f
        L2f:
            r7.g()
            goto L6f
        L33:
            if (r0 != 0) goto L6f
            goto L2f
        L36:
            if (r0 == 0) goto L2f
            Q2.D$a r9 = r7.f7532a
            long r1 = r9.a()
            long r3 = r7.f7537f
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L6f
            r7.h(r8)
            goto L6f
        L48:
            if (r0 == 0) goto L62
            Q2.D$a r8 = r7.f7532a
            long r8 = r8.b()
            long r2 = r7.f7534c
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L70
            Q2.D$a r8 = r7.f7532a
            long r8 = r8.a()
            r7.f7537f = r8
            r7.h(r4)
            goto L6f
        L62:
            long r1 = r7.f7534c
            long r8 = r8 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L6f
            r7.h(r3)
        L6f:
            r1 = r0
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.D.e(long):boolean");
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f7532a != null) {
            h(0);
        }
    }

    public final void h(int i9) {
        this.f7533b = i9;
        long j9 = 10000;
        if (i9 == 0) {
            this.f7536e = 0L;
            this.f7537f = -1L;
            this.f7534c = System.nanoTime() / 1000;
        } else if (i9 != 1) {
            if (i9 == 2 || i9 == 3) {
                j9 = 10000000;
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException();
                }
                j9 = 500000;
            }
        }
        this.f7535d = j9;
    }
}
