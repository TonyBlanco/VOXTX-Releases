package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class kh implements jp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f23444a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f23445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23446c;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f23447A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f23448B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f23449C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f23450D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f23451E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f23452F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f23453G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f23454H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f23455I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float f23456J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private jb[] f23457K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private ByteBuffer[] f23458L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ByteBuffer f23459M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f23460N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ByteBuffer f23461O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private byte[] f23462P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f23463Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f23464R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f23465S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f23466T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f23467U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f23468V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f23469W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private C1298g f23470X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private jy f23471Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f23472Z;
    private long aa;
    private boolean ab;
    private boolean ac;
    private final agp ad;
    private final ui ae;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final iy f23473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f23474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final jv f23475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ks f23476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jb[] f23477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final jb[] f23478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final jt f23479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayDeque f23480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f23481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private kg f23482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kd f23483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final kd f23484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final jz f23485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private iw f23486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private jm f23487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private kb f23488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private kb f23489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AudioTrack f23490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C1295f f23491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private kc f23492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private kc f23493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private au f23494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ByteBuffer f23495z;

    public /* synthetic */ kh(ka kaVar) {
        this.f23473d = kaVar.f23422b;
        ui uiVar = kaVar.f23423c;
        this.ae = uiVar;
        int i9 = cq.f22640a;
        this.f23474e = false;
        this.f23481l = false;
        this.f23485p = kaVar.f23421a;
        agp agpVar = new agp(null);
        this.ad = agpVar;
        agpVar.f();
        this.f23479j = new jt(new ke(this));
        jv jvVar = new jv();
        this.f23475f = jvVar;
        ks ksVar = new ks();
        this.f23476g = ksVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ko(), jvVar, ksVar);
        Collections.addAll(arrayList, uiVar.k());
        this.f23477h = (jb[]) arrayList.toArray(new jb[0]);
        this.f23478i = new jb[]{new kk()};
        this.f23456J = 1.0f;
        this.f23491v = C1295f.f22871a;
        this.f23469W = 0;
        this.f23470X = new C1298g();
        au auVar = au.f20738a;
        this.f23493x = new kc(auVar, false, 0L, 0L);
        this.f23494y = auVar;
        this.f23464R = -1;
        this.f23457K = new jb[0];
        this.f23458L = new ByteBuffer[0];
        this.f23480k = new ArrayDeque();
        this.f23483n = new kd();
        this.f23484o = new kd();
    }

    public static /* synthetic */ void G(AudioTrack audioTrack, agp agpVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            agpVar.f();
            synchronized (f23444a) {
                try {
                    int i9 = f23446c - 1;
                    f23446c = i9;
                    if (i9 == 0) {
                        f23445b.shutdown();
                        f23445b = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            agpVar.f();
            synchronized (f23444a) {
                try {
                    int i10 = f23446c - 1;
                    f23446c = i10;
                    if (i10 == 0) {
                        f23445b.shutdown();
                        f23445b = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private static int H(AudioTrack audioTrack, ByteBuffer byteBuffer, int i9) {
        return audioTrack.write(byteBuffer, i9, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long I() {
        kb kbVar = this.f23489t;
        return kbVar.f23426c == 0 ? this.f23448B / ((long) kbVar.f23425b) : this.f23449C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long J() {
        kb kbVar = this.f23489t;
        return kbVar.f23426c == 0 ? this.f23450D / ((long) kbVar.f23427d) : this.f23451E;
    }

    private final AudioTrack K(kb kbVar) throws jl {
        try {
            return kbVar.b(this.f23472Z, this.f23491v, this.f23469W);
        } catch (jl e9) {
            jm jmVar = this.f23487r;
            if (jmVar != null) {
                jmVar.a(e9);
            }
            throw e9;
        }
    }

    private final au L() {
        return M().f23433a;
    }

    private final kc M() {
        kc kcVar = this.f23492w;
        return kcVar != null ? kcVar : !this.f23480k.isEmpty() ? (kc) this.f23480k.getLast() : this.f23493x;
    }

    private final void N(long j9) {
        au auVarL;
        boolean z9;
        if (X()) {
            ui uiVar = this.ae;
            auVarL = L();
            uiVar.l(auVarL);
        } else {
            auVarL = au.f20738a;
        }
        au auVar = auVarL;
        if (X()) {
            ui uiVar2 = this.ae;
            boolean zF = F();
            uiVar2.m(zF);
            z9 = zF;
        } else {
            z9 = false;
        }
        this.f23480k.add(new kc(auVar, z9, Math.max(0L, j9), this.f23489t.a(J())));
        jb[] jbVarArr = this.f23489t.f23432i;
        ArrayList arrayList = new ArrayList();
        for (jb jbVar : jbVarArr) {
            if (jbVar.g()) {
                arrayList.add(jbVar);
            } else {
                jbVar.c();
            }
        }
        int size = arrayList.size();
        this.f23457K = (jb[]) arrayList.toArray(new jb[size]);
        this.f23458L = new ByteBuffer[size];
        O();
        jm jmVar = this.f23487r;
        if (jmVar != null) {
            ((km) jmVar).f23509a.f23511c.s(z9);
        }
    }

    private final void O() {
        int i9 = 0;
        while (true) {
            jb[] jbVarArr = this.f23457K;
            if (i9 >= jbVarArr.length) {
                return;
            }
            jb jbVar = jbVarArr[i9];
            jbVar.c();
            this.f23458L[i9] = jbVar.b();
            i9++;
        }
    }

    private final void P() {
        if (this.f23466T) {
            return;
        }
        this.f23466T = true;
        this.f23479j.c(J());
        this.f23490u.stop();
        this.f23447A = 0;
    }

    private final void Q(long j9) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.f23457K.length;
        int i9 = length;
        while (i9 >= 0) {
            if (i9 > 0) {
                byteBuffer = this.f23458L[i9 - 1];
            } else {
                byteBuffer = this.f23459M;
                if (byteBuffer == null) {
                    byteBuffer = jb.f23338a;
                }
            }
            if (i9 == length) {
                T(byteBuffer, j9);
            } else {
                jb jbVar = this.f23457K[i9];
                if (i9 > this.f23464R) {
                    jbVar.e(byteBuffer);
                }
                ByteBuffer byteBufferB = jbVar.b();
                this.f23458L[i9] = byteBufferB;
                if (byteBufferB.hasRemaining()) {
                    i9++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i9--;
            }
        }
    }

    private final void R(au auVar, boolean z9) {
        kc kcVarM = M();
        if (auVar.equals(kcVarM.f23433a) && z9 == kcVarM.f23434b) {
            return;
        }
        kc kcVar = new kc(auVar, z9, -9223372036854775807L, -9223372036854775807L);
        if (V()) {
            this.f23492w = kcVar;
        } else {
            this.f23493x = kcVar;
        }
    }

    private final void S() {
        if (V()) {
            if (cq.f22640a >= 21) {
                this.f23490u.setVolume(this.f23456J);
                return;
            }
            AudioTrack audioTrack = this.f23490u;
            float f9 = this.f23456J;
            audioTrack.setStereoVolume(f9, f9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void T(java.nio.ByteBuffer r13, long r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.kh.T(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean U() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.f23464R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f23464R = r2
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.f23464R
            com.google.ads.interactivemedia.v3.internal.jb[] r5 = r9.f23457K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.Q(r7)
            boolean r0 = r4.h()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.f23464R
            int r0 = r0 + r1
            r9.f23464R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f23461O
            if (r0 == 0) goto L3b
            r9.T(r0, r7)
            java.nio.ByteBuffer r0 = r9.f23461O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.f23464R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.kh.U():boolean");
    }

    private final boolean V() {
        return this.f23490u != null;
    }

    private static boolean W(AudioTrack audioTrack) {
        return cq.f22640a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean X() {
        return (this.f23472Z || !"audio/raw".equals(this.f23489t.f23424a.f24467l) || Y(this.f23489t.f23424a.f24450A)) ? false : true;
    }

    private final boolean Y(int i9) {
        return false;
    }

    public final boolean F() {
        return M().f23434b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final int a(C1333s c1333s) {
        if (!"audio/raw".equals(c1333s.f24467l)) {
            if (!this.ab) {
                int i9 = cq.f22640a;
            }
            return this.f23473d.a(c1333s) != null ? 2 : 0;
        }
        boolean zY = cq.Y(c1333s.f24450A);
        int i10 = c1333s.f24450A;
        if (zY) {
            return i10 != 2 ? 1 : 2;
        }
        cd.e("DefaultAudioSink", "Invalid PCM encoding: " + i10);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final long b(boolean z9) {
        long jQ;
        if (!V() || this.f23454H) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f23479j.b(z9), this.f23489t.a(J()));
        while (!this.f23480k.isEmpty() && jMin >= ((kc) this.f23480k.getFirst()).f23436d) {
            this.f23493x = (kc) this.f23480k.remove();
        }
        kc kcVar = this.f23493x;
        long j9 = jMin - kcVar.f23436d;
        if (kcVar.f23433a.equals(au.f20738a)) {
            jQ = this.f23493x.f23435c + j9;
        } else if (this.f23480k.isEmpty()) {
            jQ = this.ae.i(j9) + this.f23493x.f23435c;
        } else {
            kc kcVar2 = (kc) this.f23480k.getFirst();
            jQ = kcVar2.f23435c - cq.q(kcVar2.f23436d - jMin, this.f23493x.f23433a.f20739b);
        }
        return jQ + this.f23489t.a(this.ae.j());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final au c() {
        return L();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void d() {
        if (this.f23472Z) {
            this.f23472Z = false;
            e();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void e() {
        if (V()) {
            this.f23448B = 0L;
            this.f23449C = 0L;
            this.f23450D = 0L;
            this.f23451E = 0L;
            this.ac = false;
            this.f23452F = 0;
            this.f23493x = new kc(L(), F(), 0L, 0L);
            this.f23455I = 0L;
            byte[] bArr = null;
            this.f23492w = null;
            this.f23480k.clear();
            this.f23459M = null;
            this.f23460N = 0;
            this.f23461O = null;
            this.f23466T = false;
            this.f23465S = false;
            this.f23464R = -1;
            this.f23495z = null;
            this.f23447A = 0;
            this.f23476g.p();
            O();
            if (this.f23479j.h()) {
                this.f23490u.pause();
            }
            if (W(this.f23490u)) {
                kg kgVar = this.f23482m;
                af.s(kgVar);
                kgVar.b(this.f23490u);
            }
            if (cq.f22640a < 21 && !this.f23468V) {
                this.f23469W = 0;
            }
            kb kbVar = this.f23488s;
            if (kbVar != null) {
                this.f23489t = kbVar;
                this.f23488s = null;
            }
            this.f23479j.d();
            AudioTrack audioTrack = this.f23490u;
            agp agpVar = this.ad;
            agpVar.g();
            synchronized (f23444a) {
                try {
                    if (f23445b == null) {
                        f23445b = cq.R("ExoPlayer:AudioTrackReleaseThread");
                    }
                    f23446c++;
                    f23445b.execute(new jc(audioTrack, agpVar, 6, bArr));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f23490u = null;
        }
        this.f23484o.a();
        this.f23483n.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void f() {
        this.f23453G = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void g() {
        this.f23467U = false;
        if (V() && this.f23479j.k()) {
            this.f23490u.pause();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void h() {
        this.f23467U = true;
        if (V()) {
            this.f23479j.f();
            this.f23490u.play();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void i() throws jo {
        if (!this.f23465S && V() && U()) {
            P();
            this.f23465S = true;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void j() {
        e();
        for (jb jbVar : this.f23477h) {
            jbVar.f();
        }
        jb[] jbVarArr = this.f23478i;
        int length = jbVarArr.length;
        for (int i9 = 0; i9 <= 0; i9++) {
            jbVarArr[i9].f();
        }
        this.f23467U = false;
        this.ab = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void k(C1295f c1295f) {
        if (this.f23491v.equals(c1295f)) {
            return;
        }
        this.f23491v = c1295f;
        if (this.f23472Z) {
            return;
        }
        e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void l(int i9) {
        if (this.f23469W != i9) {
            this.f23469W = i9;
            this.f23468V = i9 != 0;
            e();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void m(C1298g c1298g) {
        if (this.f23470X.equals(c1298g)) {
            return;
        }
        int i9 = c1298g.f22934a;
        if (this.f23490u != null) {
            int i10 = this.f23470X.f22934a;
        }
        this.f23470X = c1298g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void n(jm jmVar) {
        this.f23487r = jmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void o(au auVar) {
        R(new au(cq.a(auVar.f20739b, 0.1f, 8.0f), cq.a(auVar.f20740c, 0.1f, 8.0f)), F());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void p(iw iwVar) {
        this.f23486q = iwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void q(AudioDeviceInfo audioDeviceInfo) {
        jy jyVar = audioDeviceInfo == null ? null : new jy(audioDeviceInfo);
        this.f23471Y = jyVar;
        AudioTrack audioTrack = this.f23490u;
        if (audioTrack != null) {
            jw.a(audioTrack, jyVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void r(boolean z9) {
        R(L(), z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void s(float f9) {
        if (this.f23456J != f9) {
            this.f23456J = f9;
            S();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[Catch: jl -> 0x00e9, SYNTHETIC, TRY_LEAVE, TryCatch #3 {jl -> 0x00e9, blocks: (B:35:0x0086, B:46:0x00d3, B:48:0x00db, B:50:0x00e1, B:53:0x00ec, B:54:0x00fe, B:56:0x0104, B:58:0x0108, B:59:0x010d, B:63:0x0123, B:67:0x013b, B:68:0x0140, B:42:0x009b, B:44:0x00a4, B:73:0x0159, B:75:0x0161, B:76:0x0164, B:38:0x008f), top: B:193:0x0086, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161 A[Catch: jl -> 0x00e9, TryCatch #3 {jl -> 0x00e9, blocks: (B:35:0x0086, B:46:0x00d3, B:48:0x00db, B:50:0x00e1, B:53:0x00ec, B:54:0x00fe, B:56:0x0104, B:58:0x0108, B:59:0x010d, B:63:0x0123, B:67:0x013b, B:68:0x0140, B:42:0x009b, B:44:0x00a4, B:73:0x0159, B:75:0x0161, B:76:0x0164, B:38:0x008f), top: B:193:0x0086, inners: #2 }] */
    @Override // com.google.ads.interactivemedia.v3.internal.jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(java.nio.ByteBuffer r26, long r27, int r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.kh.t(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final boolean u() {
        return V() && this.f23479j.g(J());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final boolean v() {
        if (V()) {
            return this.f23465S && !u();
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final boolean w(C1333s c1333s) {
        return a(c1333s) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jp
    public final void x(C1333s c1333s, int[] iArr) throws jk {
        int i9;
        jb[] jbVarArr;
        int iIntValue;
        int iL;
        int iIntValue2;
        int i10;
        int iL2;
        int iD;
        int[] iArr2;
        if ("audio/raw".equals(c1333s.f24467l)) {
            af.u(cq.Y(c1333s.f24450A));
            iL = cq.l(c1333s.f24450A, c1333s.f24480y);
            jb[] jbVarArr2 = Y(c1333s.f24450A) ? this.f23478i : this.f23477h;
            this.f23476g.q(c1333s.f24451B, c1333s.f24452C);
            if (cq.f22640a < 21 && c1333s.f24480y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i11 = 0; i11 < 6; i11++) {
                    iArr2[i11] = i11;
                }
            } else {
                iArr2 = iArr;
            }
            this.f23475f.o(iArr2);
            iz izVar = new iz(c1333s.f24481z, c1333s.f24480y, c1333s.f24450A);
            for (jb jbVar : jbVarArr2) {
                try {
                    iz izVarA = jbVar.a(izVar);
                    if (true == jbVar.g()) {
                        izVar = izVarA;
                    }
                } catch (ja e9) {
                    throw new jk(e9, c1333s);
                }
            }
            int i12 = izVar.f23331d;
            int i13 = izVar.f23329b;
            int i14 = izVar.f23330c;
            int iF = cq.f(i14);
            jbVarArr = jbVarArr2;
            iL2 = cq.l(i12, i14);
            i10 = i13;
            i9 = 0;
            iIntValue = i12;
            iIntValue2 = iF;
        } else {
            jb[] jbVarArr3 = new jb[0];
            int i15 = c1333s.f24481z;
            int i16 = cq.f22640a;
            Pair pairA = this.f23473d.a(c1333s);
            if (pairA == null) {
                throw new jk("Unable to configure passthrough for: ".concat(String.valueOf(c1333s)), c1333s);
            }
            i9 = 2;
            jbVarArr = jbVarArr3;
            iIntValue = ((Integer) pairA.first).intValue();
            iL = -1;
            iIntValue2 = ((Integer) pairA.second).intValue();
            i10 = i15;
            iL2 = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue2, iIntValue);
        af.w(minBufferSize != -2);
        int i17 = 250000;
        if (i9 == 0) {
            iD = cq.d(minBufferSize * 4, kj.a(250000, i10, iL2), kj.a(750000, i10, iL2));
        } else if (i9 != 1) {
            int i18 = 5;
            if (iIntValue == 5) {
                i17 = 500000;
            } else {
                i18 = iIntValue;
            }
            iD = axy.a((((long) i17) * ((long) kj.b(i18))) / 1000000);
            iL2 = iL2;
        } else {
            iD = axy.a((((long) kj.b(iIntValue)) * 50000000) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, iD) + iL2) - 1) / iL2) * iL2;
        if (iIntValue == 0) {
            throw new jk("Invalid output encoding (mode=" + i9 + ") for: " + String.valueOf(c1333s), c1333s);
        }
        if (iIntValue2 != 0) {
            this.ab = false;
            kb kbVar = new kb(c1333s, iL, i9, iL2, i10, iIntValue2, iIntValue, iMax, jbVarArr);
            if (V()) {
                this.f23488s = kbVar;
                return;
            } else {
                this.f23489t = kbVar;
                return;
            }
        }
        throw new jk("Invalid output channel config (mode=" + i9 + ") for: " + String.valueOf(c1333s), c1333s);
    }
}
