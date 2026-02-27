package K1;

import java.util.LinkedHashMap;
import java.util.Map;
import u1.InterfaceC2843b;
import v1.s;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f3594b = b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3595a;

    public static class a extends g {
        public a() {
            super(null);
        }

        @Override // u1.InterfaceC2843b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String decode(String str) {
            return str;
        }
    }

    public static class b extends g {
        public b() {
            super(null);
        }

        @Override // u1.InterfaceC2843b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean decode(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    public static class c extends g {
        public c() {
            super(null);
        }

        @Override // u1.InterfaceC2843b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer decode(String str) {
            return Integer.valueOf(Integer.parseInt(str));
        }
    }

    /* JADX INFO: renamed from: K1.d$d, reason: collision with other inner class name */
    public static class C0059d extends g {
        public C0059d() {
            super(null);
        }

        @Override // u1.InterfaceC2843b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long decode(String str) {
            return Long.valueOf(Long.parseLong(str));
        }
    }

    public static class e extends g {
        public e() {
            super(null);
        }

        @Override // u1.InterfaceC2843b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float decode(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }
    }

    public static class f extends g {
        public f() {
            super(null);
        }

        @Override // u1.InterfaceC2843b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double decode(String str) {
            return Double.valueOf(Double.parseDouble(str));
        }
    }

    public static abstract class g implements InterfaceC2843b {
        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // u1.InterfaceC2843b
        public String encode(Object obj) {
            return obj.toString();
        }
    }

    public d(Map map) {
        this.f3595a = (Map) x1.g.c(map, "customAdapters == null");
    }

    public static Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(String.class, new a());
        linkedHashMap.put(Boolean.class, new b());
        linkedHashMap.put(Integer.class, new c());
        linkedHashMap.put(Long.class, new C0059d());
        linkedHashMap.put(Float.class, new e());
        linkedHashMap.put(Double.class, new f());
        return linkedHashMap;
    }

    public InterfaceC2843b a(s sVar) {
        x1.g.c(sVar, "scalarType == null");
        InterfaceC2843b interfaceC2843b = (InterfaceC2843b) this.f3595a.get(sVar);
        if (interfaceC2843b == null) {
            interfaceC2843b = (InterfaceC2843b) f3594b.get(sVar.javaType());
        }
        if (interfaceC2843b != null) {
            return interfaceC2843b;
        }
        throw new IllegalArgumentException(String.format("Can't map GraphQL type: %s to: %s. Did you forget to add custom type adapter?", sVar.typeName(), sVar.javaType()));
    }
}
