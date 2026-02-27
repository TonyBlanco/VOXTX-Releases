package h3;

import d3.C1671h;
import d4.M;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: h3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1855d extends AbstractC1856e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f41639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f41640d;

    public C1855d() {
        super(new C1671h());
        this.f41638b = -9223372036854775807L;
        this.f41639c = new long[0];
        this.f41640d = new long[0];
    }

    public static Boolean g(M m9) {
        return Boolean.valueOf(m9.H() == 1);
    }

    public static Object h(M m9, int i9) {
        if (i9 == 0) {
            return j(m9);
        }
        if (i9 == 1) {
            return g(m9);
        }
        if (i9 == 2) {
            return n(m9);
        }
        if (i9 == 3) {
            return l(m9);
        }
        if (i9 == 8) {
            return k(m9);
        }
        if (i9 == 10) {
            return m(m9);
        }
        if (i9 != 11) {
            return null;
        }
        return i(m9);
    }

    public static Date i(M m9) {
        Date date = new Date((long) j(m9).doubleValue());
        m9.V(2);
        return date;
    }

    public static Double j(M m9) {
        return Double.valueOf(Double.longBitsToDouble(m9.A()));
    }

    public static HashMap k(M m9) {
        int iL = m9.L();
        HashMap map = new HashMap(iL);
        for (int i9 = 0; i9 < iL; i9++) {
            String strN = n(m9);
            Object objH = h(m9, o(m9));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    public static HashMap l(M m9) {
        HashMap map = new HashMap();
        while (true) {
            String strN = n(m9);
            int iO = o(m9);
            if (iO == 9) {
                return map;
            }
            Object objH = h(m9, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    public static ArrayList m(M m9) {
        int iL = m9.L();
        ArrayList arrayList = new ArrayList(iL);
        for (int i9 = 0; i9 < iL; i9++) {
            Object objH = h(m9, o(m9));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    public static String n(M m9) {
        int iN = m9.N();
        int iF = m9.f();
        m9.V(iN);
        return new String(m9.e(), iF, iN);
    }

    public static int o(M m9) {
        return m9.H();
    }

    @Override // h3.AbstractC1856e
    public boolean b(M m9) {
        return true;
    }

    @Override // h3.AbstractC1856e
    public boolean c(M m9, long j9) {
        if (o(m9) != 2 || !"onMetaData".equals(n(m9)) || m9.a() == 0 || o(m9) != 8) {
            return false;
        }
        HashMap mapK = k(m9);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f41638b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f41639c = new long[size];
                this.f41640d = new long[size];
                for (int i9 = 0; i9 < size; i9++) {
                    Object obj5 = list.get(i9);
                    Object obj6 = list2.get(i9);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f41639c = new long[0];
                        this.f41640d = new long[0];
                        break;
                    }
                    this.f41639c[i9] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f41640d[i9] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f41638b;
    }

    public long[] e() {
        return this.f41640d;
    }

    public long[] f() {
        return this.f41639c;
    }
}
