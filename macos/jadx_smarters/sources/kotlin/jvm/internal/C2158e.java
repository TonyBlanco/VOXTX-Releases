package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l8.AbstractC2204A;
import l8.AbstractC2205B;

/* JADX INFO: renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2158e implements C8.c, InterfaceC2157d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43683c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f43684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f43685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f43686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f43687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f43688h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f43689a;

    /* JADX INFO: renamed from: kotlin.jvm.internal.e$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String a(java.lang.Class r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.l.e(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb1
            Le:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L68
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L42
                kotlin.jvm.internal.l.d(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = E8.o.A0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L40
                goto L42
            L40:
                r1 = r2
                goto Lb1
            L42:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                kotlin.jvm.internal.l.d(r0, r5)
                if (r8 == 0) goto L63
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = E8.o.A0(r0, r8, r1, r3, r1)
                goto Lb1
            L63:
                java.lang.String r1 = E8.o.z0(r0, r4, r1, r3, r1)
                goto Lb1
            L68:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto L9c
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L99
                java.util.Map r0 = kotlin.jvm.internal.C2158e.c()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L99
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L99:
                if (r1 != 0) goto Lb1
                goto L40
            L9c:
                java.util.Map r0 = kotlin.jvm.internal.C2158e.c()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb1
                java.lang.String r1 = r8.getSimpleName()
            Lb1:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C2158e.a.a(java.lang.Class):java.lang.String");
        }
    }

    static {
        int i9 = 0;
        List listH = l8.k.h(w8.a.class, w8.l.class, w8.p.class, w8.q.class, w8.r.class, w8.s.class, w8.t.class, w8.u.class, w8.v.class, w8.w.class, w8.b.class, w8.c.class, w8.d.class, w8.e.class, w8.f.class, w8.g.class, w8.h.class, w8.i.class, w8.j.class, w8.k.class, w8.m.class, w8.n.class, w8.o.class);
        ArrayList arrayList = new ArrayList(l8.l.o(listH, 10));
        for (Object obj : listH) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                l8.k.n();
            }
            arrayList.add(k8.m.a((Class) obj, Integer.valueOf(i9)));
            i9 = i10;
        }
        f43684d = AbstractC2205B.j(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f43685e = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f43686f = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        l.d(collectionValues, "primitiveFqNames.values");
        for (String kotlinName : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.d(kotlinName, "kotlinName");
            sb.append(E8.o.C0(kotlinName, '.', null, 2, null));
            sb.append("CompanionObject");
            k8.i iVarA = k8.m.a(sb.toString(), kotlinName + ".Companion");
            map3.put(iVarA.c(), iVarA.d());
        }
        for (Map.Entry entry : f43684d.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f43687g = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2204A.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), E8.o.C0((String) entry2.getValue(), '.', null, 2, null));
        }
        f43688h = linkedHashMap;
    }

    public C2158e(Class jClass) {
        l.e(jClass, "jClass");
        this.f43689a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC2157d
    public Class a() {
        return this.f43689a;
    }

    @Override // C8.c
    public String b() {
        return f43683c.a(a());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2158e) && l.a(v8.a.b(this), v8.a.b((C8.c) obj));
    }

    public int hashCode() {
        return v8.a.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
