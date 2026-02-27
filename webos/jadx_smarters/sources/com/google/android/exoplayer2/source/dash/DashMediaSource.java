package com.google.android.exoplayer2.source.dash;

import B3.AbstractC0493a;
import B3.C;
import B3.C0502j;
import B3.C0512u;
import B3.C0515x;
import B3.InterfaceC0501i;
import B3.InterfaceC0517z;
import B3.J;
import F3.j;
import F3.o;
import O2.AbstractC0928w0;
import O2.C0897l1;
import O2.H0;
import O2.Q1;
import V2.B;
import V2.C1055l;
import V2.y;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import b4.AbstractC1217h;
import b4.C1208A;
import b4.F;
import b4.G;
import b4.H;
import b4.I;
import b4.InterfaceC1211b;
import b4.InterfaceC1224o;
import b4.S;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.d;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.T;
import d4.k0;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r5.AbstractC2675d;
import v5.AbstractC2885e;
import z3.C3024D;

/* JADX INFO: loaded from: classes3.dex */
public final class DashMediaSource extends AbstractC0493a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final H f25443A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC1224o f25444B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public G f25445C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public S f25446D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public IOException f25447E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Handler f25448F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public H0.g f25449G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Uri f25450H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Uri f25451I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public F3.c f25452J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f25453K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f25454L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f25455M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f25456N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f25457O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f25458P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f25459Q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H0 f25460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f25461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC1224o.a f25462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a.InterfaceC0241a f25463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0501i f25464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y f25465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F f25466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final E3.b f25467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f25468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f25469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J.a f25470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final I.a f25471t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f25472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f25473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SparseArray f25474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Runnable f25475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f25476y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d.b f25477z;

    public static final class Factory implements C.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0241a f25478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1224o.a f25479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public B f25480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC0501i f25481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public F f25482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f25483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f25484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public I.a f25485h;

        public Factory(InterfaceC1224o.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public Factory(a.InterfaceC0241a interfaceC0241a, InterfaceC1224o.a aVar) {
            this.f25478a = (a.InterfaceC0241a) AbstractC1684a.e(interfaceC0241a);
            this.f25479b = aVar;
            this.f25480c = new C1055l();
            this.f25482e = new C1208A();
            this.f25483f = 30000L;
            this.f25484g = 5000000L;
            this.f25481d = new C0502j();
        }

        @Override // B3.C.a
        public int[] c() {
            return new int[]{0};
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public DashMediaSource b(H0 h02) {
            AbstractC1684a.e(h02.f5528c);
            I.a dVar = this.f25485h;
            if (dVar == null) {
                dVar = new F3.d();
            }
            List list = h02.f5528c.f5629f;
            return new DashMediaSource(h02, null, this.f25479b, !list.isEmpty() ? new C3024D(dVar, list) : dVar, this.f25478a, this.f25481d, null, this.f25480c.a(h02), this.f25482e, this.f25483f, this.f25484g, null);
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory d(B b9) {
            this.f25480c = (B) AbstractC1684a.f(b9, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory a(F f9) {
            this.f25482e = (F) AbstractC1684a.f(f9, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    public class a implements T.b {
        public a() {
        }

        @Override // d4.T.b
        public void a(IOException iOException) {
            DashMediaSource.this.J0(iOException);
        }

        @Override // d4.T.b
        public void b() {
            DashMediaSource.this.K0(T.h());
        }
    }

    public static final class b extends Q1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f25487g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f25488h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f25489i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f25490j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f25491k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f25492l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f25493m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final F3.c f25494n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final H0 f25495o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final H0.g f25496p;

        public b(long j9, long j10, long j11, int i9, long j12, long j13, long j14, F3.c cVar, H0 h02, H0.g gVar) {
            AbstractC1684a.g(cVar.f1936d == (gVar != null));
            this.f25487g = j9;
            this.f25488h = j10;
            this.f25489i = j11;
            this.f25490j = i9;
            this.f25491k = j12;
            this.f25492l = j13;
            this.f25493m = j14;
            this.f25494n = cVar;
            this.f25495o = h02;
            this.f25496p = gVar;
        }

        public static boolean y(F3.c cVar) {
            return cVar.f1936d && cVar.f1937e != -9223372036854775807L && cVar.f1934b == -9223372036854775807L;
        }

        @Override // O2.Q1
        public int f(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f25490j) >= 0 && iIntValue < n()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // O2.Q1
        public Q1.b l(int i9, Q1.b bVar, boolean z9) {
            AbstractC1684a.c(i9, 0, n());
            return bVar.y(z9 ? this.f25494n.d(i9).f1968a : null, z9 ? Integer.valueOf(this.f25490j + i9) : null, 0, this.f25494n.g(i9), k0.P0(this.f25494n.d(i9).f1969b - this.f25494n.d(0).f1969b) - this.f25491k);
        }

        @Override // O2.Q1
        public int n() {
            return this.f25494n.e();
        }

        @Override // O2.Q1
        public Object r(int i9) {
            AbstractC1684a.c(i9, 0, n());
            return Integer.valueOf(this.f25490j + i9);
        }

        @Override // O2.Q1
        public Q1.d t(int i9, Q1.d dVar, long j9) {
            AbstractC1684a.c(i9, 0, 1);
            long jX = x(j9);
            Object obj = Q1.d.f5736s;
            H0 h02 = this.f25495o;
            F3.c cVar = this.f25494n;
            return dVar.j(obj, h02, cVar, this.f25487g, this.f25488h, this.f25489i, true, y(cVar), this.f25496p, jX, this.f25492l, 0, n() - 1, this.f25491k);
        }

        @Override // O2.Q1
        public int u() {
            return 1;
        }

        public final long x(long j9) {
            E3.f fVarB;
            long j10 = this.f25493m;
            if (!y(this.f25494n)) {
                return j10;
            }
            if (j9 > 0) {
                j10 += j9;
                if (j10 > this.f25492l) {
                    return -9223372036854775807L;
                }
            }
            long j11 = this.f25491k + j10;
            long jG = this.f25494n.g(0);
            int i9 = 0;
            while (i9 < this.f25494n.e() - 1 && j11 >= jG) {
                j11 -= jG;
                i9++;
                jG = this.f25494n.g(i9);
            }
            F3.g gVarD = this.f25494n.d(i9);
            int iA = gVarD.a(2);
            return (iA == -1 || (fVarB = ((j) ((F3.a) gVarD.f1970c.get(iA)).f1925c.get(0)).b()) == null || fVarB.i(jG) == 0) ? j10 : (j10 + fVarB.c(fVarB.h(j11, jG))) - j11;
        }
    }

    public final class c implements d.b {
        public c() {
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.source.dash.d.b
        public void a(long j9) {
            DashMediaSource.this.C0(j9);
        }

        @Override // com.google.android.exoplayer2.source.dash.d.b
        public void b() {
            DashMediaSource.this.D0();
        }
    }

    public static final class d implements I.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pattern f25498a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // b4.I.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, AbstractC2675d.f49724c)).readLine();
            try {
                Matcher matcher = f25498a.matcher(line);
                if (!matcher.matches()) {
                    throw C0897l1.c("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j9 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j10 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j9 * (((j10 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e9) {
                throw C0897l1.c(null, e9);
            }
        }
    }

    public final class e implements G.b {
        public e() {
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void t(I i9, long j9, long j10, boolean z9) {
            DashMediaSource.this.E0(i9, j9, j10);
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void W(I i9, long j9, long j10) {
            DashMediaSource.this.F0(i9, j9, j10);
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public G.c j(I i9, long j9, long j10, IOException iOException, int i10) {
            return DashMediaSource.this.G0(i9, j9, j10, iOException, i10);
        }
    }

    public final class f implements H {
        public f() {
        }

        @Override // b4.H
        public void a() throws IOException {
            DashMediaSource.this.f25445C.a();
            b();
        }

        public final void b() throws IOException {
            if (DashMediaSource.this.f25447E != null) {
                throw DashMediaSource.this.f25447E;
            }
        }
    }

    public final class g implements G.b {
        public g() {
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void t(I i9, long j9, long j10, boolean z9) {
            DashMediaSource.this.E0(i9, j9, j10);
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void W(I i9, long j9, long j10) {
            DashMediaSource.this.H0(i9, j9, j10);
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public G.c j(I i9, long j9, long j10, IOException iOException, int i10) {
            return DashMediaSource.this.I0(i9, j9, j10, iOException);
        }
    }

    public static final class h implements I.a {
        public h() {
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // b4.I.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(k0.W0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.dash");
    }

    public DashMediaSource(H0 h02, F3.c cVar, InterfaceC1224o.a aVar, I.a aVar2, a.InterfaceC0241a interfaceC0241a, InterfaceC0501i interfaceC0501i, AbstractC1217h abstractC1217h, y yVar, F f9, long j9, long j10) {
        this.f25460i = h02;
        this.f25449G = h02.f5530e;
        this.f25450H = ((H0.h) AbstractC1684a.e(h02.f5528c)).f5625a;
        this.f25451I = h02.f5528c.f5625a;
        this.f25452J = cVar;
        this.f25462k = aVar;
        this.f25471t = aVar2;
        this.f25463l = interfaceC0241a;
        this.f25465n = yVar;
        this.f25466o = f9;
        this.f25468q = j9;
        this.f25469r = j10;
        this.f25464m = interfaceC0501i;
        this.f25467p = new E3.b();
        boolean z9 = cVar != null;
        this.f25461j = z9;
        a aVar3 = null;
        this.f25470s = f0(null);
        this.f25473v = new Object();
        this.f25474w = new SparseArray();
        this.f25477z = new c(this, aVar3);
        this.f25458P = -9223372036854775807L;
        this.f25456N = -9223372036854775807L;
        if (!z9) {
            this.f25472u = new e(this, aVar3);
            this.f25443A = new f();
            this.f25475x = new Runnable() { // from class: E3.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1683a.R0();
                }
            };
            this.f25476y = new Runnable() { // from class: E3.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1684a.A0();
                }
            };
            return;
        }
        AbstractC1684a.g(true ^ cVar.f1936d);
        this.f25472u = null;
        this.f25475x = null;
        this.f25476y = null;
        this.f25443A = new H.a();
    }

    public /* synthetic */ DashMediaSource(H0 h02, F3.c cVar, InterfaceC1224o.a aVar, I.a aVar2, a.InterfaceC0241a interfaceC0241a, InterfaceC0501i interfaceC0501i, AbstractC1217h abstractC1217h, y yVar, F f9, long j9, long j10, a aVar3) {
        this(h02, cVar, aVar, aVar2, interfaceC0241a, interfaceC0501i, abstractC1217h, yVar, f9, j9, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        L0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        Uri uri;
        this.f25448F.removeCallbacks(this.f25475x);
        if (this.f25445C.i()) {
            return;
        }
        if (this.f25445C.j()) {
            this.f25453K = true;
            return;
        }
        synchronized (this.f25473v) {
            uri = this.f25450H;
        }
        this.f25453K = false;
        Q0(new I(this.f25444B, uri, 4, this.f25471t), this.f25472u, this.f25466o.b(4));
    }

    public static long u0(F3.g gVar, long j9, long j10) {
        long jP0 = k0.P0(gVar.f1969b);
        boolean zY0 = y0(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i9 = 0; i9 < gVar.f1970c.size(); i9++) {
            F3.a aVar = (F3.a) gVar.f1970c.get(i9);
            List list = aVar.f1925c;
            int i10 = aVar.f1924b;
            boolean z9 = (i10 == 1 || i10 == 2) ? false : true;
            if ((!zY0 || !z9) && !list.isEmpty()) {
                E3.f fVarB = ((j) list.get(0)).b();
                if (fVarB == null) {
                    return jP0 + j9;
                }
                long jL = fVarB.l(j9, j10);
                if (jL == 0) {
                    return jP0;
                }
                long jE = (fVarB.e(j9, j10) + jL) - 1;
                jMin = Math.min(jMin, fVarB.d(jE, j9) + fVarB.c(jE) + jP0);
            }
        }
        return jMin;
    }

    public static long v0(F3.g gVar, long j9, long j10) {
        long jP0 = k0.P0(gVar.f1969b);
        boolean zY0 = y0(gVar);
        long jMax = jP0;
        for (int i9 = 0; i9 < gVar.f1970c.size(); i9++) {
            F3.a aVar = (F3.a) gVar.f1970c.get(i9);
            List list = aVar.f1925c;
            int i10 = aVar.f1924b;
            boolean z9 = (i10 == 1 || i10 == 2) ? false : true;
            if ((!zY0 || !z9) && !list.isEmpty()) {
                E3.f fVarB = ((j) list.get(0)).b();
                if (fVarB == null || fVarB.l(j9, j10) == 0) {
                    return jP0;
                }
                jMax = Math.max(jMax, fVarB.c(fVarB.e(j9, j10)) + jP0);
            }
        }
        return jMax;
    }

    public static long w0(F3.c cVar, long j9) {
        E3.f fVarB;
        int iE = cVar.e() - 1;
        F3.g gVarD = cVar.d(iE);
        long jP0 = k0.P0(gVarD.f1969b);
        long jG = cVar.g(iE);
        long jP02 = k0.P0(j9);
        long jP03 = k0.P0(cVar.f1933a);
        long jP04 = k0.P0(5000L);
        for (int i9 = 0; i9 < gVarD.f1970c.size(); i9++) {
            List list = ((F3.a) gVarD.f1970c.get(i9)).f1925c;
            if (!list.isEmpty() && (fVarB = ((j) list.get(0)).b()) != null) {
                long jF = ((jP03 + jP0) + fVarB.f(jG, jP02)) - jP02;
                if (jF < jP04 - 100000 || (jF > jP04 && jF < jP04 + 100000)) {
                    jP04 = jF;
                }
            }
        }
        return AbstractC2885e.a(jP04, 1000L, RoundingMode.CEILING);
    }

    public static boolean y0(F3.g gVar) {
        for (int i9 = 0; i9 < gVar.f1970c.size(); i9++) {
            int i10 = ((F3.a) gVar.f1970c.get(i9)).f1924b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean z0(F3.g gVar) {
        for (int i9 = 0; i9 < gVar.f1970c.size(); i9++) {
            E3.f fVarB = ((j) ((F3.a) gVar.f1970c.get(i9)).f1925c.get(0)).b();
            if (fVarB == null || fVarB.j()) {
                return true;
            }
        }
        return false;
    }

    public final void B0() {
        T.j(this.f25445C, new a());
    }

    public void C0(long j9) {
        long j10 = this.f25458P;
        if (j10 == -9223372036854775807L || j10 < j9) {
            this.f25458P = j9;
        }
    }

    public void D0() {
        this.f25448F.removeCallbacks(this.f25476y);
        R0();
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        int iIntValue = ((Integer) bVar.f271a).intValue() - this.f25459Q;
        J.a aVarF0 = f0(bVar);
        com.google.android.exoplayer2.source.dash.b bVar2 = new com.google.android.exoplayer2.source.dash.b(iIntValue + this.f25459Q, this.f25452J, this.f25467p, iIntValue, this.f25463l, this.f25446D, null, this.f25465n, b0(bVar), this.f25466o, aVarF0, this.f25456N, this.f25443A, interfaceC1211b, this.f25464m, this.f25477z, i0());
        this.f25474w.put(bVar2.f25504a, bVar2);
        return bVar2;
    }

    public void E0(I i9, long j9, long j10) {
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        this.f25466o.d(i9.f17518a);
        this.f25470s.p(c0512u, i9.f17520d);
    }

    public void F0(I i9, long j9, long j10) {
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        this.f25466o.d(i9.f17518a);
        this.f25470s.s(c0512u, i9.f17520d);
        F3.c cVar = (F3.c) i9.e();
        F3.c cVar2 = this.f25452J;
        int iE = cVar2 == null ? 0 : cVar2.e();
        long j11 = cVar.d(0).f1969b;
        int i10 = 0;
        while (i10 < iE && this.f25452J.d(i10).f1969b < j11) {
            i10++;
        }
        if (cVar.f1936d) {
            if (iE - i10 > cVar.e()) {
                AbstractC1681B.j("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j12 = this.f25458P;
                if (j12 == -9223372036854775807L || cVar.f1940h * 1000 > j12) {
                    this.f25457O = 0;
                } else {
                    AbstractC1681B.j("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f1940h + ", " + this.f25458P);
                }
            }
            int i11 = this.f25457O;
            this.f25457O = i11 + 1;
            if (i11 < this.f25466o.b(i9.f17520d)) {
                P0(x0());
                return;
            } else {
                this.f25447E = new E3.c();
                return;
            }
        }
        this.f25452J = cVar;
        this.f25453K = cVar.f1936d & this.f25453K;
        this.f25454L = j9 - j10;
        this.f25455M = j9;
        synchronized (this.f25473v) {
            try {
                if (i9.f17519c.f17598a == this.f25450H) {
                    Uri uriF = this.f25452J.f1943k;
                    if (uriF == null) {
                        uriF = i9.f();
                    }
                    this.f25450H = uriF;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iE == 0) {
            F3.c cVar3 = this.f25452J;
            if (cVar3.f1936d) {
                o oVar = cVar3.f1941i;
                if (oVar != null) {
                    M0(oVar);
                    return;
                } else {
                    B0();
                    return;
                }
            }
        } else {
            this.f25459Q += i10;
        }
        L0(true);
    }

    public G.c G0(I i9, long j9, long j10, IOException iOException, int i10) {
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        long jC = this.f25466o.c(new F.c(c0512u, new C0515x(i9.f17520d), iOException, i10));
        G.c cVarH = jC == -9223372036854775807L ? G.f17501g : G.h(false, jC);
        boolean z9 = !cVarH.c();
        this.f25470s.w(c0512u, i9.f17520d, iOException, z9);
        if (z9) {
            this.f25466o.d(i9.f17518a);
        }
        return cVarH;
    }

    public void H0(I i9, long j9, long j10) {
        C0512u c0512u = new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b());
        this.f25466o.d(i9.f17518a);
        this.f25470s.s(c0512u, i9.f17520d);
        K0(((Long) i9.e()).longValue() - j9);
    }

    public G.c I0(I i9, long j9, long j10, IOException iOException) {
        this.f25470s.w(new C0512u(i9.f17518a, i9.f17519c, i9.f(), i9.d(), j9, j10, i9.b()), i9.f17520d, iOException, true);
        this.f25466o.d(i9.f17518a);
        J0(iOException);
        return G.f17500f;
    }

    public final void J0(IOException iOException) {
        AbstractC1681B.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        L0(true);
    }

    public final void K0(long j9) {
        this.f25456N = j9;
        L0(true);
    }

    public final void L0(boolean z9) {
        F3.g gVar;
        long j9;
        long j10;
        for (int i9 = 0; i9 < this.f25474w.size(); i9++) {
            int iKeyAt = this.f25474w.keyAt(i9);
            if (iKeyAt >= this.f25459Q) {
                ((com.google.android.exoplayer2.source.dash.b) this.f25474w.valueAt(i9)).M(this.f25452J, iKeyAt - this.f25459Q);
            }
        }
        F3.g gVarD = this.f25452J.d(0);
        int iE = this.f25452J.e() - 1;
        F3.g gVarD2 = this.f25452J.d(iE);
        long jG = this.f25452J.g(iE);
        long jP0 = k0.P0(k0.g0(this.f25456N));
        long jV0 = v0(gVarD, this.f25452J.g(0), jP0);
        long jU0 = u0(gVarD2, jG, jP0);
        boolean z10 = this.f25452J.f1936d && !z0(gVarD2);
        if (z10) {
            long j11 = this.f25452J.f1938f;
            if (j11 != -9223372036854775807L) {
                jV0 = Math.max(jV0, jU0 - k0.P0(j11));
            }
        }
        long j12 = jU0 - jV0;
        F3.c cVar = this.f25452J;
        if (cVar.f1936d) {
            AbstractC1684a.g(cVar.f1933a != -9223372036854775807L);
            long jP02 = (jP0 - k0.P0(this.f25452J.f1933a)) - jV0;
            S0(jP02, j12);
            long jX1 = this.f25452J.f1933a + k0.x1(jV0);
            long jP03 = jP02 - k0.P0(this.f25449G.f5607a);
            long jMin = Math.min(this.f25469r, j12 / 2);
            j9 = jX1;
            j10 = jP03 < jMin ? jMin : jP03;
            gVar = gVarD;
        } else {
            gVar = gVarD;
            j9 = -9223372036854775807L;
            j10 = 0;
        }
        long jP04 = jV0 - k0.P0(gVar.f1969b);
        F3.c cVar2 = this.f25452J;
        m0(new b(cVar2.f1933a, j9, this.f25456N, this.f25459Q, jP04, j12, j10, cVar2, this.f25460i, cVar2.f1936d ? this.f25449G : null));
        if (this.f25461j) {
            return;
        }
        this.f25448F.removeCallbacks(this.f25476y);
        if (z10) {
            this.f25448F.postDelayed(this.f25476y, w0(this.f25452J, k0.g0(this.f25456N)));
        }
        if (this.f25453K) {
            R0();
            return;
        }
        if (z9) {
            F3.c cVar3 = this.f25452J;
            if (cVar3.f1936d) {
                long j13 = cVar3.f1937e;
                if (j13 != -9223372036854775807L) {
                    if (j13 == 0) {
                        j13 = 5000;
                    }
                    P0(Math.max(0L, (this.f25454L + j13) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void M0(o oVar) {
        I.a dVar;
        String str = oVar.f2023a;
        if (k0.c(str, "urn:mpeg:dash:utc:direct:2014") || k0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            N0(oVar);
            return;
        }
        if (k0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || k0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            dVar = new d();
        } else {
            if (!k0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !k0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                if (k0.c(str, "urn:mpeg:dash:utc:ntp:2014") || k0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    B0();
                    return;
                } else {
                    J0(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            }
            dVar = new h(null);
        }
        O0(oVar, dVar);
    }

    public final void N0(o oVar) {
        try {
            K0(k0.W0(oVar.f2024b) - this.f25455M);
        } catch (C0897l1 e9) {
            J0(e9);
        }
    }

    public final void O0(o oVar, I.a aVar) {
        Q0(new I(this.f25444B, Uri.parse(oVar.f2024b), 5, aVar), new g(this, null), 1);
    }

    @Override // B3.C
    public void P() {
        this.f25443A.a();
    }

    public final void P0(long j9) {
        this.f25448F.postDelayed(this.f25475x, j9);
    }

    public final void Q0(I i9, G.b bVar, int i10) {
        this.f25470s.y(new C0512u(i9.f17518a, i9.f17519c, this.f25445C.n(i9, bVar, i10)), i9.f17520d);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[PHI: r1
      0x0052: PHI (r1v37 long) = (r1v12 long), (r1v15 long) binds: [B:20:0x0050, B:25:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0015 A[PHI: r1
      0x0015: PHI (r1v41 long) = (r1v2 long), (r1v5 long) binds: [B:3:0x0013, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S0(long r18, long r20) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.S0(long, long):void");
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) interfaceC0517z;
        bVar.I();
        this.f25474w.remove(bVar.f25504a);
    }

    @Override // B3.C
    public H0 e() {
        return this.f25460i;
    }

    @Override // B3.AbstractC0493a
    public void l0(S s9) {
        this.f25446D = s9;
        this.f25465n.b(Looper.myLooper(), i0());
        this.f25465n.prepare();
        if (this.f25461j) {
            L0(false);
            return;
        }
        this.f25444B = this.f25462k.a();
        this.f25445C = new G("DashMediaSource");
        this.f25448F = k0.x();
        R0();
    }

    @Override // B3.AbstractC0493a
    public void n0() {
        this.f25453K = false;
        this.f25444B = null;
        G g9 = this.f25445C;
        if (g9 != null) {
            g9.l();
            this.f25445C = null;
        }
        this.f25454L = 0L;
        this.f25455M = 0L;
        this.f25452J = this.f25461j ? this.f25452J : null;
        this.f25450H = this.f25451I;
        this.f25447E = null;
        Handler handler = this.f25448F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f25448F = null;
        }
        this.f25456N = -9223372036854775807L;
        this.f25457O = 0;
        this.f25458P = -9223372036854775807L;
        this.f25474w.clear();
        this.f25467p.i();
        this.f25465n.release();
    }

    public final long x0() {
        return Math.min((this.f25457O - 1) * 1000, 5000);
    }
}
