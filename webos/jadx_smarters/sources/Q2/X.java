package Q2;

import O2.C0917s1;
import O2.C0936z0;
import O2.InterfaceC0933y;
import P2.v0;
import Q2.B;
import Q2.C1023i;
import Q2.E;
import Q2.InterfaceC1027m;
import Q2.Y;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.ads.interactivemedia.v3.internal.AbstractC1318m1;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.C1691h;
import d4.InterfaceC1688e;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import s5.AbstractC2743y;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import u0.ExecutorC2838w;

/* JADX INFO: loaded from: classes3.dex */
public final class X implements B {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static boolean f7616h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Object f7617i0 = new Object();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static ExecutorService f7618j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static int f7619k0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public j f7620A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public j f7621B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0917s1 f7622C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f7623D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ByteBuffer f7624E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f7625F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f7626G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f7627H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f7628I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f7629J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f7630K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f7631L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f7632M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f7633N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f7634O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ByteBuffer f7635P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f7636Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ByteBuffer f7637R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public byte[] f7638S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f7639T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f7640U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f7641V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f7642W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f7643X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f7644Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public F f7645Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7646a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public d f7647a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1028n f7648b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f7649b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7650c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f7651c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f7652d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f7653d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0 f7654e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f7655e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC2743y f7656f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f7657f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC2743y f7658g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Looper f7659g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1691h f7660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E f7661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque f7662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f7665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f7666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k f7667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f7668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0933y.a f7669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v0 f7670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B.c f7671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g f7672t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f7673u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1026l f7674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AudioTrack f7675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1022h f7676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C1023i f7677y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1019e f7678z;

    public static final class b {
        public static void a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f7679a);
        }
    }

    public static final class c {
        public static void a(AudioTrack audioTrack, v0 v0Var) {
            LogSessionId logSessionIdA = v0Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioDeviceInfo f7679a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f7679a = audioDeviceInfo;
        }
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f7680a = new Y.a().g();

        int a(int i9, int i10, int i11, int i12, int i13, int i14, double d9);
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1022h f7682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC1028n f7683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e f7687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InterfaceC0933y.a f7688h;

        public f() {
            this.f7681a = null;
            this.f7682b = C1022h.f7852c;
            this.f7686f = 0;
            this.f7687g = e.f7680a;
        }

        public f(Context context) {
            this.f7681a = context;
            this.f7682b = C1022h.f7852c;
            this.f7686f = 0;
            this.f7687g = e.f7680a;
        }

        public X g() {
            if (this.f7683c == null) {
                this.f7683c = new h(new InterfaceC1027m[0]);
            }
            return new X(this);
        }

        public f h(C1022h c1022h) {
            AbstractC1684a.e(c1022h);
            this.f7682b = c1022h;
            return this;
        }

        public f i(InterfaceC1028n interfaceC1028n) {
            AbstractC1684a.e(interfaceC1028n);
            this.f7683c = interfaceC1028n;
            return this;
        }

        public f j(InterfaceC1027m[] interfaceC1027mArr) {
            AbstractC1684a.e(interfaceC1027mArr);
            return i(new h(interfaceC1027mArr));
        }

        public f k(boolean z9) {
            this.f7685e = z9;
            return this;
        }

        public f l(boolean z9) {
            this.f7684d = z9;
            return this;
        }

        public f m(int i9) {
            this.f7686f = i9;
            return this;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0936z0 f7689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7694f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f7695g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f7696h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final C1026l f7697i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f7698j;

        public g(C0936z0 c0936z0, int i9, int i10, int i11, int i12, int i13, int i14, int i15, C1026l c1026l, boolean z9) {
            this.f7689a = c0936z0;
            this.f7690b = i9;
            this.f7691c = i10;
            this.f7692d = i11;
            this.f7693e = i12;
            this.f7694f = i13;
            this.f7695g = i14;
            this.f7696h = i15;
            this.f7697i = c1026l;
            this.f7698j = z9;
        }

        public static AudioAttributes i(C1019e c1019e, boolean z9) {
            return z9 ? j() : c1019e.b().f7797a;
        }

        public static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z9, C1019e c1019e, int i9) throws B.b {
            try {
                AudioTrack audioTrackD = d(z9, c1019e, i9);
                int state = audioTrackD.getState();
                if (state == 1) {
                    return audioTrackD;
                }
                try {
                    audioTrackD.release();
                } catch (Exception unused) {
                }
                throw new B.b(state, this.f7693e, this.f7694f, this.f7696h, this.f7689a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e9) {
                throw new B.b(0, this.f7693e, this.f7694f, this.f7696h, this.f7689a, l(), e9);
            }
        }

        public boolean b(g gVar) {
            return gVar.f7691c == this.f7691c && gVar.f7695g == this.f7695g && gVar.f7693e == this.f7693e && gVar.f7694f == this.f7694f && gVar.f7692d == this.f7692d && gVar.f7698j == this.f7698j;
        }

        public g c(int i9) {
            return new g(this.f7689a, this.f7690b, this.f7691c, this.f7692d, this.f7693e, this.f7694f, this.f7695g, i9, this.f7697i, this.f7698j);
        }

        public final AudioTrack d(boolean z9, C1019e c1019e, int i9) {
            int i10 = d4.k0.f39777a;
            return i10 >= 29 ? f(z9, c1019e, i9) : i10 >= 21 ? e(z9, c1019e, i9) : g(c1019e, i9);
        }

        public final AudioTrack e(boolean z9, C1019e c1019e, int i9) {
            return new AudioTrack(i(c1019e, z9), X.L(this.f7693e, this.f7694f, this.f7695g), this.f7696h, 1, i9);
        }

        public final AudioTrack f(boolean z9, C1019e c1019e, int i9) {
            return AbstractC1318m1.a().setAudioAttributes(i(c1019e, z9)).setAudioFormat(X.L(this.f7693e, this.f7694f, this.f7695g)).setTransferMode(1).setBufferSizeInBytes(this.f7696h).setSessionId(i9).setOffloadedPlayback(this.f7691c == 1).build();
        }

        public final AudioTrack g(C1019e c1019e, int i9) {
            int iL0 = d4.k0.l0(c1019e.f7793d);
            int i10 = this.f7693e;
            int i11 = this.f7694f;
            int i12 = this.f7695g;
            int i13 = this.f7696h;
            return i9 == 0 ? new AudioTrack(iL0, i10, i11, i12, i13, 1) : new AudioTrack(iL0, i10, i11, i12, i13, 1, i9);
        }

        public long h(long j9) {
            return (j9 * 1000000) / ((long) this.f7693e);
        }

        public long k(long j9) {
            return (j9 * 1000000) / ((long) this.f7689a.f6447A);
        }

        public boolean l() {
            return this.f7691c == 1;
        }
    }

    public static class h implements InterfaceC1028n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1027m[] f7699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f7700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g0 f7701c;

        public h(InterfaceC1027m... interfaceC1027mArr) {
            this(interfaceC1027mArr, new e0(), new g0());
        }

        public h(InterfaceC1027m[] interfaceC1027mArr, e0 e0Var, g0 g0Var) {
            InterfaceC1027m[] interfaceC1027mArr2 = new InterfaceC1027m[interfaceC1027mArr.length + 2];
            this.f7699a = interfaceC1027mArr2;
            System.arraycopy(interfaceC1027mArr, 0, interfaceC1027mArr2, 0, interfaceC1027mArr.length);
            this.f7700b = e0Var;
            this.f7701c = g0Var;
            interfaceC1027mArr2[interfaceC1027mArr.length] = e0Var;
            interfaceC1027mArr2[interfaceC1027mArr.length + 1] = g0Var;
        }

        @Override // Q2.InterfaceC1028n
        public long a(long j9) {
            return this.f7701c.f(j9);
        }

        @Override // Q2.InterfaceC1028n
        public InterfaceC1027m[] b() {
            return this.f7699a;
        }

        @Override // Q2.InterfaceC1028n
        public C0917s1 c(C0917s1 c0917s1) {
            this.f7701c.h(c0917s1.f6231a);
            this.f7701c.g(c0917s1.f6232c);
            return c0917s1;
        }

        @Override // Q2.InterfaceC1028n
        public long d() {
            return this.f7700b.o();
        }

        @Override // Q2.InterfaceC1028n
        public boolean e(boolean z9) {
            this.f7700b.u(z9);
            return z9;
        }
    }

    public static final class i extends RuntimeException {
        public i(String str) {
            super(str);
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0917s1 f7702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7704c;

        public j(C0917s1 c0917s1, long j9, long j10) {
            this.f7702a = c0917s1;
            this.f7703b = j9;
            this.f7704c = j10;
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Exception f7706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7707c;

        public k(long j9) {
            this.f7705a = j9;
        }

        public void a() {
            this.f7706b = null;
        }

        public void b(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f7706b == null) {
                this.f7706b = exc;
                this.f7707c = this.f7705a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f7707c) {
                Exception exc2 = this.f7706b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f7706b;
                a();
                throw exc3;
            }
        }
    }

    public final class l implements E.a {
        public l() {
        }

        @Override // Q2.E.a
        public void a(int i9, long j9) {
            if (X.this.f7671s != null) {
                X.this.f7671s.e(i9, j9, SystemClock.elapsedRealtime() - X.this.f7653d0);
            }
        }

        @Override // Q2.E.a
        public void b(long j9) {
            AbstractC1681B.j("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j9);
        }

        @Override // Q2.E.a
        public void c(long j9) {
            if (X.this.f7671s != null) {
                X.this.f7671s.c(j9);
            }
        }

        @Override // Q2.E.a
        public void d(long j9, long j10, long j11, long j12) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j9 + ", " + j10 + ", " + j11 + ", " + j12 + ", " + X.this.P() + ", " + X.this.Q();
            if (X.f7616h0) {
                throw new i(str);
            }
            AbstractC1681B.j("DefaultAudioSink", str);
        }

        @Override // Q2.E.a
        public void e(long j9, long j10, long j11, long j12) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j9 + ", " + j10 + ", " + j11 + ", " + j12 + ", " + X.this.P() + ", " + X.this.Q();
            if (X.f7616h0) {
                throw new i(str);
            }
            AbstractC1681B.j("DefaultAudioSink", str);
        }
    }

    public final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f7709a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTrack.StreamEventCallback f7710b;

        public class a extends AudioTrack.StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ X f7712a;

            public a(X x9) {
                this.f7712a = x9;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i9) {
                if (audioTrack.equals(X.this.f7675w) && X.this.f7671s != null && X.this.f7642W) {
                    X.this.f7671s.h();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(X.this.f7675w) && X.this.f7671s != null && X.this.f7642W) {
                    X.this.f7671s.h();
                }
            }
        }

        public m() {
            this.f7710b = new a(X.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f7709a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC2838w(handler), this.f7710b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f7710b);
            this.f7709a.removeCallbacksAndMessages(null);
        }
    }

    public X(f fVar) {
        Context context = fVar.f7681a;
        this.f7646a = context;
        this.f7676x = context != null ? C1022h.c(context) : fVar.f7682b;
        this.f7648b = fVar.f7683c;
        int i9 = d4.k0.f39777a;
        this.f7650c = i9 >= 21 && fVar.f7684d;
        this.f7663k = i9 >= 23 && fVar.f7685e;
        this.f7664l = i9 >= 29 ? fVar.f7686f : 0;
        this.f7668p = fVar.f7687g;
        C1691h c1691h = new C1691h(InterfaceC1688e.f39758a);
        this.f7660h = c1691h;
        c1691h.f();
        this.f7661i = new E(new l());
        H h9 = new H();
        this.f7652d = h9;
        j0 j0Var = new j0();
        this.f7654e = j0Var;
        this.f7656f = AbstractC2743y.D(new i0(), h9, j0Var);
        this.f7658g = AbstractC2743y.A(new h0());
        this.f7634O = 1.0f;
        this.f7678z = C1019e.f7784h;
        this.f7644Y = 0;
        this.f7645Z = new F(0, 0.0f);
        C0917s1 c0917s1 = C0917s1.f6227e;
        this.f7621B = new j(c0917s1, 0L, 0L);
        this.f7622C = c0917s1;
        this.f7623D = false;
        this.f7662j = new ArrayDeque();
        this.f7666n = new k(100L);
        this.f7667o = new k(100L);
        this.f7669q = fVar.f7688h;
    }

    public static AudioFormat L(int i9, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i9).setChannelMask(i10).setEncoding(i11).build();
    }

    public static int M(int i9, int i10, int i11) {
        int minBufferSize = AudioTrack.getMinBufferSize(i9, i10, i11);
        AbstractC1684a.g(minBufferSize != -2);
        return minBufferSize;
    }

    public static int N(int i9, ByteBuffer byteBuffer) {
        switch (i9) {
            case 5:
            case 6:
            case 18:
                return AbstractC1016b.e(byteBuffer);
            case 7:
            case 8:
                return Z.e(byteBuffer);
            case 9:
                int iM = b0.m(d4.k0.K(byteBuffer, byteBuffer.position()));
                if (iM != -1) {
                    return iM;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i9);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int iB = AbstractC1016b.b(byteBuffer);
                if (iB == -1) {
                    return 0;
                }
                return AbstractC1016b.i(byteBuffer, iB) * 16;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            case 16:
                return 1024;
            case LangUtils.HASH_SEED /* 17 */:
                return AbstractC1017c.c(byteBuffer);
            case 20:
                return d0.g(byteBuffer);
        }
    }

    public static boolean S(int i9) {
        return (d4.k0.f39777a >= 24 && i9 == -6) || i9 == -32;
    }

    public static boolean U(AudioTrack audioTrack) {
        return d4.k0.f39777a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static /* synthetic */ void V(AudioTrack audioTrack, C1691h c1691h) {
        try {
            audioTrack.flush();
            audioTrack.release();
            c1691h.f();
            synchronized (f7617i0) {
                try {
                    int i9 = f7619k0 - 1;
                    f7619k0 = i9;
                    if (i9 == 0) {
                        f7618j0.shutdown();
                        f7618j0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            c1691h.f();
            synchronized (f7617i0) {
                try {
                    int i10 = f7619k0 - 1;
                    f7619k0 = i10;
                    if (i10 == 0) {
                        f7618j0.shutdown();
                        f7618j0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public static void b0(final AudioTrack audioTrack, final C1691h c1691h) {
        c1691h.d();
        synchronized (f7617i0) {
            try {
                if (f7618j0 == null) {
                    f7618j0 = d4.k0.Q0("ExoPlayer:AudioTrackReleaseThread");
                }
                f7619k0++;
                f7618j0.execute(new Runnable() { // from class: Q2.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        X.V(audioTrack, c1691h);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g0(AudioTrack audioTrack, float f9) {
        audioTrack.setVolume(f9);
    }

    public static void h0(AudioTrack audioTrack, float f9) {
        audioTrack.setStereoVolume(f9, f9);
    }

    public static int o0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i9) {
        return audioTrack.write(byteBuffer, i9, 1);
    }

    public final void E(long j9) {
        C0917s1 c0917s1C;
        if (l0()) {
            c0917s1C = C0917s1.f6227e;
        } else {
            c0917s1C = j0() ? this.f7648b.c(this.f7622C) : C0917s1.f6227e;
            this.f7622C = c0917s1C;
        }
        C0917s1 c0917s1 = c0917s1C;
        this.f7623D = j0() ? this.f7648b.e(this.f7623D) : false;
        this.f7662j.add(new j(c0917s1, Math.max(0L, j9), this.f7673u.h(Q())));
        i0();
        B.c cVar = this.f7671s;
        if (cVar != null) {
            cVar.a(this.f7623D);
        }
    }

    public final long F(long j9) {
        while (!this.f7662j.isEmpty() && j9 >= ((j) this.f7662j.getFirst()).f7704c) {
            this.f7621B = (j) this.f7662j.remove();
        }
        j jVar = this.f7621B;
        long j10 = j9 - jVar.f7704c;
        if (jVar.f7702a.equals(C0917s1.f6227e)) {
            return this.f7621B.f7703b + j10;
        }
        if (this.f7662j.isEmpty()) {
            return this.f7621B.f7703b + this.f7648b.a(j10);
        }
        j jVar2 = (j) this.f7662j.getFirst();
        return jVar2.f7703b - d4.k0.f0(jVar2.f7704c - j9, this.f7621B.f7702a.f6231a);
    }

    public final long G(long j9) {
        return j9 + this.f7673u.h(this.f7648b.d());
    }

    public final AudioTrack H(g gVar) throws B.b {
        try {
            AudioTrack audioTrackA = gVar.a(this.f7649b0, this.f7678z, this.f7644Y);
            InterfaceC0933y.a aVar = this.f7669q;
            if (aVar != null) {
                aVar.D(U(audioTrackA));
            }
            return audioTrackA;
        } catch (B.b e9) {
            B.c cVar = this.f7671s;
            if (cVar != null) {
                cVar.b(e9);
            }
            throw e9;
        }
    }

    public final AudioTrack I() throws B.b {
        try {
            return H((g) AbstractC1684a.e(this.f7673u));
        } catch (B.b e9) {
            g gVar = this.f7673u;
            if (gVar.f7696h > 1000000) {
                g gVarC = gVar.c(1000000);
                try {
                    AudioTrack audioTrackH = H(gVarC);
                    this.f7673u = gVarC;
                    return audioTrackH;
                } catch (B.b e10) {
                    e9.addSuppressed(e10);
                    W();
                    throw e9;
                }
            }
            W();
            throw e9;
        }
    }

    public final boolean J() throws Exception {
        if (!this.f7674v.f()) {
            ByteBuffer byteBuffer = this.f7637R;
            if (byteBuffer == null) {
                return true;
            }
            n0(byteBuffer, Long.MIN_VALUE);
            return this.f7637R == null;
        }
        this.f7674v.h();
        Z(Long.MIN_VALUE);
        if (!this.f7674v.e()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f7637R;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final C1022h K() {
        if (this.f7677y == null && this.f7646a != null) {
            this.f7659g0 = Looper.myLooper();
            C1023i c1023i = new C1023i(this.f7646a, new C1023i.f() { // from class: Q2.V
                @Override // Q2.C1023i.f
                public final void a(C1022h c1022h) {
                    this.f7613a.X(c1022h);
                }
            });
            this.f7677y = c1023i;
            this.f7676x = c1023i.d();
        }
        return this.f7676x;
    }

    public final int O(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i9 = d4.k0.f39777a;
        if (i9 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i9 == 30 && d4.k0.f39780d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    public final long P() {
        g gVar = this.f7673u;
        return gVar.f7691c == 0 ? this.f7626G / ((long) gVar.f7690b) : this.f7627H;
    }

    public final long Q() {
        g gVar = this.f7673u;
        return gVar.f7691c == 0 ? this.f7628I / ((long) gVar.f7692d) : this.f7629J;
    }

    public final boolean R() throws B.b {
        v0 v0Var;
        if (!this.f7660h.e()) {
            return false;
        }
        AudioTrack audioTrackI = I();
        this.f7675w = audioTrackI;
        if (U(audioTrackI)) {
            a0(this.f7675w);
            if (this.f7664l != 3) {
                AudioTrack audioTrack = this.f7675w;
                C0936z0 c0936z0 = this.f7673u.f7689a;
                audioTrack.setOffloadDelayPadding(c0936z0.f6449C, c0936z0.f6450D);
            }
        }
        int i9 = d4.k0.f39777a;
        if (i9 >= 31 && (v0Var = this.f7670r) != null) {
            c.a(this.f7675w, v0Var);
        }
        this.f7644Y = this.f7675w.getAudioSessionId();
        E e9 = this.f7661i;
        AudioTrack audioTrack2 = this.f7675w;
        g gVar = this.f7673u;
        e9.t(audioTrack2, gVar.f7691c == 2, gVar.f7695g, gVar.f7692d, gVar.f7696h);
        f0();
        int i10 = this.f7645Z.f7576a;
        if (i10 != 0) {
            this.f7675w.attachAuxEffect(i10);
            this.f7675w.setAuxEffectSendLevel(this.f7645Z.f7577b);
        }
        d dVar = this.f7647a0;
        if (dVar != null && i9 >= 23) {
            b.a(this.f7675w, dVar);
        }
        this.f7632M = true;
        return true;
    }

    public final boolean T() {
        return this.f7675w != null;
    }

    public final void W() {
        if (this.f7673u.l()) {
            this.f7655e0 = true;
        }
    }

    public void X(C1022h c1022h) {
        AbstractC1684a.g(this.f7659g0 == Looper.myLooper());
        if (c1022h.equals(K())) {
            return;
        }
        this.f7676x = c1022h;
        B.c cVar = this.f7671s;
        if (cVar != null) {
            cVar.f();
        }
    }

    public final void Y() {
        if (this.f7641V) {
            return;
        }
        this.f7641V = true;
        this.f7661i.h(Q());
        this.f7675w.stop();
        this.f7625F = 0;
    }

    public final void Z(long j9) throws Exception {
        ByteBuffer byteBufferD;
        if (!this.f7674v.f()) {
            ByteBuffer byteBuffer = this.f7635P;
            if (byteBuffer == null) {
                byteBuffer = InterfaceC1027m.f7885a;
            }
            n0(byteBuffer, j9);
            return;
        }
        while (!this.f7674v.e()) {
            do {
                byteBufferD = this.f7674v.d();
                if (byteBufferD.hasRemaining()) {
                    n0(byteBufferD, j9);
                } else {
                    ByteBuffer byteBuffer2 = this.f7635P;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f7674v.i(this.f7635P);
                    }
                }
            } while (!byteBufferD.hasRemaining());
            return;
        }
    }

    @Override // Q2.B
    public boolean a(C0936z0 c0936z0) {
        return j(c0936z0) != 0;
    }

    public final void a0(AudioTrack audioTrack) {
        if (this.f7665m == null) {
            this.f7665m = new m();
        }
        this.f7665m.a(audioTrack);
    }

    @Override // Q2.B
    public void b(C0917s1 c0917s1) {
        this.f7622C = new C0917s1(d4.k0.q(c0917s1.f6231a, 0.1f, 8.0f), d4.k0.q(c0917s1.f6232c, 0.1f, 8.0f));
        if (l0()) {
            e0();
        } else {
            d0(c0917s1);
        }
    }

    @Override // Q2.B
    public C0917s1 c() {
        return this.f7622C;
    }

    public final void c0() {
        this.f7626G = 0L;
        this.f7627H = 0L;
        this.f7628I = 0L;
        this.f7629J = 0L;
        this.f7657f0 = false;
        this.f7630K = 0;
        this.f7621B = new j(this.f7622C, 0L, 0L);
        this.f7633N = 0L;
        this.f7620A = null;
        this.f7662j.clear();
        this.f7635P = null;
        this.f7636Q = 0;
        this.f7637R = null;
        this.f7641V = false;
        this.f7640U = false;
        this.f7624E = null;
        this.f7625F = 0;
        this.f7654e.m();
        i0();
    }

    @Override // Q2.B
    public boolean d() {
        return !T() || (this.f7640U && !f());
    }

    public final void d0(C0917s1 c0917s1) {
        j jVar = new j(c0917s1, -9223372036854775807L, -9223372036854775807L);
        if (T()) {
            this.f7620A = jVar;
        } else {
            this.f7621B = jVar;
        }
    }

    @Override // Q2.B
    public void e(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.f7647a0 = dVar;
        AudioTrack audioTrack = this.f7675w;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    public final void e0() {
        if (T()) {
            try {
                this.f7675w.setPlaybackParams(J.a().allowDefaults().setSpeed(this.f7622C.f6231a).setPitch(this.f7622C.f6232c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e9) {
                AbstractC1681B.k("DefaultAudioSink", "Failed to set playback params", e9);
            }
            C0917s1 c0917s1 = new C0917s1(this.f7675w.getPlaybackParams().getSpeed(), this.f7675w.getPlaybackParams().getPitch());
            this.f7622C = c0917s1;
            this.f7661i.u(c0917s1.f6231a);
        }
    }

    @Override // Q2.B
    public boolean f() {
        return T() && this.f7661i.i(Q());
    }

    public final void f0() {
        if (T()) {
            if (d4.k0.f39777a >= 21) {
                g0(this.f7675w, this.f7634O);
            } else {
                h0(this.f7675w, this.f7634O);
            }
        }
    }

    @Override // Q2.B
    public void flush() {
        if (T()) {
            c0();
            if (this.f7661i.j()) {
                this.f7675w.pause();
            }
            if (U(this.f7675w)) {
                ((m) AbstractC1684a.e(this.f7665m)).b(this.f7675w);
            }
            if (d4.k0.f39777a < 21 && !this.f7643X) {
                this.f7644Y = 0;
            }
            g gVar = this.f7672t;
            if (gVar != null) {
                this.f7673u = gVar;
                this.f7672t = null;
            }
            this.f7661i.r();
            b0(this.f7675w, this.f7660h);
            this.f7675w = null;
        }
        this.f7667o.a();
        this.f7666n.a();
    }

    @Override // Q2.B
    public void g(int i9) {
        if (this.f7644Y != i9) {
            this.f7644Y = i9;
            this.f7643X = i9 != 0;
            flush();
        }
    }

    @Override // Q2.B
    public void h() {
        if (this.f7649b0) {
            this.f7649b0 = false;
            flush();
        }
    }

    @Override // Q2.B
    public void i(v0 v0Var) {
        this.f7670r = v0Var;
    }

    public final void i0() {
        C1026l c1026l = this.f7673u.f7697i;
        this.f7674v = c1026l;
        c1026l.b();
    }

    @Override // Q2.B
    public int j(C0936z0 c0936z0) {
        if (!"audio/raw".equals(c0936z0.f6467m)) {
            return ((this.f7655e0 || !m0(c0936z0, this.f7678z)) && !K().i(c0936z0)) ? 0 : 2;
        }
        if (d4.k0.D0(c0936z0.f6448B)) {
            int i9 = c0936z0.f6448B;
            return (i9 == 2 || (this.f7650c && i9 == 4)) ? 2 : 1;
        }
        AbstractC1681B.j("DefaultAudioSink", "Invalid PCM encoding: " + c0936z0.f6448B);
        return 0;
    }

    public final boolean j0() {
        if (!this.f7649b0) {
            g gVar = this.f7673u;
            if (gVar.f7691c == 0 && !k0(gVar.f7689a.f6448B)) {
                return true;
            }
        }
        return false;
    }

    @Override // Q2.B
    public void k(B.c cVar) {
        this.f7671s = cVar;
    }

    public final boolean k0(int i9) {
        return this.f7650c && d4.k0.C0(i9);
    }

    @Override // Q2.B
    public boolean l(ByteBuffer byteBuffer, long j9, int i9) throws Exception {
        ByteBuffer byteBuffer2 = this.f7635P;
        AbstractC1684a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f7672t != null) {
            if (!J()) {
                return false;
            }
            if (this.f7672t.b(this.f7673u)) {
                this.f7673u = this.f7672t;
                this.f7672t = null;
                if (U(this.f7675w) && this.f7664l != 3) {
                    if (this.f7675w.getPlayState() == 3) {
                        this.f7675w.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f7675w;
                    C0936z0 c0936z0 = this.f7673u.f7689a;
                    audioTrack.setOffloadDelayPadding(c0936z0.f6449C, c0936z0.f6450D);
                    this.f7657f0 = true;
                }
            } else {
                Y();
                if (f()) {
                    return false;
                }
                flush();
            }
            E(j9);
        }
        if (!T()) {
            try {
                if (!R()) {
                    return false;
                }
            } catch (B.b e9) {
                if (e9.f7525c) {
                    throw e9;
                }
                this.f7666n.b(e9);
                return false;
            }
        }
        this.f7666n.a();
        if (this.f7632M) {
            this.f7633N = Math.max(0L, j9);
            this.f7631L = false;
            this.f7632M = false;
            if (l0()) {
                e0();
            }
            E(j9);
            if (this.f7642W) {
                play();
            }
        }
        if (!this.f7661i.l(Q())) {
            return false;
        }
        if (this.f7635P == null) {
            AbstractC1684a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f7673u;
            if (gVar.f7691c != 0 && this.f7630K == 0) {
                int iN = N(gVar.f7695g, byteBuffer);
                this.f7630K = iN;
                if (iN == 0) {
                    return true;
                }
            }
            if (this.f7620A != null) {
                if (!J()) {
                    return false;
                }
                E(j9);
                this.f7620A = null;
            }
            long jK = this.f7633N + this.f7673u.k(P() - this.f7654e.l());
            if (!this.f7631L && Math.abs(jK - j9) > 200000) {
                B.c cVar = this.f7671s;
                if (cVar != null) {
                    cVar.b(new B.d(j9, jK));
                }
                this.f7631L = true;
            }
            if (this.f7631L) {
                if (!J()) {
                    return false;
                }
                long j10 = j9 - jK;
                this.f7633N += j10;
                this.f7631L = false;
                E(j9);
                B.c cVar2 = this.f7671s;
                if (cVar2 != null && j10 != 0) {
                    cVar2.g();
                }
            }
            if (this.f7673u.f7691c == 0) {
                this.f7626G += (long) byteBuffer.remaining();
            } else {
                this.f7627H += ((long) this.f7630K) * ((long) i9);
            }
            this.f7635P = byteBuffer;
            this.f7636Q = i9;
        }
        Z(j9);
        if (!this.f7635P.hasRemaining()) {
            this.f7635P = null;
            this.f7636Q = 0;
            return true;
        }
        if (!this.f7661i.k(Q())) {
            return false;
        }
        AbstractC1681B.j("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    public final boolean l0() {
        g gVar = this.f7673u;
        return gVar != null && gVar.f7698j && d4.k0.f39777a >= 23;
    }

    @Override // Q2.B
    public void m(F f9) {
        if (this.f7645Z.equals(f9)) {
            return;
        }
        int i9 = f9.f7576a;
        float f10 = f9.f7577b;
        AudioTrack audioTrack = this.f7675w;
        if (audioTrack != null) {
            if (this.f7645Z.f7576a != i9) {
                audioTrack.attachAuxEffect(i9);
            }
            if (i9 != 0) {
                this.f7675w.setAuxEffectSendLevel(f10);
            }
        }
        this.f7645Z = f9;
    }

    public final boolean m0(C0936z0 c0936z0, C1019e c1019e) {
        int iF;
        int I9;
        int iO;
        if (d4.k0.f39777a < 29 || this.f7664l == 0 || (iF = d4.F.f((String) AbstractC1684a.e(c0936z0.f6467m), c0936z0.f6464j)) == 0 || (I9 = d4.k0.I(c0936z0.f6480z)) == 0 || (iO = O(L(c0936z0.f6447A, I9, iF), c1019e.b().f7797a)) == 0) {
            return false;
        }
        if (iO == 1) {
            return ((c0936z0.f6449C != 0 || c0936z0.f6450D != 0) && (this.f7664l == 1)) ? false : true;
        }
        if (iO == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // Q2.B
    public void n() {
        if (d4.k0.f39777a < 25) {
            flush();
            return;
        }
        this.f7667o.a();
        this.f7666n.a();
        if (T()) {
            c0();
            if (this.f7661i.j()) {
                this.f7675w.pause();
            }
            this.f7675w.flush();
            this.f7661i.r();
            E e9 = this.f7661i;
            AudioTrack audioTrack = this.f7675w;
            g gVar = this.f7673u;
            e9.t(audioTrack, gVar.f7691c == 2, gVar.f7695g, gVar.f7692d, gVar.f7696h);
            this.f7632M = true;
        }
    }

    public final void n0(ByteBuffer byteBuffer, long j9) throws Exception {
        int iO0;
        B.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f7637R;
            if (byteBuffer2 != null) {
                AbstractC1684a.a(byteBuffer2 == byteBuffer);
            } else {
                this.f7637R = byteBuffer;
                if (d4.k0.f39777a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f7638S;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f7638S = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f7638S, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f7639T = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (d4.k0.f39777a < 21) {
                int iD = this.f7661i.d(this.f7628I);
                if (iD > 0) {
                    iO0 = this.f7675w.write(this.f7638S, this.f7639T, Math.min(iRemaining2, iD));
                    if (iO0 > 0) {
                        this.f7639T += iO0;
                        byteBuffer.position(byteBuffer.position() + iO0);
                    }
                } else {
                    iO0 = 0;
                }
            } else if (this.f7649b0) {
                AbstractC1684a.g(j9 != -9223372036854775807L);
                if (j9 == Long.MIN_VALUE) {
                    j9 = this.f7651c0;
                } else {
                    this.f7651c0 = j9;
                }
                iO0 = p0(this.f7675w, byteBuffer, iRemaining2, j9);
            } else {
                iO0 = o0(this.f7675w, byteBuffer, iRemaining2);
            }
            this.f7653d0 = SystemClock.elapsedRealtime();
            if (iO0 < 0) {
                B.e eVar = new B.e(iO0, this.f7673u.f7689a, S(iO0) && this.f7629J > 0);
                B.c cVar2 = this.f7671s;
                if (cVar2 != null) {
                    cVar2.b(eVar);
                }
                if (eVar.f7530c) {
                    this.f7676x = C1022h.f7852c;
                    throw eVar;
                }
                this.f7667o.b(eVar);
                return;
            }
            this.f7667o.a();
            if (U(this.f7675w)) {
                if (this.f7629J > 0) {
                    this.f7657f0 = false;
                }
                if (this.f7642W && (cVar = this.f7671s) != null && iO0 < iRemaining2 && !this.f7657f0) {
                    cVar.d();
                }
            }
            int i9 = this.f7673u.f7691c;
            if (i9 == 0) {
                this.f7628I += (long) iO0;
            }
            if (iO0 == iRemaining2) {
                if (i9 != 0) {
                    AbstractC1684a.g(byteBuffer == this.f7635P);
                    this.f7629J += ((long) this.f7630K) * ((long) this.f7636Q);
                }
                this.f7637R = null;
            }
        }
    }

    @Override // Q2.B
    public void o() {
        if (!this.f7640U && T() && J()) {
            Y();
            this.f7640U = true;
        }
    }

    @Override // Q2.B
    public long p(boolean z9) {
        if (!T() || this.f7632M) {
            return Long.MIN_VALUE;
        }
        return G(F(Math.min(this.f7661i.e(z9), this.f7673u.h(Q()))));
    }

    public final int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i9, long j9) {
        if (d4.k0.f39777a >= 26) {
            return audioTrack.write(byteBuffer, i9, 1, j9 * 1000);
        }
        if (this.f7624E == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f7624E = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f7624E.putInt(1431633921);
        }
        if (this.f7625F == 0) {
            this.f7624E.putInt(4, i9);
            this.f7624E.putLong(8, j9 * 1000);
            this.f7624E.position(0);
            this.f7625F = i9;
        }
        int iRemaining = this.f7624E.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f7624E, iRemaining, 1);
            if (iWrite < 0) {
                this.f7625F = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iO0 = o0(audioTrack, byteBuffer, i9);
        if (iO0 < 0) {
            this.f7625F = 0;
            return iO0;
        }
        this.f7625F -= iO0;
        return iO0;
    }

    @Override // Q2.B
    public void pause() {
        this.f7642W = false;
        if (T() && this.f7661i.q()) {
            this.f7675w.pause();
        }
    }

    @Override // Q2.B
    public void play() {
        this.f7642W = true;
        if (T()) {
            this.f7661i.v();
            this.f7675w.play();
        }
    }

    @Override // Q2.B
    public /* synthetic */ void q(long j9) {
        A.a(this, j9);
    }

    @Override // Q2.B
    public void r() {
        this.f7631L = true;
    }

    @Override // Q2.B
    public void release() {
        C1023i c1023i = this.f7677y;
        if (c1023i != null) {
            c1023i.e();
        }
    }

    @Override // Q2.B
    public void reset() {
        flush();
        s5.c0 it = this.f7656f.iterator();
        while (it.hasNext()) {
            ((InterfaceC1027m) it.next()).reset();
        }
        s5.c0 it2 = this.f7658g.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1027m) it2.next()).reset();
        }
        C1026l c1026l = this.f7674v;
        if (c1026l != null) {
            c1026l.j();
        }
        this.f7642W = false;
        this.f7655e0 = false;
    }

    @Override // Q2.B
    public void s() {
        AbstractC1684a.g(d4.k0.f39777a >= 21);
        AbstractC1684a.g(this.f7643X);
        if (this.f7649b0) {
            return;
        }
        this.f7649b0 = true;
        flush();
    }

    @Override // Q2.B
    public void setVolume(float f9) {
        if (this.f7634O != f9) {
            this.f7634O = f9;
            f0();
        }
    }

    @Override // Q2.B
    public void t(C1019e c1019e) {
        if (this.f7678z.equals(c1019e)) {
            return;
        }
        this.f7678z = c1019e;
        if (this.f7649b0) {
            return;
        }
        flush();
    }

    @Override // Q2.B
    public void u(C0936z0 c0936z0, int i9, int[] iArr) throws B.a {
        C1026l c1026l;
        int i10;
        int iIntValue;
        int iF;
        boolean z9;
        int iJ0;
        int iJ02;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iA;
        int[] iArr2;
        if ("audio/raw".equals(c0936z0.f6467m)) {
            AbstractC1684a.a(d4.k0.D0(c0936z0.f6448B));
            iJ0 = d4.k0.j0(c0936z0.f6448B, c0936z0.f6480z);
            AbstractC2743y.a aVar = new AbstractC2743y.a();
            if (k0(c0936z0.f6448B)) {
                aVar.j(this.f7658g);
            } else {
                aVar.j(this.f7656f);
                aVar.i(this.f7648b.b());
            }
            C1026l c1026l2 = new C1026l(aVar.k());
            if (c1026l2.equals(this.f7674v)) {
                c1026l2 = this.f7674v;
            }
            this.f7654e.n(c0936z0.f6449C, c0936z0.f6450D);
            if (d4.k0.f39777a < 21 && c0936z0.f6480z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i16 = 0; i16 < 6; i16++) {
                    iArr2[i16] = i16;
                }
            } else {
                iArr2 = iArr;
            }
            this.f7652d.l(iArr2);
            try {
                InterfaceC1027m.a aVarA = c1026l2.a(new InterfaceC1027m.a(c0936z0.f6447A, c0936z0.f6480z, c0936z0.f6448B));
                int i17 = aVarA.f7889c;
                int i18 = aVarA.f7887a;
                int I9 = d4.k0.I(aVarA.f7888b);
                iJ02 = d4.k0.j0(i17, aVarA.f7888b);
                c1026l = c1026l2;
                i10 = i18;
                iIntValue = I9;
                z9 = this.f7663k;
                i11 = 0;
                iF = i17;
            } catch (InterfaceC1027m.b e9) {
                throw new B.a(e9, c0936z0);
            }
        } else {
            C1026l c1026l3 = new C1026l(AbstractC2743y.z());
            int i19 = c0936z0.f6447A;
            if (m0(c0936z0, this.f7678z)) {
                c1026l = c1026l3;
                i10 = i19;
                iF = d4.F.f((String) AbstractC1684a.e(c0936z0.f6467m), c0936z0.f6464j);
                iIntValue = d4.k0.I(c0936z0.f6480z);
                iJ0 = -1;
                iJ02 = -1;
                i11 = 1;
                z9 = true;
            } else {
                Pair pairF = K().f(c0936z0);
                if (pairF == null) {
                    throw new B.a("Unable to configure passthrough for: " + c0936z0, c0936z0);
                }
                int iIntValue2 = ((Integer) pairF.first).intValue();
                c1026l = c1026l3;
                i10 = i19;
                iIntValue = ((Integer) pairF.second).intValue();
                iF = iIntValue2;
                z9 = this.f7663k;
                iJ0 = -1;
                iJ02 = -1;
                i11 = 2;
            }
        }
        if (iF == 0) {
            throw new B.a("Invalid output encoding (mode=" + i11 + ") for: " + c0936z0, c0936z0);
        }
        if (iIntValue == 0) {
            throw new B.a("Invalid output channel config (mode=" + i11 + ") for: " + c0936z0, c0936z0);
        }
        if (i9 != 0) {
            iA = i9;
            i12 = iF;
            i13 = iIntValue;
            i14 = iJ02;
            i15 = i10;
        } else {
            i12 = iF;
            i13 = iIntValue;
            i14 = iJ02;
            i15 = i10;
            iA = this.f7668p.a(M(i10, iIntValue, iF), iF, i11, iJ02 != -1 ? iJ02 : 1, i10, c0936z0.f6463i, z9 ? 8.0d : 1.0d);
        }
        this.f7655e0 = false;
        g gVar = new g(c0936z0, iJ0, i11, i14, i15, i13, i12, iA, c1026l, z9);
        if (T()) {
            this.f7672t = gVar;
        } else {
            this.f7673u = gVar;
        }
    }

    @Override // Q2.B
    public void v(boolean z9) {
        this.f7623D = z9;
        d0(l0() ? C0917s1.f6227e : this.f7622C);
    }
}
