package J3;

import V2.C1056m;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f3135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f3137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f3138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1056m f3141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f3142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f3143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f3144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f3145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0052f f3146v;

    public static final class b extends e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f3147m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f3148n;

        public b(String str, d dVar, long j9, int i9, long j10, C1056m c1056m, String str2, String str3, long j11, long j12, boolean z9, boolean z10, boolean z11) {
            super(str, dVar, j9, i9, j10, c1056m, str2, str3, j11, j12, z9);
            this.f3147m = z10;
            this.f3148n = z11;
        }

        public b b(long j9, int i9) {
            return new b(this.f3154a, this.f3155c, this.f3156d, i9, j9, this.f3159g, this.f3160h, this.f3161i, this.f3162j, this.f3163k, this.f3164l, this.f3147m, this.f3148n);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f3149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f3150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3151c;

        public c(Uri uri, long j9, int i9) {
            this.f3149a = uri;
            this.f3150b = j9;
            this.f3151c = i9;
        }
    }

    public static final class d extends e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f3152m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List f3153n;

        public d(String str, long j9, long j10, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j9, j10, false, AbstractC2743y.z());
        }

        public d(String str, d dVar, String str2, long j9, int i9, long j10, C1056m c1056m, String str3, String str4, long j11, long j12, boolean z9, List list) {
            super(str, dVar, j9, i9, j10, c1056m, str3, str4, j11, j12, z9);
            this.f3152m = str2;
            this.f3153n = AbstractC2743y.r(list);
        }

        public d b(long j9, int i9) {
            ArrayList arrayList = new ArrayList();
            long j10 = j9;
            for (int i10 = 0; i10 < this.f3153n.size(); i10++) {
                b bVar = (b) this.f3153n.get(i10);
                arrayList.add(bVar.b(j10, i9));
                j10 += bVar.f3156d;
            }
            return new d(this.f3154a, this.f3155c, this.f3152m, this.f3156d, i9, j9, this.f3159g, this.f3160h, this.f3161i, this.f3162j, this.f3163k, this.f3164l, arrayList);
        }
    }

    public static class e implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3154a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f3155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f3156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f3158f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C1056m f3159g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f3160h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f3161i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f3162j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f3163k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f3164l;

        public e(String str, d dVar, long j9, int i9, long j10, C1056m c1056m, String str2, String str3, long j11, long j12, boolean z9) {
            this.f3154a = str;
            this.f3155c = dVar;
            this.f3156d = j9;
            this.f3157e = i9;
            this.f3158f = j10;
            this.f3159g = c1056m;
            this.f3160h = str2;
            this.f3161i = str3;
            this.f3162j = j11;
            this.f3163k = j12;
            this.f3164l = z9;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l9) {
            if (this.f3158f > l9.longValue()) {
                return 1;
            }
            return this.f3158f < l9.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: J3.f$f, reason: collision with other inner class name */
    public static final class C0052f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f3165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f3167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f3168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f3169e;

        public C0052f(long j9, boolean z9, long j10, long j11, boolean z10) {
            this.f3165a = j9;
            this.f3166b = z9;
            this.f3167c = j10;
            this.f3168d = j11;
            this.f3169e = z10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r11, java.lang.String r12, java.util.List r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, V2.C1056m r31, java.util.List r32, java.util.List r33, J3.f.C0052f r34, java.util.Map r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.f3128d = r3
            r3 = r17
            r0.f3132h = r3
            r3 = r16
            r0.f3131g = r3
            r3 = r19
            r0.f3133i = r3
            r3 = r20
            r0.f3134j = r3
            r3 = r21
            r0.f3135k = r3
            r3 = r23
            r0.f3136l = r3
            r3 = r24
            r0.f3137m = r3
            r3 = r26
            r0.f3138n = r3
            r3 = r29
            r0.f3139o = r3
            r3 = r30
            r0.f3140p = r3
            r3 = r31
            r0.f3141q = r3
            s5.y r3 = s5.AbstractC2743y.r(r32)
            r0.f3142r = r3
            s5.y r3 = s5.AbstractC2743y.r(r33)
            r0.f3143s = r3
            s5.A r3 = s5.AbstractC2717A.d(r35)
            r0.f3144t = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = s5.D.d(r33)
            J3.f$b r3 = (J3.f.b) r3
        L58:
            long r6 = r3.f3158f
            long r8 = r3.f3156d
            long r6 = r6 + r8
            r0.f3145u = r6
            goto L6f
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = s5.D.d(r32)
            J3.f$d r3 = (J3.f.d) r3
            goto L58
        L6d:
            r0.f3145u = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.f3145u
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.f3129e = r6
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.f3130f = r1
            r1 = r34
            r0.f3146v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.f.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, V2.m, java.util.List, java.util.List, J3.f$f, java.util.Map):void");
    }

    @Override // z3.InterfaceC3023C
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(List list) {
        return this;
    }

    public f c(long j9, int i9) {
        return new f(this.f3128d, this.f3191a, this.f3192b, this.f3129e, this.f3131g, j9, true, i9, this.f3135k, this.f3136l, this.f3137m, this.f3138n, this.f3193c, this.f3139o, this.f3140p, this.f3141q, this.f3142r, this.f3143s, this.f3146v, this.f3144t);
    }

    public f d() {
        return this.f3139o ? this : new f(this.f3128d, this.f3191a, this.f3192b, this.f3129e, this.f3131g, this.f3132h, this.f3133i, this.f3134j, this.f3135k, this.f3136l, this.f3137m, this.f3138n, this.f3193c, true, this.f3140p, this.f3141q, this.f3142r, this.f3143s, this.f3146v, this.f3144t);
    }

    public long e() {
        return this.f3132h + this.f3145u;
    }

    public boolean f(f fVar) {
        if (fVar == null) {
            return true;
        }
        long j9 = this.f3135k;
        long j10 = fVar.f3135k;
        if (j9 > j10) {
            return true;
        }
        if (j9 < j10) {
            return false;
        }
        int size = this.f3142r.size() - fVar.f3142r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f3143s.size();
        int size3 = fVar.f3143s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f3139o && !fVar.f3139o;
        }
        return true;
    }
}
