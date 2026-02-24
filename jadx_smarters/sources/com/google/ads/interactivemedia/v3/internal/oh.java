package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class oh implements oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cx f23918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f23920c;

    public oh(String str, cx cxVar) {
        af.u(true);
        this.f23918a = cxVar;
        this.f23919b = null;
        this.f23920c = new HashMap();
    }

    private static byte[] d(cx cxVar, String str, byte[] bArr, Map map) throws ok {
        Map map2;
        List list;
        dv dvVar = new dv(((dg) cxVar).a());
        db dbVar = new db();
        dbVar.j(str);
        dbVar.e(map);
        dbVar.d();
        dbVar.c(bArr);
        dbVar.b(1);
        dc dcVarA = dbVar.a();
        int i9 = 0;
        dc dcVarA2 = dcVarA;
        int i10 = 0;
        while (true) {
            try {
                da daVar = new da(dvVar, dcVarA2);
                try {
                    return cq.ae(daVar);
                } catch (dq e9) {
                    int i11 = e9.f22734c;
                    String str2 = null;
                    if ((i11 == 307 || i11 == 308) && i10 < 5 && (map2 = e9.f22735d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(i9);
                    }
                    if (str2 == null) {
                        throw e9;
                    }
                    i10++;
                    db dbVarA = dcVarA2.a();
                    dbVarA.j(str2);
                    dcVarA2 = dbVarA.a();
                } finally {
                    cq.S(daVar);
                }
            } catch (Exception e10) {
                Uri uriH = dvVar.h();
                af.s(uriH);
                throw new ok(dcVarA, uriH, dvVar.e(), dvVar.g(), e10);
            }
        }
    }

    public final void a(String str, String str2) {
        af.s(str);
        af.s(str2);
        synchronized (this.f23920c) {
            this.f23920c.put(str, str2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final byte[] b(zo zoVar) throws ok {
        return d(this.f23918a, zoVar.d() + "&signedRequest=" + cq.I(zoVar.e()), null, Collections.emptyMap());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final byte[] c(UUID uuid, aeq aeqVar) throws ok {
        String strH = aeqVar.h();
        if (TextUtils.isEmpty(strH)) {
            strH = null;
        }
        if (TextUtils.isEmpty(strH)) {
            db dbVar = new db();
            Uri uri = Uri.EMPTY;
            dbVar.i(uri);
            throw new ok(dbVar.a(), uri, avs.d(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C1304i.f23216e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C1304i.f23214c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f23920c) {
            map.putAll(this.f23920c);
        }
        return d(this.f23918a, strH, aeqVar.i(), map);
    }
}
