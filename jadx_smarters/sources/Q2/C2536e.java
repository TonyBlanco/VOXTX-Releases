package q2;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: q2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2536e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46809c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f46807a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46810d = 0;

    public C2536e(int i9) {
        this.f46809c = i9;
        this.f46808b = i9;
    }

    public void c() {
        m(0);
    }

    public final void f() {
        m(this.f46808b);
    }

    public Object g(Object obj) {
        return this.f46807a.get(obj);
    }

    public int h() {
        return this.f46810d;
    }

    public int i(Object obj) {
        return 1;
    }

    public void j(Object obj, Object obj2) {
    }

    public Object k(Object obj, Object obj2) {
        if (i(obj2) >= this.f46808b) {
            j(obj, obj2);
            return null;
        }
        Object objPut = this.f46807a.put(obj, obj2);
        if (obj2 != null) {
            this.f46810d += i(obj2);
        }
        if (objPut != null) {
            this.f46810d -= i(objPut);
        }
        f();
        return objPut;
    }

    public Object l(Object obj) {
        Object objRemove = this.f46807a.remove(obj);
        if (objRemove != null) {
            this.f46810d -= i(objRemove);
        }
        return objRemove;
    }

    public void m(int i9) {
        while (this.f46810d > i9) {
            Map.Entry entry = (Map.Entry) this.f46807a.entrySet().iterator().next();
            Object value = entry.getValue();
            this.f46810d -= i(value);
            Object key = entry.getKey();
            this.f46807a.remove(key);
            j(key, value);
        }
    }
}
