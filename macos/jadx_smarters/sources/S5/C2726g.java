package s5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: s5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2726g extends AbstractC2727h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f50087h;

    public C2726g() {
        this(12, 3);
    }

    public C2726g(int i9, int i10) {
        super(S.c(i9));
        AbstractC2731l.b(i10, "expectedValuesPerKey");
        this.f50087h = i10;
    }

    public static C2726g A() {
        return new C2726g();
    }

    @Override // s5.AbstractC2723d
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public List r() {
        return new ArrayList(this.f50087h);
    }

    @Override // s5.AbstractC2723d, s5.AbstractC2725f, s5.J
    public /* bridge */ /* synthetic */ Collection a() {
        return super.a();
    }

    @Override // s5.AbstractC2722c, s5.AbstractC2725f, s5.J
    public /* bridge */ /* synthetic */ Map b() {
        return super.b();
    }

    @Override // s5.AbstractC2725f, s5.J
    public /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // s5.AbstractC2723d, s5.J
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // s5.AbstractC2725f
    public /* bridge */ /* synthetic */ boolean d(Object obj) {
        return super.d(obj);
    }

    @Override // s5.AbstractC2722c, s5.AbstractC2725f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // s5.AbstractC2722c, s5.AbstractC2723d, s5.J
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    @Override // s5.AbstractC2725f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // s5.AbstractC2725f, s5.J
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // s5.AbstractC2725f, s5.J
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // s5.AbstractC2722c, s5.AbstractC2723d, s5.J
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // s5.AbstractC2725f, s5.J
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // s5.AbstractC2723d, s5.J
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // s5.AbstractC2725f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // s5.AbstractC2723d, s5.AbstractC2725f, s5.J
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }
}
