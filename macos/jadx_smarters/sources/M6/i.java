package M6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import x6.EnumC2960a;
import x6.EnumC2964e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k[] f5194b = new k[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k[] f5195a;

    public i(Map map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC2964e.POSSIBLE_FORMATS);
        boolean z9 = (map == null || map.get(EnumC2964e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC2960a.EAN_13) || collection.contains(EnumC2960a.UPC_A) || collection.contains(EnumC2960a.EAN_8) || collection.contains(EnumC2960a.UPC_E)) {
                arrayList.add(new j(map));
            }
            if (collection.contains(EnumC2960a.CODE_39)) {
                arrayList.add(new c(z9));
            }
            if (collection.contains(EnumC2960a.CODE_93)) {
                arrayList.add(new d());
            }
            if (collection.contains(EnumC2960a.CODE_128)) {
                arrayList.add(new b());
            }
            if (collection.contains(EnumC2960a.ITF)) {
                arrayList.add(new h());
            }
            if (collection.contains(EnumC2960a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(EnumC2960a.RSS_14)) {
                arrayList.add(new N6.e());
            }
            if (collection.contains(EnumC2960a.RSS_EXPANDED)) {
                arrayList.add(new O6.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new j(map));
            arrayList.add(new c());
            arrayList.add(new a());
            arrayList.add(new d());
            arrayList.add(new b());
            arrayList.add(new h());
            arrayList.add(new N6.e());
            arrayList.add(new O6.d());
        }
        this.f5195a = (k[]) arrayList.toArray(f5194b);
    }

    @Override // M6.k
    public x6.o c(int i9, D6.a aVar, Map map) throws x6.k {
        for (k kVar : this.f5195a) {
            try {
                return kVar.c(i9, aVar, map);
            } catch (x6.n unused) {
            }
        }
        throw x6.k.a();
    }

    @Override // M6.k, x6.m
    public void reset() {
        for (k kVar : this.f5195a) {
            kVar.reset();
        }
    }
}
