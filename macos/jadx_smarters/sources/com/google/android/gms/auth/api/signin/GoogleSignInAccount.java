package com.google.android.gms.auth.api.signin;

import C4.e;
import C4.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k4.C2147a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public class GoogleSignInAccount extends AbstractC2985a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C2147a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f26220s = h.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f26223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f26224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f26225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f26226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f26227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f26228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f26229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f26230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f26231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f26232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f26233r = new HashSet();

    public GoogleSignInAccount(int i9, String str, String str2, String str3, String str4, Uri uri, String str5, long j9, String str6, List list, String str7, String str8) {
        this.f26221f = i9;
        this.f26222g = str;
        this.f26223h = str2;
        this.f26224i = str3;
        this.f26225j = str4;
        this.f26226k = uri;
        this.f26227l = str5;
        this.f26228m = j9;
        this.f26229n = str6;
        this.f26230o = list;
        this.f26231p = str7;
        this.f26232q = str8;
    }

    public static GoogleSignInAccount Q(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l9, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l9.longValue(), r.g(str7), new ArrayList((Collection) r.m(set)), str5, str6);
    }

    public static GoogleSignInAccount R(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j9 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            hashSet.add(new Scope(jSONArray.getString(i9)));
        }
        GoogleSignInAccount googleSignInAccountQ = Q(jSONObject.optString(Name.MARK), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j9), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountQ.f26227l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountQ;
    }

    public String H() {
        return this.f26225j;
    }

    public String I() {
        return this.f26224i;
    }

    public String J() {
        return this.f26232q;
    }

    public String K() {
        return this.f26231p;
    }

    public String L() {
        return this.f26222g;
    }

    public String M() {
        return this.f26223h;
    }

    public Uri N() {
        return this.f26226k;
    }

    public Set O() {
        HashSet hashSet = new HashSet(this.f26230o);
        hashSet.addAll(this.f26233r);
        return hashSet;
    }

    public String P() {
        return this.f26227l;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f26229n.equals(this.f26229n) && googleSignInAccount.O().equals(O());
    }

    public int hashCode() {
        return ((this.f26229n.hashCode() + 527) * 31) + O().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.l(parcel, 1, this.f26221f);
        c.t(parcel, 2, L(), false);
        c.t(parcel, 3, M(), false);
        c.t(parcel, 4, I(), false);
        c.t(parcel, 5, H(), false);
        c.r(parcel, 6, N(), i9, false);
        c.t(parcel, 7, P(), false);
        c.o(parcel, 8, this.f26228m);
        c.t(parcel, 9, this.f26229n, false);
        c.x(parcel, 10, this.f26230o, false);
        c.t(parcel, 11, K(), false);
        c.t(parcel, 12, J(), false);
        c.b(parcel, iA);
    }
}
