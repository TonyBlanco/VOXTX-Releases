package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
abstract class auj extends aum implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Map f20757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f20758b;

    public auj(Map map) {
        atp.e(map.isEmpty());
        this.f20757a = map;
    }

    public static /* synthetic */ void n(auj aujVar, Object obj) {
        Object objRemove;
        Map map = aujVar.f20757a;
        atp.k(map);
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            aujVar.f20758b -= size;
        }
    }

    public static /* synthetic */ void q(auj aujVar) {
        aujVar.f20758b++;
    }

    public static /* synthetic */ void r(auj aujVar) {
        aujVar.f20758b--;
    }

    public static /* synthetic */ void s(auj aujVar, int i9) {
        aujVar.f20758b += i9;
    }

    public static /* synthetic */ void t(auj aujVar, int i9) {
        aujVar.f20758b -= i9;
    }

    public abstract Collection a();

    public Collection b(Collection collection) {
        throw null;
    }

    public Collection c(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awq
    public final int d() {
        return this.f20758b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aum
    public final Collection e() {
        return new aul(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aum
    public final Iterator f() {
        return new atx(this, null);
    }

    public final List g(Object obj, List list, aug augVar) {
        return list instanceof RandomAccess ? new auc(this, obj, list, augVar) : new aui(this, obj, list, augVar);
    }

    public final Map i() {
        return this.f20757a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aum
    public Map j() {
        throw null;
    }

    public final Map k() {
        Map map = this.f20757a;
        return map instanceof NavigableMap ? new aua(this, (NavigableMap) map) : map instanceof SortedMap ? new aud(this, (SortedMap) map) : new atw(this, map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aum
    public Set l() {
        throw null;
    }

    public final Set m() {
        Map map = this.f20757a;
        return map instanceof NavigableMap ? new aub(this, (NavigableMap) map) : map instanceof SortedMap ? new aue(this, (SortedMap) map) : new atz(this, map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awq
    public final void o() {
        Iterator it = this.f20757a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f20757a.clear();
        this.f20758b = 0;
    }

    public final void p(Map map) {
        this.f20757a = map;
        this.f20758b = 0;
        for (Collection collection : map.values()) {
            atp.e(!collection.isEmpty());
            this.f20758b += collection.size();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aum, com.google.ads.interactivemedia.v3.internal.awq
    public final void u(Object obj, Object obj2) {
        Collection collection = (Collection) this.f20757a.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.f20758b++;
            }
        } else {
            Collection collectionA = a();
            if (!collectionA.add(obj2)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            this.f20758b++;
            this.f20757a.put(obj, collectionA);
        }
    }
}
