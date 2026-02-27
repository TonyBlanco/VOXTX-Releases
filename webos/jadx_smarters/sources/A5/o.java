package A5;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.C1421u;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f142g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f149g;

        public o a() {
            return new o(this.f144b, this.f143a, this.f145c, this.f146d, this.f147e, this.f148f, this.f149g);
        }

        public b b(String str) {
            this.f143a = r.h(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f144b = r.h(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f147e = str;
            return this;
        }

        public b e(String str) {
            this.f149g = str;
            return this;
        }
    }

    public o(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.q(!C4.o.b(str), "ApplicationId must be set.");
        this.f137b = str;
        this.f136a = str2;
        this.f138c = str3;
        this.f139d = str4;
        this.f140e = str5;
        this.f141f = str6;
        this.f142g = str7;
    }

    public static o a(Context context) {
        C1421u c1421u = new C1421u(context);
        String strA = c1421u.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new o(strA, c1421u.a("google_api_key"), c1421u.a("firebase_database_url"), c1421u.a("ga_trackingId"), c1421u.a("gcm_defaultSenderId"), c1421u.a("google_storage_bucket"), c1421u.a("project_id"));
    }

    public String b() {
        return this.f136a;
    }

    public String c() {
        return this.f137b;
    }

    public String d() {
        return this.f140e;
    }

    public String e() {
        return this.f142g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC1418q.b(this.f137b, oVar.f137b) && AbstractC1418q.b(this.f136a, oVar.f136a) && AbstractC1418q.b(this.f138c, oVar.f138c) && AbstractC1418q.b(this.f139d, oVar.f139d) && AbstractC1418q.b(this.f140e, oVar.f140e) && AbstractC1418q.b(this.f141f, oVar.f141f) && AbstractC1418q.b(this.f142g, oVar.f142g);
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f137b, this.f136a, this.f138c, this.f139d, this.f140e, this.f141f, this.f142g);
    }

    public String toString() {
        return AbstractC1418q.d(this).a("applicationId", this.f137b).a("apiKey", this.f136a).a("databaseUrl", this.f138c).a("gcmSenderId", this.f140e).a("storageBucket", this.f141f).a("projectId", this.f142g).toString();
    }
}
