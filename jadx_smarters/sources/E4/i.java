package e4;

import O2.A0;
import O2.C0927w;
import O2.C0936z0;
import O2.D1;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import d.AbstractC1617D;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.C1702t;
import d4.E;
import d4.F;
import d4.InterfaceC1696m;
import d4.InterfaceC1698o;
import d4.S;
import d4.V;
import d4.a0;
import d4.k0;
import d4.l0;
import e4.InterfaceC1735A;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTimeConstants;
import p3.AbstractC2392B;
import p3.C2408n;
import p3.InterfaceC2407m;
import s5.AbstractC2743y;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import u0.ExecutorC2838w;

/* JADX INFO: loaded from: classes3.dex */
public class i extends p3.u {

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int[] f40270t1 = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static boolean f40271u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static boolean f40272v1;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final Context f40273L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final o f40274M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final InterfaceC1735A.a f40275N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final d f40276O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final long f40277P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final int f40278Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final boolean f40279R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public b f40280S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f40281T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f40282U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public Surface f40283V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public j f40284W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public boolean f40285X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public int f40286Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public boolean f40287Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f40288a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f40289b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f40290c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public long f40291d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public long f40292e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f40293f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f40294g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f40295h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public long f40296i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public long f40297j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public long f40298k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f40299l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public long f40300m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public C1737C f40301n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public C1737C f40302o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f40303p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f40304q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public c f40305r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public m f40306s1;

    public static final class a {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i9 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i9 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40309c;

        public b(int i9, int i10, int i11) {
            this.f40307a = i9;
            this.f40308b = i10;
            this.f40309c = i11;
        }
    }

    public final class c implements InterfaceC2407m.c, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f40310a;

        public c(InterfaceC2407m interfaceC2407m) {
            Handler handlerY = k0.y(this);
            this.f40310a = handlerY;
            interfaceC2407m.a(this, handlerY);
        }

        @Override // p3.InterfaceC2407m.c
        public void a(InterfaceC2407m interfaceC2407m, long j9, long j10) {
            if (k0.f39777a >= 30) {
                b(j9);
            } else {
                this.f40310a.sendMessageAtFrontOfQueue(Message.obtain(this.f40310a, 0, (int) (j9 >> 32), (int) j9));
            }
        }

        public final void b(long j9) {
            i iVar = i.this;
            if (this != iVar.f40305r1 || iVar.q0() == null) {
                return;
            }
            if (j9 == Long.MAX_VALUE) {
                i.this.g2();
                return;
            }
            try {
                i.this.f2(j9);
            } catch (C0927w e9) {
                i.this.i1(e9);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(k0.t1(message.arg1, message.arg2));
            return true;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f40312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f40313b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f40316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CopyOnWriteArrayList f40317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Pair f40318g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Pair f40319h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f40322k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f40323l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayDeque f40314c = new ArrayDeque();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayDeque f40315d = new ArrayDeque();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f40320i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f40321j = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f40324m = -9223372036854775807L;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public C1737C f40325n = C1737C.f40172f;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f40326o = -9223372036854775807L;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f40327p = -9223372036854775807L;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C0936z0 f40328a;

            public a(C0936z0 c0936z0) {
                this.f40328a = c0936z0;
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static Constructor f40330a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static Method f40331b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static Method f40332c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static Constructor f40333d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static Method f40334e;

            public static InterfaceC1698o a(float f9) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
                c();
                Object objNewInstance = f40330a.newInstance(null);
                f40331b.invoke(objNewInstance, Float.valueOf(f9));
                AbstractC1617D.a(AbstractC1684a.e(f40332c.invoke(objNewInstance, null)));
                return null;
            }

            public static l0 b() throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
                c();
                AbstractC1617D.a(AbstractC1684a.e(f40334e.invoke(f40333d.newInstance(null), null)));
                return null;
            }

            public static void c() throws ClassNotFoundException {
                if (f40330a == null || f40331b == null || f40332c == null) {
                    Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
                    f40330a = cls.getConstructor(null);
                    f40331b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    f40332c = cls.getMethod("build", null);
                }
                if (f40333d == null || f40334e == null) {
                    Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    f40333d = cls2.getConstructor(null);
                    f40334e = cls2.getMethod("build", null);
                }
            }
        }

        public d(o oVar, i iVar) {
            this.f40312a = oVar;
            this.f40313b = iVar;
        }

        public MediaFormat a(MediaFormat mediaFormat) {
            if (k0.f39777a >= 29 && this.f40313b.f40273L0.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        public void b() {
            AbstractC1617D.a(AbstractC1684a.e(null));
            throw null;
        }

        public void c() {
            AbstractC1684a.i(null);
            throw null;
        }

        public long d(long j9, long j10) {
            AbstractC1684a.g(this.f40327p != -9223372036854775807L);
            return (j9 + j10) - this.f40327p;
        }

        public Surface e() {
            AbstractC1617D.a(AbstractC1684a.e(null));
            throw null;
        }

        public boolean f() {
            return false;
        }

        public boolean g() {
            Pair pair = this.f40319h;
            return pair == null || !((S) pair.second).equals(S.f39721c);
        }

        public boolean h(C0936z0 c0936z0, long j9) throws C0927w {
            int i9;
            AbstractC1684a.g(!f());
            if (!this.f40321j) {
                return false;
            }
            if (this.f40317f == null) {
                this.f40321j = false;
                return false;
            }
            this.f40316e = k0.x();
            Pair pairN1 = this.f40313b.N1(c0936z0.f6479y);
            try {
                if (!i.H1() && (i9 = c0936z0.f6475u) != 0) {
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f40317f;
                    b.a(i9);
                    copyOnWriteArrayList.add(0, null);
                }
                b.b();
                Context unused = this.f40313b.f40273L0;
                InterfaceC1696m interfaceC1696m = InterfaceC1696m.f39792a;
                Handler handler = this.f40316e;
                Objects.requireNonNull(handler);
                new ExecutorC2838w(handler);
                new a(c0936z0);
                throw null;
            } catch (Exception e9) {
                throw this.f40313b.y(e9, c0936z0, 7000);
            }
        }

        public boolean i(C0936z0 c0936z0, long j9, boolean z9) {
            AbstractC1684a.i(null);
            AbstractC1684a.g(this.f40320i != -1);
            throw null;
        }

        public void j(String str) {
            this.f40320i = k0.e0(this.f40313b.f40273L0, str, false);
        }

        public final void k(long j9, boolean z9) {
            AbstractC1684a.i(null);
            throw null;
        }

        public void l(long j9, long j10) {
            AbstractC1684a.i(null);
            while (!this.f40314c.isEmpty()) {
                boolean z9 = false;
                boolean z10 = this.f40313b.getState() == 2;
                long jLongValue = ((Long) AbstractC1684a.e((Long) this.f40314c.peek())).longValue();
                long j11 = jLongValue + this.f40327p;
                long jE1 = this.f40313b.E1(j9, j10, SystemClock.elapsedRealtime() * 1000, j11, z10);
                if (this.f40322k && this.f40314c.size() == 1) {
                    z9 = true;
                }
                if (this.f40313b.r2(j9, jE1)) {
                    k(-1L, z9);
                    return;
                }
                if (!z10 || j9 == this.f40313b.f40290c1 || jE1 > 50000) {
                    return;
                }
                this.f40312a.h(j11);
                long jB = this.f40312a.b(System.nanoTime() + (jE1 * 1000));
                if (this.f40313b.q2((jB - System.nanoTime()) / 1000, j10, z9)) {
                    k(-2L, z9);
                } else {
                    if (!this.f40315d.isEmpty() && j11 > ((Long) ((Pair) this.f40315d.peek()).first).longValue()) {
                        this.f40318g = (Pair) this.f40315d.remove();
                    }
                    this.f40313b.e2(jLongValue, jB, (C0936z0) this.f40318g.second);
                    if (this.f40326o >= j11) {
                        this.f40326o = -9223372036854775807L;
                        this.f40313b.b2(this.f40325n);
                    }
                    k(jB, z9);
                }
            }
        }

        public boolean m() {
            return this.f40323l;
        }

        public void n() {
            AbstractC1617D.a(AbstractC1684a.e(null));
            throw null;
        }

        public void o(C0936z0 c0936z0) {
            AbstractC1617D.a(AbstractC1684a.e(null));
            new C1702t.b(c0936z0.f6472r, c0936z0.f6473s).b(c0936z0.f6476v).a();
            throw null;
        }

        public void p(Surface surface, S s9) {
            Pair pair = this.f40319h;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((S) this.f40319h.second).equals(s9)) {
                return;
            }
            this.f40319h = Pair.create(surface, s9);
            if (f()) {
                AbstractC1617D.a(AbstractC1684a.e(null));
                new V(surface, s9.b(), s9.a());
                throw null;
            }
        }

        public void q(List list) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f40317f;
            if (copyOnWriteArrayList == null) {
                this.f40317f = new CopyOnWriteArrayList(list);
            } else {
                copyOnWriteArrayList.clear();
                this.f40317f.addAll(list);
            }
        }
    }

    public i(Context context, InterfaceC2407m.b bVar, p3.w wVar, long j9, boolean z9, Handler handler, InterfaceC1735A interfaceC1735A, int i9) {
        this(context, bVar, wVar, j9, z9, handler, interfaceC1735A, i9, 30.0f);
    }

    public i(Context context, InterfaceC2407m.b bVar, p3.w wVar, long j9, boolean z9, Handler handler, InterfaceC1735A interfaceC1735A, int i9, float f9) {
        super(2, bVar, wVar, z9, f9);
        this.f40277P0 = j9;
        this.f40278Q0 = i9;
        Context applicationContext = context.getApplicationContext();
        this.f40273L0 = applicationContext;
        o oVar = new o(applicationContext);
        this.f40274M0 = oVar;
        this.f40275N0 = new InterfaceC1735A.a(handler, interfaceC1735A);
        this.f40276O0 = new d(oVar, this);
        this.f40279R0 = K1();
        this.f40291d1 = -9223372036854775807L;
        this.f40286Y0 = 1;
        this.f40301n1 = C1737C.f40172f;
        this.f40304q1 = 0;
        G1();
    }

    public static boolean H1() {
        return k0.f39777a >= 21;
    }

    public static void J1(MediaFormat mediaFormat, int i9) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i9);
    }

    public static boolean K1() {
        return "NVIDIA".equals(k0.f39779c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean M1() {
        /*
            Method dump skipped, instruction units count: 3184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.i.M1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int O1(p3.t r10, O2.C0936z0 r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.i.O1(p3.t, O2.z0):int");
    }

    public static Point P1(p3.t tVar, C0936z0 c0936z0) {
        int i9 = c0936z0.f6473s;
        int i10 = c0936z0.f6472r;
        boolean z9 = i9 > i10;
        int i11 = z9 ? i9 : i10;
        if (z9) {
            i9 = i10;
        }
        float f9 = i9 / i11;
        for (int i12 : f40270t1) {
            int i13 = (int) (i12 * f9);
            if (i12 <= i11 || i13 <= i9) {
                break;
            }
            if (k0.f39777a >= 21) {
                int i14 = z9 ? i13 : i12;
                if (!z9) {
                    i12 = i13;
                }
                Point pointC = tVar.c(i14, i12);
                if (tVar.w(pointC.x, pointC.y, c0936z0.f6474t)) {
                    return pointC;
                }
            } else {
                try {
                    int iL = k0.l(i12, 16) * 16;
                    int iL2 = k0.l(i13, 16) * 16;
                    if (iL * iL2 <= AbstractC2392B.P()) {
                        int i15 = z9 ? iL2 : iL;
                        if (!z9) {
                            iL = iL2;
                        }
                        return new Point(i15, iL);
                    }
                } catch (AbstractC2392B.c unused) {
                }
            }
        }
        return null;
    }

    public static List R1(Context context, p3.w wVar, C0936z0 c0936z0, boolean z9, boolean z10) {
        String str = c0936z0.f6467m;
        if (str == null) {
            return AbstractC2743y.z();
        }
        if (k0.f39777a >= 26 && "video/dolby-vision".equals(str) && !a.a(context)) {
            List listN = AbstractC2392B.n(wVar, c0936z0, z9, z10);
            if (!listN.isEmpty()) {
                return listN;
            }
        }
        return AbstractC2392B.v(wVar, c0936z0, z9, z10);
    }

    public static int S1(p3.t tVar, C0936z0 c0936z0) {
        if (c0936z0.f6468n == -1) {
            return O1(tVar, c0936z0);
        }
        int size = c0936z0.f6469o.size();
        int length = 0;
        for (int i9 = 0; i9 < size; i9++) {
            length += ((byte[]) c0936z0.f6469o.get(i9)).length;
        }
        return c0936z0.f6468n + length;
    }

    public static int T1(int i9, int i10) {
        return (i9 * 3) / (i10 * 2);
    }

    public static boolean V1(long j9) {
        return j9 < -30000;
    }

    public static boolean W1(long j9) {
        return j9 < -500000;
    }

    public static void l2(InterfaceC2407m interfaceC2407m, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC2407m.i(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [e4.o] */
    /* JADX WARN: Type inference failed for: r0v8, types: [e4.i$d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [O2.k, e4.i, p3.u] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v8, types: [e4.j] */
    /* JADX WARN: Type inference failed for: r5v9 */
    private void n2(Object obj) throws C0927w {
        ?? D9 = obj instanceof Surface ? (Surface) obj : 0;
        if (D9 == 0) {
            j jVar = this.f40284W0;
            if (jVar != null) {
                D9 = jVar;
            } else {
                p3.t tVarR0 = r0();
                if (tVarR0 != null && t2(tVarR0)) {
                    D9 = j.d(this.f40273L0, tVarR0.f46305g);
                    this.f40284W0 = D9;
                }
            }
        }
        if (this.f40283V0 == D9) {
            if (D9 == 0 || D9 == this.f40284W0) {
                return;
            }
            d2();
            c2();
            return;
        }
        this.f40283V0 = D9;
        this.f40274M0.m(D9);
        this.f40285X0 = false;
        int state = getState();
        InterfaceC2407m interfaceC2407mQ0 = q0();
        if (interfaceC2407mQ0 != null && !this.f40276O0.f()) {
            if (k0.f39777a < 23 || D9 == 0 || this.f40281T0) {
                Z0();
                I0();
            } else {
                o2(interfaceC2407mQ0, D9);
            }
        }
        if (D9 == 0 || D9 == this.f40284W0) {
            G1();
            F1();
            if (this.f40276O0.f()) {
                this.f40276O0.b();
                return;
            }
            return;
        }
        d2();
        F1();
        if (state == 2) {
            m2();
        }
        if (this.f40276O0.f()) {
            this.f40276O0.p(D9, S.f39721c);
        }
    }

    public final long E1(long j9, long j10, long j11, long j12, boolean z9) {
        long jY0 = (long) ((j12 - j9) / ((double) y0()));
        return z9 ? jY0 - (j11 - j10) : jY0;
    }

    public final void F1() {
        InterfaceC2407m interfaceC2407mQ0;
        this.f40287Z0 = false;
        if (k0.f39777a < 23 || !this.f40303p1 || (interfaceC2407mQ0 = q0()) == null) {
            return;
        }
        this.f40305r1 = new c(interfaceC2407mQ0);
    }

    @Override // p3.u, O2.AbstractC0892k
    public void G() {
        G1();
        F1();
        this.f40285X0 = false;
        this.f40305r1 = null;
        try {
            super.G();
        } finally {
            this.f40275N0.m(this.f46324G0);
            this.f40275N0.D(C1737C.f40172f);
        }
    }

    public final void G1() {
        this.f40302o1 = null;
    }

    @Override // p3.u, O2.AbstractC0892k
    public void H(boolean z9, boolean z10) {
        super.H(z9, z10);
        boolean z11 = A().f5516a;
        AbstractC1684a.g((z11 && this.f40304q1 == 0) ? false : true);
        if (this.f40303p1 != z11) {
            this.f40303p1 = z11;
            Z0();
        }
        this.f40275N0.o(this.f46324G0);
        this.f40288a1 = z10;
        this.f40289b1 = false;
    }

    @Override // p3.u, O2.AbstractC0892k
    public void I(long j9, boolean z9) throws C0927w {
        super.I(j9, z9);
        if (this.f40276O0.f()) {
            this.f40276O0.c();
        }
        F1();
        this.f40274M0.j();
        this.f40296i1 = -9223372036854775807L;
        this.f40290c1 = -9223372036854775807L;
        this.f40294g1 = 0;
        if (z9) {
            m2();
        } else {
            this.f40291d1 = -9223372036854775807L;
        }
    }

    public boolean I1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (i.class) {
            try {
                if (!f40271u1) {
                    f40272v1 = M1();
                    f40271u1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f40272v1;
    }

    @Override // p3.u
    public void K0(Exception exc) {
        AbstractC1681B.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f40275N0.C(exc);
    }

    @Override // p3.u, O2.AbstractC0892k
    public void L() {
        try {
            super.L();
        } finally {
            if (this.f40276O0.f()) {
                this.f40276O0.n();
            }
            if (this.f40284W0 != null) {
                h2();
            }
        }
    }

    @Override // p3.u
    public void L0(String str, InterfaceC2407m.a aVar, long j9, long j10) {
        this.f40275N0.k(str, j9, j10);
        this.f40281T0 = I1(str);
        this.f40282U0 = ((p3.t) AbstractC1684a.e(r0())).p();
        if (k0.f39777a >= 23 && this.f40303p1) {
            this.f40305r1 = new c((InterfaceC2407m) AbstractC1684a.e(q0()));
        }
        this.f40276O0.j(str);
    }

    public void L1(InterfaceC2407m interfaceC2407m, int i9, long j9) {
        a0.a("dropVideoBuffer");
        interfaceC2407m.m(i9, false);
        a0.c();
        v2(0, 1);
    }

    @Override // p3.u, O2.AbstractC0892k
    public void M() {
        super.M();
        this.f40293f1 = 0;
        this.f40292e1 = SystemClock.elapsedRealtime();
        this.f40297j1 = SystemClock.elapsedRealtime() * 1000;
        this.f40298k1 = 0L;
        this.f40299l1 = 0;
        this.f40274M0.k();
    }

    @Override // p3.u
    public void M0(String str) {
        this.f40275N0.l(str);
    }

    @Override // p3.u, O2.AbstractC0892k
    public void N() {
        this.f40291d1 = -9223372036854775807L;
        Y1();
        a2();
        this.f40274M0.l();
        super.N();
    }

    @Override // p3.u
    public U2.h N0(A0 a02) throws C0927w {
        U2.h hVarN0 = super.N0(a02);
        this.f40275N0.p(a02.f5499b, hVarN0);
        return hVarN0;
    }

    public Pair N1(C1740c c1740c) {
        if (C1740c.f(c1740c)) {
            return c1740c.f40200d == 7 ? Pair.create(c1740c, c1740c.b().d(6).a()) : Pair.create(c1740c, c1740c);
        }
        C1740c c1740c2 = C1740c.f40191g;
        return Pair.create(c1740c2, c1740c2);
    }

    @Override // p3.u
    public void O0(C0936z0 c0936z0, MediaFormat mediaFormat) {
        int integer;
        int i9;
        InterfaceC2407m interfaceC2407mQ0 = q0();
        if (interfaceC2407mQ0 != null) {
            interfaceC2407mQ0.d(this.f40286Y0);
        }
        int i10 = 0;
        if (this.f40303p1) {
            i9 = c0936z0.f6472r;
            integer = c0936z0.f6473s;
        } else {
            AbstractC1684a.e(mediaFormat);
            boolean z9 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z9 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z9 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i9 = integer2;
        }
        float f9 = c0936z0.f6476v;
        if (H1()) {
            int i11 = c0936z0.f6475u;
            if (i11 == 90 || i11 == 270) {
                f9 = 1.0f / f9;
                int i12 = integer;
                integer = i9;
                i9 = i12;
            }
        } else if (!this.f40276O0.f()) {
            i10 = c0936z0.f6475u;
        }
        this.f40301n1 = new C1737C(i9, integer, i10, f9);
        this.f40274M0.g(c0936z0.f6474t);
        if (this.f40276O0.f()) {
            this.f40276O0.o(c0936z0.b().n0(i9).S(integer).f0(i10).c0(f9).G());
        }
    }

    @Override // p3.u
    public void Q0(long j9) {
        super.Q0(j9);
        if (this.f40303p1) {
            return;
        }
        this.f40295h1--;
    }

    public b Q1(p3.t tVar, C0936z0 c0936z0, C0936z0[] c0936z0Arr) {
        int iO1;
        int iMax = c0936z0.f6472r;
        int iMax2 = c0936z0.f6473s;
        int iS1 = S1(tVar, c0936z0);
        if (c0936z0Arr.length == 1) {
            if (iS1 != -1 && (iO1 = O1(tVar, c0936z0)) != -1) {
                iS1 = Math.min((int) (iS1 * 1.5f), iO1);
            }
            return new b(iMax, iMax2, iS1);
        }
        int length = c0936z0Arr.length;
        boolean z9 = false;
        for (int i9 = 0; i9 < length; i9++) {
            C0936z0 c0936z0G = c0936z0Arr[i9];
            if (c0936z0.f6479y != null && c0936z0G.f6479y == null) {
                c0936z0G = c0936z0G.b().L(c0936z0.f6479y).G();
            }
            if (tVar.f(c0936z0, c0936z0G).f9710d != 0) {
                int i10 = c0936z0G.f6472r;
                z9 |= i10 == -1 || c0936z0G.f6473s == -1;
                iMax = Math.max(iMax, i10);
                iMax2 = Math.max(iMax2, c0936z0G.f6473s);
                iS1 = Math.max(iS1, S1(tVar, c0936z0G));
            }
        }
        if (z9) {
            AbstractC1681B.j("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointP1 = P1(tVar, c0936z0);
            if (pointP1 != null) {
                iMax = Math.max(iMax, pointP1.x);
                iMax2 = Math.max(iMax2, pointP1.y);
                iS1 = Math.max(iS1, O1(tVar, c0936z0.b().n0(iMax).S(iMax2).G()));
                AbstractC1681B.j("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new b(iMax, iMax2, iS1);
    }

    @Override // p3.u
    public void R0() {
        super.R0();
        F1();
    }

    @Override // p3.u
    public void S0(U2.g gVar) {
        boolean z9 = this.f40303p1;
        if (!z9) {
            this.f40295h1++;
        }
        if (k0.f39777a >= 23 || !z9) {
            return;
        }
        f2(gVar.f9701f);
    }

    @Override // p3.u
    public void T0(C0936z0 c0936z0) throws C0927w {
        if (this.f40276O0.f()) {
            return;
        }
        this.f40276O0.h(c0936z0, x0());
    }

    @Override // p3.u
    public U2.h U(p3.t tVar, C0936z0 c0936z0, C0936z0 c0936z02) {
        U2.h hVarF = tVar.f(c0936z0, c0936z02);
        int i9 = hVarF.f9711e;
        int i10 = c0936z02.f6472r;
        b bVar = this.f40280S0;
        if (i10 > bVar.f40307a || c0936z02.f6473s > bVar.f40308b) {
            i9 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if (S1(tVar, c0936z02) > this.f40280S0.f40309c) {
            i9 |= 64;
        }
        int i11 = i9;
        return new U2.h(tVar.f46299a, c0936z0, c0936z02, i11 != 0 ? 0 : hVarF.f9710d, i11);
    }

    public MediaFormat U1(C0936z0 c0936z0, String str, b bVar, float f9, boolean z9, int i9) {
        Pair pairR;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", c0936z0.f6472r);
        mediaFormat.setInteger("height", c0936z0.f6473s);
        E.e(mediaFormat, c0936z0.f6469o);
        E.c(mediaFormat, "frame-rate", c0936z0.f6474t);
        E.d(mediaFormat, "rotation-degrees", c0936z0.f6475u);
        E.b(mediaFormat, c0936z0.f6479y);
        if ("video/dolby-vision".equals(c0936z0.f6467m) && (pairR = AbstractC2392B.r(c0936z0)) != null) {
            E.d(mediaFormat, "profile", ((Integer) pairR.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f40307a);
        mediaFormat.setInteger("max-height", bVar.f40308b);
        E.d(mediaFormat, "max-input-size", bVar.f40309c);
        if (k0.f39777a >= 23) {
            mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
            if (f9 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f9);
            }
        }
        if (z9) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i9 != 0) {
            J1(mediaFormat, i9);
        }
        return mediaFormat;
    }

    @Override // p3.u
    public boolean V0(long j9, long j10, InterfaceC2407m interfaceC2407m, ByteBuffer byteBuffer, int i9, int i10, int i11, long j11, boolean z9, boolean z10, C0936z0 c0936z0) {
        AbstractC1684a.e(interfaceC2407m);
        if (this.f40290c1 == -9223372036854775807L) {
            this.f40290c1 = j9;
        }
        if (j11 != this.f40296i1) {
            if (!this.f40276O0.f()) {
                this.f40274M0.h(j11);
            }
            this.f40296i1 = j11;
        }
        long jX0 = j11 - x0();
        if (z9 && !z10) {
            u2(interfaceC2407m, i9, jX0);
            return true;
        }
        boolean z11 = false;
        boolean z12 = getState() == 2;
        long jE1 = E1(j9, j10, SystemClock.elapsedRealtime() * 1000, j11, z12);
        if (this.f40283V0 == this.f40284W0) {
            if (!V1(jE1)) {
                return false;
            }
            u2(interfaceC2407m, i9, jX0);
            w2(jE1);
            return true;
        }
        if (r2(j9, jE1)) {
            if (!this.f40276O0.f()) {
                z11 = true;
            } else if (!this.f40276O0.i(c0936z0, jX0, z10)) {
                return false;
            }
            j2(interfaceC2407m, c0936z0, i9, jX0, z11);
            w2(jE1);
            return true;
        }
        if (z12 && j9 != this.f40290c1) {
            long jNanoTime = System.nanoTime();
            long jB = this.f40274M0.b((jE1 * 1000) + jNanoTime);
            if (!this.f40276O0.f()) {
                jE1 = (jB - jNanoTime) / 1000;
            }
            boolean z13 = this.f40291d1 != -9223372036854775807L;
            if (p2(jE1, j10, z10) && X1(j9, z13)) {
                return false;
            }
            if (q2(jE1, j10, z10)) {
                if (z13) {
                    u2(interfaceC2407m, i9, jX0);
                } else {
                    L1(interfaceC2407m, i9, jX0);
                }
                w2(jE1);
                return true;
            }
            if (this.f40276O0.f()) {
                this.f40276O0.l(j9, j10);
                if (!this.f40276O0.i(c0936z0, jX0, z10)) {
                    return false;
                }
                j2(interfaceC2407m, c0936z0, i9, jX0, false);
                return true;
            }
            if (k0.f39777a >= 21) {
                if (jE1 < 50000) {
                    if (jB == this.f40300m1) {
                        u2(interfaceC2407m, i9, jX0);
                    } else {
                        e2(jX0, jB, c0936z0);
                        k2(interfaceC2407m, i9, jX0, jB);
                    }
                    w2(jE1);
                    this.f40300m1 = jB;
                    return true;
                }
            } else if (jE1 < 30000) {
                if (jE1 > 11000) {
                    try {
                        Thread.sleep((jE1 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                e2(jX0, jB, c0936z0);
                i2(interfaceC2407m, i9, jX0);
                w2(jE1);
                return true;
            }
        }
        return false;
    }

    public boolean X1(long j9, boolean z9) throws C0927w {
        int iR = R(j9);
        if (iR == 0) {
            return false;
        }
        if (z9) {
            U2.e eVar = this.f46324G0;
            eVar.f9688d += iR;
            eVar.f9690f += this.f40295h1;
        } else {
            this.f46324G0.f9694j++;
            v2(iR, this.f40295h1);
        }
        n0();
        if (this.f40276O0.f()) {
            this.f40276O0.c();
        }
        return true;
    }

    public final void Y1() {
        if (this.f40293f1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f40275N0.n(this.f40293f1, jElapsedRealtime - this.f40292e1);
            this.f40293f1 = 0;
            this.f40292e1 = jElapsedRealtime;
        }
    }

    public void Z1() {
        this.f40289b1 = true;
        if (this.f40287Z0) {
            return;
        }
        this.f40287Z0 = true;
        this.f40275N0.A(this.f40283V0);
        this.f40285X0 = true;
    }

    public final void a2() {
        int i9 = this.f40299l1;
        if (i9 != 0) {
            this.f40275N0.B(this.f40298k1, i9);
            this.f40298k1 = 0L;
            this.f40299l1 = 0;
        }
    }

    @Override // p3.u
    public void b1() {
        super.b1();
        this.f40295h1 = 0;
    }

    public final void b2(C1737C c1737c) {
        if (c1737c.equals(C1737C.f40172f) || c1737c.equals(this.f40302o1)) {
            return;
        }
        this.f40302o1 = c1737c;
        this.f40275N0.D(c1737c);
    }

    public final void c2() {
        if (this.f40285X0) {
            this.f40275N0.A(this.f40283V0);
        }
    }

    @Override // p3.u, O2.C1
    public boolean d() {
        boolean zD = super.d();
        return this.f40276O0.f() ? zD & this.f40276O0.m() : zD;
    }

    public final void d2() {
        C1737C c1737c = this.f40302o1;
        if (c1737c != null) {
            this.f40275N0.D(c1737c);
        }
    }

    @Override // p3.u, O2.C1
    public boolean e() {
        j jVar;
        if (super.e() && ((!this.f40276O0.f() || this.f40276O0.g()) && (this.f40287Z0 || (((jVar = this.f40284W0) != null && this.f40283V0 == jVar) || q0() == null || this.f40303p1)))) {
            this.f40291d1 = -9223372036854775807L;
            return true;
        }
        if (this.f40291d1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f40291d1) {
            return true;
        }
        this.f40291d1 = -9223372036854775807L;
        return false;
    }

    @Override // p3.u
    public C2408n e0(Throwable th, p3.t tVar) {
        return new h(th, tVar, this.f40283V0);
    }

    public final void e2(long j9, long j10, C0936z0 c0936z0) {
        m mVar = this.f40306s1;
        if (mVar != null) {
            mVar.a(j9, j10, c0936z0, u0());
        }
    }

    public void f2(long j9) {
        s1(j9);
        b2(this.f40301n1);
        this.f46324G0.f9689e++;
        Z1();
        Q0(j9);
    }

    public final void g2() {
        h1();
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public final void h2() {
        Surface surface = this.f40283V0;
        j jVar = this.f40284W0;
        if (surface == jVar) {
            this.f40283V0 = null;
        }
        jVar.release();
        this.f40284W0 = null;
    }

    public void i2(InterfaceC2407m interfaceC2407m, int i9, long j9) {
        a0.a("releaseOutputBuffer");
        interfaceC2407m.m(i9, true);
        a0.c();
        this.f46324G0.f9689e++;
        this.f40294g1 = 0;
        if (this.f40276O0.f()) {
            return;
        }
        this.f40297j1 = SystemClock.elapsedRealtime() * 1000;
        b2(this.f40301n1);
        Z1();
    }

    public final void j2(InterfaceC2407m interfaceC2407m, C0936z0 c0936z0, int i9, long j9, boolean z9) {
        long jD = this.f40276O0.f() ? this.f40276O0.d(j9, x0()) * 1000 : System.nanoTime();
        if (z9) {
            e2(j9, jD, c0936z0);
        }
        if (k0.f39777a >= 21) {
            k2(interfaceC2407m, i9, j9, jD);
        } else {
            i2(interfaceC2407m, i9, j9);
        }
    }

    public void k2(InterfaceC2407m interfaceC2407m, int i9, long j9, long j10) {
        a0.a("releaseOutputBuffer");
        interfaceC2407m.j(i9, j10);
        a0.c();
        this.f46324G0.f9689e++;
        this.f40294g1 = 0;
        if (this.f40276O0.f()) {
            return;
        }
        this.f40297j1 = SystemClock.elapsedRealtime() * 1000;
        b2(this.f40301n1);
        Z1();
    }

    @Override // p3.u
    public boolean l1(p3.t tVar) {
        return this.f40283V0 != null || t2(tVar);
    }

    public final void m2() {
        this.f40291d1 = this.f40277P0 > 0 ? SystemClock.elapsedRealtime() + this.f40277P0 : -9223372036854775807L;
    }

    @Override // O2.AbstractC0892k, O2.C0932x1.b
    public void n(int i9, Object obj) throws C0927w {
        Surface surface;
        if (i9 == 1) {
            n2(obj);
            return;
        }
        if (i9 == 7) {
            this.f40306s1 = (m) obj;
            return;
        }
        if (i9 == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f40304q1 != iIntValue) {
                this.f40304q1 = iIntValue;
                if (this.f40303p1) {
                    Z0();
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == 4) {
            this.f40286Y0 = ((Integer) obj).intValue();
            InterfaceC2407m interfaceC2407mQ0 = q0();
            if (interfaceC2407mQ0 != null) {
                interfaceC2407mQ0.d(this.f40286Y0);
                return;
            }
            return;
        }
        if (i9 == 5) {
            this.f40274M0.o(((Integer) obj).intValue());
            return;
        }
        if (i9 == 13) {
            this.f40276O0.q((List) AbstractC1684a.e(obj));
            return;
        }
        if (i9 != 14) {
            super.n(i9, obj);
            return;
        }
        S s9 = (S) AbstractC1684a.e(obj);
        if (s9.b() == 0 || s9.a() == 0 || (surface = this.f40283V0) == null) {
            return;
        }
        this.f40276O0.p(surface, s9);
    }

    @Override // p3.u
    public int o1(p3.w wVar, C0936z0 c0936z0) {
        boolean z9;
        int i9 = 0;
        if (!F.s(c0936z0.f6467m)) {
            return D1.a(0);
        }
        boolean z10 = c0936z0.f6470p != null;
        List listR1 = R1(this.f40273L0, wVar, c0936z0, z10, false);
        if (z10 && listR1.isEmpty()) {
            listR1 = R1(this.f40273L0, wVar, c0936z0, false, false);
        }
        if (listR1.isEmpty()) {
            return D1.a(1);
        }
        if (!p3.u.p1(c0936z0)) {
            return D1.a(2);
        }
        p3.t tVar = (p3.t) listR1.get(0);
        boolean zO = tVar.o(c0936z0);
        if (zO) {
            z9 = true;
        } else {
            for (int i10 = 1; i10 < listR1.size(); i10++) {
                p3.t tVar2 = (p3.t) listR1.get(i10);
                if (tVar2.o(c0936z0)) {
                    tVar = tVar2;
                    z9 = false;
                    zO = true;
                    break;
                }
            }
            z9 = true;
        }
        int i11 = zO ? 4 : 3;
        int i12 = tVar.r(c0936z0) ? 16 : 8;
        int i13 = tVar.f46306h ? 64 : 0;
        int i14 = z9 ? 128 : 0;
        if (k0.f39777a >= 26 && "video/dolby-vision".equals(c0936z0.f6467m) && !a.a(this.f40273L0)) {
            i14 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if (zO) {
            List listR12 = R1(this.f40273L0, wVar, c0936z0, z10, true);
            if (!listR12.isEmpty()) {
                p3.t tVar3 = (p3.t) AbstractC2392B.w(listR12, c0936z0).get(0);
                if (tVar3.o(c0936z0) && tVar3.r(c0936z0)) {
                    i9 = 32;
                }
            }
        }
        return D1.c(i11, i12, i9, i13, i14);
    }

    public void o2(InterfaceC2407m interfaceC2407m, Surface surface) {
        interfaceC2407m.f(surface);
    }

    public boolean p2(long j9, long j10, boolean z9) {
        return W1(j9) && !z9;
    }

    public boolean q2(long j9, long j10, boolean z9) {
        return V1(j9) && !z9;
    }

    public final boolean r2(long j9, long j10) {
        boolean z9 = getState() == 2;
        boolean z10 = this.f40289b1 ? !this.f40287Z0 : z9 || this.f40288a1;
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.f40297j1;
        if (this.f40291d1 != -9223372036854775807L || j9 < x0()) {
            return false;
        }
        return z10 || (z9 && s2(j10, jElapsedRealtime));
    }

    @Override // p3.u, O2.AbstractC0892k, O2.C1
    public void s(float f9, float f10) throws C0927w {
        super.s(f9, f10);
        this.f40274M0.i(f9);
    }

    @Override // p3.u
    public boolean s0() {
        return this.f40303p1 && k0.f39777a < 23;
    }

    public boolean s2(long j9, long j10) {
        return V1(j9) && j10 > 100000;
    }

    @Override // p3.u
    public float t0(float f9, C0936z0 c0936z0, C0936z0[] c0936z0Arr) {
        float fMax = -1.0f;
        for (C0936z0 c0936z02 : c0936z0Arr) {
            float f10 = c0936z02.f6474t;
            if (f10 != -1.0f) {
                fMax = Math.max(fMax, f10);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f9;
    }

    public final boolean t2(p3.t tVar) {
        return k0.f39777a >= 23 && !this.f40303p1 && !I1(tVar.f46299a) && (!tVar.f46305g || j.c(this.f40273L0));
    }

    @Override // p3.u, O2.C1
    public void u(long j9, long j10) throws C0927w {
        super.u(j9, j10);
        if (this.f40276O0.f()) {
            this.f40276O0.l(j9, j10);
        }
    }

    public void u2(InterfaceC2407m interfaceC2407m, int i9, long j9) {
        a0.a("skipVideoBuffer");
        interfaceC2407m.m(i9, false);
        a0.c();
        this.f46324G0.f9690f++;
    }

    @Override // p3.u
    public List v0(p3.w wVar, C0936z0 c0936z0, boolean z9) {
        return AbstractC2392B.w(R1(this.f40273L0, wVar, c0936z0, z9, this.f40303p1), c0936z0);
    }

    public void v2(int i9, int i10) {
        U2.e eVar = this.f46324G0;
        eVar.f9692h += i9;
        int i11 = i9 + i10;
        eVar.f9691g += i11;
        this.f40293f1 += i11;
        int i12 = this.f40294g1 + i11;
        this.f40294g1 = i12;
        eVar.f9693i = Math.max(i12, eVar.f9693i);
        int i13 = this.f40278Q0;
        if (i13 <= 0 || this.f40293f1 < i13) {
            return;
        }
        Y1();
    }

    @Override // p3.u
    public InterfaceC2407m.a w0(p3.t tVar, C0936z0 c0936z0, MediaCrypto mediaCrypto, float f9) {
        j jVar = this.f40284W0;
        if (jVar != null && jVar.f40337a != tVar.f46305g) {
            h2();
        }
        String str = tVar.f46301c;
        b bVarQ1 = Q1(tVar, c0936z0, E());
        this.f40280S0 = bVarQ1;
        MediaFormat mediaFormatU1 = U1(c0936z0, str, bVarQ1, f9, this.f40279R0, this.f40303p1 ? this.f40304q1 : 0);
        if (this.f40283V0 == null) {
            if (!t2(tVar)) {
                throw new IllegalStateException();
            }
            if (this.f40284W0 == null) {
                this.f40284W0 = j.d(this.f40273L0, tVar.f46305g);
            }
            this.f40283V0 = this.f40284W0;
        }
        if (this.f40276O0.f()) {
            mediaFormatU1 = this.f40276O0.a(mediaFormatU1);
        }
        return InterfaceC2407m.a.b(tVar, mediaFormatU1, c0936z0, this.f40276O0.f() ? this.f40276O0.e() : this.f40283V0, mediaCrypto);
    }

    public void w2(long j9) {
        this.f46324G0.a(j9);
        this.f40298k1 += j9;
        this.f40299l1++;
    }

    @Override // p3.u
    public void z0(U2.g gVar) {
        if (this.f40282U0) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1684a.e(gVar.f9702g);
            if (byteBuffer.remaining() >= 7) {
                byte b9 = byteBuffer.get();
                short s9 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b9 == -75 && s9 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        l2(q0(), bArr);
                    }
                }
            }
        }
    }
}
