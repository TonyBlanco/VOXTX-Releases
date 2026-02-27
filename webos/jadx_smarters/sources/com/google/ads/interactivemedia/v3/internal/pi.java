package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pi {
    public pi(qg qgVar) {
        int i9 = px.f24157a;
        new qg(qgVar.f24221t, qgVar.f24222u, qgVar.f24212c, qgVar.f24213d, qgVar.f24214e, qgVar.f24215f, qgVar.f24216g, qgVar.f24217h, qgVar.f24218i, qgVar.f24223v, qgVar.f24219j, qgVar.f24220k);
    }

    public static Pair a(nm nmVar) {
        Map mapD = nmVar.d();
        if (mapD == null) {
            return null;
        }
        return new Pair(Long.valueOf(f(mapD, "LicenseDurationRemaining")), Long.valueOf(f(mapD, "PlaybackDurationRemaining")));
    }

    public static /* synthetic */ void b(AtomicReference atomicReference, Object obj) {
        while (!z1.a(atomicReference, null, obj) && atomicReference.get() == null) {
        }
    }

    public static void c(nm nmVar, nm nmVar2) {
        if (nmVar == nmVar2) {
            return;
        }
        if (nmVar2 != null) {
            nmVar2.h(null);
        }
        if (nmVar != null) {
            nmVar.m(null);
        }
    }

    public static byte[] d(byte[] bArr) {
        if (cq.f22640a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(cq.I(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                if (i9 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                sb.append("{\"k\":\"");
                sb.append(g(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(g(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return cq.ad(sb.toString());
        } catch (JSONException e9) {
            cd.c("ClearKeyUtil", "Failed to adjust response data: ".concat(cq.I(bArr)), e9);
            return bArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dc e(me meVar, String str, mb mbVar, int i9) {
        db dbVar = new db();
        dbVar.i(mbVar.a(str));
        dbVar.h(mbVar.f23769a);
        dbVar.g(mbVar.f23770b);
        meVar.m();
        dbVar.f(mbVar.a(((lt) meVar.f23778c.get(0)).f23721a).toString());
        dbVar.b(i9);
        return dbVar.a();
    }

    private static long f(Map map, String str) {
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    private static String g(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
