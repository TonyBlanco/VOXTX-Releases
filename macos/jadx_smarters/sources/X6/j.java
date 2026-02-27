package x6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import y6.C2991b;

/* JADX INFO: loaded from: classes.dex */
public final class j implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m[] f51966c = new m[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f51967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m[] f51968b;

    @Override // x6.m
    public o a(C2962c c2962c) {
        e(null);
        return c(c2962c);
    }

    @Override // x6.m
    public o b(C2962c c2962c, Map map) {
        e(map);
        return c(c2962c);
    }

    public final o c(C2962c c2962c) throws k {
        m[] mVarArr = this.f51968b;
        if (mVarArr != null) {
            for (m mVar : mVarArr) {
                try {
                    return mVar.b(c2962c, this.f51967a);
                } catch (n unused) {
                }
            }
        }
        throw k.a();
    }

    public o d(C2962c c2962c) {
        if (this.f51968b == null) {
            e(null);
        }
        return c(c2962c);
    }

    public void e(Map map) {
        this.f51967a = map;
        boolean z9 = map != null && map.containsKey(EnumC2964e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(EnumC2964e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z10 = collection.contains(EnumC2960a.UPC_A) || collection.contains(EnumC2960a.UPC_E) || collection.contains(EnumC2960a.EAN_13) || collection.contains(EnumC2960a.EAN_8) || collection.contains(EnumC2960a.CODABAR) || collection.contains(EnumC2960a.CODE_39) || collection.contains(EnumC2960a.CODE_93) || collection.contains(EnumC2960a.CODE_128) || collection.contains(EnumC2960a.ITF) || collection.contains(EnumC2960a.RSS_14) || collection.contains(EnumC2960a.RSS_EXPANDED);
            if (z10 && !z9) {
                arrayList.add(new M6.i(map));
            }
            if (collection.contains(EnumC2960a.QR_CODE)) {
                arrayList.add(new U6.a());
            }
            if (collection.contains(EnumC2960a.DATA_MATRIX)) {
                arrayList.add(new G6.a());
            }
            if (collection.contains(EnumC2960a.AZTEC)) {
                arrayList.add(new C2991b());
            }
            if (collection.contains(EnumC2960a.PDF_417)) {
                arrayList.add(new Q6.b());
            }
            if (collection.contains(EnumC2960a.MAXICODE)) {
                arrayList.add(new K6.a());
            }
            if (z10 && z9) {
                arrayList.add(new M6.i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z9) {
                arrayList.add(new M6.i(map));
            }
            arrayList.add(new U6.a());
            arrayList.add(new G6.a());
            arrayList.add(new C2991b());
            arrayList.add(new Q6.b());
            arrayList.add(new K6.a());
            if (z9) {
                arrayList.add(new M6.i(map));
            }
        }
        this.f51968b = (m[]) arrayList.toArray(f51966c);
    }

    @Override // x6.m
    public void reset() {
        m[] mVarArr = this.f51968b;
        if (mVarArr != null) {
            for (m mVar : mVarArr) {
                mVar.reset();
            }
        }
    }
}
