package androidx.work;

import Q0.k;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f17301b = k.f("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f17302c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f17303a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f17304a = new HashMap();

        public b a() throws Throwable {
            b bVar = new b(this.f17304a);
            b.n(bVar);
            return bVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.f17304a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f17304a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f17304a.put(str, b.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f17304a.put(str, b.b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f17304a.put(str, b.e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f17304a.put(str, b.f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f17304a.put(str, b.d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                    this.f17304a.put(str, b.c((double[]) obj));
                }
            }
            return this;
        }

        public a c(b bVar) {
            d(bVar.f17303a);
            return this;
        }

        public a d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String str, boolean z9) {
            this.f17304a.put(str, Boolean.valueOf(z9));
            return this;
        }

        public a f(String str, int i9) {
            this.f17304a.put(str, Integer.valueOf(i9));
            return this;
        }

        public a g(String str, long j9) {
            this.f17304a.put(str, Long.valueOf(j9));
            return this;
        }

        public a h(String str, String str2) {
            this.f17304a.put(str, str2);
            return this;
        }
    }

    public b(b bVar) {
        this.f17303a = new HashMap(bVar.f17303a);
    }

    public b(Map map) {
        this.f17303a = new HashMap(map);
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i9 = 0; i9 < zArr.length; i9++) {
            boolArr[i9] = Boolean.valueOf(zArr[i9]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i9 = 0; i9 < bArr.length; i9++) {
            bArr2[i9] = Byte.valueOf(bArr[i9]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i9 = 0; i9 < dArr.length; i9++) {
            dArr2[i9] = Double.valueOf(dArr[i9]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i9 = 0; i9 < fArr.length; i9++) {
            fArr2[i9] = Float.valueOf(fArr[i9]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            numArr[i9] = Integer.valueOf(iArr[i9]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i9 = 0; i9 < jArr.length; i9++) {
            lArr[i9] = Long.valueOf(jArr[i9]);
        }
        return lArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0040 -> B:37:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.b g(byte[] r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L82
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
        L1b:
            if (r7 <= 0) goto L31
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r7 = move-exception
            goto L6b
        L2d:
            r7 = move-exception
            goto L51
        L2f:
            r7 = move-exception
            goto L51
        L31:
            r3.close()     // Catch: java.io.IOException -> L35
            goto L3b
        L35:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f17301b
            android.util.Log.e(r3, r0, r7)
        L3b:
            r2.close()     // Catch: java.io.IOException -> L3f
            goto L65
        L3f:
            r7 = move-exception
            java.lang.String r2 = androidx.work.b.f17301b
            android.util.Log.e(r2, r0, r7)
            goto L65
        L46:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L6b
        L4a:
            r3 = move-exception
        L4b:
            r6 = r3
            r3 = r7
            r7 = r6
            goto L51
        L4f:
            r3 = move-exception
            goto L4b
        L51:
            java.lang.String r4 = androidx.work.b.f17301b     // Catch: java.lang.Throwable -> L2b
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f17301b
            android.util.Log.e(r3, r0, r7)
        L62:
            r2.close()     // Catch: java.io.IOException -> L3f
        L65:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>(r1)
            return r7
        L6b:
            if (r3 == 0) goto L77
            r3.close()     // Catch: java.io.IOException -> L71
            goto L77
        L71:
            r1 = move-exception
            java.lang.String r3 = androidx.work.b.f17301b
            android.util.Log.e(r3, r0, r1)
        L77:
            r2.close()     // Catch: java.io.IOException -> L7b
            goto L81
        L7b:
            r1 = move-exception
            java.lang.String r2 = androidx.work.b.f17301b
            android.util.Log.e(r2, r0, r1)
        L81:
            throw r7
        L82:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.g(byte[]):androidx.work.b");
    }

    public static byte[] n(b bVar) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e9) {
            e = e9;
        }
        try {
            objectOutputStream.writeInt(bVar.m());
            for (Map.Entry entry : bVar.f17303a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e10) {
                Log.e(f17301b, "Error in Data#toByteArray: ", e10);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e11) {
                Log.e(f17301b, "Error in Data#toByteArray: ", e11);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e12) {
            e = e12;
            objectOutputStream2 = objectOutputStream;
            Log.e(f17301b, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e13) {
                    Log.e(f17301b, "Error in Data#toByteArray: ", e13);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e14) {
                Log.e(f17301b, "Error in Data#toByteArray: ", e14);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e15) {
                    Log.e(f17301b, "Error in Data#toByteArray: ", e15);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e16) {
                Log.e(f17301b, "Error in Data#toByteArray: ", e16);
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> setKeySet = this.f17303a.keySet();
        if (!setKeySet.equals(bVar.f17303a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f17303a.get(str);
            Object obj3 = bVar.f17303a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public boolean h(String str, boolean z9) {
        Object obj = this.f17303a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z9;
    }

    public int hashCode() {
        return this.f17303a.hashCode() * 31;
    }

    public int i(String str, int i9) {
        Object obj = this.f17303a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i9;
    }

    public Map j() {
        return Collections.unmodifiableMap(this.f17303a);
    }

    public long k(String str, long j9) {
        Object obj = this.f17303a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j9;
    }

    public String l(String str) {
        Object obj = this.f17303a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int m() {
        return this.f17303a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f17303a.isEmpty()) {
            for (String str : this.f17303a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f17303a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
