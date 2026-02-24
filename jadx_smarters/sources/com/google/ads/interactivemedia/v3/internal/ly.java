package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f23758d;

    public ly() {
        Random random = new Random();
        this.f23756b = new HashMap();
        this.f23755a = random;
        this.f23758d = new HashMap();
        this.f23757c = new HashMap();
    }

    public ly(View view, agv agvVar, String str) {
        this.f23757c = new aia(view);
        this.f23758d = view.getClass().getCanonicalName();
        this.f23755a = agvVar;
        this.f23756b = str;
    }

    private ly(agu aguVar, agw agwVar, agx agxVar, agx agxVar2) {
        this.f23755a = aguVar;
        this.f23757c = agwVar;
        this.f23756b = agxVar;
        if (agxVar2 == null) {
            this.f23758d = agx.NONE;
        } else {
            this.f23758d = agxVar2;
        }
    }

    public ly(String str, String str2, long[] jArr, aal[] aalVarArr) {
        this.f23757c = str;
        this.f23758d = str2;
        this.f23756b = jArr;
        this.f23755a = aalVarArr;
    }

    public static ly k(agu aguVar, agw agwVar, agx agxVar, agx agxVar2) {
        com.google.ads.interactivemedia.v3.impl.data.i.e(aguVar, "CreativeType is null");
        com.google.ads.interactivemedia.v3.impl.data.i.e(agwVar, "ImpressionType is null");
        com.google.ads.interactivemedia.v3.impl.data.i.e(agxVar, "Impression owner is null");
        if (agxVar == agx.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (aguVar == agu.DEFINED_BY_JAVASCRIPT && agxVar == agx.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (agwVar == agw.DEFINED_BY_JAVASCRIPT && agxVar == agx.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new ly(aguVar, agwVar, agxVar, agxVar2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    private final List l(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        n(jElapsedRealtime, this.f23758d);
        n(jElapsedRealtime, this.f23757c);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            lt ltVar = (lt) list.get(i9);
            if (!this.f23758d.containsKey(ltVar.f23722b) && !this.f23757c.containsKey(Integer.valueOf(ltVar.f23723c))) {
                arrayList.add(ltVar);
            }
        }
        return arrayList;
    }

    private static void m(Object obj, long j9, Map map) {
        if (map.containsKey(obj)) {
            Long l9 = (Long) map.get(obj);
            int i9 = cq.f22640a;
            j9 = Math.max(j9, l9.longValue());
        }
        map.put(obj, Long.valueOf(j9));
    }

    private static void n(long j9, Map map) {
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

    public final String a() {
        return ((String) this.f23757c) + "/" + ((String) this.f23758d);
    }

    public final int b(List list) {
        HashSet hashSet = new HashSet();
        List listL = l(list);
        for (int i9 = 0; i9 < listL.size(); i9++) {
            hashSet.add(Integer.valueOf(((lt) listL.get(i9)).f23723c));
        }
        return hashSet.size();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    public final lt c(List list) {
        lt ltVar;
        Object objB;
        List listL = l(list);
        if (listL.size() >= 2) {
            Collections.sort(listL, new Comparator() { // from class: com.google.ads.interactivemedia.v3.internal.kt
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    lt ltVar2 = (lt) obj;
                    lt ltVar3 = (lt) obj2;
                    int i9 = ltVar2.f23723c;
                    int i10 = ltVar3.f23723c;
                    int i11 = i9 == i10 ? 0 : i9 < i10 ? -1 : 1;
                    return i11 != 0 ? i11 : ltVar2.f23722b.compareTo(ltVar3.f23722b);
                }
            });
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            int i10 = ((lt) listL.get(0)).f23723c;
            int i11 = 0;
            while (true) {
                if (i11 >= listL.size()) {
                    break;
                }
                lt ltVar2 = (lt) listL.get(i11);
                if (i10 == ltVar2.f23723c) {
                    arrayList.add(new Pair(ltVar2.f23722b, Integer.valueOf(ltVar2.f23724d)));
                    i11++;
                } else if (arrayList.size() == 1) {
                    objB = listL.get(0);
                }
            }
            lt ltVar3 = (lt) this.f23756b.get(arrayList);
            if (ltVar3 != null) {
                return ltVar3;
            }
            List listSubList = listL.subList(0, arrayList.size());
            int i12 = 0;
            for (int i13 = 0; i13 < listSubList.size(); i13++) {
                i12 += ((lt) listSubList.get(i13)).f23724d;
            }
            int iNextInt = ((Random) this.f23755a).nextInt(i12);
            int i14 = 0;
            while (true) {
                if (i9 >= listSubList.size()) {
                    ltVar = (lt) axo.z(listSubList);
                    break;
                }
                ltVar = (lt) listSubList.get(i9);
                i14 += ltVar.f23724d;
                if (iNextInt < i14) {
                    break;
                }
                i9++;
            }
            this.f23756b.put(arrayList, ltVar);
            return ltVar;
        }
        objB = axo.B(listL);
        return (lt) objB;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public final void d(lt ltVar, long j9) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j9;
        m(ltVar.f23722b, jElapsedRealtime, this.f23758d);
        int i9 = ltVar.f23723c;
        if (i9 != Integer.MIN_VALUE) {
            m(Integer.valueOf(i9), jElapsedRealtime, this.f23757c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final void e() {
        this.f23758d.clear();
        this.f23757c.clear();
        this.f23756b.clear();
    }

    public final agv f() {
        return (agv) this.f23755a;
    }

    public final String g() {
        return (String) this.f23756b;
    }

    public final String h() {
        return (String) this.f23758d;
    }

    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        ahn.h(jSONObject, "impressionOwner", this.f23756b);
        ahn.h(jSONObject, "mediaEventsOwner", this.f23758d);
        ahn.h(jSONObject, "creativeType", this.f23755a);
        ahn.h(jSONObject, "impressionType", this.f23757c);
        ahn.h(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }

    public final aia j() {
        return (aia) this.f23757c;
    }
}
