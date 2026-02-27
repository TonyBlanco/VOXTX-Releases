package H5;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzab;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.C2695a;

/* JADX INFO: renamed from: H5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0632x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A4.a f2718a = new A4.a("JSONParser", new String[0]);

    public static List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            Object objC = jSONArray.get(i9);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static Map b(String str) {
        com.google.android.gms.common.internal.r.g(str);
        List<String> listZza = zzab.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            f2718a.c("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map mapD = d(new String(C4.c.b(listZza.get(1)), "UTF-8"));
            return mapD == null ? new HashMap() : mapD;
        } catch (UnsupportedEncodingException e9) {
            f2718a.b("Unable to decode token", e9, new Object[0]);
            return new HashMap();
        }
    }

    public static Map c(JSONObject jSONObject) throws JSONException {
        C2695a c2695a = new C2695a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            c2695a.put(next, objC);
        }
        return c2695a;
    }

    public static Map d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e9) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzxw(e9);
        }
    }
}
