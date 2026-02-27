package com.google.ads.interactivemedia.v3.internal;

import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class avf extends AbstractMap implements Serializable, aun {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient Object[] f20790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient Object[] f20791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient int f20792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient int f20793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int[] f20794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int[] f20795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int[] f20796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int[] f20797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient int f20798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f20799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int[] f20800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private transient int[] f20801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient Set f20802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Set f20803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient Set f20804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private transient aun f20805p;

    private avf() {
        i(2);
    }

    private static int[] A(int[] iArr, int i9) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i9);
        Arrays.fill(iArrCopyOf, length, i9, -1);
        return iArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i9, Object obj) {
        atp.e(i9 != -1);
        int iD = d(obj, axo.F(obj));
        int i10 = this.f20799j;
        if (iD != -1) {
            Objects.toString(obj);
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(obj)));
        }
        if (i10 == i9) {
            i10 = this.f20800k[i9];
        } else if (i10 == this.f20792c) {
            i10 = iD;
        }
        if (i9 == -2) {
            iD = this.f20801l[-2];
        } else if (this.f20792c != -2) {
            iD = -2;
        }
        y(this.f20800k[i9], this.f20801l[i9]);
        s(i9, axo.F(this.f20790a[i9]));
        this.f20790a[i9] = obj;
        v(i9, axo.F(obj));
        y(i10, i9);
        y(i9, iD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i9, Object obj) {
        atp.e(i9 != -1);
        int iF = axo.F(obj);
        if (f(obj, iF) != -1) {
            Objects.toString(obj);
            throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(obj)));
        }
        t(i9, axo.F(this.f20791b[i9]));
        this.f20791b[i9] = obj;
        w(i9, iF);
    }

    public static avf p() {
        return new avf();
    }

    private final int r(int i9) {
        return i9 & (this.f20794e.length - 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i9 = objectInputStream.readInt();
        i(16);
        for (int i10 = 0; i10 < i9; i10++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final void s(int i9, int i10) {
        atp.e(i9 != -1);
        int iR = r(i10);
        int[] iArr = this.f20794e;
        int i11 = iArr[iR];
        if (i11 == i9) {
            int[] iArr2 = this.f20796g;
            iArr[iR] = iArr2[i9];
            iArr2[i9] = -1;
            return;
        }
        int i12 = this.f20796g[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                Object obj = this.f20790a[i9];
                Objects.toString(obj);
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(obj)));
            }
            if (i11 == i9) {
                int[] iArr3 = this.f20796g;
                iArr3[i13] = iArr3[i9];
                iArr3[i9] = -1;
                return;
            }
            i12 = this.f20796g[i11];
        }
    }

    private final void t(int i9, int i10) {
        atp.e(i9 != -1);
        int iR = r(i10);
        int[] iArr = this.f20795f;
        int i11 = iArr[iR];
        if (i11 == i9) {
            int[] iArr2 = this.f20797h;
            iArr[iR] = iArr2[i9];
            iArr2[i9] = -1;
            return;
        }
        int i12 = this.f20797h[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                Object obj = this.f20791b[i9];
                Objects.toString(obj);
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(obj)));
            }
            if (i11 == i9) {
                int[] iArr3 = this.f20797h;
                iArr3[i13] = iArr3[i9];
                iArr3[i9] = -1;
                return;
            }
            i12 = this.f20797h[i11];
        }
    }

    private final void u(int i9) {
        int length = this.f20796g.length;
        if (length < i9) {
            int iE = avh.e(length, i9);
            this.f20790a = Arrays.copyOf(this.f20790a, iE);
            this.f20791b = Arrays.copyOf(this.f20791b, iE);
            this.f20796g = A(this.f20796g, iE);
            this.f20797h = A(this.f20797h, iE);
            this.f20800k = A(this.f20800k, iE);
            this.f20801l = A(this.f20801l, iE);
        }
        if (this.f20794e.length < i9) {
            int iG = axo.G(i9);
            this.f20794e = z(iG);
            this.f20795f = z(iG);
            for (int i10 = 0; i10 < this.f20792c; i10++) {
                int iR = r(axo.F(this.f20790a[i10]));
                int[] iArr = this.f20796g;
                int[] iArr2 = this.f20794e;
                iArr[i10] = iArr2[iR];
                iArr2[iR] = i10;
                int iR2 = r(axo.F(this.f20791b[i10]));
                int[] iArr3 = this.f20797h;
                int[] iArr4 = this.f20795f;
                iArr3[i10] = iArr4[iR2];
                iArr4[iR2] = i10;
            }
        }
    }

    private final void v(int i9, int i10) {
        atp.e(i9 != -1);
        int iR = r(i10);
        int[] iArr = this.f20796g;
        int[] iArr2 = this.f20794e;
        iArr[i9] = iArr2[iR];
        iArr2[iR] = i9;
    }

    private final void w(int i9, int i10) {
        atp.e(i9 != -1);
        int iR = r(i10);
        int[] iArr = this.f20797h;
        int[] iArr2 = this.f20795f;
        iArr[i9] = iArr2[iR];
        iArr2[iR] = i9;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f20792c);
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final void x(int i9, int i10, int i11) {
        int i12;
        int i13;
        atp.e(i9 != -1);
        s(i9, i10);
        t(i9, i11);
        y(this.f20800k[i9], this.f20801l[i9]);
        int i14 = this.f20792c - 1;
        if (i14 != i9) {
            int i15 = this.f20800k[i14];
            int i16 = this.f20801l[i14];
            y(i15, i9);
            y(i9, i16);
            Object[] objArr = this.f20790a;
            Object obj = objArr[i14];
            Object[] objArr2 = this.f20791b;
            Object obj2 = objArr2[i14];
            objArr[i9] = obj;
            objArr2[i9] = obj2;
            int iR = r(axo.F(obj));
            int[] iArr = this.f20794e;
            int i17 = iArr[iR];
            if (i17 == i14) {
                iArr[iR] = i9;
            } else {
                int i18 = this.f20796g[i17];
                while (true) {
                    i12 = i17;
                    i17 = i18;
                    if (i17 == i14) {
                        break;
                    } else {
                        i18 = this.f20796g[i17];
                    }
                }
                this.f20796g[i12] = i9;
            }
            int[] iArr2 = this.f20796g;
            iArr2[i9] = iArr2[i14];
            iArr2[i14] = -1;
            int iR2 = r(axo.F(obj2));
            int[] iArr3 = this.f20795f;
            int i19 = iArr3[iR2];
            if (i19 == i14) {
                iArr3[iR2] = i9;
            } else {
                int i20 = this.f20797h[i19];
                while (true) {
                    i13 = i19;
                    i19 = i20;
                    if (i19 == i14) {
                        break;
                    } else {
                        i20 = this.f20797h[i19];
                    }
                }
                this.f20797h[i13] = i9;
            }
            int[] iArr4 = this.f20797h;
            iArr4[i9] = iArr4[i14];
            iArr4[i14] = -1;
        }
        Object[] objArr3 = this.f20790a;
        int i21 = this.f20792c - 1;
        objArr3[i21] = null;
        this.f20791b[i21] = null;
        this.f20792c = i21;
        this.f20793d++;
    }

    private final void y(int i9, int i10) {
        if (i9 == -2) {
            this.f20798i = i10;
        } else {
            this.f20801l[i9] = i10;
        }
        if (i10 == -2) {
            this.f20799j = i9;
        } else {
            this.f20800k[i10] = i9;
        }
    }

    private static int[] z(int i9) {
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final int b(Object obj, int i9, int[] iArr, int[] iArr2, Object[] objArr) {
        int i10 = iArr[r(i9)];
        while (i10 != -1) {
            if (com.google.ads.interactivemedia.v3.impl.data.k.c(objArr[i10], obj)) {
                return i10;
            }
            i10 = iArr2[i10];
        }
        return -1;
    }

    public final int c(Object obj) {
        return d(obj, axo.F(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f20790a, 0, this.f20792c, (Object) null);
        Arrays.fill(this.f20791b, 0, this.f20792c, (Object) null);
        Arrays.fill(this.f20794e, -1);
        Arrays.fill(this.f20795f, -1);
        Arrays.fill(this.f20796g, 0, this.f20792c, -1);
        Arrays.fill(this.f20797h, 0, this.f20792c, -1);
        Arrays.fill(this.f20800k, 0, this.f20792c, -1);
        Arrays.fill(this.f20801l, 0, this.f20792c, -1);
        this.f20792c = 0;
        this.f20798i = -2;
        this.f20799j = -2;
        this.f20793d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return e(obj) != -1;
    }

    public final int d(Object obj, int i9) {
        return b(obj, i9, this.f20794e, this.f20796g, this.f20790a);
    }

    public final int e(Object obj) {
        return f(obj, axo.F(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f20804o;
        if (set != null) {
            return set;
        }
        auy auyVar = new auy(this);
        this.f20804o = auyVar;
        return auyVar;
    }

    public final int f(Object obj, int i9) {
        return b(obj, i9, this.f20795f, this.f20797h, this.f20791b);
    }

    public final aun g() {
        aun aunVar = this.f20805p;
        if (aunVar != null) {
            return aunVar;
        }
        auz auzVar = new auz(this);
        this.f20805p = auzVar;
        return auzVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iC = c(obj);
        if (iC == -1) {
            return null;
        }
        return this.f20791b[iC];
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.f20803n;
        if (set != null) {
            return set;
        }
        avc avcVar = new avc(this);
        this.f20803n = avcVar;
        return avcVar;
    }

    public final void i(int i9) {
        axo.K(i9, "expectedSize");
        int iG = axo.G(i9);
        this.f20792c = 0;
        this.f20790a = new Object[i9];
        this.f20791b = new Object[i9];
        this.f20794e = z(iG);
        this.f20795f = z(iG);
        this.f20796g = z(i9);
        this.f20797h = z(i9);
        this.f20798i = -2;
        this.f20799j = -2;
        this.f20800k = z(i9);
        this.f20801l = z(i9);
    }

    public final void j(int i9, int i10) {
        x(i9, i10, axo.F(this.f20791b[i9]));
    }

    public final void k(int i9, int i10) {
        x(i9, axo.F(this.f20790a[i9]), i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f20802m;
        if (set != null) {
            return set;
        }
        avb avbVar = new avb(this);
        this.f20802m = avbVar;
        return avbVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iF = axo.F(obj);
        int iD = d(obj, iF);
        if (iD != -1) {
            Object obj3 = this.f20791b[iD];
            if (com.google.ads.interactivemedia.v3.impl.data.k.c(obj3, obj2)) {
                return obj2;
            }
            C(iD, obj2);
            return obj3;
        }
        int iF2 = axo.F(obj2);
        atp.g(f(obj2, iF2) == -1, "Value already present: %s", obj2);
        u(this.f20792c + 1);
        Object[] objArr = this.f20790a;
        int i9 = this.f20792c;
        objArr[i9] = obj;
        this.f20791b[i9] = obj2;
        v(i9, iF);
        w(this.f20792c, iF2);
        y(this.f20799j, this.f20792c);
        y(this.f20792c, -2);
        this.f20792c++;
        this.f20793d++;
        return null;
    }

    public final Object q(Object obj, Object obj2) {
        int iF = axo.F(obj);
        int iF2 = f(obj, iF);
        if (iF2 != -1) {
            Object obj3 = this.f20790a[iF2];
            if (com.google.ads.interactivemedia.v3.impl.data.k.c(obj3, obj2)) {
                return obj2;
            }
            B(iF2, obj2);
            return obj3;
        }
        int i9 = this.f20799j;
        int iF3 = axo.F(obj2);
        atp.g(d(obj2, iF3) == -1, "Key already present: %s", obj2);
        u(this.f20792c + 1);
        Object[] objArr = this.f20790a;
        int i10 = this.f20792c;
        objArr[i10] = obj2;
        this.f20791b[i10] = obj;
        v(i10, iF3);
        w(this.f20792c, iF);
        int i11 = i9 == -2 ? this.f20798i : this.f20801l[i9];
        y(i9, this.f20792c);
        y(this.f20792c, i11);
        this.f20792c++;
        this.f20793d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iF = axo.F(obj);
        int iD = d(obj, iF);
        if (iD == -1) {
            return null;
        }
        Object obj2 = this.f20791b[iD];
        j(iD, iF);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20792c;
    }
}
