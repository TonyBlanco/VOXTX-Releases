package i1;

import h1.InterfaceC1847b;
import h1.v;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: i1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1878e {
    public static List a(List list, InterfaceC1847b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((h1.g) it.next()).a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = aVar.f41513h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (h1.g gVar : aVar.f41513h) {
                    if (!treeSet.contains(gVar.a())) {
                        arrayList.add(gVar);
                    }
                }
            }
        } else if (!aVar.f41512g.isEmpty()) {
            for (Map.Entry entry : aVar.f41512g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new h1.g((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static String b(long j9) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j9));
    }

    public static Map c(InterfaceC1847b.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        String str = aVar.f41507b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j9 = aVar.f41509d;
        if (j9 > 0) {
            map.put("If-Modified-Since", b(j9));
        }
        return map;
    }

    public static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static InterfaceC1847b.a e(h1.k kVar) {
        boolean z9;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = kVar.f41542c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jF = str != null ? f(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i9 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z9 = false;
            j9 = 0;
            j10 = 0;
            while (i9 < strArrSplit.length) {
                String strTrim = strArrSplit[i9].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j9 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z9 = true;
                }
                i9++;
            }
            i9 = 1;
        } else {
            z9 = false;
            j9 = 0;
            j10 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jF2 = str3 != null ? f(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jF3 = str4 != null ? f(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (i9 != 0) {
            j12 = jCurrentTimeMillis + (j9 * 1000);
            if (z9) {
                j13 = j12;
            } else {
                Long.signum(j10);
                j13 = (j10 * 1000) + j12;
            }
            j11 = j13;
        } else {
            j11 = 0;
            if (jF <= 0 || jF2 < jF) {
                j12 = 0;
            } else {
                j12 = jCurrentTimeMillis + (jF2 - jF);
                j11 = j12;
            }
        }
        InterfaceC1847b.a aVar = new InterfaceC1847b.a();
        aVar.f41506a = kVar.f41541b;
        aVar.f41507b = str5;
        aVar.f41511f = j12;
        aVar.f41510e = j11;
        aVar.f41508c = jF;
        aVar.f41509d = jF3;
        aVar.f41512g = map;
        aVar.f41513h = kVar.f41543d;
        return aVar;
    }

    public static long f(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e9) {
            if ("0".equals(str) || "-1".equals(str)) {
                v.e("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            v.d(e9, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static List g(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new h1.g((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static Map h(List list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h1.g gVar = (h1.g) it.next();
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }
}
