package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class C extends AbstractC1118c implements D, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f14569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f14570e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14571c;

    static {
        C c9 = new C();
        f14569d = c9;
        c9.k();
        f14570e = c9;
    }

    public C() {
        this(10);
    }

    public C(int i9) {
        this(new ArrayList(i9));
    }

    public C(ArrayList arrayList) {
        this.f14571c = arrayList;
    }

    public static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC1122g ? ((AbstractC1122g) obj).s() : AbstractC1139y.j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public D C() {
        return t() ? new o0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public Object G(int i9) {
        return this.f14571c.get(i9);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, java.util.AbstractList, java.util.List
    public boolean addAll(int i9, Collection collection) {
        d();
        if (collection instanceof D) {
            collection = ((D) collection).m();
        }
        boolean zAddAll = this.f14571c.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        this.f14571c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i9, String str) {
        d();
        this.f14571c.add(i9, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i9) {
        Object obj = this.f14571c.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1122g) {
            AbstractC1122g abstractC1122g = (AbstractC1122g) obj;
            String strS = abstractC1122g.s();
            if (abstractC1122g.i()) {
                this.f14571c.set(i9, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = AbstractC1139y.j(bArr);
        if (AbstractC1139y.g(bArr)) {
            this.f14571c.set(i9, strJ);
        }
        return strJ;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1139y.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C w(int i9) {
        if (i9 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i9);
        arrayList.addAll(this.f14571c);
        return new C(arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i9) {
        d();
        Object objRemove = this.f14571c.remove(i9);
        ((AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String set(int i9, String str) {
        d();
        return f(this.f14571c.set(i9, str));
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List m() {
        return Collections.unmodifiableList(this.f14571c);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14571c.size();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1118c, androidx.datastore.preferences.protobuf.AbstractC1139y.b
    public /* bridge */ /* synthetic */ boolean t() {
        return super.t();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void x(AbstractC1122g abstractC1122g) {
        d();
        this.f14571c.add(abstractC1122g);
        ((AbstractList) this).modCount++;
    }
}
