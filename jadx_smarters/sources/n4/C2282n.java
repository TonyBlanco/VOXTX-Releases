package n4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2282n extends AbstractC2985a {
    public static final Parcelable.Creator<C2282n> CREATOR = new m0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f45455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f45456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f45457j;

    /* JADX INFO: renamed from: n4.n$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2282n f45458a = new C2282n(null);

        public C2282n a() {
            return new C2282n(this.f45458a, null);
        }

        public final a b(JSONObject jSONObject) {
            C2282n.N(this.f45458a, jSONObject);
            return this;
        }
    }

    public C2282n(int i9, String str, List list, List list2, double d9) {
        this.f45453f = i9;
        this.f45454g = str;
        this.f45455h = list;
        this.f45456i = list2;
        this.f45457j = d9;
    }

    public /* synthetic */ C2282n(l0 l0Var) {
        O();
    }

    public /* synthetic */ C2282n(C2282n c2282n, l0 l0Var) {
        this.f45453f = c2282n.f45453f;
        this.f45454g = c2282n.f45454g;
        this.f45455h = c2282n.f45455h;
        this.f45456i = c2282n.f45456i;
        this.f45457j = c2282n.f45457j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void N(n4.C2282n r5, org.json.JSONObject r6) {
        /*
            r5.O()
            java.lang.String r0 = "containerType"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.optString(r0, r1)
            int r1 = r0.hashCode()
            r2 = 6924225(0x69a7c1, float:9.702906E-39)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L26
            r2 = 828666841(0x316473d9, float:3.3244218E-9)
            if (r1 == r2) goto L1c
            goto L30
        L1c:
            java.lang.String r1 = "GENERIC_CONTAINER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            r0 = 0
            goto L31
        L26:
            java.lang.String r1 = "AUDIOBOOK_CONTAINER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = -1
        L31:
            if (r0 == 0) goto L39
            if (r0 == r4) goto L36
            goto L3b
        L36:
            r5.f45453f = r4
            goto L3b
        L39:
            r5.f45453f = r3
        L3b:
            java.lang.String r0 = "title"
            java.lang.String r0 = t4.AbstractC2774a.c(r6, r0)
            r5.f45454g = r0
            java.lang.String r0 = "sections"
            org.json.JSONArray r0 = r6.optJSONArray(r0)
            if (r0 == 0) goto L6c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f45455h = r1
        L52:
            int r2 = r0.length()
            if (r3 >= r2) goto L6c
            org.json.JSONObject r2 = r0.optJSONObject(r3)
            if (r2 == 0) goto L69
            n4.m r4 = new n4.m
            r4.<init>()
            r4.P(r2)
            r1.add(r4)
        L69:
            int r3 = r3 + 1
            goto L52
        L6c:
            java.lang.String r0 = "containerImages"
            org.json.JSONArray r0 = r6.optJSONArray(r0)
            if (r0 == 0) goto L7e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f45456i = r1
            u4.AbstractC2854b.c(r1, r0)
        L7e:
            double r0 = r5.f45457j
            java.lang.String r2 = "containerDuration"
            double r0 = r6.optDouble(r2, r0)
            r5.f45457j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.C2282n.N(n4.n, org.json.JSONObject):void");
    }

    public double H() {
        return this.f45457j;
    }

    public List I() {
        List list = this.f45456i;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public int J() {
        return this.f45453f;
    }

    public List K() {
        List list = this.f45455h;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String L() {
        return this.f45454g;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020 A[Catch: JSONException -> 0x0071, TryCatch #0 {JSONException -> 0x0071, blocks: (B:3:0x0005, B:10:0x0011, B:12:0x0018, B:14:0x0020, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x003c, B:22:0x0042, B:23:0x0050, B:24:0x0055, B:26:0x0059, B:28:0x005f, B:29:0x006a), top: B:32:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[Catch: JSONException -> 0x0071, LOOP:0: B:20:0x003c->B:22:0x0042, LOOP_END, TryCatch #0 {JSONException -> 0x0071, blocks: (B:3:0x0005, B:10:0x0011, B:12:0x0018, B:14:0x0020, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x003c, B:22:0x0042, B:23:0x0050, B:24:0x0055, B:26:0x0059, B:28:0x005f, B:29:0x006a), top: B:32:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject M() {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r4.f45453f     // Catch: org.json.JSONException -> L71
            java.lang.String r2 = "containerType"
            if (r1 == 0) goto L15
            r3 = 1
            if (r1 == r3) goto Lf
            goto L18
        Lf:
            java.lang.String r1 = "AUDIOBOOK_CONTAINER"
        L11:
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L71
            goto L18
        L15:
            java.lang.String r1 = "GENERIC_CONTAINER"
            goto L11
        L18:
            java.lang.String r1 = r4.f45454g     // Catch: org.json.JSONException -> L71
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L71
            if (r1 != 0) goto L27
            java.lang.String r1 = "title"
            java.lang.String r2 = r4.f45454g     // Catch: org.json.JSONException -> L71
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L71
        L27:
            java.util.List r1 = r4.f45455h     // Catch: org.json.JSONException -> L71
            if (r1 == 0) goto L55
            boolean r1 = r1.isEmpty()     // Catch: org.json.JSONException -> L71
            if (r1 != 0) goto L55
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L71
            r1.<init>()     // Catch: org.json.JSONException -> L71
            java.util.List r2 = r4.f45455h     // Catch: org.json.JSONException -> L71
            java.util.Iterator r2 = r2.iterator()     // Catch: org.json.JSONException -> L71
        L3c:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> L71
            if (r3 == 0) goto L50
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> L71
            n4.m r3 = (n4.C2281m) r3     // Catch: org.json.JSONException -> L71
            org.json.JSONObject r3 = r3.O()     // Catch: org.json.JSONException -> L71
            r1.put(r3)     // Catch: org.json.JSONException -> L71
            goto L3c
        L50:
            java.lang.String r2 = "sections"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L71
        L55:
            java.util.List r1 = r4.f45456i     // Catch: org.json.JSONException -> L71
            if (r1 == 0) goto L6a
            boolean r1 = r1.isEmpty()     // Catch: org.json.JSONException -> L71
            if (r1 != 0) goto L6a
            java.util.List r1 = r4.f45456i     // Catch: org.json.JSONException -> L71
            org.json.JSONArray r1 = u4.AbstractC2854b.b(r1)     // Catch: org.json.JSONException -> L71
            java.lang.String r2 = "containerImages"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L71
        L6a:
            java.lang.String r1 = "containerDuration"
            double r2 = r4.f45457j     // Catch: org.json.JSONException -> L71
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L71
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.C2282n.M():org.json.JSONObject");
    }

    public final void O() {
        this.f45453f = 0;
        this.f45454g = null;
        this.f45455h = null;
        this.f45456i = null;
        this.f45457j = 0.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2282n)) {
            return false;
        }
        C2282n c2282n = (C2282n) obj;
        return this.f45453f == c2282n.f45453f && TextUtils.equals(this.f45454g, c2282n.f45454g) && AbstractC1418q.b(this.f45455h, c2282n.f45455h) && AbstractC1418q.b(this.f45456i, c2282n.f45456i) && this.f45457j == c2282n.f45457j;
    }

    public int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f45453f), this.f45454g, this.f45455h, this.f45456i, Double.valueOf(this.f45457j));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 2, J());
        y4.c.t(parcel, 3, L(), false);
        y4.c.x(parcel, 4, K(), false);
        y4.c.x(parcel, 5, I(), false);
        y4.c.g(parcel, 6, H());
        y4.c.b(parcel, iA);
    }
}
