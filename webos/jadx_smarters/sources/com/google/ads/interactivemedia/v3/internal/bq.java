package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class bq implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22021a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f22022b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f22023c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f22024d = Collections.emptyList();

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.f22021a) {
            try {
                iIntValue = this.f22022b.containsKey(obj) ? ((Integer) this.f22022b.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public final Set b() {
        Set set;
        synchronized (this.f22021a) {
            set = this.f22023c;
        }
        return set;
    }

    public final void c(Object obj) {
        synchronized (this.f22021a) {
            try {
                ArrayList arrayList = new ArrayList(this.f22024d);
                arrayList.add(obj);
                this.f22024d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f22022b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f22023c);
                    hashSet.add(obj);
                    this.f22023c = Collections.unmodifiableSet(hashSet);
                }
                this.f22022b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        synchronized (this.f22021a) {
            try {
                Integer num = (Integer) this.f22022b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f22024d);
                arrayList.remove(obj);
                this.f22024d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f22022b.remove(obj);
                    HashSet hashSet = new HashSet(this.f22023c);
                    hashSet.remove(obj);
                    this.f22023c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f22022b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f22021a) {
            it = this.f22024d.iterator();
        }
        return it;
    }
}
