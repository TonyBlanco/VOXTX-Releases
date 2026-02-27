package P5;

import O5.AbstractC0945i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7289a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7291c;

    public b(int i9, int i10) {
        this.f7290b = i9;
        this.f7291c = i10;
    }

    public static String c(String str, int i9) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i9 ? strTrim.substring(0, i9) : strTrim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f7289a));
    }

    public final String b(String str) {
        if (str != null) {
            return c(str, this.f7291c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f7289a.size() >= this.f7290b && !this.f7289a.containsKey(strB)) {
            L5.f.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f7290b);
            return false;
        }
        String strC = c(str2, this.f7291c);
        if (AbstractC0945i.B((String) this.f7289a.get(strB), strC)) {
            return false;
        }
        Map map = this.f7289a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i9 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = b((String) entry.getKey());
                if (this.f7289a.size() < this.f7290b || this.f7289a.containsKey(strB)) {
                    String str = (String) entry.getValue();
                    this.f7289a.put(strB, str == null ? "" : c(str, this.f7291c));
                } else {
                    i9++;
                }
            }
            if (i9 > 0) {
                L5.f.f().k("Ignored " + i9 + " entries when adding custom keys. Maximum allowable: " + this.f7290b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
