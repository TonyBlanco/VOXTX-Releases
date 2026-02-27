package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class bsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f22219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bto f22220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final bto f22221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bto f22222d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f22219a = cls;
        f22220b = ab(false);
        f22221c = ab(true);
        f22222d = new bto(null);
    }

    public static void A(int i9, List list, btn btnVar, bsi bsiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((bpl) btnVar).w(i9, list.get(i10), bsiVar);
        }
    }

    public static void B(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.z(i9, list, z9);
    }

    public static void C(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.B(i9, list, z9);
    }

    public static void D(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.D(i9, list, z9);
    }

    public static void E(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.F(i9, list, z9);
    }

    public static void F(int i9, List list, btn btnVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.I(i9, list);
    }

    public static void G(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.K(i9, list, z9);
    }

    public static void H(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.M(i9, list, z9);
    }

    public static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int J(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * bpk.aC(i9);
    }

    public static int K(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * bpk.Q(i9));
    }

    public static int L(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * bpk.aE(i9);
    }

    public static int M(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * bpk.aF(i9);
    }

    public static int N(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * bpk.Q(i9));
    }

    public static int O(int i9, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return h(list) + (list.size() * bpk.Q(i9));
    }

    public static int P(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + (size * bpk.Q(i9));
    }

    public static int Q(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + (size * bpk.Q(i9));
    }

    public static int R(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + (size * bpk.Q(i9));
    }

    public static int S(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + (size * bpk.Q(i9));
    }

    public static bto T() {
        return f22220b;
    }

    public static bto U() {
        return f22221c;
    }

    public static bto V() {
        return f22222d;
    }

    public static Object W(Object obj, int i9, List list, bqr bqrVar, Object obj2, bto btoVar) {
        if (bqrVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) list.get(i11);
                int iIntValue = num.intValue();
                if (bqrVar.a(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj2 = X(obj, i9, iIntValue, obj2, btoVar);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!bqrVar.a(iIntValue2)) {
                    obj2 = X(obj, i9, iIntValue2, obj2, btoVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object X(Object obj, int i9, int i10, Object obj2, bto btoVar) {
        if (obj2 == null) {
            obj2 = btoVar.i(obj);
        }
        bto.r(obj2, i9, i10);
        return obj2;
    }

    public static void Y(bto btoVar, Object obj, Object obj2) {
        btoVar.m(obj, bto.v(btoVar.j(obj), btoVar.j(obj2)));
    }

    public static void Z(bsr bsrVar, Object obj, Object obj2, long j9) {
        btf.w(obj, j9, bsr.g(btf.h(obj, j9), btf.h(obj2, j9)));
    }

    public static int a(List list) {
        return list.size();
    }

    public static void aa(bsr bsrVar, Object obj, Object obj2) {
        bqe bqeVarO = bsr.o(obj2);
        if (bqeVarO.l()) {
            return;
        }
        bsr.p(obj).j(bqeVarO);
    }

    private static bto ab(boolean z9) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (bto) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z9));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int b(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = size * bpk.Q(i9);
        for (int i10 = 0; i10 < list.size(); i10++) {
            iQ += bpk.y((bpb) list.get(i10));
        }
        return iQ;
    }

    public static int c(List list) {
        int iD;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bqo) {
            bqo bqoVar = (bqo) list;
            iD = 0;
            while (i9 < size) {
                iD += bpk.D(bqoVar.e(i9));
                i9++;
            }
        } else {
            iD = 0;
            while (i9 < size) {
                iD += bpk.D(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iD;
    }

    public static int d(List list) {
        return list.size() * 4;
    }

    public static int e(List list) {
        return list.size() * 8;
    }

    public static int f(int i9, List list, bsi bsiVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iA += bpk.A(i9, (brs) list.get(i10), bsiVar);
        }
        return iA;
    }

    public static int g(List list) {
        int iD;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bqo) {
            bqo bqoVar = (bqo) list;
            iD = 0;
            while (i9 < size) {
                iD += bpk.D(bqoVar.e(i9));
                i9++;
            }
        } else {
            iD = 0;
            while (i9 < size) {
                iD += bpk.D(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iD;
    }

    public static int h(List list) {
        int iU;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bri) {
            bri briVar = (bri) list;
            iU = 0;
            while (i9 < size) {
                iU += bpk.U(briVar.e(i9));
                i9++;
            }
        } else {
            iU = 0;
            while (i9 < size) {
                iU += bpk.U(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return iU;
    }

    public static int i(int i9, Object obj, bsi bsiVar) {
        return obj instanceof brc ? bpk.F(i9, (brc) obj) : bpk.Q(i9) + bpk.J((brs) obj, bsiVar);
    }

    public static int j(int i9, List list, bsi bsiVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = bpk.Q(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            iQ += obj instanceof brc ? bpk.G((brc) obj) : bpk.J((brs) obj, bsiVar);
        }
        return iQ;
    }

    public static int k(List list) {
        int iL;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bqo) {
            bqo bqoVar = (bqo) list;
            iL = 0;
            while (i9 < size) {
                iL += bpk.L(bqoVar.e(i9));
                i9++;
            }
        } else {
            iL = 0;
            while (i9 < size) {
                iL += bpk.L(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iL;
    }

    public static int l(List list) {
        int iN;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bri) {
            bri briVar = (bri) list;
            iN = 0;
            while (i9 < size) {
                iN += bpk.N(briVar.e(i9));
                i9++;
            }
        } else {
            iN = 0;
            while (i9 < size) {
                iN += bpk.N(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return iN;
    }

    public static int m(int i9, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iQ = bpk.Q(i9) * size;
        if (list instanceof bre) {
            bre breVar = (bre) list;
            while (i10 < size) {
                Object objF = breVar.f(i10);
                iQ += objF instanceof bpb ? bpk.y((bpb) objF) : bpk.P((String) objF);
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                iQ += obj instanceof bpb ? bpk.y((bpb) obj) : bpk.P((String) obj);
                i10++;
            }
        }
        return iQ;
    }

    public static int n(List list) {
        int iS;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bqo) {
            bqo bqoVar = (bqo) list;
            iS = 0;
            while (i9 < size) {
                iS += bpk.S(bqoVar.e(i9));
                i9++;
            }
        } else {
            iS = 0;
            while (i9 < size) {
                iS += bpk.S(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return iS;
    }

    public static int o(List list) {
        int iU;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof bri) {
            bri briVar = (bri) list;
            iU = 0;
            while (i9 < size) {
                iU += bpk.U(briVar.e(i9));
                i9++;
            }
        } else {
            iU = 0;
            while (i9 < size) {
                iU += bpk.U(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return iU;
    }

    public static void p(Class cls) {
        Class cls2;
        if (!bqn.class.isAssignableFrom(cls) && (cls2 = f22219a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void q(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.c(i9, list, z9);
    }

    public static void r(int i9, List list, btn btnVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.e(i9, list);
    }

    public static void s(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.g(i9, list, z9);
    }

    public static void t(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.j(i9, list, z9);
    }

    public static void u(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.l(i9, list, z9);
    }

    public static void v(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.n(i9, list, z9);
    }

    public static void w(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.p(i9, list, z9);
    }

    public static void x(int i9, List list, btn btnVar, bsi bsiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((bpl) btnVar).q(i9, list.get(i10), bsiVar);
        }
    }

    public static void y(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.s(i9, list, z9);
    }

    public static void z(int i9, List list, btn btnVar, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        btnVar.u(i9, list, z9);
    }
}
