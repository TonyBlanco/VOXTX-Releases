package c4;

import android.net.Uri;
import b4.C1209B;
import b4.C1225p;
import b4.C1227s;
import b4.InterfaceC1222m;
import b4.InterfaceC1224o;
import b4.K;
import b4.Q;
import b4.S;
import c4.C1256b;
import c4.InterfaceC1255a;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import d4.O;
import d4.k0;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: c4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1257c implements InterfaceC1224o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1255a f18210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1224o f18211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1224o f18212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1224o f18213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1263i f18214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f18218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1227s f18219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1227s f18220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC1224o f18221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f18224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC1264j f18225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f18228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f18229t;

    /* JADX INFO: renamed from: c4.c$b */
    public interface b {
    }

    /* JADX INFO: renamed from: c4.c$c, reason: collision with other inner class name */
    public static final class C0215c implements InterfaceC1224o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC1255a f18230a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC1222m.a f18232c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC1224o.a f18235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18236g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f18237h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC1224o.a f18231b = new C1209B.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC1263i f18233d = InterfaceC1263i.f18243a;

        @Override // b4.InterfaceC1224o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1257c a() {
            InterfaceC1224o.a aVar = this.f18235f;
            return e(aVar != null ? aVar.a() : null, this.f18237h, this.f18236g);
        }

        public C1257c c() {
            InterfaceC1224o.a aVar = this.f18235f;
            return e(aVar != null ? aVar.a() : null, this.f18237h | 1, -1000);
        }

        public C1257c d() {
            return e(null, this.f18237h | 1, -1000);
        }

        public final C1257c e(InterfaceC1224o interfaceC1224o, int i9, int i10) {
            InterfaceC1222m interfaceC1222mA;
            InterfaceC1255a interfaceC1255a = (InterfaceC1255a) AbstractC1684a.e(this.f18230a);
            if (this.f18234e || interfaceC1224o == null) {
                interfaceC1222mA = null;
            } else {
                InterfaceC1222m.a aVar = this.f18232c;
                interfaceC1222mA = aVar != null ? aVar.a() : new C1256b.C0214b().b(interfaceC1255a).a();
            }
            return new C1257c(interfaceC1255a, interfaceC1224o, this.f18231b.a(), interfaceC1222mA, this.f18233d, i9, null, i10, null);
        }

        public InterfaceC1255a f() {
            return this.f18230a;
        }

        public InterfaceC1263i g() {
            return this.f18233d;
        }

        public O h() {
            return null;
        }

        public C0215c i(InterfaceC1255a interfaceC1255a) {
            this.f18230a = interfaceC1255a;
            return this;
        }

        public C0215c j(InterfaceC1222m.a aVar) {
            this.f18232c = aVar;
            this.f18234e = aVar == null;
            return this;
        }

        public C0215c k(int i9) {
            this.f18237h = i9;
            return this;
        }

        public C0215c l(InterfaceC1224o.a aVar) {
            this.f18235f = aVar;
            return this;
        }
    }

    public C1257c(InterfaceC1255a interfaceC1255a, InterfaceC1224o interfaceC1224o, InterfaceC1224o interfaceC1224o2, InterfaceC1222m interfaceC1222m, InterfaceC1263i interfaceC1263i, int i9, O o9, int i10, b bVar) {
        this.f18210a = interfaceC1255a;
        this.f18211b = interfaceC1224o2;
        this.f18214e = interfaceC1263i == null ? InterfaceC1263i.f18243a : interfaceC1263i;
        this.f18215f = (i9 & 1) != 0;
        this.f18216g = (i9 & 2) != 0;
        this.f18217h = (i9 & 4) != 0;
        Q q9 = null;
        if (interfaceC1224o != null) {
            this.f18213d = interfaceC1224o;
            if (interfaceC1222m != null) {
                q9 = new Q(interfaceC1224o, interfaceC1222m);
            }
        } else {
            this.f18213d = K.f17524a;
        }
        this.f18212c = q9;
    }

    public static Uri v(InterfaceC1255a interfaceC1255a, String str, Uri uri) {
        Uri uriB = AbstractC1268n.b(interfaceC1255a.b(str));
        return uriB != null ? uriB : uri;
    }

    public final boolean A() {
        return this.f18221l == this.f18212c;
    }

    public final void B() {
    }

    public final void C(int i9) {
    }

    public final void D(C1227s c1227s, boolean z9) throws InterruptedIOException {
        AbstractC1264j abstractC1264jH;
        long jMin;
        C1227s c1227sA;
        InterfaceC1224o interfaceC1224o;
        String str = (String) k0.j(c1227s.f17606i);
        if (this.f18227r) {
            abstractC1264jH = null;
        } else if (this.f18215f) {
            try {
                abstractC1264jH = this.f18210a.h(str, this.f18223n, this.f18224o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            abstractC1264jH = this.f18210a.d(str, this.f18223n, this.f18224o);
        }
        if (abstractC1264jH == null) {
            interfaceC1224o = this.f18213d;
            c1227sA = c1227s.a().h(this.f18223n).g(this.f18224o).a();
        } else if (abstractC1264jH.f18247e) {
            Uri uriFromFile = Uri.fromFile((File) k0.j(abstractC1264jH.f18248f));
            long j9 = abstractC1264jH.f18245c;
            long j10 = this.f18223n - j9;
            long jMin2 = abstractC1264jH.f18246d - j10;
            long j11 = this.f18224o;
            if (j11 != -1) {
                jMin2 = Math.min(jMin2, j11);
            }
            c1227sA = c1227s.a().i(uriFromFile).k(j9).h(j10).g(jMin2).a();
            interfaceC1224o = this.f18211b;
        } else {
            if (abstractC1264jH.h()) {
                jMin = this.f18224o;
            } else {
                jMin = abstractC1264jH.f18246d;
                long j12 = this.f18224o;
                if (j12 != -1) {
                    jMin = Math.min(jMin, j12);
                }
            }
            c1227sA = c1227s.a().h(this.f18223n).g(jMin).a();
            interfaceC1224o = this.f18212c;
            if (interfaceC1224o == null) {
                interfaceC1224o = this.f18213d;
                this.f18210a.g(abstractC1264jH);
                abstractC1264jH = null;
            }
        }
        this.f18229t = (this.f18227r || interfaceC1224o != this.f18213d) ? Long.MAX_VALUE : this.f18223n + 102400;
        if (z9) {
            AbstractC1684a.g(x());
            if (interfaceC1224o == this.f18213d) {
                return;
            }
            try {
                j();
            } finally {
            }
        }
        if (abstractC1264jH != null && abstractC1264jH.b()) {
            this.f18225p = abstractC1264jH;
        }
        this.f18221l = interfaceC1224o;
        this.f18220k = c1227sA;
        this.f18222m = 0L;
        long jA = interfaceC1224o.a(c1227sA);
        C1270p c1270p = new C1270p();
        if (c1227sA.f17605h == -1 && jA != -1) {
            this.f18224o = jA;
            C1270p.g(c1270p, this.f18223n + jA);
        }
        if (z()) {
            Uri uri = interfaceC1224o.getUri();
            this.f18218i = uri;
            C1270p.h(c1270p, c1227s.f17598a.equals(uri) ^ true ? this.f18218i : null);
        }
        if (A()) {
            this.f18210a.f(str, c1270p);
        }
    }

    public final void E(String str) {
        this.f18224o = 0L;
        if (A()) {
            C1270p c1270p = new C1270p();
            C1270p.g(c1270p, this.f18223n);
            this.f18210a.f(str, c1270p);
        }
    }

    public final int F(C1227s c1227s) {
        if (this.f18216g && this.f18226q) {
            return 0;
        }
        return (this.f18217h && c1227s.f17605h == -1) ? 1 : -1;
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) {
        try {
            String strA = this.f18214e.a(c1227s);
            C1227s c1227sA = c1227s.a().f(strA).a();
            this.f18219j = c1227sA;
            this.f18218i = v(this.f18210a, strA, c1227sA.f17598a);
            this.f18223n = c1227s.f17604g;
            int iF = F(c1227s);
            boolean z9 = iF != -1;
            this.f18227r = z9;
            if (z9) {
                C(iF);
            }
            if (this.f18227r) {
                this.f18224o = -1L;
            } else {
                long jA = AbstractC1268n.a(this.f18210a.b(strA));
                this.f18224o = jA;
                if (jA != -1) {
                    long j9 = jA - c1227s.f17604g;
                    this.f18224o = j9;
                    if (j9 < 0) {
                        throw new C1225p(AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            }
            long jMin = c1227s.f17605h;
            if (jMin != -1) {
                long j10 = this.f18224o;
                if (j10 != -1) {
                    jMin = Math.min(j10, jMin);
                }
                this.f18224o = jMin;
            }
            long j11 = this.f18224o;
            if (j11 > 0 || j11 == -1) {
                D(c1227sA, false);
            }
            long j12 = c1227s.f17605h;
            return j12 != -1 ? j12 : this.f18224o;
        } catch (Throwable th) {
            w(th);
            throw th;
        }
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        this.f18219j = null;
        this.f18218i = null;
        this.f18223n = 0L;
        B();
        try {
            j();
        } catch (Throwable th) {
            w(th);
            throw th;
        }
    }

    @Override // b4.InterfaceC1224o
    public Map e() {
        return z() ? this.f18213d.e() : Collections.emptyMap();
    }

    @Override // b4.InterfaceC1224o
    public void g(S s9) {
        AbstractC1684a.e(s9);
        this.f18211b.g(s9);
        this.f18213d.g(s9);
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f18218i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        InterfaceC1224o interfaceC1224o = this.f18221l;
        if (interfaceC1224o == null) {
            return;
        }
        try {
            interfaceC1224o.close();
        } finally {
            this.f18220k = null;
            this.f18221l = null;
            AbstractC1264j abstractC1264j = this.f18225p;
            if (abstractC1264j != null) {
                this.f18210a.g(abstractC1264j);
                this.f18225p = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x001e, B:11:0x0026, B:14:0x002d, B:16:0x003d, B:18:0x0043, B:19:0x0049, B:21:0x005a, B:22:0x005e, B:24:0x0064, B:26:0x006a, B:28:0x0070, B:29:0x007c, B:35:0x0088), top: B:39:0x001e }] */
    @Override // b4.InterfaceC1220k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 0
            if (r15 != 0) goto L4
            return r0
        L4:
            long r1 = r12.f18224o
            r3 = -1
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto Le
            return r3
        Le:
            b4.s r1 = r12.f18219j
            java.lang.Object r1 = d4.AbstractC1684a.e(r1)
            b4.s r1 = (b4.C1227s) r1
            b4.s r2 = r12.f18220k
            java.lang.Object r2 = d4.AbstractC1684a.e(r2)
            b4.s r2 = (b4.C1227s) r2
            long r6 = r12.f18223n     // Catch: java.lang.Throwable -> L2b
            long r8 = r12.f18229t     // Catch: java.lang.Throwable -> L2b
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L2d
            r6 = 1
            r12.D(r1, r6)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r13 = move-exception
            goto L93
        L2d:
            b4.o r6 = r12.f18221l     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = d4.AbstractC1684a.e(r6)     // Catch: java.lang.Throwable -> L2b
            b4.o r6 = (b4.InterfaceC1224o) r6     // Catch: java.lang.Throwable -> L2b
            int r6 = r6.read(r13, r14, r15)     // Catch: java.lang.Throwable -> L2b
            r7 = -1
            if (r6 == r3) goto L5e
            boolean r13 = r12.y()     // Catch: java.lang.Throwable -> L2b
            if (r13 == 0) goto L49
            long r13 = r12.f18228s     // Catch: java.lang.Throwable -> L2b
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L2b
            long r13 = r13 + r0
            r12.f18228s = r13     // Catch: java.lang.Throwable -> L2b
        L49:
            long r13 = r12.f18223n     // Catch: java.lang.Throwable -> L2b
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L2b
            long r13 = r13 + r0
            r12.f18223n = r13     // Catch: java.lang.Throwable -> L2b
            long r13 = r12.f18222m     // Catch: java.lang.Throwable -> L2b
            long r13 = r13 + r0
            r12.f18222m = r13     // Catch: java.lang.Throwable -> L2b
            long r13 = r12.f18224o     // Catch: java.lang.Throwable -> L2b
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L87
            long r13 = r13 - r0
            r12.f18224o = r13     // Catch: java.lang.Throwable -> L2b
            goto L87
        L5e:
            boolean r3 = r12.z()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L7c
            long r2 = r2.f17605h     // Catch: java.lang.Throwable -> L2b
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 == 0) goto L70
            long r9 = r12.f18222m     // Catch: java.lang.Throwable -> L2b
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 >= 0) goto L7c
        L70:
            java.lang.String r13 = r1.f17606i     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r13 = d4.k0.j(r13)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L2b
            r12.E(r13)     // Catch: java.lang.Throwable -> L2b
            goto L87
        L7c:
            long r2 = r12.f18224o     // Catch: java.lang.Throwable -> L2b
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L88
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L87
            goto L88
        L87:
            return r6
        L88:
            r12.j()     // Catch: java.lang.Throwable -> L2b
            r12.D(r1, r0)     // Catch: java.lang.Throwable -> L2b
            int r13 = r12.read(r13, r14, r15)     // Catch: java.lang.Throwable -> L2b
            return r13
        L93:
            r12.w(r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C1257c.read(byte[], int, int):int");
    }

    public InterfaceC1255a t() {
        return this.f18210a;
    }

    public InterfaceC1263i u() {
        return this.f18214e;
    }

    public final void w(Throwable th) {
        if (y() || (th instanceof InterfaceC1255a.C0213a)) {
            this.f18226q = true;
        }
    }

    public final boolean x() {
        return this.f18221l == this.f18213d;
    }

    public final boolean y() {
        return this.f18221l == this.f18211b;
    }

    public final boolean z() {
        return !y();
    }
}
