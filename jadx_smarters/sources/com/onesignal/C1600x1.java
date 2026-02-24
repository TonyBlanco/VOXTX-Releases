package com.onesignal;

import com.onesignal.C1584s0;
import com.onesignal.C1597w1;
import com.onesignal.F1;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.onesignal.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1600x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1584s0 f38957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f38958b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.onesignal.x1$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38959a;

        static {
            int[] iArr = new int[C1597w1.b.values().length];
            f38959a = iArr;
            try {
                iArr[C1597w1.b.EQUAL_TO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38959a[C1597w1.b.NOT_EQUAL_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38959a[C1597w1.b.EXISTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38959a[C1597w1.b.CONTAINS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38959a[C1597w1.b.NOT_EXISTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38959a[C1597w1.b.LESS_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38959a[C1597w1.b.GREATER_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38959a[C1597w1.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38959a[C1597w1.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C1600x1(C1584s0.c cVar) {
        this.f38957a = new C1584s0(cVar);
    }

    public final boolean a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!c((C1597w1) it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean b(D0 d02) {
        if (d02.f38185c.size() == 0) {
            return true;
        }
        Iterator it = d02.f38185c.iterator();
        while (it.hasNext()) {
            if (a((ArrayList) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(C1597w1 c1597w1) {
        C1597w1.a aVar = c1597w1.f38944b;
        if (aVar == C1597w1.a.UNKNOWN) {
            return false;
        }
        if (aVar != C1597w1.a.CUSTOM) {
            return this.f38957a.c(c1597w1);
        }
        C1597w1.b bVar = c1597w1.f38946d;
        Object obj = this.f38958b.get(c1597w1.f38945c);
        if (obj == null) {
            if (bVar == C1597w1.b.NOT_EXISTS) {
                return true;
            }
            return bVar == C1597w1.b.NOT_EQUAL_TO && c1597w1.f38947e != null;
        }
        if (bVar == C1597w1.b.EXISTS) {
            return true;
        }
        if (bVar == C1597w1.b.NOT_EXISTS) {
            return false;
        }
        if (bVar == C1597w1.b.CONTAINS) {
            return (obj instanceof Collection) && ((Collection) obj).contains(c1597w1.f38947e);
        }
        if (obj instanceof String) {
            Object obj2 = c1597w1.f38947e;
            if ((obj2 instanceof String) && i((String) obj2, (String) obj, bVar)) {
                return true;
            }
        }
        Object obj3 = c1597w1.f38947e;
        return ((obj3 instanceof Number) && (obj instanceof Number) && g((Number) obj3, (Number) obj, bVar)) || f(c1597w1.f38947e, obj, bVar);
    }

    public boolean d(D0 d02, Collection collection) {
        if (d02.f38185c == null) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = d02.f38185c.iterator();
            while (it2.hasNext()) {
                for (C1597w1 c1597w1 : (ArrayList) it2.next()) {
                    if (str.equals(c1597w1.f38945c) || str.equals(c1597w1.f38943a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean e(D0 d02) {
        ArrayList arrayList = d02.f38185c;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator it = d02.f38185c.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                C1597w1.a aVar = ((C1597w1) it2.next()).f38944b;
                if (aVar == C1597w1.a.CUSTOM || aVar == C1597w1.a.UNKNOWN) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(Object obj, Object obj2, C1597w1.b bVar) {
        if (obj == null) {
            return false;
        }
        if (!bVar.checksEquality()) {
            if ((obj2 instanceof String) && (obj instanceof Number)) {
                return h((Number) obj, (String) obj2, bVar);
            }
            return false;
        }
        String string = obj.toString();
        String string2 = obj2.toString();
        if (obj2 instanceof Number) {
            string2 = new DecimalFormat("0.#").format(obj2);
        }
        return i(string, string2, bVar);
    }

    public final boolean g(Number number, Number number2, C1597w1.b bVar) {
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        switch (a.f38959a[bVar.ordinal()]) {
            case 1:
                if (dDoubleValue2 == dDoubleValue) {
                }
                break;
            case 2:
                if (dDoubleValue2 != dDoubleValue) {
                }
                break;
            case 3:
            case 4:
            case 5:
                F1.c1(F1.v.ERROR, "Attempted to use an invalid operator with a numeric value: " + bVar.toString());
                break;
            case 6:
                if (dDoubleValue2 < dDoubleValue) {
                }
                break;
            case 7:
                if (dDoubleValue2 > dDoubleValue) {
                }
                break;
            case 8:
                if (dDoubleValue2 < dDoubleValue || dDoubleValue2 == dDoubleValue) {
                }
                break;
            case 9:
                if (dDoubleValue2 > dDoubleValue || dDoubleValue2 == dDoubleValue) {
                }
                break;
        }
        return false;
    }

    public final boolean h(Number number, String str, C1597w1.b bVar) {
        try {
            return g(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean i(String str, String str2, C1597w1.b bVar) {
        int i9 = a.f38959a[bVar.ordinal()];
        if (i9 == 1) {
            return str.equals(str2);
        }
        if (i9 == 2) {
            return !str.equals(str2);
        }
        F1.c1(F1.v.ERROR, "Attempted to use an invalid operator for a string trigger comparison: " + bVar.toString());
        return false;
    }
}
