package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class bur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f22583a = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f22585c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22584b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f22586d = null;

    public bur() {
        ArrayList arrayList = new ArrayList();
        this.f22585c = arrayList;
        arrayList.add(String.class);
    }

    public static Set a() {
        return (Set) f22583a.get();
    }

    public static bux b(Object obj, Object obj2) {
        return bux.c(new buv(obj), new buv(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.Object r5, java.lang.Object r6, java.lang.String... r7) {
        /*
            if (r5 != r6) goto L5
            r5 = 1
            goto L6c
        L5:
            com.google.ads.interactivemedia.v3.internal.bur r0 = new com.google.ads.interactivemedia.v3.internal.bur
            r0.<init>()
            r0.f22586d = r7
            boolean r7 = r0.f22584b
            if (r7 != 0) goto L11
            goto L6a
        L11:
            if (r5 == r6) goto L6a
            java.lang.Class r7 = r5.getClass()
            java.lang.Class r1 = r6.getClass()
            boolean r2 = r7.isInstance(r6)
            r3 = 0
            if (r2 == 0) goto L29
            boolean r2 = r1.isInstance(r5)
            if (r2 != 0) goto L35
            goto L37
        L29:
            boolean r2 = r1.isInstance(r5)
            if (r2 == 0) goto L68
            boolean r2 = r7.isInstance(r6)
            if (r2 != 0) goto L37
        L35:
            r2 = r7
            goto L38
        L37:
            r2 = r1
        L38:
            boolean r4 = r2.isArray()     // Catch: java.lang.IllegalArgumentException -> L68
            if (r4 == 0) goto L42
            r0.f(r5, r6)     // Catch: java.lang.IllegalArgumentException -> L68
            goto L6a
        L42:
            java.util.List r4 = r0.f22585c     // Catch: java.lang.IllegalArgumentException -> L68
            boolean r7 = r4.contains(r7)     // Catch: java.lang.IllegalArgumentException -> L68
            if (r7 != 0) goto L61
            java.util.List r7 = r0.f22585c     // Catch: java.lang.IllegalArgumentException -> L68
            boolean r7 = r7.contains(r1)     // Catch: java.lang.IllegalArgumentException -> L68
            if (r7 == 0) goto L53
            goto L61
        L53:
            r0.h(r5, r6, r2)     // Catch: java.lang.IllegalArgumentException -> L68
            java.lang.Class r7 = r2.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L68
            if (r7 == 0) goto L6a
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L68
            goto L53
        L61:
            boolean r5 = r5.equals(r6)     // Catch: java.lang.IllegalArgumentException -> L68
            r0.f22584b = r5     // Catch: java.lang.IllegalArgumentException -> L68
            goto L6a
        L68:
            r0.f22584b = r3
        L6a:
            boolean r5 = r0.f22584b
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bur.c(java.lang.Object, java.lang.Object, java.lang.String[]):boolean");
    }

    private final void h(Object obj, Object obj2, Class cls) {
        Set setA = a();
        bux buxVarB = b(obj, obj2);
        buw buwVar = (buw) buxVarB;
        bux buxVarC = bux.c(buwVar.f22592b, buwVar.f22591a);
        if (setA == null || !(setA.contains(buxVarB) || setA.contains(buxVarC))) {
            try {
                Set setA2 = a();
                if (setA2 == null) {
                    setA2 = new HashSet();
                    f22583a.set(setA2);
                }
                setA2.add(b(obj, obj2));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (int i9 = 0; i9 < declaredFields.length && this.f22584b; i9++) {
                    Field field = declaredFields[i9];
                    if (!bto.D(this.f22586d, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(bus.class)) {
                        try {
                            f(field.get(obj), field.get(obj2));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
                i(obj, obj2);
            } catch (Throwable th) {
                i(obj, obj2);
                throw th;
            }
        }
    }

    private static void i(Object obj, Object obj2) {
        Set setA = a();
        if (setA != null) {
            setA.remove(b(obj, obj2));
            if (setA.isEmpty()) {
                f22583a.remove();
            }
        }
    }

    public final void d(int i9, int i10) {
        if (this.f22584b) {
            this.f22584b = i9 == i10;
        }
    }

    public final void e(long j9, long j10) {
        if (this.f22584b) {
            this.f22584b = j9 == j10;
        }
    }

    public final void f(Object obj, Object obj2) {
        if (this.f22584b && obj != obj2) {
            if (obj == null || obj2 == null) {
                g();
                return;
            }
            if (!obj.getClass().isArray()) {
                this.f22584b = obj.equals(obj2);
                return;
            }
            if (obj.getClass() != obj2.getClass()) {
                g();
                return;
            }
            int i9 = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (this.f22584b && jArr != jArr2) {
                    if (jArr.length != jArr2.length) {
                        g();
                        return;
                    }
                    while (i9 < jArr.length && this.f22584b) {
                        e(jArr[i9], jArr2[i9]);
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (!this.f22584b || iArr == iArr2) {
                    return;
                }
                if (iArr.length != iArr2.length) {
                    g();
                    return;
                }
                while (i9 < iArr.length && this.f22584b) {
                    d(iArr[i9], iArr2[i9]);
                    i9++;
                }
                return;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (!this.f22584b || sArr == sArr2) {
                    return;
                }
                if (sArr.length != sArr2.length) {
                    g();
                    return;
                }
                for (int i10 = 0; i10 < sArr.length && this.f22584b; i10++) {
                    this.f22584b = sArr[i10] == sArr2[i10];
                }
                return;
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (!this.f22584b || cArr == cArr2) {
                    return;
                }
                if (cArr.length != cArr2.length) {
                    g();
                    return;
                }
                for (int i11 = 0; i11 < cArr.length && this.f22584b; i11++) {
                    this.f22584b = cArr[i11] == cArr2[i11];
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (!this.f22584b || bArr == bArr2) {
                    return;
                }
                if (bArr.length != bArr2.length) {
                    g();
                    return;
                }
                for (int i12 = 0; i12 < bArr.length && this.f22584b; i12++) {
                    this.f22584b = bArr[i12] == bArr2[i12];
                }
                return;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (!this.f22584b || dArr == dArr2) {
                    return;
                }
                if (dArr.length != dArr2.length) {
                    g();
                    return;
                }
                while (i9 < dArr.length && this.f22584b) {
                    e(Double.doubleToLongBits(dArr[i9]), Double.doubleToLongBits(dArr2[i9]));
                    i9++;
                }
                return;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (!this.f22584b || fArr == fArr2) {
                    return;
                }
                if (fArr.length != fArr2.length) {
                    g();
                    return;
                }
                while (i9 < fArr.length && this.f22584b) {
                    d(Float.floatToIntBits(fArr[i9]), Float.floatToIntBits(fArr2[i9]));
                    i9++;
                }
                return;
            }
            if (!(obj instanceof boolean[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (!this.f22584b || objArr == objArr2) {
                    return;
                }
                if (objArr.length != objArr2.length) {
                    g();
                    return;
                }
                while (i9 < objArr.length && this.f22584b) {
                    f(objArr[i9], objArr2[i9]);
                    i9++;
                }
                return;
            }
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            if (!this.f22584b || zArr == zArr2) {
                return;
            }
            if (zArr.length != zArr2.length) {
                g();
                return;
            }
            for (int i13 = 0; i13 < zArr.length && this.f22584b; i13++) {
                this.f22584b = zArr[i13] == zArr2[i13];
            }
        }
    }

    public final void g() {
        this.f22584b = false;
    }
}
