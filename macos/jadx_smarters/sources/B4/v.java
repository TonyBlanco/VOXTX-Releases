package b4;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import b4.InterfaceC1215f;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import d4.I;
import d4.InterfaceC1688e;
import d4.k0;
import java.util.HashMap;
import java.util.Map;
import s5.AbstractC2717A;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements InterfaceC1215f, S {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AbstractC2743y f17627p = AbstractC2743y.E(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AbstractC2743y f17628q = AbstractC2743y.E(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AbstractC2743y f17629r = AbstractC2743y.E(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AbstractC2743y f17630s = AbstractC2743y.E(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbstractC2743y f17631t = AbstractC2743y.E(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AbstractC2743y f17632u = AbstractC2743y.E(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static v f17633v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2717A f17634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1215f.a.C0211a f17635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f17636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1688e f17637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17648o;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f17650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC1688e f17652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17653e;

        public b(Context context) {
            this.f17649a = context == null ? null : context.getApplicationContext();
            this.f17650b = b(k0.P(context));
            this.f17651c = AdError.SERVER_ERROR_CODE;
            this.f17652d = InterfaceC1688e.f39758a;
            this.f17653e = true;
        }

        public static Map b(String str) {
            int[] iArrL = v.l(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            AbstractC2743y abstractC2743y = v.f17627p;
            map.put(2, (Long) abstractC2743y.get(iArrL[0]));
            map.put(3, (Long) v.f17628q.get(iArrL[1]));
            map.put(4, (Long) v.f17629r.get(iArrL[2]));
            map.put(5, (Long) v.f17630s.get(iArrL[3]));
            map.put(10, (Long) v.f17631t.get(iArrL[4]));
            map.put(9, (Long) v.f17632u.get(iArrL[5]));
            map.put(7, (Long) abstractC2743y.get(iArrL[0]));
            return map;
        }

        public v a() {
            return new v(this.f17649a, this.f17650b, this.f17651c, this.f17652d, this.f17653e);
        }
    }

    public v(Context context, Map map, int i9, InterfaceC1688e interfaceC1688e, boolean z9) {
        this.f17634a = AbstractC2717A.d(map);
        this.f17635b = new InterfaceC1215f.a.C0211a();
        this.f17636c = new O(i9);
        this.f17637d = interfaceC1688e;
        this.f17638e = z9;
        if (context == null) {
            this.f17642i = 0;
            this.f17645l = m(0);
            return;
        }
        d4.I iD = d4.I.d(context);
        int iF = iD.f();
        this.f17642i = iF;
        this.f17645l = m(iF);
        iD.i(new I.c() { // from class: b4.u
            @Override // d4.I.c
            public final void a(int i10) {
                this.f17626a.q(i10);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] l(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 8104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.v.l(java.lang.String):int[]");
    }

    public static synchronized v n(Context context) {
        try {
            if (f17633v == null) {
                f17633v = new b(context).a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17633v;
    }

    public static boolean o(C1227s c1227s, boolean z9) {
        return z9 && !c1227s.d(8);
    }

    @Override // b4.S
    public synchronized void a(InterfaceC1224o interfaceC1224o, C1227s c1227s, boolean z9) {
        try {
            if (o(c1227s, z9)) {
                if (this.f17639f == 0) {
                    this.f17640g = this.f17637d.b();
                }
                this.f17639f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // b4.InterfaceC1215f
    public /* synthetic */ long b() {
        return AbstractC1213d.a(this);
    }

    @Override // b4.S
    public void c(InterfaceC1224o interfaceC1224o, C1227s c1227s, boolean z9) {
    }

    @Override // b4.InterfaceC1215f
    public S d() {
        return this;
    }

    @Override // b4.InterfaceC1215f
    public synchronized long e() {
        return this.f17645l;
    }

    @Override // b4.S
    public synchronized void f(InterfaceC1224o interfaceC1224o, C1227s c1227s, boolean z9, int i9) {
        if (o(c1227s, z9)) {
            this.f17641h += (long) i9;
        }
    }

    @Override // b4.InterfaceC1215f
    public void g(Handler handler, InterfaceC1215f.a aVar) {
        AbstractC1684a.e(handler);
        AbstractC1684a.e(aVar);
        this.f17635b.b(handler, aVar);
    }

    @Override // b4.InterfaceC1215f
    public void h(InterfaceC1215f.a aVar) {
        this.f17635b.e(aVar);
    }

    @Override // b4.S
    public synchronized void i(InterfaceC1224o interfaceC1224o, C1227s c1227s, boolean z9) {
        try {
            if (o(c1227s, z9)) {
                AbstractC1684a.g(this.f17639f > 0);
                long jB = this.f17637d.b();
                int i9 = (int) (jB - this.f17640g);
                this.f17643j += (long) i9;
                long j9 = this.f17644k;
                long j10 = this.f17641h;
                this.f17644k = j9 + j10;
                if (i9 > 0) {
                    this.f17636c.c((int) Math.sqrt(j10), (j10 * 8000.0f) / i9);
                    if (this.f17643j >= 2000 || this.f17644k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        this.f17645l = (long) this.f17636c.f(0.5f);
                    }
                    p(i9, this.f17641h, this.f17645l);
                    this.f17640g = jB;
                    this.f17641h = 0L;
                }
                this.f17639f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long m(int i9) {
        Long l9 = (Long) this.f17634a.get(Integer.valueOf(i9));
        if (l9 == null) {
            l9 = (Long) this.f17634a.get(0);
        }
        if (l9 == null) {
            l9 = 1000000L;
        }
        return l9.longValue();
    }

    public final void p(int i9, long j9, long j10) {
        if (i9 == 0 && j9 == 0 && j10 == this.f17646m) {
            return;
        }
        this.f17646m = j10;
        this.f17635b.c(i9, j9, j10);
    }

    public final synchronized void q(int i9) {
        int i10 = this.f17642i;
        if (i10 == 0 || this.f17638e) {
            if (this.f17647n) {
                i9 = this.f17648o;
            }
            if (i10 == i9) {
                return;
            }
            this.f17642i = i9;
            if (i9 != 1 && i9 != 0 && i9 != 8) {
                this.f17645l = m(i9);
                long jB = this.f17637d.b();
                p(this.f17639f > 0 ? (int) (jB - this.f17640g) : 0, this.f17641h, this.f17645l);
                this.f17640g = jB;
                this.f17641h = 0L;
                this.f17644k = 0L;
                this.f17643j = 0L;
                this.f17636c.i();
            }
        }
    }
}
