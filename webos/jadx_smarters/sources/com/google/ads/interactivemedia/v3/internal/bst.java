package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class bst extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22233a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile bss f22237e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f22234b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f22235c = Collections.emptyMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f22238f = Collections.emptyMap();

    public static bst c(int i9) {
        return new bsl(i9);
    }

    private final int l(Comparable comparable) {
        int size = this.f22234b.size();
        int i9 = size - 1;
        int i10 = 0;
        if (i9 >= 0) {
            int iCompareTo = comparable.compareTo(((bsp) this.f22234b.get(i9)).a());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i9;
            }
        }
        while (i10 <= i9) {
            int i11 = (i10 + i9) / 2;
            int iCompareTo2 = comparable.compareTo(((bsp) this.f22234b.get(i11)).a());
            if (iCompareTo2 < 0) {
                i9 = i11 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i9) {
        o();
        Object value = ((bsp) this.f22234b.remove(i9)).getValue();
        if (!this.f22235c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            List list = this.f22234b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new bsp(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.f22235c.isEmpty() && !(this.f22235c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22235c = treeMap;
            this.f22238f = treeMap.descendingMap();
        }
        return (SortedMap) this.f22235c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f22236d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f22236d) {
            return;
        }
        this.f22235c = this.f22235c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f22235c);
        this.f22238f = this.f22238f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f22238f);
        this.f22236d = true;
    }

    public final int b() {
        return this.f22234b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.f22234b.isEmpty()) {
            this.f22234b.clear();
        }
        if (this.f22235c.isEmpty()) {
            return;
        }
        this.f22235c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f22235c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f22235c.isEmpty() ? bso.a() : this.f22235c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((bsp) this.f22234b.get(iL)).setValue(obj);
        }
        o();
        if (this.f22234b.isEmpty() && !(this.f22234b instanceof ArrayList)) {
            this.f22234b = new ArrayList(this.f22233a);
        }
        int i9 = -(iL + 1);
        if (i9 >= this.f22233a) {
            return n().put(comparable, obj);
        }
        int size = this.f22234b.size();
        int i10 = this.f22233a;
        if (size == i10) {
            bsp bspVar = (bsp) this.f22234b.remove(i10 - 1);
            n().put(bspVar.a(), bspVar.getValue());
        }
        this.f22234b.add(i9, new bsp(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f22237e == null) {
            this.f22237e = new bss(this);
        }
        return this.f22237e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object objEntrySet;
        Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bst)) {
            return super.equals(obj);
        }
        bst bstVar = (bst) obj;
        int size = size();
        if (size != bstVar.size()) {
            return false;
        }
        int iB = b();
        if (iB == bstVar.b()) {
            for (int i9 = 0; i9 < iB; i9++) {
                if (!g(i9).equals(bstVar.g(i9))) {
                    return false;
                }
            }
            if (iB == size) {
                return true;
            }
            objEntrySet = this.f22235c;
            objEntrySet2 = bstVar.f22235c;
        } else {
            objEntrySet = entrySet();
            objEntrySet2 = bstVar.entrySet();
        }
        return objEntrySet.equals(objEntrySet2);
    }

    public final Map.Entry g(int i9) {
        return (Map.Entry) this.f22234b.get(i9);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((bsp) this.f22234b.get(iL)).getValue() : this.f22235c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            iHashCode += ((bsp) this.f22234b.get(i9)).hashCode();
        }
        return this.f22235c.size() > 0 ? iHashCode + this.f22235c.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f22236d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f22235c.isEmpty()) {
            return null;
        }
        return this.f22235c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f22234b.size() + this.f22235c.size();
    }
}
