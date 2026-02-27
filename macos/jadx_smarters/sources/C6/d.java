package c6;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f18315b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f18317b = null;

        public b(String str) {
            this.f18316a = str;
        }

        public d a() {
            return new d(this.f18316a, this.f18317b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f18317b)));
        }

        public b b(Annotation annotation) {
            if (this.f18317b == null) {
                this.f18317b = new HashMap();
            }
            this.f18317b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public d(String str, Map map) {
        this.f18314a = str;
        this.f18315b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static d d(String str) {
        return new d(str, Collections.emptyMap());
    }

    public String b() {
        return this.f18314a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f18315b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18314a.equals(dVar.f18314a) && this.f18315b.equals(dVar.f18315b);
    }

    public int hashCode() {
        return (this.f18314a.hashCode() * 31) + this.f18315b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f18314a + ", properties=" + this.f18315b.values() + "}";
    }
}
