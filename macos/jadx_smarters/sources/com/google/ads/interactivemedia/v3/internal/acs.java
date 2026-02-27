package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class acs implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1333s f18957b;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f18958A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f18959B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f18960C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f18961D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private zk f18962E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private aae[] f18963F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private aae[] f18964G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f18965H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final bdy f18966I;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f18968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f18969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cj f18970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final cj f18971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final cj f18972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f18973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final cj f18974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final co f18975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final cj f18976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayDeque f18977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f18978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final aae f18979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f18981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f18982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private cj f18984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f18985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f18987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f18988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f18989y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private acr f18990z;

    static {
        acu acuVar = acu.f18993a;
        f18956a = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        r rVar = new r();
        rVar.ae("application/x-emsg");
        f18957b = rVar.v();
    }

    public acs() {
        this(null);
    }

    public acs(int i9, co coVar, List list) {
        this(i9, coVar, list, null);
    }

    public acs(int i9, co coVar, List list, aae aaeVar) {
        this.f18967c = i9;
        this.f18975k = coVar;
        this.f18968d = Collections.unmodifiableList(list);
        this.f18979o = aaeVar;
        this.f18966I = new bdy((char[]) null);
        this.f18976l = new cj(16);
        this.f18970f = new cj(zw.f25312a);
        this.f18971g = new cj(5);
        this.f18972h = new cj();
        byte[] bArr = new byte[16];
        this.f18973i = bArr;
        this.f18974j = new cj(bArr);
        this.f18977m = new ArrayDeque();
        this.f18978n = new ArrayDeque();
        this.f18969e = new SparseArray();
        this.f18988x = -9223372036854775807L;
        this.f18987w = -9223372036854775807L;
        this.f18989y = -9223372036854775807L;
        this.f18962E = zk.f25259b;
        this.f18963F = new aae[0];
        this.f18964G = new aae[0];
    }

    public acs(byte[] bArr) {
        this(0, null, Collections.emptyList());
    }

    private static C1322o f(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            acd acdVar = (acd) list.get(i9);
            if (acdVar.f18900d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrH = acdVar.f18899a.H();
                UUID uuidB = acz.b(bArrH);
                if (uuidB == null) {
                    cd.e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C1319n(uuidB, "video/mp4", bArrH));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C1322o(arrayList);
    }

    private final void g() {
        this.f18980p = 0;
        this.f18983s = 0;
    }

    private static void h(cj cjVar, int i9, add addVar) throws as {
        cjVar.F(i9 + 8);
        int iE = ace.e(cjVar.e());
        if ((iE & 1) != 0) {
            throw as.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z9 = (iE & 2) != 0;
        int iL = cjVar.l();
        if (iL == 0) {
            Arrays.fill(addVar.f19063l, 0, addVar.f19056e, false);
            return;
        }
        int i10 = addVar.f19056e;
        if (iL != i10) {
            throw as.a("Senc sample count " + iL + " is different from fragment sample count" + i10, null);
        }
        Arrays.fill(addVar.f19063l, 0, iL, z9);
        addVar.b(cjVar.a());
        cj cjVar2 = addVar.f19065n;
        cjVar.A(cjVar2.H(), 0, cjVar2.d());
        addVar.f19065n.F(0);
        addVar.f19066o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x071a, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x071e, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(long r52) throws com.google.ads.interactivemedia.v3.internal.as {
        /*
            Method dump skipped, instruction units count: 1823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.acs.i(long):void");
    }

    private static void j(int i9) throws as {
        if (i9 >= 0) {
            return;
        }
        throw as.a("Unexpected negative value: " + i9, null);
    }

    private static final acn k(SparseArray sparseArray, int i9) {
        if (sparseArray.size() == 1) {
            return (acn) sparseArray.valueAt(0);
        }
        acn acnVar = (acn) sparseArray.get(i9);
        af.s(acnVar);
        return acnVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final boolean C(zi ziVar) throws IOException {
        return ada.a(ziVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d8, code lost:
    
        r35.f18972h.B(r13);
        r36.g(r35.f18972h.H(), 0, r35.f18960C);
        r6.e(r35.f18972h, r35.f18960C);
        r5 = r35.f18960C;
        r10 = r35.f18972h;
        r10 = com.google.ads.interactivemedia.v3.internal.zw.b(r10.H(), r10.d());
        r35.f18972h.F("video/hevc".equals(r2.f19041f.f24467l) ? 1 : 0);
        r35.f18972h.E(r10);
        com.google.ads.interactivemedia.v3.internal.fz.l(r7, r35.f18972h, r35.f18964G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x021a, code lost:
    
        r5 = r6.a(r36, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0220, code lost:
    
        r35.f18959B += r5;
        r35.f18960C -= r5;
        r5 = 6;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022d, code lost:
    
        r22 = r4.a();
        r1 = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0235, code lost:
    
        if (r1 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0237, code lost:
    
        r25 = r1.f19049c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023c, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023e, code lost:
    
        r6.f(r7, r22, r35.f18958A, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0251, code lost:
    
        if (r35.f18978n.isEmpty() != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0253, code lost:
    
        r1 = (com.google.ads.interactivemedia.v3.internal.acq) r35.f18978n.removeFirst();
        r35.f18986v -= r1.f18943c;
        r5 = r1.f18941a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0266, code lost:
    
        if (r1.f18942b == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0268, code lost:
    
        r5 = r5 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0269, code lost:
    
        r2 = r35.f18975k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x026b, code lost:
    
        if (r2 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x026d, code lost:
    
        r5 = r2.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0271, code lost:
    
        r2 = r35.f18963F;
        r15 = r2.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0275, code lost:
    
        if (r14 >= r15) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0277, code lost:
    
        r2[r14].f(r5, 1, r1.f18943c, r35.f18986v, null);
        r14 = r14 + 1;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029a, code lost:
    
        if (r4.j() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x029c, code lost:
    
        r35.f18990z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029f, code lost:
    
        r35.f18980p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (r35.f18980p != 3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        r2 = r4.b();
        r35.f18958A = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r4.f18949f >= r4.f18952i) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        r36.i(r2);
        r1 = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        r2 = r4.f18945b.f19065n;
        r1 = r1.f19050d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r1 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        r2.G(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        if (r4.f18945b.c(r4.f18949f) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
    
        r2.G(r2.m() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        if (r4.j() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        r35.f18990z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
    
        r35.f18980p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        if (r4.f18947d.f19069a.f19042g != r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
    
        r35.f18958A = r2 - 8;
        r36.i(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
    
        if ("audio/ac4".equals(r4.f18947d.f19069a.f19041f.f24467l) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
    
        r35.f18959B = r4.c(r35.f18958A, 7);
        com.google.ads.interactivemedia.v3.internal.yq.b(r35.f18958A, r35.f18974j);
        r4.f18944a.e(r35.f18974j, 7);
        r2 = r35.f18959B + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0113, code lost:
    
        r35.f18959B = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0116, code lost:
    
        r2 = r4.c(r35.f18958A, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        r35.f18958A += r2;
        r35.f18980p = 4;
        r35.f18960C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0127, code lost:
    
        r2 = r4.f18947d.f19069a;
        r6 = r4.f18944a;
        r7 = r4.e();
        r11 = r35.f18975k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        if (r11 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
    
        r7 = r11.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0139, code lost:
    
        r11 = r2.f19045j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013b, code lost:
    
        if (r11 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013d, code lost:
    
        r2 = r35.f18959B;
        r5 = r35.f18958A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0141, code lost:
    
        if (r2 >= r5) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0143, code lost:
    
        r35.f18959B += r6.a(r36, r5 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014e, code lost:
    
        r12 = r35.f18971g.H();
        r12[0] = 0;
        r12[r3] = 0;
        r12[2] = 0;
        r14 = r11 + 1;
        r11 = 4 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        if (r35.f18959B >= r35.f18958A) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        r13 = r35.f18960C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016a, code lost:
    
        if (r13 != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016c, code lost:
    
        r36.g(r12, r11, r14);
        r35.f18971g.F(r10);
        r13 = r35.f18971g.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
    
        if (r13 <= 0) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017c, code lost:
    
        r35.f18960C = r13 - 1;
        r35.f18970f.F(r10);
        r6.e(r35.f18970f, 4);
        r6.e(r35.f18971g, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0195, code lost:
    
        if (r35.f18964G.length <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0197, code lost:
    
        r13 = r2.f19041f.f24467l;
        r17 = r12[4];
        r10 = com.google.ads.interactivemedia.v3.internal.zw.f25312a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a5, code lost:
    
        if ("video/avc".equals(r13) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a9, code lost:
    
        if ((r17 & 31) == r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ac, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b2, code lost:
    
        if ("video/hevc".equals(r13) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b9, code lost:
    
        if (((r17 & 126) >> r3) != 39) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bc, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bd, code lost:
    
        r35.f18961D = r10;
        r35.f18959B += 5;
        r35.f18958A += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ca, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d3, code lost:
    
        throw com.google.ads.interactivemedia.v3.internal.as.a("Invalid NAL length", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d6, code lost:
    
        if (r35.f18961D == false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x072e A[SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.zh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.google.ads.interactivemedia.v3.internal.zi r36, com.google.ads.interactivemedia.v3.internal.zy r37) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.acs.a(com.google.ads.interactivemedia.v3.internal.zi, com.google.ads.interactivemedia.v3.internal.zy):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        int i9;
        this.f18962E = zkVar;
        g();
        aae[] aaeVarArr = new aae[2];
        this.f18963F = aaeVarArr;
        aae aaeVar = this.f18979o;
        int i10 = 0;
        if (aaeVar != null) {
            aaeVarArr[0] = aaeVar;
            i9 = 1;
        } else {
            i9 = 0;
        }
        int i11 = 100;
        if ((this.f18967c & 4) != 0) {
            aaeVarArr[i9] = this.f18962E.i(100, 5);
            i11 = 101;
            i9++;
        }
        aae[] aaeVarArr2 = (aae[]) cq.ai(this.f18963F, i9);
        this.f18963F = aaeVarArr2;
        for (aae aaeVar2 : aaeVarArr2) {
            aaeVar2.b(f18957b);
        }
        this.f18964G = new aae[this.f18968d.size()];
        while (i10 < this.f18964G.length) {
            aae aaeVarI = this.f18962E.i(i11, 3);
            aaeVarI.b((C1333s) this.f18968d.get(i10));
            this.f18964G[i10] = aaeVarI;
            i10++;
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void d(long j9, long j10) {
        int size = this.f18969e.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((acr) this.f18969e.valueAt(i9)).h();
        }
        this.f18978n.clear();
        this.f18986v = 0;
        this.f18987w = j10;
        this.f18977m.clear();
        g();
    }
}
