package s1;

import k1.C2132a;
import k1.f;
import okhttp3.Response;

/* JADX INFO: renamed from: s1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2704b {
    public static void a(Response response, C2132a c2132a) {
        if (c2132a.B() == f.OK_HTTP_RESPONSE || response == null || response.body() == null || response.body().source() == null) {
            return;
        }
        try {
            response.body().source().close();
        } catch (Exception unused) {
        }
    }
}
