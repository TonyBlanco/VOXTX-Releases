package V2;

import d4.AbstractC1681B;
import d4.k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: V2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1044a {
    public static byte[] a(byte[] bArr) {
        return k0.f39777a >= 27 ? bArr : k0.s0(c(k0.E(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (k0.f39777a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(k0.E(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                if (i9 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return k0.s0(sb.toString());
        } catch (JSONException e9) {
            AbstractC1681B.e("ClearKeyUtil", "Failed to adjust response data: " + k0.E(bArr), e9);
            return bArr;
        }
    }

    public static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
