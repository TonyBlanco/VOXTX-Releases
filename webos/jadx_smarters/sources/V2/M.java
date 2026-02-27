package V2;

import O2.AbstractC0904o;
import V2.G;
import android.net.Uri;
import android.text.TextUtils;
import b4.C;
import b4.C1226q;
import b4.C1227s;
import b4.InterfaceC1224o;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import s5.AbstractC2717A;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1224o.a f9891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f9894d;

    public M(String str, boolean z9, InterfaceC1224o.a aVar) {
        AbstractC1684a.a((z9 && TextUtils.isEmpty(str)) ? false : true);
        this.f9891a = aVar;
        this.f9892b = str;
        this.f9893c = z9;
        this.f9894d = new HashMap();
    }

    public static byte[] c(InterfaceC1224o.a aVar, String str, byte[] bArr, Map map) throws P {
        b4.P p9 = new b4.P(aVar.a());
        C1227s c1227sA = new C1227s.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i9 = 0;
        C1227s c1227sA2 = c1227sA;
        while (true) {
            try {
                C1226q c1226q = new C1226q(p9, c1227sA2);
                try {
                    try {
                        return k0.p1(c1226q);
                    } catch (C.e e9) {
                        String strD = d(e9, i9);
                        if (strD == null) {
                            throw e9;
                        }
                        i9++;
                        c1227sA2 = c1227sA2.a().j(strD).a();
                    }
                } finally {
                    k0.o(c1226q);
                }
            } catch (Exception e10) {
                throw new P(c1227sA, (Uri) AbstractC1684a.e(p9.t()), p9.e(), p9.j(), e10);
            }
        }
    }

    public static String d(C.e eVar, int i9) {
        Map map;
        List list;
        int i10 = eVar.f17480e;
        if ((i10 != 307 && i10 != 308) || i9 >= 5 || (map = eVar.f17482g) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // V2.O
    public byte[] a(UUID uuid, G.d dVar) {
        return c(this.f9891a, dVar.b() + "&signedRequest=" + k0.E(dVar.a()), null, Collections.emptyMap());
    }

    @Override // V2.O
    public byte[] b(UUID uuid, G.a aVar) throws P {
        String strB = aVar.b();
        if (this.f9893c || TextUtils.isEmpty(strB)) {
            strB = this.f9892b;
        }
        if (TextUtils.isEmpty(strB)) {
            C1227s.b bVar = new C1227s.b();
            Uri uri = Uri.EMPTY;
            throw new P(bVar.i(uri).a(), uri, AbstractC2717A.k(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = AbstractC0904o.f6141e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC0904o.f6139c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f9894d) {
            map.putAll(this.f9894d);
        }
        return c(this.f9891a, strB, aVar.a(), map);
    }

    public void e(String str, String str2) {
        AbstractC1684a.e(str);
        AbstractC1684a.e(str2);
        synchronized (this.f9894d) {
            this.f9894d.put(str, str2);
        }
    }
}
