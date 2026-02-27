package n4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import t4.AbstractC2774a;
import u4.AbstractC2853a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2283o extends AbstractC2985a {
    public static final Parcelable.Creator<C2283o> CREATOR = new o0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f45462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2282n f45463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f45465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f45467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45468o;

    /* JADX INFO: renamed from: n4.o$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2283o f45469a = new C2283o(null);

        public C2283o a() {
            return new C2283o(this.f45469a, null);
        }

        public final a b(JSONObject jSONObject) {
            C2283o.Q(this.f45469a, jSONObject);
            return this;
        }
    }

    public C2283o(String str, String str2, int i9, String str3, C2282n c2282n, int i10, List list, int i11, long j9, boolean z9) {
        this.f45459f = str;
        this.f45460g = str2;
        this.f45461h = i9;
        this.f45462i = str3;
        this.f45463j = c2282n;
        this.f45464k = i10;
        this.f45465l = list;
        this.f45466m = i11;
        this.f45467n = j9;
        this.f45468o = z9;
    }

    public /* synthetic */ C2283o(n0 n0Var) {
        S();
    }

    public /* synthetic */ C2283o(C2283o c2283o, n0 n0Var) {
        this.f45459f = c2283o.f45459f;
        this.f45460g = c2283o.f45460g;
        this.f45461h = c2283o.f45461h;
        this.f45462i = c2283o.f45462i;
        this.f45463j = c2283o.f45463j;
        this.f45464k = c2283o.f45464k;
        this.f45465l = c2283o.f45465l;
        this.f45466m = c2283o.f45466m;
        this.f45467n = c2283o.f45467n;
        this.f45468o = c2283o.f45468o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void Q(n4.C2283o r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.C2283o.Q(n4.o, org.json.JSONObject):void");
    }

    public C2282n H() {
        return this.f45463j;
    }

    public String I() {
        return this.f45460g;
    }

    public List J() {
        List list = this.f45465l;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String K() {
        return this.f45459f;
    }

    public int L() {
        return this.f45461h;
    }

    public int M() {
        return this.f45464k;
    }

    public int N() {
        return this.f45466m;
    }

    public long O() {
        return this.f45467n;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0027. Please report as an issue. */
    public final JSONObject P() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f45459f)) {
                jSONObject.put(Name.MARK, this.f45459f);
            }
            if (!TextUtils.isEmpty(this.f45460g)) {
                jSONObject.put("entity", this.f45460g);
            }
            switch (this.f45461h) {
                case 1:
                    str = "ALBUM";
                    jSONObject.put("queueType", str);
                    break;
                case 2:
                    str = "PLAYLIST";
                    jSONObject.put("queueType", str);
                    break;
                case 3:
                    str = "AUDIOBOOK";
                    jSONObject.put("queueType", str);
                    break;
                case 4:
                    str = "RADIO_STATION";
                    jSONObject.put("queueType", str);
                    break;
                case 5:
                    str = "PODCAST_SERIES";
                    jSONObject.put("queueType", str);
                    break;
                case 6:
                    str = "TV_SERIES";
                    jSONObject.put("queueType", str);
                    break;
                case 7:
                    str = "VIDEO_PLAYLIST";
                    jSONObject.put("queueType", str);
                    break;
                case 8:
                    str = "LIVE_TV";
                    jSONObject.put("queueType", str);
                    break;
                case 9:
                    str = "MOVIE";
                    jSONObject.put("queueType", str);
                    break;
            }
            if (!TextUtils.isEmpty(this.f45462i)) {
                jSONObject.put("name", this.f45462i);
            }
            C2282n c2282n = this.f45463j;
            if (c2282n != null) {
                jSONObject.put("containerMetadata", c2282n.M());
            }
            String strB = AbstractC2853a.b(Integer.valueOf(this.f45464k));
            if (strB != null) {
                jSONObject.put("repeatMode", strB);
            }
            List list = this.f45465l;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f45465l.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C2284p) it.next()).Q());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f45466m);
            long j9 = this.f45467n;
            if (j9 != -1) {
                jSONObject.put("startTime", AbstractC2774a.b(j9));
            }
            jSONObject.put("shuffle", this.f45468o);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean R() {
        return this.f45468o;
    }

    public final void S() {
        this.f45459f = null;
        this.f45460g = null;
        this.f45461h = 0;
        this.f45462i = null;
        this.f45464k = 0;
        this.f45465l = null;
        this.f45466m = 0;
        this.f45467n = -1L;
        this.f45468o = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2283o)) {
            return false;
        }
        C2283o c2283o = (C2283o) obj;
        return TextUtils.equals(this.f45459f, c2283o.f45459f) && TextUtils.equals(this.f45460g, c2283o.f45460g) && this.f45461h == c2283o.f45461h && TextUtils.equals(this.f45462i, c2283o.f45462i) && AbstractC1418q.b(this.f45463j, c2283o.f45463j) && this.f45464k == c2283o.f45464k && AbstractC1418q.b(this.f45465l, c2283o.f45465l) && this.f45466m == c2283o.f45466m && this.f45467n == c2283o.f45467n && this.f45468o == c2283o.f45468o;
    }

    public String getName() {
        return this.f45462i;
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f45459f, this.f45460g, Integer.valueOf(this.f45461h), this.f45462i, this.f45463j, Integer.valueOf(this.f45464k), this.f45465l, Integer.valueOf(this.f45466m), Long.valueOf(this.f45467n), Boolean.valueOf(this.f45468o));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, K(), false);
        y4.c.t(parcel, 3, I(), false);
        y4.c.l(parcel, 4, L());
        y4.c.t(parcel, 5, getName(), false);
        y4.c.r(parcel, 6, H(), i9, false);
        y4.c.l(parcel, 7, M());
        y4.c.x(parcel, 8, J(), false);
        y4.c.l(parcel, 9, N());
        y4.c.o(parcel, 10, O());
        y4.c.c(parcel, 11, this.f45468o);
        y4.c.b(parcel, iA);
    }
}
