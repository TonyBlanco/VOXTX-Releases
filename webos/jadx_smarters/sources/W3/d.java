package W3;

import P3.b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import d4.AbstractC1684a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f10262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f10263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f10266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f10267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f10268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f10269m;

    public d(String str, String str2, long j9, long j10, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f10257a = str;
        this.f10258b = str2;
        this.f10265i = str4;
        this.f10262f = gVar;
        this.f10263g = strArr;
        this.f10259c = str2 != null;
        this.f10260d = j9;
        this.f10261e = j10;
        this.f10264h = (String) AbstractC1684a.e(str3);
        this.f10266j = dVar;
        this.f10267k = new HashMap();
        this.f10268l = new HashMap();
    }

    public static d c(String str, long j9, long j10, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j9, j10, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i9 = 0; i9 < spannableStringBuilder.length(); i9++) {
            if (spannableStringBuilder.charAt(i9) == ' ') {
                int i10 = i9 + 1;
                int i11 = i10;
                while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                    i11++;
                }
                int i12 = i11 - i10;
                if (i12 > 0) {
                    spannableStringBuilder.delete(i9, i12 + i9);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
            if (spannableStringBuilder.charAt(i13) == '\n') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == ' ') {
                    spannableStringBuilder.delete(i14, i13 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
            if (spannableStringBuilder.charAt(i15) == ' ') {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i16) == '\n') {
                    spannableStringBuilder.delete(i15, i16);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            b.C0083b c0083b = new b.C0083b();
            c0083b.o(new SpannableStringBuilder());
            map.put(str, c0083b);
        }
        return (SpannableStringBuilder) AbstractC1684a.e(((b.C0083b) map.get(str)).e());
    }

    public void a(d dVar) {
        if (this.f10269m == null) {
            this.f10269m = new ArrayList();
        }
        this.f10269m.add(dVar);
    }

    public final void b(Map map, b.C0083b c0083b, int i9, int i10, int i11) {
        g gVarF = f.f(this.f10262f, this.f10263g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0083b.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0083b.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i9, i10, gVarF, this.f10266j, map, i11);
            if ("p".equals(this.f10257a)) {
                if (gVarF.k() != Float.MAX_VALUE) {
                    c0083b.m((gVarF.k() * (-90.0f)) / 100.0f);
                }
                if (gVarF.m() != null) {
                    c0083b.p(gVarF.m());
                }
                if (gVarF.h() != null) {
                    c0083b.j(gVarF.h());
                }
            }
        }
    }

    public d f(int i9) {
        List list = this.f10269m;
        if (list != null) {
            return (d) list.get(i9);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f10269m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j9, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        n(j9, this.f10264h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j9, false, this.f10264h, treeMap);
        o(j9, map, map2, this.f10264h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) AbstractC1684a.e((e) map2.get(pair.first));
                arrayList2.add(new b.C0083b().f(bitmapDecodeByteArray).k(eVar.f10271b).l(0).h(eVar.f10272c, 0).i(eVar.f10274e).n(eVar.f10275f).g(eVar.f10276g).r(eVar.f10279j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) AbstractC1684a.e((e) map2.get(entry.getKey()));
            b.C0083b c0083b = (b.C0083b) entry.getValue();
            e((SpannableStringBuilder) AbstractC1684a.e(c0083b.e()));
            c0083b.h(eVar2.f10272c, eVar2.f10273d);
            c0083b.i(eVar2.f10274e);
            c0083b.k(eVar2.f10271b);
            c0083b.n(eVar2.f10275f);
            c0083b.q(eVar2.f10278i, eVar2.f10277h);
            c0083b.r(eVar2.f10279j);
            arrayList2.add(c0083b.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet treeSet, boolean z9) {
        boolean zEquals = "p".equals(this.f10257a);
        boolean zEquals2 = "div".equals(this.f10257a);
        if (z9 || zEquals || (zEquals2 && this.f10265i != null)) {
            long j9 = this.f10260d;
            if (j9 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j9));
            }
            long j10 = this.f10261e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f10269m == null) {
            return;
        }
        for (int i9 = 0; i9 < this.f10269m.size(); i9++) {
            ((d) this.f10269m.get(i9)).i(treeSet, z9 || zEquals);
        }
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i9 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f10263g;
    }

    public boolean m(long j9) {
        long j10 = this.f10260d;
        return (j10 == -9223372036854775807L && this.f10261e == -9223372036854775807L) || (j10 <= j9 && this.f10261e == -9223372036854775807L) || ((j10 == -9223372036854775807L && j9 < this.f10261e) || (j10 <= j9 && j9 < this.f10261e));
    }

    public final void n(long j9, String str, List list) {
        if (!"".equals(this.f10264h)) {
            str = this.f10264h;
        }
        if (m(j9) && "div".equals(this.f10257a) && this.f10265i != null) {
            list.add(new Pair(str, this.f10265i));
            return;
        }
        for (int i9 = 0; i9 < g(); i9++) {
            f(i9).n(j9, str, list);
        }
    }

    public final void o(long j9, Map map, Map map2, String str, Map map3) {
        int i9;
        if (m(j9)) {
            String str2 = "".equals(this.f10264h) ? str : this.f10264h;
            Iterator it = this.f10268l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f10267k.containsKey(str3) ? ((Integer) this.f10267k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (b.C0083b) AbstractC1684a.e((b.C0083b) map3.get(str3)), iIntValue, iIntValue2, ((e) AbstractC1684a.e((e) map2.get(str2))).f10279j);
                }
            }
            for (i9 = 0; i9 < g(); i9++) {
                f(i9).o(j9, map, map2, str2, map3);
            }
        }
    }

    public final void p(long j9, boolean z9, String str, Map map) {
        this.f10267k.clear();
        this.f10268l.clear();
        if ("metadata".equals(this.f10257a)) {
            return;
        }
        if (!"".equals(this.f10264h)) {
            str = this.f10264h;
        }
        if (this.f10259c && z9) {
            k(str, map).append((CharSequence) AbstractC1684a.e(this.f10258b));
            return;
        }
        if ("br".equals(this.f10257a) && z9) {
            k(str, map).append('\n');
            return;
        }
        if (m(j9)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f10267k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC1684a.e(((b.C0083b) entry.getValue()).e())).length()));
            }
            boolean zEquals = "p".equals(this.f10257a);
            for (int i9 = 0; i9 < g(); i9++) {
                f(i9).p(j9, z9 || zEquals, str, map);
            }
            if (zEquals) {
                f.c(k(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.f10268l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC1684a.e(((b.C0083b) entry2.getValue()).e())).length()));
            }
        }
    }
}
