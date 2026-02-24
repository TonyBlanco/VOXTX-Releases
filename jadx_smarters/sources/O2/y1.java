package O2;

import B3.AbstractC0510s;
import O2.Q1;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends AbstractC0862a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f6406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f6407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Q1[] f6408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object[] f6409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f6410p;

    public class a extends AbstractC0510s {
        public a(Q1 q12) {
            super(q12);
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.b l(int i9, Q1.b bVar, boolean z9) {
            Q1.b bVarL = super.l(i9, bVar, z9);
            bVarL.f5721g = true;
            return bVarL;
        }
    }

    public y1(Collection collection, B3.a0 a0Var) {
        this(L(collection), M(collection), a0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Q1[] q1Arr, Object[] objArr, B3.a0 a0Var) {
        super(false, a0Var);
        int i9 = 0;
        int length = q1Arr.length;
        this.f6408n = q1Arr;
        this.f6406l = new int[length];
        this.f6407m = new int[length];
        this.f6409o = objArr;
        this.f6410p = new HashMap();
        int length2 = q1Arr.length;
        int iU = 0;
        int iN = 0;
        int i10 = 0;
        while (i9 < length2) {
            Q1 q12 = q1Arr[i9];
            this.f6408n[i10] = q12;
            this.f6407m[i10] = iU;
            this.f6406l[i10] = iN;
            iU += q12.u();
            iN += this.f6408n[i10].n();
            this.f6410p.put(objArr[i10], Integer.valueOf(i10));
            i9++;
            i10++;
        }
        this.f6404j = iU;
        this.f6405k = iN;
    }

    public static Q1[] L(Collection collection) {
        Q1[] q1Arr = new Q1[collection.size()];
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            q1Arr[i9] = ((W0) it.next()).b();
            i9++;
        }
        return q1Arr;
    }

    public static Object[] M(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            objArr[i9] = ((W0) it.next()).a();
            i9++;
        }
        return objArr;
    }

    @Override // O2.AbstractC0862a
    public Object C(int i9) {
        return this.f6409o[i9];
    }

    @Override // O2.AbstractC0862a
    public int E(int i9) {
        return this.f6406l[i9];
    }

    @Override // O2.AbstractC0862a
    public int F(int i9) {
        return this.f6407m[i9];
    }

    @Override // O2.AbstractC0862a
    public Q1 I(int i9) {
        return this.f6408n[i9];
    }

    public y1 J(B3.a0 a0Var) {
        Q1[] q1Arr = new Q1[this.f6408n.length];
        int i9 = 0;
        while (true) {
            Q1[] q1Arr2 = this.f6408n;
            if (i9 >= q1Arr2.length) {
                return new y1(q1Arr, this.f6409o, a0Var);
            }
            q1Arr[i9] = new a(q1Arr2[i9]);
            i9++;
        }
    }

    public List K() {
        return Arrays.asList(this.f6408n);
    }

    @Override // O2.Q1
    public int n() {
        return this.f6405k;
    }

    @Override // O2.Q1
    public int u() {
        return this.f6404j;
    }

    @Override // O2.AbstractC0862a
    public int x(Object obj) {
        Integer num = (Integer) this.f6410p.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // O2.AbstractC0862a
    public int y(int i9) {
        return d4.k0.h(this.f6406l, i9 + 1, false, false);
    }

    @Override // O2.AbstractC0862a
    public int z(int i9) {
        return d4.k0.h(this.f6407m, i9 + 1, false, false);
    }
}
