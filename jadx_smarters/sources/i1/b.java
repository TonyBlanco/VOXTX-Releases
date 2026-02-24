package I1;

import D1.a;
import F1.h;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import okhttp3.Response;
import okio.BufferedSource;
import v1.InterfaceC2868f;
import v1.i;
import v1.l;
import w1.InterfaceC2901a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements D1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K1.d f2778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E1.b f2779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f2780e;

    public class a implements a.InterfaceC0015a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0015a f2781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.c f2782b;

        public a(a.InterfaceC0015a interfaceC0015a, a.c cVar) {
            this.f2781a = interfaceC0015a;
            this.f2782b = cVar;
        }

        @Override // D1.a.InterfaceC0015a
        public void onCompleted() {
        }

        @Override // D1.a.InterfaceC0015a
        public void onFailure(B1.b bVar) {
            if (b.this.f2780e) {
                return;
            }
            this.f2781a.onFailure(bVar);
        }

        @Override // D1.a.InterfaceC0015a
        public void onFetch(a.b bVar) {
            this.f2781a.onFetch(bVar);
        }

        @Override // D1.a.InterfaceC0015a
        public void onResponse(a.d dVar) {
            a.InterfaceC0015a interfaceC0015a;
            try {
                if (b.this.f2780e) {
                    return;
                }
                if (dVar.f1323b.f()) {
                    interfaceC0015a = this.f2781a;
                } else {
                    dVar = b.this.d(this.f2782b.f1314b, (Response) dVar.f1322a.e());
                    interfaceC0015a = this.f2781a;
                }
                interfaceC0015a.onResponse(dVar);
                this.f2781a.onCompleted();
            } catch (B1.b e9) {
                onFailure(e9);
            }
        }
    }

    public b(InterfaceC2901a interfaceC2901a, h hVar, l lVar, K1.d dVar, E1.b bVar) {
        this.f2776a = hVar;
        this.f2777b = lVar;
        this.f2778c = dVar;
        this.f2779d = bVar;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public final a.d d(InterfaceC2868f interfaceC2868f, Response response) throws B1.e, B1.c {
        String string;
        response.request().header("X-APOLLO-CACHE-KEY");
        BufferedSource bufferedSourceSource = response.body().source();
        try {
            bufferedSourceSource.request(Long.MAX_VALUE);
            string = bufferedSourceSource.buffer().clone().readString(Charset.forName("UTF-8"));
        } catch (IOException e9) {
            e9.printStackTrace();
            string = null;
        }
        if (!response.isSuccessful()) {
            this.f2779d.c("Failed to parse network response: %s", response);
            throw new B1.c(response);
        }
        try {
            i iVarF = new K1.a(interfaceC2868f, this.f2777b, this.f2778c, this.f2776a).f(response.body().source()).f().j(response.cacheResponse() != null).f();
            iVarF.e();
            return new a.d(response, iVarF, this.f2776a.m(), string);
        } catch (Exception e10) {
            this.f2779d.d(e10, "Failed to parse network response for operation: %s", interfaceC2868f);
            c(response);
            throw new B1.e("Failed to parse http response", e10);
        }
    }

    @Override // D1.a
    public void dispose() {
        this.f2780e = true;
    }

    @Override // D1.a
    public void interceptAsync(a.c cVar, D1.b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
        if (this.f2780e) {
            return;
        }
        bVar.a(cVar, executor, new a(interfaceC0015a, cVar));
    }
}
