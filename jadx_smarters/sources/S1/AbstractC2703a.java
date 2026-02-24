package s1;

import com.google.gson.Gson;
import n1.C2243a;
import p1.e;

/* JADX INFO: renamed from: s1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2703a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e.a f49858a;

    public static e.a a() {
        if (f49858a == null) {
            f49858a = new C2243a(new Gson());
        }
        return f49858a;
    }
}
