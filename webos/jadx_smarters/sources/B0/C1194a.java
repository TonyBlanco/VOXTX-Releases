package b0;

import b0.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import l8.s;
import w8.l;

/* JADX INFO: renamed from: b0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1194a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f17423b;

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    public static final class C0207a extends m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0207a f17424a = new C0207a();

        public C0207a() {
            super(1);
        }

        @Override // w8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            kotlin.jvm.internal.l.e(entry, "entry");
            return "  " + ((d.a) entry.getKey()).a() + " = " + entry.getValue();
        }
    }

    public C1194a(Map preferencesMap, boolean z9) {
        kotlin.jvm.internal.l.e(preferencesMap, "preferencesMap");
        this.f17422a = preferencesMap;
        this.f17423b = new AtomicBoolean(z9);
    }

    public /* synthetic */ C1194a(Map map, boolean z9, int i9, kotlin.jvm.internal.g gVar) {
        this((i9 & 1) != 0 ? new LinkedHashMap() : map, (i9 & 2) != 0 ? true : z9);
    }

    @Override // b0.d
    public Map a() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f17422a);
        kotlin.jvm.internal.l.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // b0.d
    public Object b(d.a key) {
        kotlin.jvm.internal.l.e(key, "key");
        return this.f17422a.get(key);
    }

    public final void e() {
        if (!(!this.f17423b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1194a) {
            return kotlin.jvm.internal.l.a(this.f17422a, ((C1194a) obj).f17422a);
        }
        return false;
    }

    public final void f() {
        this.f17423b.set(true);
    }

    public final void g(d.b... pairs) {
        kotlin.jvm.internal.l.e(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        d.b bVar = pairs[0];
        throw null;
    }

    public final Object h(d.a key) {
        kotlin.jvm.internal.l.e(key, "key");
        e();
        return this.f17422a.remove(key);
    }

    public int hashCode() {
        return this.f17422a.hashCode();
    }

    public final void i(d.a key, Object obj) {
        kotlin.jvm.internal.l.e(key, "key");
        j(key, obj);
    }

    public final void j(d.a key, Object obj) {
        Map map;
        kotlin.jvm.internal.l.e(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            map = this.f17422a;
            obj = Collections.unmodifiableSet(s.O((Iterable) obj));
            kotlin.jvm.internal.l.d(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f17422a;
        }
        map.put(key, obj);
    }

    public String toString() {
        return s.A(this.f17422a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0207a.f17424a, 24, null);
    }
}
