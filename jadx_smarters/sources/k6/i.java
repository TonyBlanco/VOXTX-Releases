package k6;

/* JADX INFO: loaded from: classes3.dex */
public class i extends A5.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f43618a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public i(String str, a aVar) {
        super(str);
        this.f43618a = aVar;
    }

    public i(a aVar) {
        this.f43618a = aVar;
    }
}
