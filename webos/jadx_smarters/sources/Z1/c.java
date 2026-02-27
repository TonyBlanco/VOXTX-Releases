package Z1;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f10861d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10862a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10863b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10864c;

    public static class a implements l {
        @Override // Z1.l
        public T1.c a(Object obj, int i9, int i10) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public c(Context context) {
        this.f10864c = context.getApplicationContext();
    }

    public synchronized l a(Class cls, Class cls2) {
        l lVarD = d(cls, cls2);
        if (lVarD != null) {
            if (f10861d.equals(lVarD)) {
                return null;
            }
            return lVarD;
        }
        m mVarE = e(cls, cls2);
        if (mVarE != null) {
            lVarD = mVarE.b(this.f10864c, this);
            b(cls, cls2, lVarD);
        } else {
            c(cls, cls2);
        }
        return lVarD;
    }

    public final void b(Class cls, Class cls2, l lVar) {
        Map map = (Map) this.f10863b.get(cls);
        if (map == null) {
            map = new HashMap();
            this.f10863b.put(cls, map);
        }
        map.put(cls2, lVar);
    }

    public final void c(Class cls, Class cls2) {
        b(cls, cls2, f10861d);
    }

    public final l d(Class cls, Class cls2) {
        Map map = (Map) this.f10863b.get(cls);
        if (map != null) {
            return (l) map.get(cls2);
        }
        return null;
    }

    public final m e(Class cls, Class cls2) {
        Map map;
        Map map2 = (Map) this.f10862a.get(cls);
        m mVar = map2 != null ? (m) map2.get(cls2) : null;
        if (mVar == null) {
            for (Class cls3 : this.f10862a.keySet()) {
                if (cls3.isAssignableFrom(cls) && (map = (Map) this.f10862a.get(cls3)) != null && (mVar = (m) map.get(cls2)) != null) {
                    break;
                }
            }
        }
        return mVar;
    }

    public synchronized m f(Class cls, Class cls2, m mVar) {
        m mVar2;
        try {
            this.f10863b.clear();
            Map map = (Map) this.f10862a.get(cls);
            if (map == null) {
                map = new HashMap();
                this.f10862a.put(cls, map);
            }
            mVar2 = (m) map.put(cls2, mVar);
            if (mVar2 != null) {
                Iterator it = this.f10862a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Map) it.next()).containsValue(mVar2)) {
                        mVar2 = null;
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return mVar2;
    }
}
