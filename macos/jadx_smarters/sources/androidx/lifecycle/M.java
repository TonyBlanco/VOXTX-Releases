package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15899a = new HashMap();

    public final void a() {
        Iterator it = this.f15899a.values().iterator();
        while (it.hasNext()) {
            ((I) it.next()).clear();
        }
        this.f15899a.clear();
    }

    public final I b(String str) {
        return (I) this.f15899a.get(str);
    }

    public Set c() {
        return new HashSet(this.f15899a.keySet());
    }

    public final void d(String str, I i9) {
        I i10 = (I) this.f15899a.put(str, i9);
        if (i10 != null) {
            i10.onCleared();
        }
    }
}
