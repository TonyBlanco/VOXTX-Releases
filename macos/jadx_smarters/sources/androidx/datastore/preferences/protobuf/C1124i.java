package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1140z;
import androidx.datastore.preferences.protobuf.r0;
import com.google.android.gms.common.api.a;
import d.AbstractC1617D;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1124i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1123h f14685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14688d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14689a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f14689a = iArr;
            try {
                iArr[r0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14689a[r0.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14689a[r0.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14689a[r0.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14689a[r0.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14689a[r0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14689a[r0.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14689a[r0.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14689a[r0.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14689a[r0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14689a[r0.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14689a[r0.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14689a[r0.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14689a[r0.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14689a[r0.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14689a[r0.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14689a[r0.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C1124i(AbstractC1123h abstractC1123h) {
        AbstractC1123h abstractC1123h2 = (AbstractC1123h) AbstractC1139y.b(abstractC1123h, "input");
        this.f14685a = abstractC1123h2;
        abstractC1123h2.f14645d = this;
    }

    public static C1124i P(AbstractC1123h abstractC1123h) {
        C1124i c1124i = abstractC1123h.f14645d;
        return c1124i != null ? c1124i : new C1124i(abstractC1123h);
    }

    private Object Q(r0.b bVar, Class cls, C1130o c1130o) {
        switch (a.f14689a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return p();
            case 3:
                return Double.valueOf(i());
            case 4:
                return Integer.valueOf(l());
            case 5:
                return Integer.valueOf(x());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(J());
            case 8:
                return Integer.valueOf(q());
            case 9:
                return Long.valueOf(N());
            case 10:
                return T(cls, c1130o);
            case 11:
                return Integer.valueOf(K());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(m());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Long.valueOf(C());
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return O();
            case 16:
                return Integer.valueOf(h());
            case LangUtils.HASH_SEED /* 17 */:
                return Long.valueOf(v());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object R(e0 e0Var, C1130o c1130o) {
        int i9 = this.f14687c;
        this.f14687c = r0.c(r0.a(this.f14686b), 4);
        try {
            Object objF = e0Var.f();
            e0Var.b(objF, this, c1130o);
            e0Var.c(objF);
            if (this.f14686b == this.f14687c) {
                return objF;
            }
            throw C1140z.g();
        } finally {
            this.f14687c = i9;
        }
    }

    private Object S(e0 e0Var, C1130o c1130o) throws C1140z {
        int iC = this.f14685a.C();
        AbstractC1123h abstractC1123h = this.f14685a;
        if (abstractC1123h.f14642a >= abstractC1123h.f14643b) {
            throw C1140z.h();
        }
        int iL = abstractC1123h.l(iC);
        Object objF = e0Var.f();
        this.f14685a.f14642a++;
        e0Var.b(objF, this, c1130o);
        e0Var.c(objF);
        this.f14685a.a(0);
        r5.f14642a--;
        this.f14685a.k(iL);
        return objF;
    }

    private void V(int i9) throws C1140z {
        if (this.f14685a.d() != i9) {
            throw C1140z.k();
        }
    }

    private void W(int i9) throws C1140z.a {
        if (r0.b(this.f14686b) != i9) {
            throw C1140z.d();
        }
    }

    private void X(int i9) throws C1140z {
        if ((i9 & 3) != 0) {
            throw C1140z.g();
        }
    }

    private void Y(int i9) throws C1140z {
        if ((i9 & 7) != 0) {
            throw C1140z.g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f14685a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(java.util.Map r8, androidx.datastore.preferences.protobuf.H.a r9, androidx.datastore.preferences.protobuf.C1130o r10) throws androidx.datastore.preferences.protobuf.C1140z.a {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f14685a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.h r2 = r7.f14685a
            int r1 = r2.l(r1)
            java.lang.Object r2 = r9.f14582b
            java.lang.Object r3 = r9.f14584d
        L14:
            int r4 = r7.E()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.h r5 = r7.f14685a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.I()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.z r4 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f14583c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
            java.lang.Object r5 = r9.f14584d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
            java.lang.Object r3 = r7.Q(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f14581a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.Q(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1140z.a -> L51
            goto L14
        L51:
            boolean r4 = r7.I()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.z r8 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.h r8 = r7.f14685a
            r8.k(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.h r9 = r7.f14685a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1124i.A(java.util.Map, androidx.datastore.preferences.protobuf.H$a, androidx.datastore.preferences.protobuf.o):void");
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void B(List list) throws C1140z {
        int iB;
        if (list instanceof AbstractC1138x) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw C1140z.d();
                }
                this.f14685a.q();
                throw null;
            }
            X(this.f14685a.C());
            this.f14685a.d();
            this.f14685a.q();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 2) {
            int iC = this.f14685a.C();
            X(iC);
            int iD = this.f14685a.d() + iC;
            do {
                list.add(Integer.valueOf(this.f14685a.q()));
            } while (this.f14685a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw C1140z.d();
        }
        do {
            list.add(Integer.valueOf(this.f14685a.q()));
            if (this.f14685a.e()) {
                return;
            } else {
                iB = this.f14685a.B();
            }
        } while (iB == this.f14686b);
        this.f14688d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long C() throws C1140z.a {
        W(0);
        return this.f14685a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public String D() throws C1140z.a {
        W(2);
        return this.f14685a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int E() {
        int i9 = this.f14688d;
        if (i9 != 0) {
            this.f14686b = i9;
            this.f14688d = 0;
        } else {
            this.f14686b = this.f14685a.B();
        }
        int i10 = this.f14686b;
        return (i10 == 0 || i10 == this.f14687c) ? a.e.API_PRIORITY_OTHER : r0.a(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void F(List list) throws C1140z.a {
        U(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void G(List list) throws C1140z {
        int iB;
        if (list instanceof AbstractC1135u) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw C1140z.d();
                }
                this.f14685a.s();
                throw null;
            }
            X(this.f14685a.C());
            this.f14685a.d();
            this.f14685a.s();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 2) {
            int iC = this.f14685a.C();
            X(iC);
            int iD = this.f14685a.d() + iC;
            do {
                list.add(Float.valueOf(this.f14685a.s()));
            } while (this.f14685a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw C1140z.d();
        }
        do {
            list.add(Float.valueOf(this.f14685a.s()));
            if (this.f14685a.e()) {
                return;
            } else {
                iB = this.f14685a.B();
            }
        } while (iB == this.f14686b);
        this.f14688d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void H(List list, e0 e0Var, C1130o c1130o) throws C1140z.a {
        int iB;
        if (r0.b(this.f14686b) != 3) {
            throw C1140z.d();
        }
        int i9 = this.f14686b;
        do {
            list.add(R(e0Var, c1130o));
            if (this.f14685a.e() || this.f14688d != 0) {
                return;
            } else {
                iB = this.f14685a.B();
            }
        } while (iB == i9);
        this.f14688d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean I() {
        int i9;
        if (this.f14685a.e() || (i9 = this.f14686b) == this.f14687c) {
            return false;
        }
        return this.f14685a.E(i9);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public float J() throws C1140z.a {
        W(5);
        return this.f14685a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int K() throws C1140z.a {
        W(5);
        return this.f14685a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void L(List list) throws C1140z.a {
        int iB;
        if (r0.b(this.f14686b) != 2) {
            throw C1140z.d();
        }
        do {
            list.add(p());
            if (this.f14685a.e()) {
                return;
            } else {
                iB = this.f14685a.B();
            }
        } while (iB == this.f14686b);
        this.f14688d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void M(List list) throws C1140z {
        int iB;
        if (list instanceof AbstractC1127l) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 1) {
                this.f14685a.o();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            Y(this.f14685a.C());
            this.f14685a.d();
            this.f14685a.o();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 1) {
            do {
                list.add(Double.valueOf(this.f14685a.o()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iC = this.f14685a.C();
        Y(iC);
        int iD = this.f14685a.d() + iC;
        do {
            list.add(Double.valueOf(this.f14685a.o()));
        } while (this.f14685a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long N() throws C1140z.a {
        W(0);
        return this.f14685a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public String O() throws C1140z.a {
        W(2);
        return this.f14685a.A();
    }

    public Object T(Class cls, C1130o c1130o) throws C1140z.a {
        W(2);
        return S(a0.a().c(cls), c1130o);
    }

    public void U(List list, boolean z9) throws C1140z.a {
        int iB;
        int iB2;
        if (r0.b(this.f14686b) != 2) {
            throw C1140z.d();
        }
        if (!(list instanceof D) || z9) {
            do {
                list.add(z9 ? O() : D());
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        D d9 = (D) list;
        do {
            d9.x(p());
            if (this.f14685a.e()) {
                return;
            } else {
                iB2 = this.f14685a.B();
            }
        } while (iB2 == this.f14686b);
        this.f14688d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Object a(e0 e0Var, C1130o c1130o) throws C1140z.a {
        W(2);
        return S(e0Var, c1130o);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long b() throws C1140z.a {
        W(1);
        return this.f14685a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void c(List list) throws C1140z {
        int iB;
        if (list instanceof AbstractC1138x) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw C1140z.d();
                }
                this.f14685a.v();
                throw null;
            }
            X(this.f14685a.C());
            this.f14685a.d();
            this.f14685a.v();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 2) {
            int iC = this.f14685a.C();
            X(iC);
            int iD = this.f14685a.d() + iC;
            do {
                list.add(Integer.valueOf(this.f14685a.v()));
            } while (this.f14685a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw C1140z.d();
        }
        do {
            list.add(Integer.valueOf(this.f14685a.v()));
            if (this.f14685a.e()) {
                return;
            } else {
                iB = this.f14685a.B();
            }
        } while (iB == this.f14686b);
        this.f14688d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void d(List list) throws C1140z {
        int iB;
        if (list instanceof F) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 0) {
                this.f14685a.y();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            this.f14685a.C();
            this.f14685a.d();
            this.f14685a.y();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 0) {
            do {
                list.add(Long.valueOf(this.f14685a.y()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iD = this.f14685a.d() + this.f14685a.C();
        do {
            list.add(Long.valueOf(this.f14685a.y()));
        } while (this.f14685a.d() < iD);
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public boolean e() throws C1140z.a {
        W(0);
        return this.f14685a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long f() throws C1140z.a {
        W(1);
        return this.f14685a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void g(List list) throws C1140z {
        int iB;
        if (list instanceof F) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 0) {
                this.f14685a.D();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            this.f14685a.C();
            this.f14685a.d();
            this.f14685a.D();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 0) {
            do {
                list.add(Long.valueOf(this.f14685a.D()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iD = this.f14685a.d() + this.f14685a.C();
        do {
            list.add(Long.valueOf(this.f14685a.D()));
        } while (this.f14685a.d() < iD);
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int getTag() {
        return this.f14686b;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int h() throws C1140z.a {
        W(0);
        return this.f14685a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public double i() throws C1140z.a {
        W(1);
        return this.f14685a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void j(List list) throws C1140z {
        int iB;
        if (list instanceof F) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 0) {
                this.f14685a.u();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            this.f14685a.C();
            this.f14685a.d();
            this.f14685a.u();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 0) {
            do {
                list.add(Long.valueOf(this.f14685a.u()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iD = this.f14685a.d() + this.f14685a.C();
        do {
            list.add(Long.valueOf(this.f14685a.u()));
        } while (this.f14685a.d() < iD);
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void k(List list) throws C1140z {
        int iB;
        if (list instanceof AbstractC1138x) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 0) {
                this.f14685a.p();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            this.f14685a.C();
            this.f14685a.d();
            this.f14685a.p();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f14685a.p()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iD = this.f14685a.d() + this.f14685a.C();
        do {
            list.add(Integer.valueOf(this.f14685a.p()));
        } while (this.f14685a.d() < iD);
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int l() throws C1140z.a {
        W(0);
        return this.f14685a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int m() throws C1140z.a {
        W(0);
        return this.f14685a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void n(List list) throws C1140z {
        int iB;
        if (list instanceof AbstractC1120e) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 0) {
                this.f14685a.m();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            this.f14685a.C();
            this.f14685a.d();
            this.f14685a.m();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 0) {
            do {
                list.add(Boolean.valueOf(this.f14685a.m()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iD = this.f14685a.d() + this.f14685a.C();
        do {
            list.add(Boolean.valueOf(this.f14685a.m()));
        } while (this.f14685a.d() < iD);
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void o(List list) throws C1140z.a {
        U(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public AbstractC1122g p() throws C1140z.a {
        W(2);
        return this.f14685a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int q() throws C1140z.a {
        W(0);
        return this.f14685a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void r(List list, e0 e0Var, C1130o c1130o) throws C1140z.a {
        int iB;
        if (r0.b(this.f14686b) != 2) {
            throw C1140z.d();
        }
        int i9 = this.f14686b;
        do {
            list.add(S(e0Var, c1130o));
            if (this.f14685a.e() || this.f14688d != 0) {
                return;
            } else {
                iB = this.f14685a.B();
            }
        } while (iB == i9);
        this.f14688d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void s(List list) throws C1140z {
        int iB;
        if (list instanceof F) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 1) {
                this.f14685a.r();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            Y(this.f14685a.C());
            this.f14685a.d();
            this.f14685a.r();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 1) {
            do {
                list.add(Long.valueOf(this.f14685a.r()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iC = this.f14685a.C();
        Y(iC);
        int iD = this.f14685a.d() + iC;
        do {
            list.add(Long.valueOf(this.f14685a.r()));
        } while (this.f14685a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public Object t(e0 e0Var, C1130o c1130o) throws C1140z.a {
        W(3);
        return R(e0Var, c1130o);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void u(List list) throws C1140z {
        int iB;
        if (list instanceof AbstractC1138x) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 0) {
                this.f14685a.x();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            this.f14685a.C();
            this.f14685a.d();
            this.f14685a.x();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f14685a.x()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iD = this.f14685a.d() + this.f14685a.C();
        do {
            list.add(Integer.valueOf(this.f14685a.x()));
        } while (this.f14685a.d() < iD);
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public long v() throws C1140z.a {
        W(0);
        return this.f14685a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void w(List list) throws C1140z {
        int iB;
        if (list instanceof AbstractC1138x) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 0) {
                this.f14685a.C();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            this.f14685a.C();
            this.f14685a.d();
            this.f14685a.C();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f14685a.C()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iD = this.f14685a.d() + this.f14685a.C();
        do {
            list.add(Integer.valueOf(this.f14685a.C()));
        } while (this.f14685a.d() < iD);
        V(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public int x() throws C1140z.a {
        W(5);
        return this.f14685a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void y(List list) throws C1140z {
        int iB;
        if (list instanceof F) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 1) {
                this.f14685a.w();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            Y(this.f14685a.C());
            this.f14685a.d();
            this.f14685a.w();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 1) {
            do {
                list.add(Long.valueOf(this.f14685a.w()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iC = this.f14685a.C();
        Y(iC);
        int iD = this.f14685a.d() + iC;
        do {
            list.add(Long.valueOf(this.f14685a.w()));
        } while (this.f14685a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void z(List list) throws C1140z {
        int iB;
        if (list instanceof AbstractC1138x) {
            AbstractC1617D.a(list);
            int iB2 = r0.b(this.f14686b);
            if (iB2 == 0) {
                this.f14685a.t();
                throw null;
            }
            if (iB2 != 2) {
                throw C1140z.d();
            }
            this.f14685a.C();
            this.f14685a.d();
            this.f14685a.t();
            throw null;
        }
        int iB3 = r0.b(this.f14686b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f14685a.t()));
                if (this.f14685a.e()) {
                    return;
                } else {
                    iB = this.f14685a.B();
                }
            } while (iB == this.f14686b);
            this.f14688d = iB;
            return;
        }
        if (iB3 != 2) {
            throw C1140z.d();
        }
        int iD = this.f14685a.d() + this.f14685a.C();
        do {
            list.add(Integer.valueOf(this.f14685a.t()));
        } while (this.f14685a.d() < iD);
        V(iD);
    }
}
