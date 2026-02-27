package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import sun.misc.Unsafe;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
final class brv<T> implements bsi<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f22172a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Unsafe f22173b = btf.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f22174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object[] f22175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f22177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final brs f22178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f22179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f22182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f22183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f22184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f22185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final brh f22186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final bto f22187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final bsr f22188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final bsr f22189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final bsr f22190s;

    private brv(int[] iArr, Object[] objArr, int i9, int i10, brs brsVar, boolean z9, boolean z10, int[] iArr2, int i11, int i12, bsr bsrVar, brh brhVar, bto btoVar, bsr bsrVar2, bsr bsrVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f22174c = iArr;
        this.f22175d = objArr;
        this.f22176e = i9;
        this.f22177f = i10;
        this.f22180i = brsVar instanceof bqn;
        this.f22181j = z9;
        this.f22179h = bsrVar2 != null && bsr.q(brsVar);
        this.f22182k = false;
        this.f22183l = iArr2;
        this.f22184m = i11;
        this.f22185n = i12;
        this.f22188q = bsrVar;
        this.f22186o = brhVar;
        this.f22187p = btoVar;
        this.f22190s = bsrVar2;
        this.f22178g = brsVar;
        this.f22189r = bsrVar3;
    }

    private final int A(int i9, int i10) {
        int length = (this.f22174c.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int iS = s(i12);
            if (i9 == iS) {
                return i12;
            }
            if (i9 < iS) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int B(int i9) {
        return (i9 >>> 20) & 255;
    }

    private final int C(int i9) {
        return this.f22174c[i9 + 1];
    }

    private static long D(int i9) {
        return i9 & 1048575;
    }

    private static long E(Object obj, long j9) {
        return ((Long) btf.h(obj, j9)).longValue();
    }

    private final bqr F(int i9) {
        int i10 = i9 / 3;
        return (bqr) this.f22175d[i10 + i10 + 1];
    }

    private final bsi G(int i9) {
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        bsi bsiVar = (bsi) this.f22175d[i11];
        if (bsiVar != null) {
            return bsiVar;
        }
        bsi bsiVarB = bsa.a().b((Class) this.f22175d[i11 + 1]);
        this.f22175d[i11] = bsiVarB;
        return bsiVarB;
    }

    private final Object H(int i9) {
        int i10 = i9 / 3;
        return this.f22175d[i10 + i10];
    }

    private final Object I(Object obj, int i9) {
        bsi bsiVarG = G(i9);
        long jD = D(C(i9));
        if (!Y(obj, i9)) {
            return bsiVarG.e();
        }
        Object object = f22173b.getObject(obj, jD);
        if (ab(object)) {
            return object;
        }
        Object objE = bsiVarG.e();
        if (object != null) {
            bsiVarG.g(objE, object);
        }
        return objE;
    }

    private final Object J(Object obj, int i9, int i10) {
        bsi bsiVarG = G(i10);
        if (!ac(obj, i9, i10)) {
            return bsiVarG.e();
        }
        Object object = f22173b.getObject(obj, D(C(i10)));
        if (ab(object)) {
            return object;
        }
        Object objE = bsiVarG.e();
        if (object != null) {
            bsiVarG.g(objE, object);
        }
        return objE;
    }

    private static Field K(Class cls, String str) {
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

    private static List L(Object obj, long j9) {
        return (List) btf.h(obj, j9);
    }

    private static void M(Object obj) {
        if (!ab(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void N(Object obj, Object obj2, int i9) {
        if (Y(obj2, i9)) {
            long jD = D(C(i9));
            Unsafe unsafe = f22173b;
            Object object = unsafe.getObject(obj2, jD);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + s(i9) + " is present but null: " + obj2.toString());
            }
            bsi bsiVarG = G(i9);
            if (!Y(obj, i9)) {
                if (ab(object)) {
                    Object objE = bsiVarG.e();
                    bsiVarG.g(objE, object);
                    unsafe.putObject(obj, jD, objE);
                } else {
                    unsafe.putObject(obj, jD, object);
                }
                Q(obj, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, jD);
            if (!ab(object2)) {
                Object objE2 = bsiVarG.e();
                bsiVarG.g(objE2, object2);
                unsafe.putObject(obj, jD, objE2);
                object2 = objE2;
            }
            bsiVarG.g(object2, object);
        }
    }

    private final void O(Object obj, Object obj2, int i9) {
        int iS = s(i9);
        if (ac(obj2, iS, i9)) {
            long jD = D(C(i9));
            Unsafe unsafe = f22173b;
            Object object = unsafe.getObject(obj2, jD);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + s(i9) + " is present but null: " + obj2.toString());
            }
            bsi bsiVarG = G(i9);
            if (!ac(obj, iS, i9)) {
                if (ab(object)) {
                    Object objE = bsiVarG.e();
                    bsiVarG.g(objE, object);
                    unsafe.putObject(obj, jD, objE);
                } else {
                    unsafe.putObject(obj, jD, object);
                }
                R(obj, iS, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, jD);
            if (!ab(object2)) {
                Object objE2 = bsiVarG.e();
                bsiVarG.g(objE2, object2);
                unsafe.putObject(obj, jD, objE2);
                object2 = objE2;
            }
            bsiVarG.g(object2, object);
        }
    }

    private final void P(Object obj, int i9, bsd bsdVar) throws IOException {
        long jD;
        Object objP;
        if (X(i9)) {
            jD = D(i9);
            objP = bsdVar.u();
        } else if (this.f22180i) {
            jD = D(i9);
            objP = bsdVar.t();
        } else {
            jD = D(i9);
            objP = bsdVar.p();
        }
        btf.w(obj, jD, objP);
    }

    private final void Q(Object obj, int i9) {
        int iZ = z(i9);
        long j9 = 1048575 & iZ;
        if (j9 == 1048575) {
            return;
        }
        btf.u(obj, j9, (1 << (iZ >>> 20)) | btf.d(obj, j9));
    }

    private final void R(Object obj, int i9, int i10) {
        btf.u(obj, z(i10) & 1048575, i9);
    }

    private final void S(Object obj, int i9, Object obj2) {
        f22173b.putObject(obj, D(C(i9)), obj2);
        Q(obj, i9);
    }

    private final void T(Object obj, int i9, int i10, Object obj2) {
        f22173b.putObject(obj, D(C(i10)), obj2);
        R(obj, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void U(java.lang.Object r18, com.google.ads.interactivemedia.v3.internal.btn r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.U(java.lang.Object, com.google.ads.interactivemedia.v3.internal.btn):void");
    }

    private final void V(btn btnVar, int i9, Object obj, int i10) throws IOException {
        if (obj != null) {
            btnVar.v(i9, bsr.c(H(i10)), bsr.b(obj));
        }
    }

    private final boolean W(Object obj, Object obj2, int i9) {
        return Y(obj, i9) == Y(obj2, i9);
    }

    private static boolean X(int i9) {
        return (i9 & 536870912) != 0;
    }

    private final boolean Y(Object obj, int i9) {
        int iZ = z(i9);
        long j9 = 1048575 & iZ;
        if (j9 != 1048575) {
            return (btf.d(obj, j9) & (1 << (iZ >>> 20))) != 0;
        }
        int iC = C(i9);
        long jD = D(iC);
        switch (B(iC)) {
            case 0:
                return Double.doubleToRawLongBits(btf.b(obj, jD)) != 0;
            case 1:
                return Float.floatToRawIntBits(btf.c(obj, jD)) != 0;
            case 2:
                return btf.f(obj, jD) != 0;
            case 3:
                return btf.f(obj, jD) != 0;
            case 4:
                return btf.d(obj, jD) != 0;
            case 5:
                return btf.f(obj, jD) != 0;
            case 6:
                return btf.d(obj, jD) != 0;
            case 7:
                return btf.A(obj, jD);
            case 8:
                Object objH = btf.h(obj, jD);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof bpb) {
                    return !bpb.f21870b.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return btf.h(obj, jD) != null;
            case 10:
                return !bpb.f21870b.equals(btf.h(obj, jD));
            case 11:
                return btf.d(obj, jD) != 0;
            case 12:
                return btf.d(obj, jD) != 0;
            case 13:
                return btf.d(obj, jD) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return btf.f(obj, jD) != 0;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return btf.d(obj, jD) != 0;
            case 16:
                return btf.f(obj, jD) != 0;
            case LangUtils.HASH_SEED /* 17 */:
                return btf.h(obj, jD) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean Z(Object obj, int i9, int i10, int i11, int i12) {
        return i10 == 1048575 ? Y(obj, i9) : (i11 & i12) != 0;
    }

    private static boolean aa(Object obj, int i9, bsi bsiVar) {
        return bsiVar.l(btf.h(obj, D(i9)));
    }

    private static boolean ab(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof bqn) {
            return ((bqn) obj).aO();
        }
        return true;
    }

    private final boolean ac(Object obj, int i9, int i10) {
        return btf.d(obj, (long) (z(i10) & 1048575)) == i9;
    }

    private static boolean ad(Object obj, long j9) {
        return ((Boolean) btf.h(obj, j9)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0294, code lost:
    
        if (r0 != r15) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b1, code lost:
    
        if (r0 != r15) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0243, code lost:
    
        if (r0 != r31) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0245, code lost:
    
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r1 = r18;
        r2 = r22;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025c, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0087. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ae(java.lang.Object r29, byte[] r30, int r31, int r32, com.google.ads.interactivemedia.v3.internal.boq r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.ae(java.lang.Object, byte[], int, int, com.google.ads.interactivemedia.v3.internal.boq):void");
    }

    private static final void af(int i9, Object obj, btn btnVar) throws IOException {
        if (obj instanceof String) {
            btnVar.H(i9, (String) obj);
        } else {
            btnVar.d(i9, (bpb) obj);
        }
    }

    private final Object ag(Object obj, int i9, Object obj2, bto btoVar, Object obj3) {
        bqr bqrVarF;
        int iS = s(i9);
        Object objH = btf.h(obj, D(C(i9)));
        if (objH == null || (bqrVarF = F(i9)) == null) {
            return obj2;
        }
        Map mapD = bsr.d(objH);
        brm brmVarC = bsr.c(H(i9));
        Iterator it = mapD.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!bqrVarF.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = btoVar.i(obj3);
                }
                int iJ = bsr.j(brmVarC, entry.getKey(), entry.getValue());
                bpb bpbVar = bpb.f21870b;
                byte[] bArr = new byte[iJ];
                bpk bpkVarX = bpk.X(bArr);
                try {
                    bsr.k(bpd.b(bpkVarX), brmVarC, entry.getKey(), entry.getValue());
                    bto.q(obj2, iS, bpd.a(bpkVarX, bArr));
                    it.remove();
                } catch (IOException e9) {
                    throw new RuntimeException(e9);
                }
            }
        }
        return obj2;
    }

    private static final int ah(bto btoVar, Object obj) {
        return ((bsx) btoVar.j(obj)).a();
    }

    private static final void ai(bto btoVar, Object obj, btn btnVar) throws IOException {
        ((bsx) btoVar.j(obj)).k(btnVar);
    }

    public static bsx d(Object obj) {
        bqn bqnVar = (bqn) obj;
        bsx bsxVar = bqnVar.f22109c;
        if (bsxVar != bsx.c()) {
            return bsxVar;
        }
        bsx bsxVarE = bsx.e();
        bqnVar.f22109c = bsxVarE;
        return bsxVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.ads.interactivemedia.v3.internal.brv m(com.google.ads.interactivemedia.v3.internal.bsc r34, com.google.ads.interactivemedia.v3.internal.bsr r35, com.google.ads.interactivemedia.v3.internal.brh r36, com.google.ads.interactivemedia.v3.internal.bto r37, com.google.ads.interactivemedia.v3.internal.bsr r38, com.google.ads.interactivemedia.v3.internal.bsr r39) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.m(com.google.ads.interactivemedia.v3.internal.bsc, com.google.ads.interactivemedia.v3.internal.bsr, com.google.ads.interactivemedia.v3.internal.brh, com.google.ads.interactivemedia.v3.internal.bto, com.google.ads.interactivemedia.v3.internal.bsr, com.google.ads.interactivemedia.v3.internal.bsr):com.google.ads.interactivemedia.v3.internal.brv");
    }

    public static brv n(brp brpVar, bsr bsrVar, brh brhVar, bto btoVar, bsr bsrVar2, bsr bsrVar3) {
        if (brpVar instanceof bsc) {
            return m((bsc) brpVar, bsrVar, brhVar, btoVar, bsrVar2, bsrVar3);
        }
        throw null;
    }

    private static double o(Object obj, long j9) {
        return ((Double) btf.h(obj, j9)).doubleValue();
    }

    private static float p(Object obj, long j9) {
        return ((Float) btf.h(obj, j9)).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4 A[PHI: r7
      0x00b4: PHI (r7v138 java.lang.Object) = (r7v13 java.lang.Object), (r7v134 java.lang.Object), (r7v141 java.lang.Object) binds: [B:167:0x0325, B:50:0x00da, B:42:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd A[PHI: r7
      0x00dd: PHI (r7v130 java.lang.Object) = (r7v13 java.lang.Object), (r7v134 java.lang.Object) binds: [B:167:0x0325, B:50:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a A[PHI: r7
      0x017a: PHI (r7v104 int) = 
      (r7v67 int)
      (r7v70 int)
      (r7v73 int)
      (r7v76 int)
      (r7v79 int)
      (r7v82 int)
      (r7v85 int)
      (r7v88 int)
      (r7v91 int)
      (r7v94 int)
      (r7v97 int)
      (r7v100 int)
      (r7v103 int)
      (r7v107 int)
     binds: [B:122:0x0231, B:119:0x0223, B:116:0x0215, B:113:0x0207, B:110:0x01f9, B:107:0x01ec, B:104:0x01df, B:101:0x01d2, B:98:0x01c5, B:95:0x01b8, B:92:0x01ab, B:89:0x019e, B:86:0x0191, B:83:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int q(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.q(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7 A[PHI: r3
      0x00a7: PHI (r3v133 java.lang.Object) = (r3v17 java.lang.Object), (r3v129 java.lang.Object), (r3v136 java.lang.Object) binds: [B:165:0x0310, B:48:0x00cd, B:40:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0 A[PHI: r3
      0x00d0: PHI (r3v125 java.lang.Object) = (r3v17 java.lang.Object), (r3v129 java.lang.Object) binds: [B:165:0x0310, B:48:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b A[PHI: r3
      0x016b: PHI (r3v96 int) = 
      (r3v59 int)
      (r3v62 int)
      (r3v65 int)
      (r3v68 int)
      (r3v71 int)
      (r3v74 int)
      (r3v77 int)
      (r3v80 int)
      (r3v83 int)
      (r3v86 int)
      (r3v89 int)
      (r3v92 int)
      (r3v95 int)
      (r3v99 int)
     binds: [B:120:0x0222, B:117:0x0214, B:114:0x0206, B:111:0x01f8, B:108:0x01ea, B:105:0x01dd, B:102:0x01d0, B:99:0x01c3, B:96:0x01b6, B:93:0x01a9, B:90:0x019c, B:87:0x018f, B:84:0x0182, B:81:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int r(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.r(java.lang.Object):int");
    }

    private final int s(int i9) {
        return this.f22174c[i9];
    }

    private static int t(Object obj, long j9) {
        return ((Integer) btf.h(obj, j9)).intValue();
    }

    private final int u(Object obj, byte[] bArr, int i9, int i10, int i11, long j9, boq boqVar) throws IOException {
        Unsafe unsafe = f22173b;
        Object objH = H(i11);
        Object object = unsafe.getObject(obj, j9);
        if (bsr.f(object)) {
            Object objH2 = bsr.h();
            bsr.g(objH2, object);
            unsafe.putObject(obj, j9, objH2);
            object = objH2;
        }
        brm brmVarC = bsr.c(objH);
        Map mapD = bsr.d(object);
        int iN = bpd.n(bArr, i9, boqVar);
        int i12 = boqVar.f21856a;
        if (i12 < 0 || i12 > i10 - iN) {
            throw bqw.i();
        }
        int i13 = i12 + iN;
        Object obj2 = brmVarC.f22164b;
        while (iN < i13) {
            int iO = iN + 1;
            int i14 = bArr[iN];
            if (i14 < 0) {
                iO = bpd.o(i14, bArr, iO, boqVar);
                i14 = boqVar.f21856a;
            }
            int i15 = i14 >>> 3;
            if (i15 == 1) {
                throw null;
            }
            if (i15 == 2) {
                throw null;
            }
            iN = bpd.t(i14, bArr, iO, i10, boqVar);
        }
        if (iN != i13) {
            throw bqw.g();
        }
        mapD.put(null, null);
        return i13;
    }

    private final int v(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j9, int i16, boq boqVar) throws IOException {
        Unsafe unsafe = f22173b;
        long j10 = this.f22174c[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Double.valueOf(bpd.c(bArr, i9)));
                unsafe.putInt(obj, j10, i12);
                return i9 + 8;
            case 52:
                if (i13 != 5) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Float.valueOf(bpd.d(bArr, i9)));
                unsafe.putInt(obj, j10, i12);
                return i9 + 4;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i9;
                }
                int iQ = bpd.q(bArr, i9, boqVar);
                unsafe.putObject(obj, j9, Long.valueOf(boqVar.f21857b));
                unsafe.putInt(obj, j10, i12);
                return iQ;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i9;
                }
                int iN = bpd.n(bArr, i9, boqVar);
                unsafe.putObject(obj, j9, Integer.valueOf(boqVar.f21856a));
                unsafe.putInt(obj, j10, i12);
                return iN;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Long.valueOf(bpd.u(bArr, i9)));
                unsafe.putInt(obj, j10, i12);
                return i9 + 8;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i9;
                }
                unsafe.putObject(obj, j9, Integer.valueOf(bpd.f(bArr, i9)));
                unsafe.putInt(obj, j10, i12);
                return i9 + 4;
            case 58:
                if (i13 != 0) {
                    return i9;
                }
                int iQ2 = bpd.q(bArr, i9, boqVar);
                unsafe.putObject(obj, j9, Boolean.valueOf(boqVar.f21857b != 0));
                unsafe.putInt(obj, j10, i12);
                return iQ2;
            case 59:
                if (i13 != 2) {
                    return i9;
                }
                int iN2 = bpd.n(bArr, i9, boqVar);
                int i17 = boqVar.f21856a;
                if (i17 == 0) {
                    unsafe.putObject(obj, j9, "");
                } else {
                    if ((i14 & 536870912) != 0 && !btj.j(bArr, iN2, iN2 + i17)) {
                        throw bqw.d();
                    }
                    unsafe.putObject(obj, j9, new String(bArr, iN2, i17, bqu.f22114a));
                    iN2 += i17;
                }
                unsafe.putInt(obj, j10, i12);
                return iN2;
            case 60:
                if (i13 != 2) {
                    return i9;
                }
                Object objJ = J(obj, i12, i16);
                int iS = bpd.s(objJ, G(i16), bArr, i9, i10, boqVar);
                T(obj, i12, i16, objJ);
                return iS;
            case 61:
                if (i13 != 2) {
                    return i9;
                }
                int iE = bpd.e(bArr, i9, boqVar);
                unsafe.putObject(obj, j9, boqVar.f21858c);
                unsafe.putInt(obj, j10, i12);
                return iE;
            case 63:
                if (i13 != 0) {
                    return i9;
                }
                int iN3 = bpd.n(bArr, i9, boqVar);
                int i18 = boqVar.f21856a;
                bqr bqrVarF = F(i16);
                if (bqrVarF == null || bqrVarF.a(i18)) {
                    unsafe.putObject(obj, j9, Integer.valueOf(i18));
                    unsafe.putInt(obj, j10, i12);
                } else {
                    d(obj).i(i11, Long.valueOf(i18));
                }
                return iN3;
            case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                if (i13 != 0) {
                    return i9;
                }
                int iN4 = bpd.n(bArr, i9, boqVar);
                unsafe.putObject(obj, j9, Integer.valueOf(bpg.F(boqVar.f21856a)));
                unsafe.putInt(obj, j10, i12);
                return iN4;
            case 67:
                if (i13 != 0) {
                    return i9;
                }
                int iQ3 = bpd.q(bArr, i9, boqVar);
                unsafe.putObject(obj, j9, Long.valueOf(bpg.G(boqVar.f21857b)));
                unsafe.putInt(obj, j10, i12);
                return iQ3;
            case 68:
                if (i13 != 3) {
                    return i9;
                }
                Object objJ2 = J(obj, i12, i16);
                int iR = bpd.r(objJ2, G(i16), bArr, i9, i10, (i11 & (-8)) | 4, boqVar);
                T(obj, i12, i16, objJ2);
                return iR;
            default:
                return i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0269, code lost:
    
        if (r29.f21857b != 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x026b, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x026d, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x026e, code lost:
    
        r12.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0271, code lost:
    
        if (r4 >= r19) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0273, code lost:
    
        r6 = com.google.ads.interactivemedia.v3.internal.bpd.n(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0279, code lost:
    
        if (r20 == r29.f21856a) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x027c, code lost:
    
        r4 = com.google.ads.interactivemedia.v3.internal.bpd.q(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0284, code lost:
    
        if (r29.f21857b == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0287, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0146, code lost:
    
        r12.add(com.google.ads.interactivemedia.v3.internal.bpb.u(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x026e, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        if (r4 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        r12.add(com.google.ads.interactivemedia.v3.internal.bpb.f21870b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
    
        r12.add(com.google.ads.interactivemedia.v3.internal.bpb.u(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        if (r1 >= r19) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0148, code lost:
    
        r4 = com.google.ads.interactivemedia.v3.internal.bpd.n(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
    
        if (r20 == r29.f21856a) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0151, code lost:
    
        r1 = com.google.ads.interactivemedia.v3.internal.bpd.n(r17, r4, r29);
        r4 = r29.f21856a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        if (r4 < 0) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015b, code lost:
    
        if (r4 > (r17.length - r1)) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        if (r4 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0164, code lost:
    
        throw com.google.ads.interactivemedia.v3.internal.bqw.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0169, code lost:
    
        throw com.google.ads.interactivemedia.v3.internal.bqw.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01c7 -> B:94:0x01a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x020e -> B:113:0x01e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0284 -> B:152:0x026b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x015d -> B:63:0x0138). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int w(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.ads.interactivemedia.v3.internal.boq r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.w(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.ads.interactivemedia.v3.internal.boq):int");
    }

    private final int x(int i9) {
        if (i9 < this.f22176e || i9 > this.f22177f) {
            return -1;
        }
        return A(i9, 0);
    }

    private final int y(int i9, int i10) {
        if (i9 < this.f22176e || i9 > this.f22177f) {
            return -1;
        }
        return A(i9, i10);
    }

    private final int z(int i9) {
        return this.f22174c[i9 + 2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final int a(Object obj) {
        return this.f22181j ? r(obj) : q(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec A[PHI: r3
      0x00ec: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:73:0x0108, B:67:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.b(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0585, code lost:
    
        if (r0 == r1) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0587, code lost:
    
        r30.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x058d, code lost:
    
        r10 = r9.f22184m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0592, code lost:
    
        if (r10 >= r9.f22185n) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0594, code lost:
    
        r3 = ag(r33, r9.f22183l[r10], r3, r9.f22187p, r33);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05a7, code lost:
    
        if (r3 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x05a9, code lost:
    
        r9.f22187p.l(r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x05ae, code lost:
    
        if (r7 != 0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x05b0, code lost:
    
        if (r15 != r6) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05b7, code lost:
    
        throw com.google.ads.interactivemedia.v3.internal.bqw.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05b8, code lost:
    
        if (r15 > r6) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05ba, code lost:
    
        if (r8 != r7) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05bc, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x05c1, code lost:
    
        throw com.google.ads.interactivemedia.v3.internal.bqw.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0533  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.ads.interactivemedia.v3.internal.boq r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.c(java.lang.Object, byte[], int, int, int, com.google.ads.interactivemedia.v3.internal.boq):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final Object e() {
        return bsr.a(this.f22178g);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = ab(r7)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7 instanceof com.google.ads.interactivemedia.v3.internal.bqn
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r7
            com.google.ads.interactivemedia.v3.internal.bqn r0 = (com.google.ads.interactivemedia.v3.internal.bqn) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.aM(r2)
            r0.f21854b = r1
            r0.aK()
        L1a:
            int[] r0 = r6.f22174c
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L5e
            int r2 = r6.C(r1)
            long r3 = D(r2)
            int r2 = B(r2)
            r5 = 9
            if (r2 == r5) goto L48
            switch(r2) {
                case 17: goto L48;
                case 18: goto L42;
                case 19: goto L42;
                case 20: goto L42;
                case 21: goto L42;
                case 22: goto L42;
                case 23: goto L42;
                case 24: goto L42;
                case 25: goto L42;
                case 26: goto L42;
                case 27: goto L42;
                case 28: goto L42;
                case 29: goto L42;
                case 30: goto L42;
                case 31: goto L42;
                case 32: goto L42;
                case 33: goto L42;
                case 34: goto L42;
                case 35: goto L42;
                case 36: goto L42;
                case 37: goto L42;
                case 38: goto L42;
                case 39: goto L42;
                case 40: goto L42;
                case 41: goto L42;
                case 42: goto L42;
                case 43: goto L42;
                case 44: goto L42;
                case 45: goto L42;
                case 46: goto L42;
                case 47: goto L42;
                case 48: goto L42;
                case 49: goto L42;
                case 50: goto L33;
                default: goto L32;
            }
        L32:
            goto L5b
        L33:
            sun.misc.Unsafe r2 = com.google.ads.interactivemedia.v3.internal.brv.f22173b
            java.lang.Object r5 = r2.getObject(r7, r3)
            if (r5 == 0) goto L5b
            com.google.ads.interactivemedia.v3.internal.bsr.i(r5)
            r2.putObject(r7, r3, r5)
            goto L5b
        L42:
            com.google.ads.interactivemedia.v3.internal.brh r2 = r6.f22186o
            r2.c(r7, r3)
            goto L5b
        L48:
            boolean r2 = r6.Y(r7, r1)
            if (r2 == 0) goto L5b
            com.google.ads.interactivemedia.v3.internal.bsi r2 = r6.G(r1)
            sun.misc.Unsafe r5 = com.google.ads.interactivemedia.v3.internal.brv.f22173b
            java.lang.Object r3 = r5.getObject(r7, r3)
            r2.f(r3)
        L5b:
            int r1 = r1 + 3
            goto L1d
        L5e:
            com.google.ads.interactivemedia.v3.internal.bto r0 = r6.f22187p
            r0.k(r7)
            boolean r0 = r6.f22179h
            if (r0 == 0) goto L6c
            com.google.ads.interactivemedia.v3.internal.bsr r0 = r6.f22190s
            r0.l(r7)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.f(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.g(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final void h(Object obj, bsd bsdVar, bqb bqbVar) throws IOException {
        brs brsVar;
        int iE;
        List listB;
        List listB2;
        List listB3;
        List listB4;
        List listB5;
        List listB6;
        List listB7;
        List listB8;
        List listB9;
        List listB10;
        bqr bqrVarF;
        List listB11;
        List listB12;
        List listB13;
        List listB14;
        brs brsVar2;
        bqbVar.getClass();
        M(obj);
        bto btoVar = this.f22187p;
        bqe bqeVar = null;
        Object objU = null;
        while (true) {
            try {
                int iC = bsdVar.c();
                int iX = x(iC);
                if (iX >= 0) {
                    int iC2 = C(iX);
                    try {
                        switch (B(iC2)) {
                            case 0:
                                btf.s(obj, D(iC2), bsdVar.a());
                                Q(obj, iX);
                                break;
                            case 1:
                                btf.t(obj, D(iC2), bsdVar.b());
                                Q(obj, iX);
                                break;
                            case 2:
                                btf.v(obj, D(iC2), bsdVar.l());
                                Q(obj, iX);
                                break;
                            case 3:
                                btf.v(obj, D(iC2), bsdVar.o());
                                Q(obj, iX);
                                break;
                            case 4:
                                btf.u(obj, D(iC2), bsdVar.g());
                                Q(obj, iX);
                                break;
                            case 5:
                                btf.v(obj, D(iC2), bsdVar.k());
                                Q(obj, iX);
                                break;
                            case 6:
                                btf.u(obj, D(iC2), bsdVar.f());
                                Q(obj, iX);
                                break;
                            case 7:
                                btf.q(obj, D(iC2), bsdVar.P());
                                Q(obj, iX);
                                break;
                            case 8:
                                P(obj, iC2, bsdVar);
                                Q(obj, iX);
                                break;
                            case 9:
                                brsVar = (brs) I(obj, iX);
                                bsdVar.w(brsVar, G(iX), bqbVar);
                                S(obj, iX, brsVar);
                                break;
                            case 10:
                                btf.w(obj, D(iC2), bsdVar.p());
                                Q(obj, iX);
                                break;
                            case 11:
                                btf.u(obj, D(iC2), bsdVar.j());
                                Q(obj, iX);
                                break;
                            case 12:
                                iE = bsdVar.e();
                                bqr bqrVarF2 = F(iX);
                                if (bqrVarF2 == null || bqrVarF2.a(iE)) {
                                    btf.u(obj, D(iC2), iE);
                                    Q(obj, iX);
                                } else {
                                    objU = bsk.X(obj, iC, iE, objU, btoVar);
                                }
                                break;
                            case 13:
                                btf.u(obj, D(iC2), bsdVar.h());
                                Q(obj, iX);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                btf.v(obj, D(iC2), bsdVar.m());
                                Q(obj, iX);
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                btf.u(obj, D(iC2), bsdVar.i());
                                Q(obj, iX);
                                break;
                            case 16:
                                btf.v(obj, D(iC2), bsdVar.n());
                                Q(obj, iX);
                                break;
                            case LangUtils.HASH_SEED /* 17 */:
                                brsVar = (brs) I(obj, iX);
                                bsdVar.v(brsVar, G(iX), bqbVar);
                                S(obj, iX, brsVar);
                                break;
                            case 18:
                                listB = this.f22186o.b(obj, D(iC2));
                                bsdVar.z(listB);
                                break;
                            case 19:
                                listB2 = this.f22186o.b(obj, D(iC2));
                                bsdVar.D(listB2);
                                break;
                            case 20:
                                listB3 = this.f22186o.b(obj, D(iC2));
                                bsdVar.G(listB3);
                                break;
                            case 21:
                                listB4 = this.f22186o.b(obj, D(iC2));
                                bsdVar.O(listB4);
                                break;
                            case 22:
                                listB5 = this.f22186o.b(obj, D(iC2));
                                bsdVar.F(listB5);
                                break;
                            case 23:
                                listB6 = this.f22186o.b(obj, D(iC2));
                                bsdVar.C(listB6);
                                break;
                            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                                listB7 = this.f22186o.b(obj, D(iC2));
                                bsdVar.B(listB7);
                                break;
                            case 25:
                                listB8 = this.f22186o.b(obj, D(iC2));
                                bsdVar.x(listB8);
                                break;
                            case 26:
                                if (X(iC2)) {
                                    ((bpi) bsdVar).M(this.f22186o.b(obj, D(iC2)), true);
                                } else {
                                    ((bpi) bsdVar).M(this.f22186o.b(obj, D(iC2)), false);
                                }
                                break;
                            case 27:
                                bsdVar.H(this.f22186o.b(obj, D(iC2)), G(iX), bqbVar);
                                break;
                            case 28:
                                bsdVar.y(this.f22186o.b(obj, D(iC2)));
                                break;
                            case 29:
                                listB9 = this.f22186o.b(obj, D(iC2));
                                bsdVar.N(listB9);
                                break;
                            case 30:
                                listB10 = this.f22186o.b(obj, D(iC2));
                                bsdVar.A(listB10);
                                bqrVarF = F(iX);
                                objU = bsk.W(obj, iC, listB10, bqrVarF, objU, btoVar);
                                break;
                            case 31:
                                listB11 = this.f22186o.b(obj, D(iC2));
                                bsdVar.I(listB11);
                                break;
                            case 32:
                                listB12 = this.f22186o.b(obj, D(iC2));
                                bsdVar.J(listB12);
                                break;
                            case 33:
                                listB13 = this.f22186o.b(obj, D(iC2));
                                bsdVar.K(listB13);
                                break;
                            case 34:
                                listB14 = this.f22186o.b(obj, D(iC2));
                                bsdVar.L(listB14);
                                break;
                            case 35:
                                listB = this.f22186o.b(obj, D(iC2));
                                bsdVar.z(listB);
                                break;
                            case 36:
                                listB2 = this.f22186o.b(obj, D(iC2));
                                bsdVar.D(listB2);
                                break;
                            case LangUtils.HASH_OFFSET /* 37 */:
                                listB3 = this.f22186o.b(obj, D(iC2));
                                bsdVar.G(listB3);
                                break;
                            case 38:
                                listB4 = this.f22186o.b(obj, D(iC2));
                                bsdVar.O(listB4);
                                break;
                            case 39:
                                listB5 = this.f22186o.b(obj, D(iC2));
                                bsdVar.F(listB5);
                                break;
                            case 40:
                                listB6 = this.f22186o.b(obj, D(iC2));
                                bsdVar.C(listB6);
                                break;
                            case 41:
                                listB7 = this.f22186o.b(obj, D(iC2));
                                bsdVar.B(listB7);
                                break;
                            case 42:
                                listB8 = this.f22186o.b(obj, D(iC2));
                                bsdVar.x(listB8);
                                break;
                            case 43:
                                listB9 = this.f22186o.b(obj, D(iC2));
                                bsdVar.N(listB9);
                                break;
                            case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                listB10 = this.f22186o.b(obj, D(iC2));
                                bsdVar.A(listB10);
                                bqrVarF = F(iX);
                                objU = bsk.W(obj, iC, listB10, bqrVarF, objU, btoVar);
                                break;
                            case 45:
                                listB11 = this.f22186o.b(obj, D(iC2));
                                bsdVar.I(listB11);
                                break;
                            case 46:
                                listB12 = this.f22186o.b(obj, D(iC2));
                                bsdVar.J(listB12);
                                break;
                            case 47:
                                listB13 = this.f22186o.b(obj, D(iC2));
                                bsdVar.K(listB13);
                                break;
                            case 48:
                                listB14 = this.f22186o.b(obj, D(iC2));
                                bsdVar.L(listB14);
                                break;
                            case 49:
                                bsdVar.E(this.f22186o.b(obj, D(iC2)), G(iX), bqbVar);
                                break;
                            case 50:
                                Object objH = H(iX);
                                long jD = D(C(iX));
                                Object objH2 = btf.h(obj, jD);
                                if (objH2 == null) {
                                    objH2 = bsr.h();
                                    btf.w(obj, jD, objH2);
                                } else if (bsr.f(objH2)) {
                                    Object objH3 = bsr.h();
                                    bsr.g(objH3, objH2);
                                    btf.w(obj, jD, objH3);
                                    objH2 = objH3;
                                }
                                bsdVar.R(bsr.d(objH2), bsr.c(objH));
                                break;
                            case 51:
                                btf.w(obj, D(iC2), Double.valueOf(bsdVar.a()));
                                R(obj, iC, iX);
                                break;
                            case 52:
                                btf.w(obj, D(iC2), Float.valueOf(bsdVar.b()));
                                R(obj, iC, iX);
                                break;
                            case 53:
                                btf.w(obj, D(iC2), Long.valueOf(bsdVar.l()));
                                R(obj, iC, iX);
                                break;
                            case 54:
                                btf.w(obj, D(iC2), Long.valueOf(bsdVar.o()));
                                R(obj, iC, iX);
                                break;
                            case 55:
                                btf.w(obj, D(iC2), Integer.valueOf(bsdVar.g()));
                                R(obj, iC, iX);
                                break;
                            case 56:
                                btf.w(obj, D(iC2), Long.valueOf(bsdVar.k()));
                                R(obj, iC, iX);
                                break;
                            case 57:
                                btf.w(obj, D(iC2), Integer.valueOf(bsdVar.f()));
                                R(obj, iC, iX);
                                break;
                            case 58:
                                btf.w(obj, D(iC2), Boolean.valueOf(bsdVar.P()));
                                R(obj, iC, iX);
                                break;
                            case 59:
                                P(obj, iC2, bsdVar);
                                R(obj, iC, iX);
                                break;
                            case 60:
                                brsVar2 = (brs) J(obj, iC, iX);
                                bsdVar.w(brsVar2, G(iX), bqbVar);
                                T(obj, iC, iX, brsVar2);
                                break;
                            case 61:
                                btf.w(obj, D(iC2), bsdVar.p());
                                R(obj, iC, iX);
                                break;
                            case 62:
                                btf.w(obj, D(iC2), Integer.valueOf(bsdVar.j()));
                                R(obj, iC, iX);
                                break;
                            case 63:
                                iE = bsdVar.e();
                                bqr bqrVarF3 = F(iX);
                                if (bqrVarF3 != null && !bqrVarF3.a(iE)) {
                                    objU = bsk.X(obj, iC, iE, objU, btoVar);
                                }
                                btf.w(obj, D(iC2), Integer.valueOf(iE));
                                R(obj, iC, iX);
                                break;
                            case 64:
                                btf.w(obj, D(iC2), Integer.valueOf(bsdVar.h()));
                                R(obj, iC, iX);
                                break;
                            case 65:
                                btf.w(obj, D(iC2), Long.valueOf(bsdVar.m()));
                                R(obj, iC, iX);
                                break;
                            case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                                btf.w(obj, D(iC2), Integer.valueOf(bsdVar.i()));
                                R(obj, iC, iX);
                                break;
                            case 67:
                                btf.w(obj, D(iC2), Long.valueOf(bsdVar.n()));
                                R(obj, iC, iX);
                                break;
                            case 68:
                                brsVar2 = (brs) J(obj, iC, iX);
                                bsdVar.v(brsVar2, G(iX), bqbVar);
                                T(obj, iC, iX, brsVar2);
                                break;
                            default:
                                if (objU == null) {
                                    objU = btoVar.i(obj);
                                }
                                if (!btoVar.h(objU, bsdVar)) {
                                    Object objAg = objU;
                                    for (int i9 = this.f22184m; i9 < this.f22185n; i9++) {
                                        objAg = ag(obj, this.f22183l[i9], objAg, btoVar, obj);
                                    }
                                    if (objAg != null) {
                                        btoVar.l(obj, objAg);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (bqv unused) {
                        if (objU == null) {
                            objU = btoVar.i(obj);
                        }
                        if (!btoVar.h(objU, bsdVar)) {
                            Object objAg2 = objU;
                            for (int i10 = this.f22184m; i10 < this.f22185n; i10++) {
                                objAg2 = ag(obj, this.f22183l[i10], objAg2, btoVar, obj);
                            }
                            if (objAg2 != null) {
                                btoVar.l(obj, objAg2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iC == Integer.MAX_VALUE) {
                        Object objAg3 = objU;
                        for (int i11 = this.f22184m; i11 < this.f22185n; i11++) {
                            objAg3 = ag(obj, this.f22183l[i11], objAg3, btoVar, obj);
                        }
                        if (objAg3 != null) {
                            btoVar.l(obj, objAg3);
                            return;
                        }
                        return;
                    }
                    Object objN = !this.f22179h ? null : bsr.n(bqbVar, this.f22178g, iC);
                    if (objN != null) {
                        bqe bqeVarP = bqeVar == null ? bsr.p(obj) : bqeVar;
                        objU = bsr.u(obj, bsdVar, objN, bqbVar, bqeVarP, objU, btoVar);
                        bqeVar = bqeVarP;
                    } else {
                        if (objU == null) {
                            objU = btoVar.i(obj);
                        }
                        if (!btoVar.h(objU, bsdVar)) {
                            Object objAg4 = objU;
                            for (int i12 = this.f22184m; i12 < this.f22185n; i12++) {
                                objAg4 = ag(obj, this.f22183l[i12], objAg4, btoVar, obj);
                            }
                            if (objAg4 != null) {
                                btoVar.l(obj, objAg4);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                Object objAg5 = objU;
                for (int i13 = this.f22184m; i13 < this.f22185n; i13++) {
                    objAg5 = ag(obj, this.f22183l[i13], objAg5, btoVar, obj);
                }
                if (objAg5 != null) {
                    btoVar.l(obj, objAg5);
                }
                throw th;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final void i(Object obj, byte[] bArr, int i9, int i10, boq boqVar) throws IOException {
        if (this.f22181j) {
            ae(obj, bArr, i9, i10, boqVar);
        } else {
            c(obj, bArr, i9, i10, 0, boqVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Object r13, com.google.ads.interactivemedia.v3.internal.btn r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.j(java.lang.Object, com.google.ads.interactivemedia.v3.internal.btn):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    public final boolean k(Object obj, Object obj2) {
        int length = this.f22174c.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iC = C(i9);
            long jD = D(iC);
            switch (B(iC)) {
                case 0:
                    if (!W(obj, obj2, i9) || Double.doubleToLongBits(btf.b(obj, jD)) != Double.doubleToLongBits(btf.b(obj2, jD))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!W(obj, obj2, i9) || Float.floatToIntBits(btf.c(obj, jD)) != Float.floatToIntBits(btf.c(obj2, jD))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!W(obj, obj2, i9) || btf.f(obj, jD) != btf.f(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!W(obj, obj2, i9) || btf.f(obj, jD) != btf.f(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!W(obj, obj2, i9) || btf.d(obj, jD) != btf.d(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!W(obj, obj2, i9) || btf.f(obj, jD) != btf.f(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!W(obj, obj2, i9) || btf.d(obj, jD) != btf.d(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!W(obj, obj2, i9) || btf.A(obj, jD) != btf.A(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!W(obj, obj2, i9) || !bsk.I(btf.h(obj, jD), btf.h(obj2, jD))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!W(obj, obj2, i9) || !bsk.I(btf.h(obj, jD), btf.h(obj2, jD))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!W(obj, obj2, i9) || !bsk.I(btf.h(obj, jD), btf.h(obj2, jD))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!W(obj, obj2, i9) || btf.d(obj, jD) != btf.d(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!W(obj, obj2, i9) || btf.d(obj, jD) != btf.d(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!W(obj, obj2, i9) || btf.d(obj, jD) != btf.d(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (!W(obj, obj2, i9) || btf.f(obj, jD) != btf.f(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (!W(obj, obj2, i9) || btf.d(obj, jD) != btf.d(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!W(obj, obj2, i9) || btf.f(obj, jD) != btf.f(obj2, jD)) {
                        return false;
                    }
                    break;
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    if (!W(obj, obj2, i9) || !bsk.I(btf.h(obj, jD), btf.h(obj2, jD))) {
                        return false;
                    }
                    break;
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
                case 50:
                    if (!bsk.I(btf.h(obj, jD), btf.h(obj2, jD))) {
                        return false;
                    }
                    break;
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                case 67:
                case 68:
                    long jZ = z(i9) & 1048575;
                    if (btf.d(obj, jZ) != btf.d(obj2, jZ) || !bsk.I(btf.h(obj, jD), btf.h(obj2, jD))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.f22187p.j(obj).equals(this.f22187p.j(obj2))) {
            return false;
        }
        if (this.f22179h) {
            return bsr.o(obj).equals(bsr.o(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    @Override // com.google.ads.interactivemedia.v3.internal.bsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.brv.l(java.lang.Object):boolean");
    }
}
