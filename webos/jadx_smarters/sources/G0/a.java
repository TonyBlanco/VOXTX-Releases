package G0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2134a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f2135c;

    public a(String str) {
        this(str, null);
    }

    public a(String str, Object[] objArr) {
        this.f2134a = str;
        this.f2135c = objArr;
    }

    public static void b(d dVar, int i9, Object obj) {
        long jLongValue;
        int iByteValue;
        double dDoubleValue;
        if (obj == null) {
            dVar.X(i9);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.S(i9, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dDoubleValue = ((Float) obj).floatValue();
        } else {
            if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    jLongValue = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        iByteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        iByteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        iByteValue = ((Byte) obj).byteValue();
                    } else {
                        if (obj instanceof String) {
                            dVar.x(i9, (String) obj);
                            return;
                        }
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i9 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                        }
                        jLongValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    jLongValue = iByteValue;
                }
                dVar.A(i9, jLongValue);
                return;
            }
            dDoubleValue = ((Double) obj).doubleValue();
        }
        dVar.f(i9, dDoubleValue);
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i9 = 0;
        while (i9 < length) {
            Object obj = objArr[i9];
            i9++;
            b(dVar, i9, obj);
        }
    }

    @Override // G0.e
    public String a() {
        return this.f2134a;
    }

    @Override // G0.e
    public void c(d dVar) {
        d(dVar, this.f2135c);
    }
}
