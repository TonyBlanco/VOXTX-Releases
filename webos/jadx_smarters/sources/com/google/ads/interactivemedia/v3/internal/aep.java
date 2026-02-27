package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aep implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cj f19380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseIntArray f19381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aes f19382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray f19383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f19384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f19385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aem f19386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ael f19387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private zk f19388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private aeu f19393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19395s;

    static {
        adj adjVar = adj.f19094a;
    }

    public aep() {
        this(1, 112800);
    }

    public aep(int i9, int i10) {
        this(1, new co(0L), new ado(null), 112800);
    }

    public aep(int i9, co coVar, aes aesVar, int i10) {
        this.f19382f = aesVar;
        this.f19378b = 112800;
        this.f19377a = i9;
        this.f19379c = Collections.singletonList(coVar);
        this.f19380d = new cj(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f19384h = sparseBooleanArray;
        this.f19385i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f19383g = sparseArray;
        this.f19381e = new SparseIntArray();
        this.f19386j = new aem(112800);
        this.f19388l = zk.f25259b;
        this.f19395s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayA = aesVar.a();
        int size = sparseArrayA.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f19383g.put(sparseArrayA.keyAt(i11), (aeu) sparseArrayA.valueAt(i11));
        }
        this.f19383g.put(0, new aej(new aen(this)));
        this.f19393q = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.zh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(com.google.ads.interactivemedia.v3.internal.zi r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.ads.interactivemedia.v3.internal.cj r0 = r6.f19380d
            byte[] r0 = r0.H()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.f(r0, r2, r1)
            r1 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.i(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aep.C(com.google.ads.interactivemedia.v3.internal.zi):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0198  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // com.google.ads.interactivemedia.v3.internal.zh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.google.ads.interactivemedia.v3.internal.zi r18, com.google.ads.interactivemedia.v3.internal.zy r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aep.a(com.google.ads.interactivemedia.v3.internal.zi, com.google.ads.interactivemedia.v3.internal.zy):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        this.f19388l = zkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // com.google.ads.interactivemedia.v3.internal.zh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r10, long r12) {
        /*
            r9 = this;
            int r10 = r9.f19377a
            r11 = 2
            r0 = 0
            if (r10 == r11) goto L8
            r10 = 1
            goto L9
        L8:
            r10 = 0
        L9:
            com.google.ads.interactivemedia.v3.internal.af.w(r10)
            java.util.List r10 = r9.f19379c
            int r10 = r10.size()
            r11 = 0
        L13:
            r1 = 0
            if (r11 >= r10) goto L42
            java.util.List r3 = r9.f19379c
            java.lang.Object r3 = r3.get(r11)
            com.google.ads.interactivemedia.v3.internal.co r3 = (com.google.ads.interactivemedia.v3.internal.co) r3
            long r4 = r3.e()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L3c
            long r4 = r3.c()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L3f
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 == 0) goto L3f
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 == 0) goto L3f
        L3c:
            r3.h(r12)
        L3f:
            int r11 = r11 + 1
            goto L13
        L42:
            int r10 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r10 == 0) goto L4d
            com.google.ads.interactivemedia.v3.internal.ael r10 = r9.f19387k
            if (r10 == 0) goto L4d
            r10.c(r12)
        L4d:
            com.google.ads.interactivemedia.v3.internal.cj r10 = r9.f19380d
            r10.B(r0)
            android.util.SparseIntArray r10 = r9.f19381e
            r10.clear()
            r10 = 0
        L58:
            android.util.SparseArray r11 = r9.f19383g
            int r11 = r11.size()
            if (r10 >= r11) goto L6e
            android.util.SparseArray r11 = r9.f19383g
            java.lang.Object r11 = r11.valueAt(r10)
            com.google.ads.interactivemedia.v3.internal.aeu r11 = (com.google.ads.interactivemedia.v3.internal.aeu) r11
            r11.c()
            int r10 = r10 + 1
            goto L58
        L6e:
            r9.f19394r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aep.d(long, long):void");
    }
}
