package z1;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: z1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3010i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f52650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile UUID f52651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f52652d = -1;

    /* JADX INFO: renamed from: z1.i$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f52653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public UUID f52655c;

        public a(String str, Map map, UUID uuid) {
            this.f52654b = str;
            this.f52653a = new LinkedHashMap(map);
            this.f52655c = uuid;
        }

        public a a(String str, Object obj) {
            this.f52653a.put(x1.g.c(str, "key == null"), obj);
            return this;
        }

        public a b(Map map) {
            x1.g.c(map, "fields == null");
            this.f52653a.putAll(map);
            return this;
        }

        public C3010i c() {
            return new C3010i(this.f52654b, this.f52653a, this.f52655c);
        }

        public String d() {
            return this.f52654b;
        }

        public a e(UUID uuid) {
            this.f52655c = uuid;
            return this;
        }
    }

    public C3010i(String str, Map map, UUID uuid) {
        this.f52649a = str;
        this.f52650b = map;
        this.f52651c = uuid;
    }

    public static a b(String str) {
        return new a((String) x1.g.c(str, "key == null"), new LinkedHashMap(), null);
    }

    public final void a(Object obj, Object obj2) {
        if (this.f52652d != -1) {
            this.f52652d += F1.g.a(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3010i clone() {
        return i().c();
    }

    public Object d(String str) {
        return this.f52650b.get(str);
    }

    public Map e() {
        return this.f52650b;
    }

    public boolean f(String str) {
        return this.f52650b.containsKey(str);
    }

    public String g() {
        return this.f52649a;
    }

    public Set h(C3010i c3010i) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : c3010i.f52650b.entrySet()) {
            Object value = entry.getValue();
            boolean zContainsKey = this.f52650b.containsKey(entry.getKey());
            Object obj = this.f52650b.get(entry.getKey());
            if (!zContainsKey || ((obj == null && value != null) || (obj != null && !obj.equals(value)))) {
                this.f52650b.put(entry.getKey(), value);
                hashSet.add(g() + InstructionFileId.DOT + ((String) entry.getKey()));
                a(value, obj);
            }
        }
        this.f52651c = c3010i.f52651c;
        return hashSet;
    }

    public a i() {
        return new a(g(), this.f52650b, this.f52651c);
    }
}
