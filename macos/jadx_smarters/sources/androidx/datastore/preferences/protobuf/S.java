package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1139y;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import d.AbstractC1617D;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import sun.misc.Unsafe;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class S implements e0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f14589r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Unsafe f14590s = p0.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f14591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f14592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O f14595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f14600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U f14603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E f14604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l0 f14605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC1131p f14606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final J f14607q;

    public S(int[] iArr, Object[] objArr, int i9, int i10, O o9, boolean z9, boolean z10, int[] iArr2, int i11, int i12, U u9, E e9, l0 l0Var, AbstractC1131p abstractC1131p, J j9) {
        this.f14591a = iArr;
        this.f14592b = objArr;
        this.f14593c = i9;
        this.f14594d = i10;
        this.f14597g = o9 instanceof AbstractC1137w;
        this.f14598h = z9;
        this.f14596f = abstractC1131p != null && abstractC1131p.e(o9);
        this.f14599i = z10;
        this.f14600j = iArr2;
        this.f14601k = i11;
        this.f14602l = i12;
        this.f14603m = u9;
        this.f14604n = e9;
        this.f14605o = l0Var;
        this.f14606p = abstractC1131p;
        this.f14595e = o9;
        this.f14607q = j9;
    }

    public static boolean E(int i9) {
        return (i9 & 268435456) != 0;
    }

    public static List F(Object obj, long j9) {
        return (List) p0.A(obj, j9);
    }

    public static long G(Object obj, long j9) {
        return p0.y(obj, j9);
    }

    public static S M(Class cls, M m9, U u9, E e9, l0 l0Var, AbstractC1131p abstractC1131p, J j9) {
        if (m9 instanceof c0) {
            return O((c0) m9, u9, e9, l0Var, abstractC1131p, j9);
        }
        AbstractC1617D.a(m9);
        return N(null, u9, e9, l0Var, abstractC1131p, j9);
    }

    public static S N(i0 i0Var, U u9, E e9, l0 l0Var, AbstractC1131p abstractC1131p, J j9) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.S O(androidx.datastore.preferences.protobuf.c0 r36, androidx.datastore.preferences.protobuf.U r37, androidx.datastore.preferences.protobuf.E r38, androidx.datastore.preferences.protobuf.l0 r39, androidx.datastore.preferences.protobuf.AbstractC1131p r40, androidx.datastore.preferences.protobuf.J r41) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.O(androidx.datastore.preferences.protobuf.c0, androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.E, androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.J):androidx.datastore.preferences.protobuf.S");
    }

    public static long Q(int i9) {
        return i9 & 1048575;
    }

    public static boolean R(Object obj, long j9) {
        return ((Boolean) p0.A(obj, j9)).booleanValue();
    }

    public static double S(Object obj, long j9) {
        return ((Double) p0.A(obj, j9)).doubleValue();
    }

    public static float T(Object obj, long j9) {
        return ((Float) p0.A(obj, j9)).floatValue();
    }

    public static int U(Object obj, long j9) {
        return ((Integer) p0.A(obj, j9)).intValue();
    }

    public static long V(Object obj, long j9) {
        return ((Long) p0.A(obj, j9)).longValue();
    }

    public static Field c0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int g0(int i9) {
        return (i9 & 267386880) >>> 20;
    }

    public static boolean k(Object obj, long j9) {
        return p0.p(obj, j9);
    }

    public static double l(Object obj, long j9) {
        return p0.v(obj, j9);
    }

    public static float o(Object obj, long j9) {
        return p0.w(obj, j9);
    }

    public static int v(Object obj, long j9) {
        return p0.x(obj, j9);
    }

    public static boolean w(int i9) {
        return (i9 & 536870912) != 0;
    }

    public static boolean z(Object obj, int i9, e0 e0Var) {
        return e0Var.d(p0.A(obj, Q(i9)));
    }

    public final boolean A(Object obj, int i9, int i10) {
        List list = (List) p0.A(obj, Q(i9));
        if (list.isEmpty()) {
            return true;
        }
        e0 e0VarR = r(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!e0VarR.d(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(Object obj, int i9, int i10) {
        Map mapE = this.f14607q.e(p0.A(obj, Q(i9)));
        if (mapE.isEmpty()) {
            return true;
        }
        if (this.f14607q.b(q(i10)).f14583c.getJavaType() != r0.c.MESSAGE) {
            return true;
        }
        e0 e0VarC = null;
        for (Object obj2 : mapE.values()) {
            if (e0VarC == null) {
                e0VarC = a0.a().c(obj2.getClass());
            }
            if (!e0VarC.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean C(Object obj, Object obj2, int i9) {
        long jX = X(i9) & 1048575;
        return p0.x(obj, jX) == p0.x(obj2, jX);
    }

    public final boolean D(Object obj, int i9, int i10) {
        return p0.x(obj, (long) (X(i10) & 1048575)) == i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r0 = r16.f14601k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r0 >= r16.f14602l) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        r13 = n(r19, r16.f14600j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r13 == null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(androidx.datastore.preferences.protobuf.l0 r17, androidx.datastore.preferences.protobuf.AbstractC1131p r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.d0 r20, androidx.datastore.preferences.protobuf.C1130o r21) {
        /*
            Method dump skipped, instruction units count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.H(androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.o):void");
    }

    public final void I(Object obj, int i9, Object obj2, C1130o c1130o, d0 d0Var) {
        long jQ = Q(h0(i9));
        Object objA = p0.A(obj, jQ);
        if (objA == null) {
            objA = this.f14607q.d(obj2);
            p0.O(obj, jQ, objA);
        } else if (this.f14607q.h(objA)) {
            Object objD = this.f14607q.d(obj2);
            this.f14607q.a(objD, objA);
            p0.O(obj, jQ, objD);
            objA = objD;
        }
        d0Var.A(this.f14607q.c(objA), this.f14607q.b(obj2), c1130o);
    }

    public final void J(Object obj, Object obj2, int i9) {
        long jQ = Q(h0(i9));
        if (x(obj2, i9)) {
            Object objA = p0.A(obj, jQ);
            Object objA2 = p0.A(obj2, jQ);
            if (objA != null && objA2 != null) {
                objA2 = AbstractC1139y.h(objA, objA2);
            } else if (objA2 == null) {
                return;
            }
            p0.O(obj, jQ, objA2);
            d0(obj, i9);
        }
    }

    public final void K(Object obj, Object obj2, int i9) {
        int iH0 = h0(i9);
        int iP = P(i9);
        long jQ = Q(iH0);
        if (D(obj2, iP, i9)) {
            Object objA = p0.A(obj, jQ);
            Object objA2 = p0.A(obj2, jQ);
            if (objA != null && objA2 != null) {
                objA2 = AbstractC1139y.h(objA, objA2);
            } else if (objA2 == null) {
                return;
            }
            p0.O(obj, jQ, objA2);
            e0(obj, iP, i9);
        }
    }

    public final void L(Object obj, Object obj2, int i9) {
        int iH0 = h0(i9);
        long jQ = Q(iH0);
        int iP = P(i9);
        switch (g0(iH0)) {
            case 0:
                if (x(obj2, i9)) {
                    p0.K(obj, jQ, p0.v(obj2, jQ));
                    d0(obj, i9);
                }
                break;
            case 1:
                if (x(obj2, i9)) {
                    p0.L(obj, jQ, p0.w(obj2, jQ));
                    d0(obj, i9);
                }
                break;
            case 2:
                if (!x(obj2, i9)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i9);
                break;
            case 3:
                if (!x(obj2, i9)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i9);
                break;
            case 4:
                if (!x(obj2, i9)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i9);
                break;
            case 5:
                if (!x(obj2, i9)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i9);
                break;
            case 6:
                if (!x(obj2, i9)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i9);
                break;
            case 7:
                if (x(obj2, i9)) {
                    p0.E(obj, jQ, p0.p(obj2, jQ));
                    d0(obj, i9);
                }
                break;
            case 8:
                if (!x(obj2, i9)) {
                }
                p0.O(obj, jQ, p0.A(obj2, jQ));
                d0(obj, i9);
                break;
            case 9:
            case LangUtils.HASH_SEED /* 17 */:
                J(obj, obj2, i9);
                break;
            case 10:
                if (!x(obj2, i9)) {
                }
                p0.O(obj, jQ, p0.A(obj2, jQ));
                d0(obj, i9);
                break;
            case 11:
                if (!x(obj2, i9)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i9);
                break;
            case 12:
                if (!x(obj2, i9)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i9);
                break;
            case 13:
                if (!x(obj2, i9)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i9);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (!x(obj2, i9)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i9);
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                if (!x(obj2, i9)) {
                }
                p0.M(obj, jQ, p0.x(obj2, jQ));
                d0(obj, i9);
                break;
            case 16:
                if (!x(obj2, i9)) {
                }
                p0.N(obj, jQ, p0.y(obj2, jQ));
                d0(obj, i9);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case LangUtils.HASH_OFFSET /* 37 */:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f14604n.d(obj, obj2, jQ);
                break;
            case 50:
                g0.E(this.f14607q, obj, obj2, jQ);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!D(obj2, iP, i9)) {
                }
                p0.O(obj, jQ, p0.A(obj2, jQ));
                e0(obj, iP, i9);
                break;
            case 60:
            case 68:
                K(obj, obj2, i9);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
            case 67:
                if (!D(obj2, iP, i9)) {
                }
                p0.O(obj, jQ, p0.A(obj2, jQ));
                e0(obj, iP, i9);
                break;
        }
    }

    public final int P(int i9) {
        return this.f14591a[i9];
    }

    public final int W(int i9) {
        if (i9 < this.f14593c || i9 > this.f14594d) {
            return -1;
        }
        return f0(i9, 0);
    }

    public final int X(int i9) {
        return this.f14591a[i9 + 2];
    }

    public final void Y(Object obj, long j9, d0 d0Var, e0 e0Var, C1130o c1130o) {
        d0Var.H(this.f14604n.e(obj, j9), e0Var, c1130o);
    }

    public final void Z(Object obj, int i9, d0 d0Var, e0 e0Var, C1130o c1130o) {
        d0Var.r(this.f14604n.e(obj, Q(i9)), e0Var, c1130o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i9 = 0; i9 < this.f14591a.length; i9 += 3) {
            L(obj, obj2, i9);
        }
        if (this.f14598h) {
            return;
        }
        g0.F(this.f14605o, obj, obj2);
        if (this.f14596f) {
            g0.D(this.f14606p, obj, obj2);
        }
    }

    public final void a0(Object obj, int i9, d0 d0Var) {
        long jQ;
        Object objP;
        if (w(i9)) {
            jQ = Q(i9);
            objP = d0Var.O();
        } else if (this.f14597g) {
            jQ = Q(i9);
            objP = d0Var.D();
        } else {
            jQ = Q(i9);
            objP = d0Var.p();
        }
        p0.O(obj, jQ, objP);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(Object obj, d0 d0Var, C1130o c1130o) {
        c1130o.getClass();
        H(this.f14605o, this.f14606p, obj, d0Var, c1130o);
    }

    public final void b0(Object obj, int i9, d0 d0Var) {
        if (w(i9)) {
            d0Var.o(this.f14604n.e(obj, Q(i9)));
        } else {
            d0Var.F(this.f14604n.e(obj, Q(i9)));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void c(Object obj) {
        int i9;
        int i10 = this.f14601k;
        while (true) {
            i9 = this.f14602l;
            if (i10 >= i9) {
                break;
            }
            long jQ = Q(h0(this.f14600j[i10]));
            Object objA = p0.A(obj, jQ);
            if (objA != null) {
                p0.O(obj, jQ, this.f14607q.f(objA));
            }
            i10++;
        }
        int length = this.f14600j.length;
        while (i9 < length) {
            this.f14604n.c(obj, this.f14600j[i9]);
            i9++;
        }
        this.f14605o.j(obj);
        if (this.f14596f) {
            this.f14606p.f(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r12.f14601k
            r5 = 1
            if (r2 >= r4) goto L94
            int[] r4 = r12.f14600j
            r4 = r4[r2]
            int r6 = r12.P(r4)
            int r7 = r12.h0(r4)
            boolean r8 = r12.f14598h
            if (r8 != 0) goto L31
            int[] r8 = r12.f14591a
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r5 = r5 << r8
            if (r9 == r0) goto L32
            sun.misc.Unsafe r0 = androidx.datastore.preferences.protobuf.S.f14590s
            long r10 = (long) r9
            int r3 = r0.getInt(r13, r10)
            r0 = r9
            goto L32
        L31:
            r5 = 0
        L32:
            boolean r8 = E(r7)
            if (r8 == 0) goto L3f
            boolean r8 = r12.y(r13, r4, r3, r5)
            if (r8 != 0) goto L3f
            return r1
        L3f:
            int r8 = g0(r7)
            r9 = 9
            if (r8 == r9) goto L7f
            r9 = 17
            if (r8 == r9) goto L7f
            r5 = 27
            if (r8 == r5) goto L78
            r5 = 60
            if (r8 == r5) goto L67
            r5 = 68
            if (r8 == r5) goto L67
            r5 = 49
            if (r8 == r5) goto L78
            r5 = 50
            if (r8 == r5) goto L60
            goto L90
        L60:
            boolean r4 = r12.B(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L67:
            boolean r5 = r12.D(r13, r6, r4)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.e0 r4 = r12.r(r4)
            boolean r4 = z(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L78:
            boolean r4 = r12.A(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L7f:
            boolean r5 = r12.y(r13, r4, r3, r5)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.e0 r4 = r12.r(r4)
            boolean r4 = z(r13, r7, r4)
            if (r4 != 0) goto L90
            return r1
        L90:
            int r2 = r2 + 1
            goto L4
        L94:
            boolean r0 = r12.f14596f
            if (r0 == 0) goto La5
            androidx.datastore.preferences.protobuf.p r0 = r12.f14606p
            androidx.datastore.preferences.protobuf.s r13 = r0.c(r13)
            boolean r13 = r13.k()
            if (r13 != 0) goto La5
            return r1
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.d(java.lang.Object):boolean");
    }

    public final void d0(Object obj, int i9) {
        if (this.f14598h) {
            return;
        }
        int iX = X(i9);
        long j9 = iX & 1048575;
        p0.M(obj, j9, p0.x(obj, j9) | (1 << (iX >>> 20)));
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int e(Object obj) {
        return this.f14598h ? t(obj) : s(obj);
    }

    public final void e0(Object obj, int i9, int i10) {
        p0.M(obj, X(i10) & 1048575, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public Object f() {
        return this.f14603m.a(this.f14595e);
    }

    public final int f0(int i9, int i10) {
        int length = (this.f14591a.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int iP = P(i12);
            if (i9 == iP) {
                return i12;
            }
            if (i9 < iP) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2 A[PHI: r3
      0x00f2: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x010e, B:68:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.g(java.lang.Object):int");
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void h(Object obj, s0 s0Var) {
        if (s0Var.y() == s0.a.DESCENDING) {
            k0(obj, s0Var);
        } else if (this.f14598h) {
            j0(obj, s0Var);
        } else {
            i0(obj, s0Var);
        }
    }

    public final int h0(int i9) {
        return this.f14591a[i9 + 1];
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean i(Object obj, Object obj2) {
        int length = this.f14591a.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            if (!m(obj, obj2, i9)) {
                return false;
            }
        }
        if (!this.f14605o.g(obj).equals(this.f14605o.g(obj2))) {
            return false;
        }
        if (this.f14596f) {
            return this.f14606p.c(obj).equals(this.f14606p.c(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(java.lang.Object r18, androidx.datastore.preferences.protobuf.s0 r19) {
        /*
            Method dump skipped, instruction units count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.i0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    public final boolean j(Object obj, Object obj2, int i9) {
        return x(obj, i9) == x(obj2, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(java.lang.Object r13, androidx.datastore.preferences.protobuf.s0 r14) {
        /*
            Method dump skipped, instruction units count: 1496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.j0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(java.lang.Object r11, androidx.datastore.preferences.protobuf.s0 r12) {
        /*
            Method dump skipped, instruction units count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.k0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    public final void l0(s0 s0Var, int i9, Object obj, int i10) {
        if (obj != null) {
            s0Var.r(i9, this.f14607q.b(q(i10)), this.f14607q.e(obj));
        }
    }

    public final boolean m(Object obj, Object obj2, int i9) {
        int iH0 = h0(i9);
        long jQ = Q(iH0);
        switch (g0(iH0)) {
            case 0:
                return j(obj, obj2, i9) && Double.doubleToLongBits(p0.v(obj, jQ)) == Double.doubleToLongBits(p0.v(obj2, jQ));
            case 1:
                return j(obj, obj2, i9) && Float.floatToIntBits(p0.w(obj, jQ)) == Float.floatToIntBits(p0.w(obj2, jQ));
            case 2:
                return j(obj, obj2, i9) && p0.y(obj, jQ) == p0.y(obj2, jQ);
            case 3:
                return j(obj, obj2, i9) && p0.y(obj, jQ) == p0.y(obj2, jQ);
            case 4:
                return j(obj, obj2, i9) && p0.x(obj, jQ) == p0.x(obj2, jQ);
            case 5:
                return j(obj, obj2, i9) && p0.y(obj, jQ) == p0.y(obj2, jQ);
            case 6:
                return j(obj, obj2, i9) && p0.x(obj, jQ) == p0.x(obj2, jQ);
            case 7:
                return j(obj, obj2, i9) && p0.p(obj, jQ) == p0.p(obj2, jQ);
            case 8:
                return j(obj, obj2, i9) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ));
            case 9:
                return j(obj, obj2, i9) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ));
            case 10:
                return j(obj, obj2, i9) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ));
            case 11:
                return j(obj, obj2, i9) && p0.x(obj, jQ) == p0.x(obj2, jQ);
            case 12:
                return j(obj, obj2, i9) && p0.x(obj, jQ) == p0.x(obj2, jQ);
            case 13:
                return j(obj, obj2, i9) && p0.x(obj, jQ) == p0.x(obj2, jQ);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return j(obj, obj2, i9) && p0.y(obj, jQ) == p0.y(obj2, jQ);
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return j(obj, obj2, i9) && p0.x(obj, jQ) == p0.x(obj2, jQ);
            case 16:
                return j(obj, obj2, i9) && p0.y(obj, jQ) == p0.y(obj2, jQ);
            case LangUtils.HASH_SEED /* 17 */:
                return j(obj, obj2, i9) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case LangUtils.HASH_OFFSET /* 37 */:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return g0.J(p0.A(obj, jQ), p0.A(obj2, jQ));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
            case 67:
            case 68:
                return C(obj, obj2, i9) && g0.J(p0.A(obj, jQ), p0.A(obj2, jQ));
            default:
                return true;
        }
    }

    public final void m0(int i9, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.f(i9, (String) obj);
        } else {
            s0Var.j(i9, (AbstractC1122g) obj);
        }
    }

    public final Object n(Object obj, int i9, Object obj2, l0 l0Var) {
        P(i9);
        if (p0.A(obj, Q(h0(i9))) == null) {
            return obj2;
        }
        p(i9);
        return obj2;
    }

    public final void n0(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.t(l0Var.g(obj), s0Var);
    }

    public final AbstractC1139y.a p(int i9) {
        AbstractC1617D.a(this.f14592b[((i9 / 3) * 2) + 1]);
        return null;
    }

    public final Object q(int i9) {
        return this.f14592b[(i9 / 3) * 2];
    }

    public final e0 r(int i9) {
        int i10 = (i9 / 3) * 2;
        e0 e0Var = (e0) this.f14592b[i10];
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0VarC = a0.a().c((Class) this.f14592b[i10 + 1]);
        this.f14592b[i10] = e0VarC;
        return e0VarC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0351, code lost:
    
        if ((r7 & r14) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x036b, code lost:
    
        if ((r7 & r14) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0371, code lost:
    
        if ((r7 & r14) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x038b, code lost:
    
        if ((r7 & r14) != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0391, code lost:
    
        if ((r7 & r14) != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03b3, code lost:
    
        if ((r7 & r14) != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (D(r17, r9, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC1125j.r(r9, (androidx.datastore.preferences.protobuf.O) r2.getObject(r17, r12), r(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (D(r17, r9, r5) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC1125j.H(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (D(r17, r9, r5) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        r4 = androidx.datastore.preferences.protobuf.AbstractC1125j.F(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        if (D(r17, r9, r5) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC1125j.f(r9, (androidx.datastore.preferences.protobuf.AbstractC1122g) r2.getObject(r17, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (D(r17, r9, r5) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.g0.o(r9, r2.getObject(r17, r12), r(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
    
        if (D(r17, r9, r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC1125j.c(r9, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b1 A[PHI: r3
      0x01b1: PHI (r3v117 int) = 
      (r3v79 int)
      (r3v82 int)
      (r3v85 int)
      (r3v88 int)
      (r3v91 int)
      (r3v94 int)
      (r3v97 int)
      (r3v100 int)
      (r3v103 int)
      (r3v106 int)
      (r3v109 int)
      (r3v112 int)
      (r3v115 int)
      (r3v120 int)
     binds: [B:158:0x02a1, B:153:0x028f, B:148:0x027d, B:143:0x026b, B:138:0x0259, B:133:0x0247, B:128:0x0235, B:123:0x0224, B:118:0x0213, B:113:0x0202, B:108:0x01f1, B:103:0x01e0, B:98:0x01cf, B:92:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.s(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[PHI: r6
      0x00b5: PHI (r6v97 java.lang.Object) = (r6v19 java.lang.Object), (r6v93 java.lang.Object), (r6v100 java.lang.Object) binds: [B:196:0x0360, B:50:0x00db, B:42:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de A[PHI: r6
      0x00de: PHI (r6v89 java.lang.Object) = (r6v19 java.lang.Object), (r6v93 java.lang.Object) binds: [B:196:0x0360, B:50:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182 A[PHI: r7
      0x0182: PHI (r7v43 int) = 
      (r7v5 int)
      (r7v8 int)
      (r7v11 int)
      (r7v14 int)
      (r7v17 int)
      (r7v20 int)
      (r7v23 int)
      (r7v26 int)
      (r7v29 int)
      (r7v32 int)
      (r7v35 int)
      (r7v38 int)
      (r7v41 int)
      (r7v46 int)
     binds: [B:151:0x0272, B:146:0x0260, B:141:0x024e, B:136:0x023c, B:131:0x022a, B:126:0x0218, B:121:0x0206, B:116:0x01f5, B:111:0x01e4, B:106:0x01d3, B:101:0x01c2, B:96:0x01b1, B:91:0x01a0, B:85:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.t(java.lang.Object):int");
    }

    public final int u(l0 l0Var, Object obj) {
        return l0Var.h(l0Var.g(obj));
    }

    public final boolean x(Object obj, int i9) {
        if (!this.f14598h) {
            int iX = X(i9);
            return (p0.x(obj, (long) (iX & 1048575)) & (1 << (iX >>> 20))) != 0;
        }
        int iH0 = h0(i9);
        long jQ = Q(iH0);
        switch (g0(iH0)) {
            case 0:
                return p0.v(obj, jQ) != 0.0d;
            case 1:
                return p0.w(obj, jQ) != 0.0f;
            case 2:
                return p0.y(obj, jQ) != 0;
            case 3:
                return p0.y(obj, jQ) != 0;
            case 4:
                return p0.x(obj, jQ) != 0;
            case 5:
                return p0.y(obj, jQ) != 0;
            case 6:
                return p0.x(obj, jQ) != 0;
            case 7:
                return p0.p(obj, jQ);
            case 8:
                Object objA = p0.A(obj, jQ);
                if (objA instanceof String) {
                    return !((String) objA).isEmpty();
                }
                if (objA instanceof AbstractC1122g) {
                    return !AbstractC1122g.f14628c.equals(objA);
                }
                throw new IllegalArgumentException();
            case 9:
                return p0.A(obj, jQ) != null;
            case 10:
                return !AbstractC1122g.f14628c.equals(p0.A(obj, jQ));
            case 11:
                return p0.x(obj, jQ) != 0;
            case 12:
                return p0.x(obj, jQ) != 0;
            case 13:
                return p0.x(obj, jQ) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return p0.y(obj, jQ) != 0;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return p0.x(obj, jQ) != 0;
            case 16:
                return p0.y(obj, jQ) != 0;
            case LangUtils.HASH_SEED /* 17 */:
                return p0.A(obj, jQ) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean y(Object obj, int i9, int i10, int i11) {
        return this.f14598h ? x(obj, i9) : (i10 & i11) != 0;
    }
}
