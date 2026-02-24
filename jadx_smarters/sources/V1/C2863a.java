package v1;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: v1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2863a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f51255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f51256c;

    /* JADX INFO: renamed from: v1.a$a, reason: collision with other inner class name */
    public static class C0472a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f51257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f51258b;

        public C0472a(long j9, long j10) {
            this.f51257a = j9;
            this.f51258b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0472a c0472a = (C0472a) obj;
            return this.f51257a == c0472a.f51257a && this.f51258b == c0472a.f51258b;
        }

        public int hashCode() {
            long j9 = this.f51257a;
            int i9 = ((int) (j9 ^ (j9 >>> 32))) * 31;
            long j10 = this.f51258b;
            return i9 + ((int) (j10 ^ (j10 >>> 32)));
        }

        public String toString() {
            return "Location{line=" + this.f51257a + ", column=" + this.f51258b + '}';
        }
    }

    public C2863a(String str, List list, Map map) {
        this.f51254a = str;
        this.f51255b = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.f51256c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
    }

    public Map a() {
        return this.f51256c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2863a)) {
            return false;
        }
        C2863a c2863a = (C2863a) obj;
        String str = this.f51254a;
        if (str == null ? c2863a.f51254a != null : !str.equals(c2863a.f51254a)) {
            return false;
        }
        if (this.f51255b.equals(c2863a.f51255b)) {
            return this.f51256c.equals(c2863a.f51256c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f51254a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f51255b.hashCode()) * 31) + this.f51256c.hashCode();
    }

    public String toString() {
        return "Error{message='" + this.f51254a + "', locations=" + this.f51255b + ", customAttributes=" + this.f51256c + '}';
    }
}
