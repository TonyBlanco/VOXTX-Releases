package m;

import java.util.HashMap;
import java.util.Map;
import m.C2214b;

/* JADX INFO: renamed from: m.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2213a extends C2214b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f44263f = new HashMap();

    public boolean contains(Object obj) {
        return this.f44263f.containsKey(obj);
    }

    @Override // m.C2214b
    public C2214b.c e(Object obj) {
        return (C2214b.c) this.f44263f.get(obj);
    }

    @Override // m.C2214b
    public Object i(Object obj, Object obj2) {
        C2214b.c cVarE = e(obj);
        if (cVarE != null) {
            return cVarE.f44269c;
        }
        this.f44263f.put(obj, h(obj, obj2));
        return null;
    }

    @Override // m.C2214b
    public Object j(Object obj) {
        Object objJ = super.j(obj);
        this.f44263f.remove(obj);
        return objJ;
    }

    public Map.Entry l(Object obj) {
        if (contains(obj)) {
            return ((C2214b.c) this.f44263f.get(obj)).f44271e;
        }
        return null;
    }
}
