package n4;

import org.json.JSONObject;

/* JADX INFO: renamed from: n4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2279k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f45408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f45409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f45410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45412g;

    /* JADX INFO: renamed from: n4.k$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45413a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f45414b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f45415c = 1.0d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long[] f45416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public JSONObject f45417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f45418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f45419g;

        public C2279k a() {
            return new C2279k(this.f45413a, this.f45414b, this.f45415c, this.f45416d, this.f45417e, this.f45418f, this.f45419g, null);
        }

        public a b(boolean z9) {
            this.f45413a = z9;
            return this;
        }

        public a c(long j9) {
            this.f45414b = j9;
            return this;
        }
    }

    public /* synthetic */ C2279k(boolean z9, long j9, double d9, long[] jArr, JSONObject jSONObject, String str, String str2, AbstractC2273g0 abstractC2273g0) {
        this.f45406a = z9;
        this.f45407b = j9;
        this.f45408c = d9;
        this.f45409d = jArr;
        this.f45410e = jSONObject;
        this.f45411f = str;
        this.f45412g = str2;
    }

    public long[] a() {
        return this.f45409d;
    }

    public boolean b() {
        return this.f45406a;
    }

    public String c() {
        return this.f45411f;
    }

    public String d() {
        return this.f45412g;
    }

    public JSONObject e() {
        return this.f45410e;
    }

    public long f() {
        return this.f45407b;
    }

    public double g() {
        return this.f45408c;
    }
}
