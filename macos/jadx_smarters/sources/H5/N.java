package H5;

import G5.AbstractC0553u;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f2631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f2633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A4.a f2634d;

    public N(Context context, String str) {
        com.google.android.gms.common.internal.r.m(context);
        this.f2632b = com.google.android.gms.common.internal.r.g(str);
        this.f2631a = context.getApplicationContext();
        this.f2633c = this.f2631a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f2632b), 0);
        this.f2634d = new A4.a("StorageHelpers", new String[0]);
    }

    public final AbstractC0553u a() {
        String string = this.f2633c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return b(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final C0611b b(JSONObject jSONObject) {
        JSONArray jSONArray;
        C0613d c0613dD;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z9 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString(ClientCookie.VERSION_ATTR);
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i9 = 0; i9 < length; i9++) {
                arrayList.add(f0.M(jSONArray2.getString(i9)));
            }
            C0611b c0611b = new C0611b(A5.f.n(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                c0611b.P(zzafn.zzb(string));
            }
            if (!z9) {
                c0611b.Q();
            }
            c0611b.U(str);
            if (jSONObject.has("userMetadata") && (c0613dD = C0613d.d(jSONObject.getJSONObject("userMetadata"))) != null) {
                c0611b.W(c0613dD);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i10));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? G5.J.N(jSONObject2) : (strOptString == "totp" || (strOptString != null && strOptString.equals("totp"))) ? G5.M.M(jSONObject2) : null);
                }
                c0611b.R(arrayList2);
            }
            return c0611b;
        } catch (zzxw e9) {
            e = e9;
            this.f2634d.i(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e10) {
            e = e10;
            this.f2634d.i(e);
            return null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            this.f2634d.i(e);
            return null;
        } catch (JSONException e12) {
            e = e12;
            this.f2634d.i(e);
            return null;
        }
    }

    public final zzafn c(AbstractC0553u abstractC0553u) {
        com.google.android.gms.common.internal.r.m(abstractC0553u);
        String string = this.f2633c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC0553u.L()), null);
        if (string != null) {
            return zzafn.zzb(string);
        }
        return null;
    }

    public final void d(AbstractC0553u abstractC0553u, zzafn zzafnVar) {
        com.google.android.gms.common.internal.r.m(abstractC0553u);
        com.google.android.gms.common.internal.r.m(zzafnVar);
        this.f2633c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC0553u.L()), zzafnVar.zzf()).apply();
    }

    public final void e(String str) {
        this.f2633c.edit().remove(str).apply();
    }

    public final void f(AbstractC0553u abstractC0553u) {
        com.google.android.gms.common.internal.r.m(abstractC0553u);
        String strG = g(abstractC0553u);
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        this.f2633c.edit().putString("com.google.firebase.auth.FIREBASE_USER", strG).apply();
    }

    public final String g(AbstractC0553u abstractC0553u) {
        JSONObject jSONObject = new JSONObject();
        if (!C0611b.class.isAssignableFrom(abstractC0553u.getClass())) {
            return null;
        }
        C0611b c0611b = (C0611b) abstractC0553u;
        try {
            jSONObject.put("cachedTokenState", c0611b.zze());
            jSONObject.put("applicationName", c0611b.N().o());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (c0611b.a0() != null) {
                JSONArray jSONArray = new JSONArray();
                List listA0 = c0611b.a0();
                int size = listA0.size();
                if (listA0.size() > 30) {
                    this.f2634d.g("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(listA0.size()));
                    size = 30;
                }
                boolean z9 = false;
                for (int i9 = 0; i9 < size; i9++) {
                    f0 f0Var = (f0) listA0.get(i9);
                    if (f0Var.g().equals("firebase")) {
                        z9 = true;
                    }
                    if (i9 == size - 1 && !z9) {
                        break;
                    }
                    jSONArray.put(f0Var.N());
                }
                if (!z9) {
                    int i10 = size - 1;
                    while (true) {
                        if (i10 >= listA0.size() || i10 < 0) {
                            break;
                        }
                        f0 f0Var2 = (f0) listA0.get(i10);
                        if (f0Var2.g().equals("firebase")) {
                            jSONArray.put(f0Var2.N());
                            z9 = true;
                            break;
                        }
                        if (i10 == listA0.size() - 1) {
                            jSONArray.put(f0Var2.N());
                        }
                        i10++;
                    }
                    if (!z9) {
                        this.f2634d.g("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(listA0.size()), Integer.valueOf(size));
                        if (listA0.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator it = listA0.iterator();
                            while (it.hasNext()) {
                                sb.append(String.format("Provider - %s\n", ((f0) it.next()).g()));
                            }
                            this.f2634d.g(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", c0611b.M());
            jSONObject.put(ClientCookie.VERSION_ATTR, "2");
            if (c0611b.H() != null) {
                jSONObject.put("userMetadata", ((C0613d) c0611b.H()).e());
            }
            List listA = ((C0615f) c0611b.I()).a();
            if (listA != null && !listA.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    jSONArray2.put(((G5.B) listA.get(i11)).L());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e9) {
            this.f2634d.h("Failed to turn object into JSON", e9, new Object[0]);
            throw new zzxw(e9);
        }
    }
}
