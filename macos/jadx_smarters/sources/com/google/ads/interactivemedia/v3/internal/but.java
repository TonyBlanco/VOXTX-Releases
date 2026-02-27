package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class but {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f22587a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22588b = 17;

    public but() {
    }

    public but(byte[] bArr) {
    }

    public static int a(Object obj, String... strArr) {
        but butVar = new but(null);
        Class<?> superclass = obj.getClass();
        while (true) {
            f(obj, superclass, butVar, strArr);
            if (superclass.getSuperclass() == null) {
                return butVar.f22588b;
            }
            superclass = superclass.getSuperclass();
        }
    }

    public static Set b() {
        return (Set) f22587a.get();
    }

    private static void e(Object obj) {
        Set setB = b();
        if (setB != null) {
            setB.remove(new buv(obj));
            if (setB.isEmpty()) {
                f22587a.remove();
            }
        }
    }

    private static void f(Object obj, Class cls, but butVar, String[] strArr) {
        Set setB = b();
        if (setB == null || !setB.contains(new buv(obj))) {
            try {
                Set setB2 = b();
                if (setB2 == null) {
                    setB2 = new HashSet();
                    f22587a.set(setB2);
                }
                setB2.add(new buv(obj));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (Field field : declaredFields) {
                    if (!bto.D(strArr, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(buu.class)) {
                        try {
                            butVar.d(field.get(obj));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
                e(obj);
            } catch (Throwable th) {
                e(obj);
                throw th;
            }
        }
    }

    public final void c(long j9) {
        this.f22588b = (this.f22588b * 37) + ((int) (j9 ^ (j9 >> 32)));
    }

    public final void d(Object obj) {
        if (obj == null) {
            this.f22588b *= 37;
            return;
        }
        if (!obj.getClass().isArray()) {
            this.f22588b = (this.f22588b * 37) + obj.hashCode();
            return;
        }
        int i9 = 0;
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length = jArr.length;
            while (i9 < length) {
                c(jArr[i9]);
                i9++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length2 = iArr.length;
            while (i9 < length2) {
                this.f22588b = (this.f22588b * 37) + iArr[i9];
                i9++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            while (i9 < length3) {
                this.f22588b = (this.f22588b * 37) + sArr[i9];
                i9++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i9 < length4) {
                this.f22588b = (this.f22588b * 37) + cArr[i9];
                i9++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length5 = bArr.length;
            while (i9 < length5) {
                this.f22588b = (this.f22588b * 37) + bArr[i9];
                i9++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i9 < length6) {
                c(Double.doubleToLongBits(dArr[i9]));
                i9++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length7 = fArr.length;
            while (i9 < length7) {
                this.f22588b = (this.f22588b * 37) + Float.floatToIntBits(fArr[i9]);
                i9++;
            }
            return;
        }
        if (!(obj instanceof boolean[])) {
            Object[] objArr = (Object[]) obj;
            int length8 = objArr.length;
            while (i9 < length8) {
                d(objArr[i9]);
                i9++;
            }
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length9 = zArr.length;
        while (i9 < length9) {
            this.f22588b = (this.f22588b * 37) + (!zArr[i9] ? 1 : 0);
            i9++;
        }
    }

    public final int hashCode() {
        return this.f22588b;
    }
}
