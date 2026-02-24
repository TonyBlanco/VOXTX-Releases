package c4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r5.AbstractC2675d;

/* JADX INFO: renamed from: c4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1271q implements InterfaceC1269o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1271q f18287c = new C1271q(Collections.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f18289b;

    public C1271q(Map map) {
        this.f18289b = Collections.unmodifiableMap(map);
    }

    public static void c(HashMap map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), g(entry.getValue()));
        }
    }

    public static Map d(Map map, C1270p c1270p) {
        HashMap map2 = new HashMap(map);
        i(map2, c1270p.c());
        c(map2, c1270p.b());
        return map2;
    }

    public static byte[] g(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(AbstractC2675d.f49724c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static boolean h(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void i(HashMap map, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            map.remove(list.get(i9));
        }
    }

    @Override // c4.InterfaceC1269o
    public final long a(String str, long j9) {
        byte[] bArr = (byte[]) this.f18289b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j9;
    }

    @Override // c4.InterfaceC1269o
    public final String b(String str, String str2) {
        byte[] bArr = (byte[]) this.f18289b.get(str);
        return bArr != null ? new String(bArr, AbstractC2675d.f49724c) : str2;
    }

    public C1271q e(C1270p c1270p) {
        Map mapD = d(this.f18289b, c1270p);
        return h(this.f18289b, mapD) ? this : new C1271q(mapD);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1271q.class != obj.getClass()) {
            return false;
        }
        return h(this.f18289b, ((C1271q) obj).f18289b);
    }

    public Set f() {
        return this.f18289b.entrySet();
    }

    public int hashCode() {
        if (this.f18288a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f18289b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f18288a = iHashCode;
        }
        return this.f18288a;
    }
}
