package m1;

import okhttp3.Response;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2219a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44284a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Response f44287e;

    public C2219a() {
        this.f44285c = 0;
    }

    public C2219a(Throwable th) {
        super(th);
        this.f44285c = 0;
    }

    public C2219a(Response response) {
        this.f44285c = 0;
        this.f44287e = response;
    }

    public Response a() {
        return this.f44287e;
    }

    public void b() {
        this.f44286d = "requestCancelledError";
    }

    public void c(String str) {
        this.f44284a = str;
    }

    public void d(int i9) {
        this.f44285c = i9;
    }

    public void e(String str) {
        this.f44286d = str;
    }
}
