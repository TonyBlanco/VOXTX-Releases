package d4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: d4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1693j implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39767a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f39768c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f39769d = Collections.emptySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f39770e = Collections.emptyList();

    public void a(Object obj) {
        synchronized (this.f39767a) {
            try {
                ArrayList arrayList = new ArrayList(this.f39770e);
                arrayList.add(obj);
                this.f39770e = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f39768c.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f39769d);
                    hashSet.add(obj);
                    this.f39769d = Collections.unmodifiableSet(hashSet);
                }
                this.f39768c.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(Object obj) {
        int iIntValue;
        synchronized (this.f39767a) {
            try {
                iIntValue = this.f39768c.containsKey(obj) ? ((Integer) this.f39768c.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void c(Object obj) {
        synchronized (this.f39767a) {
            try {
                Integer num = (Integer) this.f39768c.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f39770e);
                arrayList.remove(obj);
                this.f39770e = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f39768c.remove(obj);
                    HashSet hashSet = new HashSet(this.f39769d);
                    hashSet.remove(obj);
                    this.f39769d = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f39768c.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f39767a) {
            it = this.f39770e.iterator();
        }
        return it;
    }

    public Set v() {
        Set set;
        synchronized (this.f39767a) {
            set = this.f39769d;
        }
        return set;
    }
}
