package androidx.lifecycle;

import F0.c;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l8.AbstractC2205B;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15829f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Class[] f15830g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f15831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f15832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f15834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.InterfaceC0023c f15835e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final B a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new B();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.l.d(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new B(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                Object obj = parcelableArrayList.get(i9);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i9));
            }
            return new B(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : B.f15830g) {
                kotlin.jvm.internal.l.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public B() {
        this.f15831a = new LinkedHashMap();
        this.f15832b = new LinkedHashMap();
        this.f15833c = new LinkedHashMap();
        this.f15834d = new LinkedHashMap();
        this.f15835e = new c.InterfaceC0023c() { // from class: androidx.lifecycle.A
            @Override // F0.c.InterfaceC0023c
            public final Bundle a() {
                return B.e(this.f15828a);
            }
        };
    }

    public B(Map initialState) {
        kotlin.jvm.internal.l.e(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f15831a = linkedHashMap;
        this.f15832b = new LinkedHashMap();
        this.f15833c = new LinkedHashMap();
        this.f15834d = new LinkedHashMap();
        this.f15835e = new c.InterfaceC0023c() { // from class: androidx.lifecycle.A
            @Override // F0.c.InterfaceC0023c
            public final Bundle a() {
                return B.e(this.f15828a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public static final B c(Bundle bundle, Bundle bundle2) {
        return f15829f.a(bundle, bundle2);
    }

    public static final Bundle e(B this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        for (Map.Entry entry : AbstractC2205B.l(this$0.f15832b).entrySet()) {
            this$0.f((String) entry.getKey(), ((c.InterfaceC0023c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.f15831a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f15831a.get(str));
        }
        return L.d.a(k8.m.a("keys", arrayList), k8.m.a("values", arrayList2));
    }

    public final c.InterfaceC0023c d() {
        return this.f15835e;
    }

    public final void f(String key, Object obj) {
        kotlin.jvm.internal.l.e(key, "key");
        if (!f15829f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            kotlin.jvm.internal.l.b(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f15833c.get(key);
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        if (uVar != null) {
            uVar.o(obj);
        } else {
            this.f15831a.put(key, obj);
        }
        kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f15834d.get(key);
        if (jVar == null) {
            return;
        }
        jVar.setValue(obj);
    }
}
