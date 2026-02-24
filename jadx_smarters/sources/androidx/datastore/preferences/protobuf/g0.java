package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1139y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f14638a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f14639b = B(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f14640c = B(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f14641d = new n0();

    public static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static l0 B(boolean z9) {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (l0) clsC.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z9));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC1131p abstractC1131p, Object obj, Object obj2) {
        C1133s c1133sC = abstractC1131p.c(obj2);
        if (c1133sC.j()) {
            return;
        }
        abstractC1131p.d(obj).p(c1133sC);
    }

    public static void E(J j9, Object obj, Object obj2, long j10) {
        p0.O(obj, j10, j9.a(p0.A(obj, j10), p0.A(obj2, j10)));
    }

    public static void F(l0 l0Var, Object obj, Object obj2) {
        l0Var.p(obj, l0Var.k(l0Var.g(obj), l0Var.g(obj2)));
    }

    public static l0 G() {
        return f14639b;
    }

    public static l0 H() {
        return f14640c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC1137w.class.isAssignableFrom(cls) && (cls2 = f14638a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object K(int i9, int i10, Object obj, l0 l0Var) {
        if (obj == null) {
            obj = l0Var.n();
        }
        l0Var.e(obj, i9, i10);
        return obj;
    }

    public static l0 L() {
        return f14641d;
    }

    public static void M(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i9, list, z9);
    }

    public static void N(int i9, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.O(i9, list);
    }

    public static void O(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.M(i9, list, z9);
    }

    public static void P(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.q(i9, list, z9);
    }

    public static void Q(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.l(i9, list, z9);
    }

    public static void R(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.E(i9, list, z9);
    }

    public static void S(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i9, list, z9);
    }

    public static void T(int i9, List list, s0 s0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.e(i9, list, e0Var);
    }

    public static void U(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.h(i9, list, z9);
    }

    public static void V(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.L(i9, list, z9);
    }

    public static void W(int i9, List list, s0 s0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.z(i9, list, e0Var);
    }

    public static void X(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.F(i9, list, z9);
    }

    public static void Y(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.v(i9, list, z9);
    }

    public static void Z(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.J(i9, list, z9);
    }

    public static int a(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? AbstractC1125j.P(i9) + AbstractC1125j.y(size) : size * AbstractC1125j.c(i9, true);
    }

    public static void a0(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.o(i9, list, z9);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i9, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.d(i9, list);
    }

    public static int c(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = size * AbstractC1125j.P(i9);
        for (int i10 = 0; i10 < list.size(); i10++) {
            iP += AbstractC1125j.g((AbstractC1122g) list.get(i10));
        }
        return iP;
    }

    public static void c0(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.n(i9, list, z9);
    }

    public static int d(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        int iP = AbstractC1125j.P(i9);
        return z9 ? iP + AbstractC1125j.y(iE) : iE + (size * iP);
    }

    public static void d0(int i9, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.w(i9, list, z9);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1138x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iK += AbstractC1125j.k(((Integer) list.get(i9)).intValue());
        }
        return iK;
    }

    public static int f(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? AbstractC1125j.P(i9) + AbstractC1125j.y(size * 4) : size * AbstractC1125j.l(i9, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? AbstractC1125j.P(i9) + AbstractC1125j.y(size * 8) : size * AbstractC1125j.n(i9, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i9, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iR += AbstractC1125j.r(i9, (O) list.get(i10), e0Var);
        }
        return iR;
    }

    public static int k(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        int iP = AbstractC1125j.P(i9);
        return z9 ? iP + AbstractC1125j.y(iL) : iL + (size * iP);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1138x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iV += AbstractC1125j.v(((Integer) list.get(i9)).intValue());
        }
        return iV;
    }

    public static int m(int i9, List list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z9 ? AbstractC1125j.P(i9) + AbstractC1125j.y(iN) : iN + (list.size() * AbstractC1125j.P(i9));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iX += AbstractC1125j.x(((Long) list.get(i9)).longValue());
        }
        return iX;
    }

    public static int o(int i9, Object obj, e0 e0Var) {
        return AbstractC1125j.z(i9, (O) obj, e0Var);
    }

    public static int p(int i9, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = AbstractC1125j.P(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            iP += AbstractC1125j.B((O) list.get(i10), e0Var);
        }
        return iP;
    }

    public static int q(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        int iP = AbstractC1125j.P(i9);
        return z9 ? iP + AbstractC1125j.y(iR) : iR + (size * iP);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1138x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iK += AbstractC1125j.K(((Integer) list.get(i9)).intValue());
        }
        return iK;
    }

    public static int s(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        int iP = AbstractC1125j.P(i9);
        return z9 ? iP + AbstractC1125j.y(iT) : iT + (size * iP);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iM += AbstractC1125j.M(((Long) list.get(i9)).longValue());
        }
        return iM;
    }

    public static int u(int i9, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iP = AbstractC1125j.P(i9) * size;
        if (list instanceof D) {
            D d9 = (D) list;
            while (i10 < size) {
                Object objG = d9.G(i10);
                iP += objG instanceof AbstractC1122g ? AbstractC1125j.g((AbstractC1122g) objG) : AbstractC1125j.O((String) objG);
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                iP += obj instanceof AbstractC1122g ? AbstractC1125j.g((AbstractC1122g) obj) : AbstractC1125j.O((String) obj);
                i10++;
            }
        }
        return iP;
    }

    public static int v(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        int iP = AbstractC1125j.P(i9);
        return z9 ? iP + AbstractC1125j.y(iW) : iW + (size * iP);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1138x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iR += AbstractC1125j.R(((Integer) list.get(i9)).intValue());
        }
        return iR;
    }

    public static int x(int i9, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        int iP = AbstractC1125j.P(i9);
        return z9 ? iP + AbstractC1125j.y(iY) : iY + (size * iP);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iT = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iT += AbstractC1125j.T(((Long) list.get(i9)).longValue());
        }
        return iT;
    }

    public static Object z(int i9, List list, AbstractC1139y.a aVar, Object obj, l0 l0Var) {
        if (aVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) list.get(i11);
                int iIntValue = num.intValue();
                if (aVar.a(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj = K(i9, iIntValue, obj, l0Var);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!aVar.a(iIntValue2)) {
                    obj = K(i9, iIntValue2, obj, l0Var);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
