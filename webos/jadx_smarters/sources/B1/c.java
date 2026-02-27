package B1;

import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f168a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Response f170d;

    public c(Response response) {
        super(a(response));
        this.f168a = response != null ? response.code() : 0;
        this.f169c = response != null ? response.message() : "";
        this.f170d = response;
    }

    public static String a(Response response) {
        if (response == null) {
            return "Empty HTTP response";
        }
        return "HTTP " + response.code() + " " + response.message();
    }

    public Response b() {
        return this.f170d;
    }
}
