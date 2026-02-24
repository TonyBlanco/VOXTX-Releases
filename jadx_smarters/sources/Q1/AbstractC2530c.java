package q1;

import android.net.TrafficStats;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import k1.C2132a;
import k1.C2134c;
import m1.C2219a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.http.client.methods.HttpOptions;
import s1.AbstractC2705c;

/* JADX INFO: renamed from: q1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2530c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static OkHttpClient f46777a = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f46778b = null;

    /* JADX INFO: renamed from: q1.c$a */
    public class a implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2132a f46779a;

        public a(C2132a c2132a) {
            this.f46779a = c2132a;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Response responseProceed = chain.proceed(chain.request());
            return responseProceed.newBuilder().body(new f(responseProceed.body(), this.f46779a.s())).build();
        }
    }

    /* JADX INFO: renamed from: q1.c$b */
    public class b implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2132a f46780a;

        public b(C2132a c2132a) {
            this.f46780a = c2132a;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Response responseProceed = chain.proceed(chain.request());
            return responseProceed.newBuilder().body(new f(responseProceed.body(), this.f46780a.s())).build();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(okhttp3.Request.Builder r3, k1.C2132a r4) {
        /*
            java.lang.String r0 = r4.F()
            java.lang.String r1 = "User-Agent"
            if (r0 == 0) goto L10
            java.lang.String r0 = r4.F()
        Lc:
            r3.addHeader(r1, r0)
            goto L1a
        L10:
            java.lang.String r0 = q1.AbstractC2530c.f46778b
            if (r0 == 0) goto L1a
            r4.M(r0)
            java.lang.String r0 = q1.AbstractC2530c.f46778b
            goto Lc
        L1a:
            okhttp3.Headers r0 = r4.u()
            if (r0 == 0) goto L3a
            r3.headers(r0)
            java.lang.String r2 = r4.F()
            if (r2 == 0) goto L3a
            java.util.Set r0 = r0.names()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L3a
            java.lang.String r4 = r4.F()
            r3.addHeader(r1, r4)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.AbstractC2530c.a(okhttp3.Request$Builder, k1.a):void");
    }

    public static OkHttpClient b() {
        OkHttpClient okHttpClient = f46777a;
        return okHttpClient == null ? c() : okHttpClient;
    }

    public static OkHttpClient c() {
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builderNewBuilder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build();
    }

    public static Response d(C2132a c2132a) {
        try {
            Request.Builder builderUrl = new Request.Builder().url(c2132a.E());
            a(builderUrl, c2132a);
            Request.Builder builder = builderUrl.get();
            if (c2132a.p() != null) {
                builder.cacheControl(c2132a.p());
            }
            c2132a.I((c2132a.x() != null ? c2132a.x().newBuilder().cache(f46777a.cache()).addNetworkInterceptor(new a(c2132a)) : f46777a.newBuilder().addNetworkInterceptor(new b(c2132a))).build().newCall(builder.build()));
            long jCurrentTimeMillis = System.currentTimeMillis();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            Response responseExecute = c2132a.q().execute();
            AbstractC2705c.h(responseExecute, c2132a.r(), c2132a.t());
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (responseExecute.cacheResponse() == null) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                C2134c.a().b((totalRxBytes == -1 || totalRxBytes2 == -1) ? responseExecute.body().contentLength() : totalRxBytes2 - totalRxBytes, jCurrentTimeMillis2);
                c2132a.n();
                AbstractC2705c.i(null, jCurrentTimeMillis2, -1L, responseExecute.body().contentLength(), false);
            } else {
                c2132a.n();
            }
            return responseExecute;
        } catch (IOException e9) {
            try {
                File file = new File(c2132a.r() + File.separator + c2132a.t());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            throw new C2219a(e9);
        }
    }

    public static Response e(C2132a c2132a) throws C2219a {
        try {
            Request.Builder builderUrl = new Request.Builder().url(c2132a.E());
            a(builderUrl, c2132a);
            RequestBody requestBodyZ = null;
            switch (c2132a.v()) {
                case 0:
                    builderUrl = builderUrl.get();
                    break;
                case 1:
                    requestBodyZ = c2132a.z();
                    builderUrl = builderUrl.post(requestBodyZ);
                    break;
                case 2:
                    requestBodyZ = c2132a.z();
                    builderUrl = builderUrl.put(requestBodyZ);
                    break;
                case 3:
                    requestBodyZ = c2132a.z();
                    builderUrl = builderUrl.delete(requestBodyZ);
                    break;
                case 4:
                    builderUrl = builderUrl.head();
                    break;
                case 5:
                    requestBodyZ = c2132a.z();
                    builderUrl = builderUrl.patch(requestBodyZ);
                    break;
                case 6:
                    builderUrl = builderUrl.method(HttpOptions.METHOD_NAME, null);
                    break;
            }
            if (c2132a.p() != null) {
                builderUrl.cacheControl(c2132a.p());
            }
            Request requestBuild = builderUrl.build();
            c2132a.I(c2132a.x() != null ? c2132a.x().newBuilder().cache(f46777a.cache()).build().newCall(requestBuild) : f46777a.newCall(requestBuild));
            long jCurrentTimeMillis = System.currentTimeMillis();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            Response responseExecute = c2132a.q().execute();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (responseExecute.cacheResponse() == null) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                C2134c.a().b((totalRxBytes == -1 || totalRxBytes2 == -1) ? responseExecute.body().contentLength() : totalRxBytes2 - totalRxBytes, jCurrentTimeMillis2);
                c2132a.n();
                AbstractC2705c.i(null, jCurrentTimeMillis2, (requestBodyZ == null || requestBodyZ.contentLength() == 0) ? -1L : requestBodyZ.contentLength(), responseExecute.body().contentLength(), false);
            } else {
                c2132a.n();
            }
            return responseExecute;
        } catch (IOException e9) {
            throw new C2219a(e9);
        }
    }

    public static Response f(C2132a c2132a) throws C2219a {
        try {
            Request.Builder builderUrl = new Request.Builder().url(c2132a.E());
            a(builderUrl, c2132a);
            RequestBody requestBodyW = c2132a.w();
            requestBodyW.contentLength();
            Request.Builder builderPost = builderUrl.post(new e(requestBodyW, c2132a.D()));
            if (c2132a.p() != null) {
                builderPost.cacheControl(c2132a.p());
            }
            Request requestBuild = builderPost.build();
            c2132a.I(c2132a.x() != null ? c2132a.x().newBuilder().cache(f46777a.cache()).build().newCall(requestBuild) : f46777a.newCall(requestBuild));
            System.currentTimeMillis();
            Response responseExecute = c2132a.q().execute();
            System.currentTimeMillis();
            c2132a.n();
            return responseExecute;
        } catch (IOException e9) {
            throw new C2219a(e9);
        }
    }
}
