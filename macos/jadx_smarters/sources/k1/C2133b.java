package k1;

import m1.C2219a;
import okhttp3.Response;

/* JADX INFO: renamed from: k1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2133b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2219a f43528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Response f43529c;

    public C2133b(Object obj) {
        this.f43527a = obj;
        this.f43528b = null;
    }

    public C2133b(C2219a c2219a) {
        this.f43527a = null;
        this.f43528b = c2219a;
    }

    public static C2133b a(C2219a c2219a) {
        return new C2133b(c2219a);
    }

    public static C2133b f(Object obj) {
        return new C2133b(obj);
    }

    public C2219a b() {
        return this.f43528b;
    }

    public Object c() {
        return this.f43527a;
    }

    public boolean d() {
        return this.f43528b == null;
    }

    public void e(Response response) {
        this.f43529c = response;
    }
}
