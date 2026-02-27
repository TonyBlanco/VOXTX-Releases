package E3;

import android.os.SystemClock;
import android.util.Pair;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import s5.D;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f1681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f1682d;

    public b() {
        this(new Random());
    }

    public b(Random random) {
        this.f1681c = new HashMap();
        this.f1682d = random;
        this.f1679a = new HashMap();
        this.f1680b = new HashMap();
    }

    public static void b(Object obj, long j9, Map map) {
        if (map.containsKey(obj)) {
            j9 = Math.max(j9, ((Long) k0.j((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j9));
    }

    public static int d(F3.b bVar, F3.b bVar2) {
        int iCompare = Integer.compare(bVar.f1931c, bVar2.f1931c);
        return iCompare != 0 ? iCompare : bVar.f1930b.compareTo(bVar2.f1930b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < list.size(); i9++) {
            hashSet.add(Integer.valueOf(((F3.b) list.get(i9)).f1931c));
        }
        return hashSet.size();
    }

    public static void h(long j9, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j9) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            map.remove(arrayList.get(i9));
        }
    }

    public final List c(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f1679a);
        h(jElapsedRealtime, this.f1680b);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            F3.b bVar = (F3.b) list.get(i9);
            if (!this.f1679a.containsKey(bVar.f1930b) && !this.f1680b.containsKey(Integer.valueOf(bVar.f1931c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void e(F3.b bVar, long j9) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j9;
        b(bVar.f1930b, jElapsedRealtime, this.f1679a);
        int i9 = bVar.f1931c;
        if (i9 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i9), jElapsedRealtime, this.f1680b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List listC = c(list);
        for (int i9 = 0; i9 < listC.size(); i9++) {
            hashSet.add(Integer.valueOf(((F3.b) listC.get(i9)).f1931c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f1679a.clear();
        this.f1680b.clear();
        this.f1681c.clear();
    }

    public F3.b j(List list) {
        Object objC;
        List listC = c(list);
        if (listC.size() >= 2) {
            Collections.sort(listC, new Comparator() { // from class: E3.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return b.d((F3.b) obj, (F3.b) obj2);
                }
            });
            ArrayList arrayList = new ArrayList();
            int i9 = ((F3.b) listC.get(0)).f1931c;
            int i10 = 0;
            while (true) {
                if (i10 >= listC.size()) {
                    break;
                }
                F3.b bVar = (F3.b) listC.get(i10);
                if (i9 == bVar.f1931c) {
                    arrayList.add(new Pair(bVar.f1930b, Integer.valueOf(bVar.f1932d)));
                    i10++;
                } else if (arrayList.size() == 1) {
                    objC = listC.get(0);
                }
            }
            F3.b bVar2 = (F3.b) this.f1681c.get(arrayList);
            if (bVar2 != null) {
                return bVar2;
            }
            F3.b bVarK = k(listC.subList(0, arrayList.size()));
            this.f1681c.put(arrayList, bVarK);
            return bVarK;
        }
        objC = D.c(listC, null);
        return (F3.b) objC;
    }

    public final F3.b k(List list) {
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += ((F3.b) list.get(i10)).f1932d;
        }
        int iNextInt = this.f1682d.nextInt(i9);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            F3.b bVar = (F3.b) list.get(i12);
            i11 += bVar.f1932d;
            if (iNextInt < i11) {
                return bVar;
            }
        }
        return (F3.b) D.d(list);
    }
}
