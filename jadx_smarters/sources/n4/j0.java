package n4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f45403a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f45404b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f45405c = new HashMap();

    public final int a(String str) {
        Integer num = (Integer) this.f45405c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final j0 b(String str, String str2, int i9) {
        this.f45403a.put(str, str2);
        this.f45404b.put(str2, str);
        this.f45405c.put(str, Integer.valueOf(i9));
        return this;
    }

    public final String c(String str) {
        return (String) this.f45403a.get(str);
    }

    public final String d(String str) {
        return (String) this.f45404b.get(str);
    }
}
