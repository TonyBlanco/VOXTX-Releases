package c4;

import android.net.Uri;
import d4.AbstractC1684a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: c4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1270p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f18285a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18286b = new ArrayList();

    public static C1270p g(C1270p c1270p, long j9) {
        return c1270p.e("exo_len", j9);
    }

    public static C1270p h(C1270p c1270p, Uri uri) {
        return uri == null ? c1270p.d("exo_redir") : c1270p.f("exo_redir", uri.toString());
    }

    public final C1270p a(String str, Object obj) {
        this.f18285a.put((String) AbstractC1684a.e(str), AbstractC1684a.e(obj));
        this.f18286b.remove(str);
        return this;
    }

    public Map b() {
        HashMap map = new HashMap(this.f18285a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List c() {
        return Collections.unmodifiableList(new ArrayList(this.f18286b));
    }

    public C1270p d(String str) {
        this.f18286b.add(str);
        this.f18285a.remove(str);
        return this;
    }

    public C1270p e(String str, long j9) {
        return a(str, Long.valueOf(j9));
    }

    public C1270p f(String str, String str2) {
        return a(str, str2);
    }
}
