package j$.util.concurrent;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f42275g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j$.sun.misc.a f42276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f42277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f42278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f42279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f42280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f42281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f42283o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile transient l[] f42284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile transient l[] f42285b;
    private volatile transient long baseCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile transient c[] f42286c;
    private volatile transient int cellsBusy;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient i f42287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient s f42288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient e f42289f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", n[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVarH = j$.sun.misc.a.h();
        f42276h = aVarH;
        f42277i = aVarH.j(ConcurrentHashMap.class, "sizeCtl");
        f42278j = aVarH.j(ConcurrentHashMap.class, "transferIndex");
        f42279k = aVarH.j(ConcurrentHashMap.class, "baseCount");
        f42280l = aVarH.j(ConcurrentHashMap.class, "cellsBusy");
        f42281m = aVarH.j(c.class, "value");
        f42282n = aVarH.a(l[].class);
        int iB = aVarH.b(l[].class);
        if (((iB - 1) & iB) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f42283o = 31 - Integer.numberOfLeadingZeros(iB);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i9) {
        this(i9, 0.75f, 1);
    }

    public ConcurrentHashMap(int i9, float f9, int i10) {
        if (f9 <= 0.0f || i9 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        long j9 = (long) (((double) ((i9 < i10 ? i10 : i9) / f9)) + 1.0d);
        this.sizeCtl = j9 >= 1073741824 ? 1073741824 : l((int) j9);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x013f, code lost:
    
        if (r25.f42286c != r7) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0141, code lost:
    
        r25.f42286c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(long r26, int r28) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    static final boolean b(l[] lVarArr, int i9, l lVar) {
        return f42276h.e(lVarArr, (((long) i9) << f42283o) + ((long) f42282n), lVar);
    }

    static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    private final l[] e() {
        while (true) {
            l[] lVarArr = this.f42284a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i9 = this.sizeCtl;
            if (i9 < 0) {
                Thread.yield();
            } else if (f42276h.c(this, f42277i, i9, -1)) {
                try {
                    l[] lVarArr2 = this.f42284a;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i10 = i9 > 0 ? i9 : 16;
                        l[] lVarArr3 = new l[i10];
                        this.f42284a = lVarArr3;
                        i9 = i10 - (i10 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    this.sizeCtl = i9;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i9;
                    throw th;
                }
            }
        }
    }

    static final void h(l[] lVarArr, int i9, l lVar) {
        f42276h.l(lVarArr, (((long) i9) << f42283o) + ((long) f42282n), lVar);
    }

    static final int i(int i9) {
        return (i9 ^ (i9 >>> 16)) & a.e.API_PRIORITY_OTHER;
    }

    static final l k(l[] lVarArr, int i9) {
        return (l) f42276h.g(lVarArr, (((long) i9) << f42283o) + ((long) f42282n));
    }

    private static final int l(int i9) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i9 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + iNumberOfLeadingZeros;
    }

    private final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i9;
        int i10;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap;
        int i11;
        l lVar;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int i12 = f42275g;
        int i13 = i12 > 1 ? (length >>> 3) / i12 : length;
        int i14 = i13 < 16 ? 16 : i13;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap2.f42285b = lVarArr5;
                concurrentHashMap2.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = a.e.API_PRIORITY_OTHER;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        int i15 = 0;
        int i16 = 0;
        boolean zB = true;
        boolean z9 = false;
        while (true) {
            if (zB) {
                int i17 = i16 - 1;
                if (i17 >= i15 || z9) {
                    i15 = i15;
                    i16 = i17;
                    zB = false;
                } else {
                    int i18 = concurrentHashMap2.transferIndex;
                    if (i18 <= 0) {
                        i16 = -1;
                    } else {
                        j$.sun.misc.a aVar = f42276h;
                        long j9 = f42278j;
                        int i19 = i18 > i14 ? i18 - i14 : 0;
                        int i20 = i15;
                        if (aVar.c(this, j9, i18, i19)) {
                            i16 = i18 - 1;
                            i15 = i19;
                        } else {
                            i15 = i20;
                            i16 = i17;
                        }
                    }
                    zB = false;
                }
            } else {
                int i21 = i15;
                r rVar = null;
                l lVar2 = null;
                if (i16 < 0 || i16 >= length || (i11 = i16 + length) >= length2) {
                    i9 = i14;
                    i10 = length2;
                    gVar = gVar2;
                    concurrentHashMap = this;
                    if (z9) {
                        concurrentHashMap.f42285b = null;
                        concurrentHashMap.f42284a = lVarArr3;
                        concurrentHashMap.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    j$.sun.misc.a aVar2 = f42276h;
                    long j10 = f42277i;
                    int i22 = concurrentHashMap.sizeCtl;
                    int i23 = i16;
                    if (!aVar2.c(this, j10, i22, i22 - 1)) {
                        i16 = i23;
                    } else {
                        if (i22 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i16 = length;
                        zB = true;
                        z9 = true;
                    }
                } else {
                    l lVarK = k(lVarArr4, i16);
                    if (lVarK == null) {
                        zB = b(lVarArr4, i16, gVar2);
                        concurrentHashMap = concurrentHashMap2;
                        i9 = i14;
                        i10 = length2;
                        gVar = gVar2;
                    } else {
                        int i24 = lVarK.f42309a;
                        if (i24 == -1) {
                            concurrentHashMap = concurrentHashMap2;
                            i9 = i14;
                            i10 = length2;
                            gVar = gVar2;
                            zB = true;
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArr4, i16) == lVarK) {
                                        if (i24 >= 0) {
                                            int i25 = i24 & length;
                                            l lVar3 = lVarK;
                                            for (l lVar4 = lVarK.f42312d; lVar4 != null; lVar4 = lVar4.f42312d) {
                                                int i26 = lVar4.f42309a & length;
                                                if (i26 != i25) {
                                                    lVar3 = lVar4;
                                                    i25 = i26;
                                                }
                                            }
                                            if (i25 == 0) {
                                                lVar = null;
                                                lVar2 = lVar3;
                                            } else {
                                                lVar = lVar3;
                                            }
                                            l lVar5 = lVarK;
                                            while (lVar5 != lVar3) {
                                                int i27 = lVar5.f42309a;
                                                Object obj = lVar5.f42310b;
                                                int i28 = i14;
                                                Object obj2 = lVar5.f42311c;
                                                int i29 = length2;
                                                if ((i27 & length) == 0) {
                                                    lVar2 = new l(i27, obj, obj2, lVar2);
                                                } else {
                                                    lVar = new l(i27, obj, obj2, lVar);
                                                }
                                                lVar5 = lVar5.f42312d;
                                                i14 = i28;
                                                length2 = i29;
                                            }
                                            i9 = i14;
                                            i10 = length2;
                                            h(lVarArr3, i16, lVar2);
                                            h(lVarArr3, i11, lVar);
                                            h(lVarArr4, i16, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i9 = i14;
                                            i10 = length2;
                                            if (lVarK instanceof q) {
                                                q qVar = (q) lVarK;
                                                r rVar2 = null;
                                                r rVar3 = null;
                                                l lVar6 = qVar.f42328f;
                                                int i30 = 0;
                                                int i31 = 0;
                                                r rVar4 = null;
                                                while (lVar6 != null) {
                                                    q qVar2 = qVar;
                                                    int i32 = lVar6.f42309a;
                                                    g gVar3 = gVar2;
                                                    r rVar5 = new r(i32, lVar6.f42310b, lVar6.f42311c, null, null);
                                                    if ((i32 & length) == 0) {
                                                        rVar5.f42333h = rVar3;
                                                        if (rVar3 == null) {
                                                            rVar = rVar5;
                                                        } else {
                                                            rVar3.f42312d = rVar5;
                                                        }
                                                        i30++;
                                                        rVar3 = rVar5;
                                                    } else {
                                                        rVar5.f42333h = rVar2;
                                                        if (rVar2 == null) {
                                                            rVar4 = rVar5;
                                                        } else {
                                                            rVar2.f42312d = rVar5;
                                                        }
                                                        i31++;
                                                        rVar2 = rVar5;
                                                    }
                                                    lVar6 = lVar6.f42312d;
                                                    qVar = qVar2;
                                                    gVar2 = gVar3;
                                                }
                                                q qVar3 = qVar;
                                                g gVar4 = gVar2;
                                                l lVarP = i30 <= 6 ? p(rVar) : i31 != 0 ? new q(rVar) : qVar3;
                                                l lVarP2 = i31 <= 6 ? p(rVar4) : i30 != 0 ? new q(rVar4) : qVar3;
                                                h(lVarArr3, i16, lVarP);
                                                h(lVarArr3, i11, lVarP2);
                                                lVarArr4 = lVarArr;
                                                gVar = gVar4;
                                                h(lVarArr4, i16, gVar);
                                            }
                                        }
                                        zB = true;
                                    } else {
                                        i9 = i14;
                                        i10 = length2;
                                    }
                                    gVar = gVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                        }
                    }
                }
                gVar2 = gVar;
                concurrentHashMap2 = concurrentHashMap;
                i15 = i21;
                i14 = i9;
                length2 = i10;
            }
        }
    }

    private final void n(l[] lVarArr, int i9) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l lVarK = k(lVarArr, i9);
        if (lVarK == null || lVarK.f42309a < 0) {
            return;
        }
        synchronized (lVarK) {
            try {
                if (k(lVarArr, i9) == lVarK) {
                    r rVar = null;
                    l lVar = lVarK;
                    r rVar2 = null;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.f42309a, lVar.f42310b, lVar.f42311c, null, null);
                        rVar3.f42333h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f42312d = rVar3;
                        }
                        lVar = lVar.f42312d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i9, new q(rVar));
                }
            } finally {
            }
        }
    }

    private final void o(int i9) {
        int length;
        int iL = i9 >= 536870912 ? 1073741824 : l(i9 + (i9 >>> 1) + 1);
        while (true) {
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                return;
            }
            l[] lVarArr = this.f42284a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i11 = i10 > iL ? i10 : iL;
                if (f42276h.c(this, f42277i, i10, -1)) {
                    try {
                        if (this.f42284a == lVarArr) {
                            this.f42284a = new l[i11];
                            i10 = i11 - (i11 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i10;
                    }
                } else {
                    continue;
                }
            } else {
                if (iL <= i10 || length >= 1073741824) {
                    return;
                }
                if (lVarArr == this.f42284a) {
                    if (f42276h.c(this, f42277i, i10, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(lVarArr, null);
                    }
                }
            }
        }
    }

    static l p(l lVar) {
        l lVar2 = null;
        l lVar3 = null;
        while (lVar != null) {
            l lVar4 = new l(lVar.f42309a, lVar.f42310b, lVar.f42311c);
            if (lVar3 == null) {
                lVar2 = lVar4;
            } else {
                lVar3.f42312d = lVar4;
            }
            lVar = lVar.f42312d;
            lVar3 = lVar4;
        }
        return lVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j9;
        boolean z9;
        boolean z10;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j10 = 0;
        long j11 = 0;
        l lVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j9 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j11++;
            lVar = new l(i(object.hashCode()), object, object2, lVar);
        }
        if (j11 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j12 = (long) (((double) (j11 / 0.75f)) + 1.0d);
        int iL = j12 >= 1073741824 ? 1073741824 : l((int) j12);
        l[] lVarArr = new l[iL];
        int i9 = iL - 1;
        while (lVar != null) {
            l lVar2 = lVar.f42312d;
            int i10 = lVar.f42309a;
            int i11 = i10 & i9;
            l lVarK = k(lVarArr, i11);
            if (lVarK == null) {
                z10 = true;
            } else {
                Object obj2 = lVar.f42310b;
                if (lVarK.f42309a >= 0) {
                    int i12 = 0;
                    for (l lVar3 = lVarK; lVar3 != null; lVar3 = lVar3.f42312d) {
                        if (lVar3.f42309a == i10 && ((obj = lVar3.f42310b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z9 = false;
                            break;
                        }
                        i12++;
                    }
                    z9 = true;
                    if (!z9 || i12 < 8) {
                        z10 = z9;
                    } else {
                        long j13 = j10 + 1;
                        lVar.f42312d = lVarK;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            long j14 = j13;
                            r rVar3 = new r(lVar4.f42309a, lVar4.f42310b, lVar4.f42311c, null, null);
                            rVar3.f42333h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f42312d = rVar3;
                            }
                            lVar4 = lVar4.f42312d;
                            rVar2 = rVar3;
                            j13 = j14;
                        }
                        h(lVarArr, i11, new q(rVar));
                        j10 = j13;
                    }
                } else if (((q) lVarK).e(i10, obj2, lVar.f42311c) == null) {
                    j10 += j9;
                }
                z10 = false;
            }
            j9 = 1;
            if (z10) {
                j10++;
                lVar.f42312d = lVarK;
                h(lVarArr, i11, lVar);
            }
            lVar = lVar2;
        }
        this.f42284a = lVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j10;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i9 = 1;
        int i10 = 0;
        while (i9 < 16) {
            i10++;
            i9 <<= 1;
        }
        int i11 = 32 - i10;
        int i12 = i9 - 1;
        n[] nVarArr = new n[16];
        for (int i13 = 0; i13 < 16; i13++) {
            nVarArr[i13] = new n();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", nVarArr);
        putFieldPutFields.put("segmentShift", i11);
        putFieldPutFields.put("segmentMask", i12);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f42284a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(lVarA.f42310b);
                objectOutputStream.writeObject(lVarA.f42311c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        l lVarK;
        l[] lVarArrD = this.f42284a;
        long j9 = 0;
        loop0: while (true) {
            int i9 = 0;
            while (lVarArrD != null && i9 < lVarArrD.length) {
                lVarK = k(lVarArrD, i9);
                if (lVarK == null) {
                    i9++;
                } else {
                    int i10 = lVarK.f42309a;
                    if (i10 == -1) {
                        break;
                    }
                    synchronized (lVarK) {
                        try {
                            if (k(lVarArrD, i9) == lVarK) {
                                for (l lVar = i10 >= 0 ? lVarK : lVarK instanceof q ? ((q) lVarK).f42328f : null; lVar != null; lVar = lVar.f42312d) {
                                    j9--;
                                }
                                h(lVarArrD, i9, null);
                                i9++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArrD = d(lVarArrD, lVarK);
        }
        if (j9 != 0) {
            a(j9, -1);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        l lVar;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i9 = i(obj.hashCode());
        l[] lVarArrE = this.f42284a;
        int i10 = 0;
        Object objApply = null;
        int i11 = 0;
        while (true) {
            if (lVarArrE != null) {
                int length = lVarArrE.length;
                if (length != 0) {
                    int i12 = (length - 1) & i9;
                    l lVarK = k(lVarArrE, i12);
                    if (lVarK == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArrE, i12, mVar)) {
                                    try {
                                        objApply = biFunction.apply(obj, null);
                                        if (objApply != null) {
                                            lVar = new l(i9, obj, objApply);
                                            i11 = 1;
                                        } else {
                                            lVar = null;
                                        }
                                        h(lVarArrE, i12, lVar);
                                        i10 = 1;
                                    } catch (Throwable th) {
                                        h(lVarArrE, i12, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i10 != 0) {
                        }
                    } else {
                        int i13 = lVarK.f42309a;
                        if (i13 == -1) {
                            lVarArrE = d(lVarArrE, lVarK);
                        } else {
                            synchronized (lVarK) {
                                try {
                                    if (k(lVarArrE, i12) == lVarK) {
                                        if (i13 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = lVarK;
                                            i10 = 1;
                                            while (true) {
                                                if (lVar3.f42309a != i9 || ((obj2 = lVar3.f42310b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                                    l lVar4 = lVar3.f42312d;
                                                    if (lVar4 == null) {
                                                        Object objApply2 = biFunction.apply(obj, null);
                                                        if (objApply2 == null) {
                                                            objApply = objApply2;
                                                        } else {
                                                            if (lVar3.f42312d != null) {
                                                                throw new IllegalStateException("Recursive update");
                                                            }
                                                            lVar3.f42312d = new l(i9, obj, objApply2);
                                                            objApply = objApply2;
                                                            i11 = 1;
                                                        }
                                                    } else {
                                                        i10++;
                                                        lVar2 = lVar3;
                                                        lVar3 = lVar4;
                                                    }
                                                }
                                            }
                                            Object objApply3 = biFunction.apply(obj, lVar3.f42311c);
                                            if (objApply3 != null) {
                                                lVar3.f42311c = objApply3;
                                                objApply = objApply3;
                                            } else {
                                                l lVar5 = lVar3.f42312d;
                                                if (lVar2 != null) {
                                                    lVar2.f42312d = lVar5;
                                                } else {
                                                    h(lVarArrE, i12, lVar5);
                                                }
                                                objApply = objApply3;
                                                i11 = -1;
                                            }
                                        } else if (lVarK instanceof q) {
                                            q qVar = (q) lVarK;
                                            r rVar = qVar.f42327e;
                                            r rVarB = rVar != null ? rVar.b(i9, obj, null) : null;
                                            Object objApply4 = biFunction.apply(obj, rVarB == null ? null : rVarB.f42311c);
                                            if (objApply4 != null) {
                                                if (rVarB != null) {
                                                    rVarB.f42311c = objApply4;
                                                } else {
                                                    qVar.e(i9, obj, objApply4);
                                                    i11 = 1;
                                                }
                                            } else if (rVarB != null) {
                                                if (qVar.f(rVarB)) {
                                                    h(lVarArrE, i12, p(qVar.f42328f));
                                                }
                                                i11 = -1;
                                            }
                                            objApply = objApply4;
                                            i10 = 1;
                                        } else if (lVarK instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(lVarArrE, i12);
                                }
                            }
                        }
                    }
                }
            }
            lVarArrE = e();
        }
        if (i11 != 0) {
            a(i11, i10);
        }
        return objApply;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        r5 = r5.f42311c;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r13.f42284a
            r3 = 0
            r5 = r0
            r4 = 0
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f42309a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f42309a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f42310b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f42311c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f42311c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.f42312d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f42312d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = -1
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.f42312d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.q r4 = (j$.util.concurrent.q) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.r r8 = r4.f42327e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f42311c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f42311c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f42328f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.l r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = -1
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.l[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f42284a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                Object obj2 = lVarA.f42311c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    final l[] d(l[] lVarArr, l lVar) {
        l[] lVarArr2;
        int i9;
        if (!(lVar instanceof g) || (lVarArr2 = ((g) lVar).f42302e) == null) {
            return this.f42284a;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
        while (true) {
            if (lVarArr2 != this.f42285b || this.f42284a != lVarArr || (i9 = this.sizeCtl) >= 0 || (i9 >>> 16) != iNumberOfLeadingZeros || i9 == iNumberOfLeadingZeros + 1 || i9 == Settings.DEFAULT_INITIAL_WINDOW_SIZE + iNumberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            }
            if (f42276h.c(this, f42277i, i9, i9 + 1)) {
                m(lVarArr, lVarArr2);
                break;
            }
        }
        return lVarArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e eVar = this.f42289f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f42289f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v9;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        l[] lVarArr = this.f42284a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v9 = get(key)) == null || (value != v9 && !value.equals(v9))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj2 = lVarA.f42311c;
            Object obj3 = map.get(lVarA.f42310b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        r7 = r6.f42311c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r11 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        r6.f42311c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lc2
            if (r10 == 0) goto Lc2
            int r1 = r9.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r8.f42284a
            r3 = 0
        L10:
            if (r2 == 0) goto Lbc
            int r4 = r2.length
            if (r4 != 0) goto L17
            goto Lbc
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.l r5 = k(r2, r4)
            if (r5 != 0) goto L2d
            j$.util.concurrent.l r5 = new j$.util.concurrent.l
            r5.<init>(r1, r9, r10)
            boolean r4 = b(r2, r4, r5)
            if (r4 == 0) goto L10
            goto Lb4
        L2d:
            int r6 = r5.f42309a
            r7 = -1
            if (r6 != r7) goto L37
            j$.util.concurrent.l[] r2 = r8.d(r2, r5)
            goto L10
        L37:
            if (r11 == 0) goto L4c
            if (r6 != r1) goto L4c
            java.lang.Object r7 = r5.f42310b
            if (r7 == r9) goto L47
            if (r7 == 0) goto L4c
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
        L47:
            java.lang.Object r7 = r5.f42311c
            if (r7 == 0) goto L4c
            return r7
        L4c:
            monitor-enter(r5)
            j$.util.concurrent.l r7 = k(r2, r4)     // Catch: java.lang.Throwable -> L68
            if (r7 != r5) goto La6
            if (r6 < 0) goto L81
            r3 = 1
            r6 = r5
        L57:
            int r7 = r6.f42309a     // Catch: java.lang.Throwable -> L68
            if (r7 != r1) goto L71
            java.lang.Object r7 = r6.f42310b     // Catch: java.lang.Throwable -> L68
            if (r7 == r9) goto L6a
            if (r7 == 0) goto L71
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L71
            goto L6a
        L68:
            r9 = move-exception
            goto Lba
        L6a:
            java.lang.Object r7 = r6.f42311c     // Catch: java.lang.Throwable -> L68
            if (r11 != 0) goto La7
            r6.f42311c = r10     // Catch: java.lang.Throwable -> L68
            goto La7
        L71:
            j$.util.concurrent.l r7 = r6.f42312d     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L7d
            j$.util.concurrent.l r7 = new j$.util.concurrent.l     // Catch: java.lang.Throwable -> L68
            r7.<init>(r1, r9, r10)     // Catch: java.lang.Throwable -> L68
            r6.f42312d = r7     // Catch: java.lang.Throwable -> L68
            goto La6
        L7d:
            int r3 = r3 + 1
            r6 = r7
            goto L57
        L81:
            boolean r6 = r5 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L99
            r3 = r5
            j$.util.concurrent.q r3 = (j$.util.concurrent.q) r3     // Catch: java.lang.Throwable -> L68
            j$.util.concurrent.r r3 = r3.e(r1, r9, r10)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L96
            java.lang.Object r6 = r3.f42311c     // Catch: java.lang.Throwable -> L68
            if (r11 != 0) goto L94
            r3.f42311c = r10     // Catch: java.lang.Throwable -> L68
        L94:
            r7 = r6
            goto L97
        L96:
            r7 = r0
        L97:
            r3 = 2
            goto La7
        L99:
            boolean r6 = r5 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L68
            if (r6 != 0) goto L9e
            goto La6
        L9e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = "Recursive update"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L68
            throw r9     // Catch: java.lang.Throwable -> L68
        La6:
            r7 = r0
        La7:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L10
            r9 = 8
            if (r3 < r9) goto Lb1
            r8.n(r2, r4)
        Lb1:
            if (r7 == 0) goto Lb4
            return r7
        Lb4:
            r9 = 1
            r8.a(r9, r3)
            return r0
        Lba:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L68
            throw r9
        Lbc:
            j$.util.concurrent.l[] r2 = r8.e()
            goto L10
        Lc2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f42284a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                biConsumer.accept(lVarA.f42310b, lVarA.f42311c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r9 = r5.f42311c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r15 == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        if (r9 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        if (r15.equals(r9) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r14 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r5.f42311c = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        r8.f42312d = r5.f42312d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        r5 = r5.f42312d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object g(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r12.f42284a
        La:
            r2 = 0
            if (r1 == 0) goto Lbd
            int r3 = r1.length
            if (r3 == 0) goto Lbd
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r4 = k(r1, r3)
            if (r4 != 0) goto L1b
            goto Lbd
        L1b:
            int r5 = r4.f42309a
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.l[] r1 = r12.d(r1, r4)
            goto La
        L25:
            monitor-enter(r4)
            j$.util.concurrent.l r7 = k(r1, r3)     // Catch: java.lang.Throwable -> L42
            if (r7 != r4) goto Lac
            r7 = 1
            if (r5 < 0) goto L6e
            r8 = r2
            r5 = r4
        L31:
            int r9 = r5.f42309a     // Catch: java.lang.Throwable -> L42
            if (r9 != r0) goto L65
            java.lang.Object r9 = r5.f42310b     // Catch: java.lang.Throwable -> L42
            if (r9 == r13) goto L45
            if (r9 == 0) goto L65
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L65
            goto L45
        L42:
            r13 = move-exception
            goto Lbb
        L45:
            java.lang.Object r9 = r5.f42311c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L53
            if (r15 == r9) goto L53
            if (r9 == 0) goto Lad
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lad
        L53:
            if (r14 == 0) goto L58
            r5.f42311c = r14     // Catch: java.lang.Throwable -> L42
            goto Lae
        L58:
            if (r8 == 0) goto L5f
            j$.util.concurrent.l r3 = r5.f42312d     // Catch: java.lang.Throwable -> L42
            r8.f42312d = r3     // Catch: java.lang.Throwable -> L42
            goto Lae
        L5f:
            j$.util.concurrent.l r5 = r5.f42312d     // Catch: java.lang.Throwable -> L42
        L61:
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Lae
        L65:
            j$.util.concurrent.l r8 = r5.f42312d     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L6a
            goto Lad
        L6a:
            r11 = r8
            r8 = r5
            r5 = r11
            goto L31
        L6e:
            boolean r5 = r4 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L9f
            r5 = r4
            j$.util.concurrent.q r5 = (j$.util.concurrent.q) r5     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.r r8 = r5.f42327e     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lad
            j$.util.concurrent.r r8 = r8.b(r0, r13, r2)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lad
            java.lang.Object r9 = r8.f42311c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L8d
            if (r15 == r9) goto L8d
            if (r9 == 0) goto Lad
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lad
        L8d:
            if (r14 == 0) goto L92
            r8.f42311c = r14     // Catch: java.lang.Throwable -> L42
            goto Lae
        L92:
            boolean r8 = r5.f(r8)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lae
            j$.util.concurrent.r r5 = r5.f42328f     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.l r5 = p(r5)     // Catch: java.lang.Throwable -> L42
            goto L61
        L9f:
            boolean r3 = r4 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto La4
            goto Lac
        La4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L42
            throw r13     // Catch: java.lang.Throwable -> L42
        Lac:
            r7 = 0
        Lad:
            r9 = r2
        Lae:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto La
            if (r9 == 0) goto Lbd
            if (r14 != 0) goto Lba
            r13 = -1
            r12.a(r13, r6)
        Lba:
            return r9
        Lbb:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r13
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        l lVarK;
        Object obj2;
        int i9 = i(obj.hashCode());
        l[] lVarArr = this.f42284a;
        if (lVarArr != null && (length = lVarArr.length) > 0 && (lVarK = k(lVarArr, (length - 1) & i9)) != null) {
            int i10 = lVarK.f42309a;
            if (i10 == i9) {
                Object obj3 = lVarK.f42310b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) lVarK.f42311c;
                }
            } else if (i10 < 0) {
                l lVarA = lVarK.a(obj, i9);
                if (lVarA != null) {
                    return (V) lVarA.f42311c;
                }
                return null;
            }
            while (true) {
                lVarK = lVarK.f42312d;
                if (lVarK == null) {
                    break;
                }
                if (lVarK.f42309a == i9 && ((obj2 = lVarK.f42310b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    break;
                }
            }
            return (V) lVarK.f42311c;
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v9 = get(obj);
        return v9 == null ? obj2 : v9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f42284a;
        int iHashCode = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                iHashCode += lVarA.f42311c.hashCode() ^ lVarA.f42310b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return j() <= 0;
    }

    final long j() {
        c[] cVarArr = this.f42286c;
        long j9 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j9 += cVar.value;
                }
            }
        }
        return j9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.f42287d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f42287d = iVar2;
        return iVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k9, V v9) {
        return (V) f(k9, v9, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k9, V v9) {
        return (V) f(k9, v9, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f42284a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            }
            Object obj = lVarA.f42311c;
            Object obj2 = lVarA.f42310b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j9 = j();
        if (j9 < 0) {
            return 0;
        }
        return j9 > 2147483647L ? a.e.API_PRIORITY_OTHER : (int) j9;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        l[] lVarArr = this.f42284a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l lVarA = pVar.a();
        if (lVarA != null) {
            while (true) {
                Object obj = lVarA.f42310b;
                Object obj2 = lVarA.f42311c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.f42288e;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f42288e = sVar2;
        return sVar2;
    }
}
