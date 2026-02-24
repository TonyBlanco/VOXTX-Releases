package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bqe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bqe f22034b = new bqe(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final bst f22035a = bst.c(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22037d;

    private bqe() {
    }

    private bqe(byte[] bArr) {
        i();
        i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(com.google.ads.interactivemedia.v3.internal.btk r2, int r3, java.lang.Object r4) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bqe.a(com.google.ads.interactivemedia.v3.internal.btk, int, java.lang.Object):int");
    }

    public static int b(bqd bqdVar, Object obj) {
        btk btkVarC = bqdVar.c();
        int iA = bqdVar.a();
        if (!bqdVar.e()) {
            return a(btkVarC, iA, obj);
        }
        bqdVar.g();
        Iterator it = ((List) obj).iterator();
        int iA2 = 0;
        while (it.hasNext()) {
            iA2 += a(btkVarC, iA, it.next());
        }
        return iA2;
    }

    public static bqe e() {
        return f22034b;
    }

    public static void o(bpk bpkVar, int i9, Object obj) throws IOException {
        if (btk.f22274j != null) {
            throw null;
        }
        brs brsVar = (brs) obj;
        bqu.g(brsVar);
        bpkVar.ax(i9, 3);
        bpkVar.ac(brsVar);
        bpkVar.ax(i9, 4);
    }

    private static Object p(Object obj) {
        if (obj instanceof brx) {
            return ((brx) obj).c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void q(Map.Entry entry) {
        brs brsVarAY;
        bqd bqdVar = (bqd) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof brb) {
            throw null;
        }
        if (bqdVar.e()) {
            Object objF = f(bqdVar);
            if (objF == null) {
                objF = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objF).add(p(it.next()));
            }
            this.f22035a.put(bqdVar, objF);
            return;
        }
        if (bqdVar.d() != btl.MESSAGE) {
            this.f22035a.put(bqdVar, p(value));
            return;
        }
        Object objF2 = f(bqdVar);
        if (objF2 == null) {
            this.f22035a.put(bqdVar, p(value));
            return;
        }
        if (objF2 instanceof brx) {
            brsVarAY = bqdVar.f();
        } else {
            brsVarAY = bqdVar.b(((brs) objF2).bq(), (brs) value).aY();
        }
        this.f22035a.put(bqdVar, brsVarAY);
    }

    private static boolean r(Map.Entry entry) {
        bqd bqdVar = (bqd) entry.getKey();
        if (bqdVar.d() != btl.MESSAGE) {
            return true;
        }
        boolean zE = bqdVar.e();
        Object value = entry.getValue();
        if (!zE) {
            return s(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!s(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean s(Object obj) {
        if (obj instanceof brt) {
            return ((brt) obj).bd();
        }
        if (obj instanceof brb) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int t(Map.Entry entry) {
        int iR;
        int iQ;
        bqd bqdVar = (bqd) entry.getKey();
        Object value = entry.getValue();
        if (bqdVar.d() != btl.MESSAGE || bqdVar.e()) {
            return b(bqdVar, value);
        }
        bqdVar.g();
        boolean z9 = value instanceof brb;
        int iA = ((bqd) entry.getKey()).a();
        if (z9) {
            int iQ2 = bpk.Q(1);
            iR = iQ2 + iQ2 + bpk.R(2, iA);
            iQ = bpk.F(3, (brb) value);
        } else {
            int iQ3 = bpk.Q(1);
            iR = iQ3 + iQ3 + bpk.R(2, iA);
            iQ = bpk.Q(3) + bpk.I((brs) value);
        }
        return iR + iQ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void u(com.google.ads.interactivemedia.v3.internal.bqd r4, java.lang.Object r5) {
        /*
            com.google.ads.interactivemedia.v3.internal.btk r0 = r4.c()
            com.google.ads.interactivemedia.v3.internal.bqu.i(r5)
            com.google.ads.interactivemedia.v3.internal.btk r1 = com.google.ads.interactivemedia.v3.internal.btk.f22265a
            com.google.ads.interactivemedia.v3.internal.btl r1 = com.google.ads.interactivemedia.v3.internal.btl.INT
            com.google.ads.interactivemedia.v3.internal.btl r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.ads.interactivemedia.v3.internal.brs
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.ads.interactivemedia.v3.internal.brb
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.ads.interactivemedia.v3.internal.bqp
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.ads.interactivemedia.v3.internal.bpb
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.ads.interactivemedia.v3.internal.btk r4 = r4.c()
            com.google.ads.interactivemedia.v3.internal.btl r4 = r4.a()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bqe.u(com.google.ads.interactivemedia.v3.internal.bqd, java.lang.Object):void");
    }

    public final int c() {
        int iT = 0;
        for (int i9 = 0; i9 < this.f22035a.b(); i9++) {
            iT += t(this.f22035a.g(i9));
        }
        Iterator it = this.f22035a.d().iterator();
        while (it.hasNext()) {
            iT += t((Map.Entry) it.next());
        }
        return iT;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final bqe clone() {
        bqe bqeVar = new bqe();
        for (int i9 = 0; i9 < this.f22035a.b(); i9++) {
            Map.Entry entryG = this.f22035a.g(i9);
            bqeVar.k((bqd) entryG.getKey(), entryG.getValue());
        }
        for (Map.Entry entry : this.f22035a.d()) {
            bqeVar.k((bqd) entry.getKey(), entry.getValue());
        }
        bqeVar.f22037d = this.f22037d;
        return bqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bqe) {
            return this.f22035a.equals(((bqe) obj).f22035a);
        }
        return false;
    }

    public final Object f(bqd bqdVar) {
        Object obj = this.f22035a.get(bqdVar);
        if (obj instanceof brb) {
            throw null;
        }
        return obj;
    }

    public final Iterator g() {
        return this.f22037d ? new bra(this.f22035a.entrySet().iterator()) : this.f22035a.entrySet().iterator();
    }

    public final void h(bqd bqdVar, Object obj) {
        List arrayList;
        if (!((bqm) bqdVar).f22107d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        u(bqdVar, obj);
        Object objF = f(bqdVar);
        if (objF == null) {
            arrayList = new ArrayList();
            this.f22035a.put(bqdVar, arrayList);
        } else {
            arrayList = (List) objF;
        }
        arrayList.add(obj);
    }

    public final int hashCode() {
        return this.f22035a.hashCode();
    }

    public final void i() {
        if (this.f22036c) {
            return;
        }
        for (int i9 = 0; i9 < this.f22035a.b(); i9++) {
            Map.Entry entryG = this.f22035a.g(i9);
            if (entryG.getValue() instanceof bqn) {
                ((bqn) entryG.getValue()).aJ();
            }
        }
        this.f22035a.a();
        this.f22036c = true;
    }

    public final void j(bqe bqeVar) {
        for (int i9 = 0; i9 < bqeVar.f22035a.b(); i9++) {
            q(bqeVar.f22035a.g(i9));
        }
        Iterator it = bqeVar.f22035a.d().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void k(bqd bqdVar, Object obj) {
        if (!bqdVar.e()) {
            u(bqdVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                u(bqdVar, arrayList.get(i9));
            }
            obj = arrayList;
        }
        if (obj instanceof brb) {
            this.f22037d = true;
        }
        this.f22035a.put(bqdVar, obj);
    }

    public final boolean l() {
        return this.f22035a.isEmpty();
    }

    public final boolean m() {
        return this.f22036c;
    }

    public final boolean n() {
        for (int i9 = 0; i9 < this.f22035a.b(); i9++) {
            if (!r(this.f22035a.g(i9))) {
                return false;
            }
        }
        Iterator it = this.f22035a.d().iterator();
        while (it.hasNext()) {
            if (!r((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
