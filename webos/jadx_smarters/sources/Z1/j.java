package Z1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public final class j implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f10881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Map f10882d;

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f10883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Map f10884f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10885a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f10886b = f10884f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10887c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10888d = true;

        static {
            String property = System.getProperty("http.agent");
            f10883e = property;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new b(property)));
            }
            map.put(HttpHeaders.ACCEPT_ENCODING, Collections.singletonList(new b(HTTP.IDENTITY_CODING)));
            f10884f = Collections.unmodifiableMap(map);
        }

        public j a() {
            this.f10885a = true;
            return new j(this.f10886b);
        }
    }

    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10889a;

        public b(String str) {
            this.f10889a = str;
        }

        @Override // Z1.i
        public String a() {
            return this.f10889a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f10889a.equals(((b) obj).f10889a);
            }
            return false;
        }

        public int hashCode() {
            return this.f10889a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f10889a + "'}";
        }
    }

    public j(Map map) {
        this.f10881c = Collections.unmodifiableMap(map);
    }

    public final Map a() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f10881c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List list = (List) entry.getValue();
            for (int i9 = 0; i9 < list.size(); i9++) {
                sb.append(((i) list.get(i9)).a());
                if (i9 != list.size() - 1) {
                    sb.append(',');
                }
            }
            map.put(entry.getKey(), sb.toString());
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f10881c.equals(((j) obj).f10881c);
        }
        return false;
    }

    @Override // Z1.e
    public Map getHeaders() {
        if (this.f10882d == null) {
            synchronized (this) {
                try {
                    if (this.f10882d == null) {
                        this.f10882d = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f10882d;
    }

    public int hashCode() {
        return this.f10881c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f10881c + '}';
    }
}
