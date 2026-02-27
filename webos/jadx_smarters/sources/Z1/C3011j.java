package z1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: renamed from: z1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3011j {
    public static C3011j a() {
        return new C3011j();
    }

    public static void e(Object obj, J1.h hVar) {
        String strD;
        if (obj == null) {
            hVar.h();
            return;
        }
        if (obj instanceof String) {
            strD = (String) obj;
        } else {
            if (obj instanceof Boolean) {
                hVar.q(((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Number) {
                hVar.o((Number) obj);
                return;
            }
            if (!(obj instanceof C3005d)) {
                if (!(obj instanceof List)) {
                    throw new RuntimeException("Unsupported record value type: " + obj.getClass());
                }
                hVar.a();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    e(it.next(), hVar);
                }
                hVar.d();
                return;
            }
            strD = ((C3005d) obj).d();
        }
        hVar.p(strD);
    }

    public Map b(String str) {
        return c(Okio.buffer(Okio.source(new ByteArrayInputStream(str.getBytes()))));
    }

    public Map c(BufferedSource bufferedSource) {
        return J1.a.b(J1.a.a(bufferedSource)).u();
    }

    public String d(Map map) {
        x1.g.c(map, "fields == null");
        Buffer buffer = new Buffer();
        J1.h hVarI = J1.h.i(buffer);
        hVarI.m(true);
        try {
            hVarI.c();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                hVarI.g(str);
                e(value, hVarI);
            }
            hVarI.e();
            hVarI.close();
            return buffer.readUtf8();
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }
}
